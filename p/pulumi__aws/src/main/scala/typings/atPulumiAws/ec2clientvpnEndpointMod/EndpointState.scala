package typings.atPulumiAws.ec2clientvpnEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2clientvpn.EndpointAuthenticationOptions
import typings.atPulumiAws.typesInputMod.ec2clientvpn.EndpointConnectionLogOptions
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointState extends js.Object {
  /**
    * Information about the authentication method to be used to authenticate clients.
    */
  val authenticationOptions: js.UndefOr[Input[EndpointAuthenticationOptions]] = js.native
  /**
    * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
    */
  val clientCidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * Information about the client connection logging options.
    */
  val connectionLogOptions: js.UndefOr[Input[EndpointConnectionLogOptions]] = js.native
  /**
    * Name of the repository.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The DNS name to be used by clients when establishing their VPN session.
    */
  val dnsName: js.UndefOr[Input[String]] = js.native
  /**
    * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN endpoint is used as the DNS server.
    */
  val dnsServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ARN of the ACM server certificate.
    */
  val serverCertificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether split-tunnel is enabled on VPN endpoint. Default value is `false`.
    */
  val splitTunnel: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The current state of the Client VPN endpoint.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The transport protocol to be used by the VPN session. Default value is `udp`.
    */
  val transportProtocol: js.UndefOr[Input[String]] = js.native
}

object EndpointState {
  @scala.inline
  def apply(
    authenticationOptions: Input[EndpointAuthenticationOptions] = null,
    clientCidrBlock: Input[String] = null,
    connectionLogOptions: Input[EndpointConnectionLogOptions] = null,
    description: Input[String] = null,
    dnsName: Input[String] = null,
    dnsServers: Input[js.Array[Input[String]]] = null,
    serverCertificateArn: Input[String] = null,
    splitTunnel: Input[Boolean] = null,
    status: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    transportProtocol: Input[String] = null
  ): EndpointState = {
    val __obj = js.Dynamic.literal()
    if (authenticationOptions != null) __obj.updateDynamic("authenticationOptions")(authenticationOptions.asInstanceOf[js.Any])
    if (clientCidrBlock != null) __obj.updateDynamic("clientCidrBlock")(clientCidrBlock.asInstanceOf[js.Any])
    if (connectionLogOptions != null) __obj.updateDynamic("connectionLogOptions")(connectionLogOptions.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dnsName != null) __obj.updateDynamic("dnsName")(dnsName.asInstanceOf[js.Any])
    if (dnsServers != null) __obj.updateDynamic("dnsServers")(dnsServers.asInstanceOf[js.Any])
    if (serverCertificateArn != null) __obj.updateDynamic("serverCertificateArn")(serverCertificateArn.asInstanceOf[js.Any])
    if (splitTunnel != null) __obj.updateDynamic("splitTunnel")(splitTunnel.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transportProtocol != null) __obj.updateDynamic("transportProtocol")(transportProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointState]
  }
}

