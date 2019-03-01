package typings
package atPulumiAwsLib.ec2clientvpnEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointArgs extends js.Object {
  /**
    * Information about the authentication method to be used to authenticate clients.
    */
  val authenticationOptions: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ActiveDirectoryIdRootCertificateChainArn]
  /**
    * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
    */
  val clientCidrBlock: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Information about the client connection logging options.
    */
  val connectionLogOptions: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CloudwatchLogGroupCloudwatchLogStream]
  /**
    * Name of the repository.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN endpoint is used as the DNS server.
    */
  val dnsServers: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ARN of the ACM server certificate.
    */
  val serverCertificateArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The transport protocol to be used by the VPN session. Default value is `udp`.
    */
  val transportProtocol: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object EndpointArgs {
  @scala.inline
  def apply(
    authenticationOptions: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ActiveDirectoryIdRootCertificateChainArn],
    clientCidrBlock: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    connectionLogOptions: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CloudwatchLogGroupCloudwatchLogStream],
    serverCertificateArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dnsServers: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    transportProtocol: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): EndpointArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticationOptions")(authenticationOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("clientCidrBlock")(clientCidrBlock.asInstanceOf[js.Any])
    __obj.updateDynamic("connectionLogOptions")(connectionLogOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("serverCertificateArn")(serverCertificateArn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dnsServers != null) __obj.updateDynamic("dnsServers")(dnsServers.asInstanceOf[js.Any])
    if (transportProtocol != null) __obj.updateDynamic("transportProtocol")(transportProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointArgs]
  }
}

