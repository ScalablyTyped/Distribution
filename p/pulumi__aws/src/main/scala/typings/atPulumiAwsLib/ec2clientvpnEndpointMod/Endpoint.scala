package typings
package atPulumiAwsLib.ec2clientvpnEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2clientvpn/endpoint", "Endpoint")
@js.native
class Endpoint protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Endpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: EndpointArgs) = this()
  def this(name: java.lang.String, args: EndpointArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Information about the authentication method to be used to authenticate clients.
    */
  val authenticationOptions: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_ActiveDirectoryId] = js.native
  /**
    * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
    */
  val clientCidrBlock: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Information about the client connection logging options.
    */
  val connectionLogOptions: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_CloudwatchLogGroup] = js.native
  /**
    * Name of the repository.
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The DNS name to be used by clients when establishing their VPN session.
    */
  val dnsName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN endpoint is used as the DNS server.
    */
  val dnsServers: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The ARN of the ACM server certificate.
    */
  val serverCertificateArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The current state of the Client VPN endpoint.
    */
  val status: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The transport protocol to be used by the VPN session. Default value is `udp`.
    */
  val transportProtocol: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2clientvpn/endpoint", "Endpoint")
@js.native
object Endpoint extends js.Object {
  /**
    * Get an existing Endpoint resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2clientvpnEndpointMod.Endpoint = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2clientvpnEndpointMod.EndpointState
  ): atPulumiAwsLib.ec2clientvpnEndpointMod.Endpoint = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2clientvpnEndpointMod.EndpointState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2clientvpnEndpointMod.Endpoint = js.native
}

