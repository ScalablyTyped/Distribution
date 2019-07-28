package typings.atPulumiAws.ec2VpcDhcpOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpcDhcpOptions", "VpcDhcpOptions")
@js.native
class VpcDhcpOptions protected () extends CustomResource {
  /**
    * Create a VpcDhcpOptions resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: VpcDhcpOptionsArgs) = this()
  def this(name: String, args: VpcDhcpOptionsArgs, opts: CustomResourceOptions) = this()
  /**
    * the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
    */
  val domainName: Output[js.UndefOr[String]] = js.native
  /**
    * List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
    */
  val domainNameServers: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * List of NETBIOS name servers.
    */
  val netbiosNameServers: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
    */
  val netbiosNodeType: Output[js.UndefOr[String]] = js.native
  /**
    * List of NTP servers to configure.
    */
  val ntpServers: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The ID of the AWS account that owns the DHCP options set.
    */
  val ownerId: Output[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpcDhcpOptions", "VpcDhcpOptions")
@js.native
object VpcDhcpOptions extends js.Object {
  /**
    * Get an existing VpcDhcpOptions resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): VpcDhcpOptions = js.native
  def get(name: String, id: Input[ID], state: VpcDhcpOptionsState): VpcDhcpOptions = js.native
  def get(name: String, id: Input[ID], state: VpcDhcpOptionsState, opts: CustomResourceOptions): VpcDhcpOptions = js.native
  /**
    * Returns true if the given object is an instance of VpcDhcpOptions.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcDhcpOptions.VpcDhcpOptions */ Boolean = js.native
}

