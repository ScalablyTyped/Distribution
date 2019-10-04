package typings.atPulumiAws.ec2clientvpnEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2clientvpnNs.EndpointAuthenticationOptions
import typings.atPulumiAws.typesInputMod.ec2clientvpnNs.EndpointConnectionLogOptions
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointArgs extends js.Object {
  /**
    * Information about the authentication method to be used to authenticate clients.
    */
  val authenticationOptions: Input[EndpointAuthenticationOptions]
  /**
    * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
    */
  val clientCidrBlock: Input[String]
  /**
    * Information about the client connection logging options.
    */
  val connectionLogOptions: Input[EndpointConnectionLogOptions]
  /**
    * Name of the repository.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN endpoint is used as the DNS server.
    */
  val dnsServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The ARN of the ACM server certificate.
    */
  val serverCertificateArn: Input[String]
  /**
    * Indicates whether split-tunnel is enabled on VPN endpoint. Default value is `false`.
    */
  val splitTunnel: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The transport protocol to be used by the VPN session. Default value is `udp`.
    */
  val transportProtocol: js.UndefOr[Input[String]] = js.undefined
}

object EndpointArgs {
  @scala.inline
  def apply(
    authenticationOptions: Input[EndpointAuthenticationOptions],
    clientCidrBlock: Input[String],
    connectionLogOptions: Input[EndpointConnectionLogOptions],
    serverCertificateArn: Input[String],
    description: Input[String] = null,
    dnsServers: Input[js.Array[Input[String]]] = null,
    splitTunnel: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null,
    transportProtocol: Input[String] = null
  ): EndpointArgs = {
    val __obj = js.Dynamic.literal(authenticationOptions = authenticationOptions.asInstanceOf[js.Any], clientCidrBlock = clientCidrBlock.asInstanceOf[js.Any], connectionLogOptions = connectionLogOptions.asInstanceOf[js.Any], serverCertificateArn = serverCertificateArn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dnsServers != null) __obj.updateDynamic("dnsServers")(dnsServers.asInstanceOf[js.Any])
    if (splitTunnel != null) __obj.updateDynamic("splitTunnel")(splitTunnel.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transportProtocol != null) __obj.updateDynamic("transportProtocol")(transportProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointArgs]
  }
}

