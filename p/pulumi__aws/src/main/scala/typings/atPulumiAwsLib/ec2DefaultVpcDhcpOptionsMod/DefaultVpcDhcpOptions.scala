package typings
package atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/defaultVpcDhcpOptions", "DefaultVpcDhcpOptions")
@js.native
class DefaultVpcDhcpOptions protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a DefaultVpcDhcpOptions resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: DefaultVpcDhcpOptionsArgs) = this()
  def this(name: java.lang.String, args: DefaultVpcDhcpOptionsArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val domainName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val domainNameServers: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * List of NETBIOS name servers.
    */
  val netbiosNameServers: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
    */
  val netbiosNodeType: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val ntpServers: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the AWS account that owns the DHCP options set.
    */
  val ownerId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
}

@JSImport("@pulumi/aws/ec2/defaultVpcDhcpOptions", "DefaultVpcDhcpOptions")
@js.native
object DefaultVpcDhcpOptions extends js.Object {
  /**
    * Get an existing DefaultVpcDhcpOptions resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod.DefaultVpcDhcpOptions = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod.DefaultVpcDhcpOptionsState
  ): atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod.DefaultVpcDhcpOptions = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod.DefaultVpcDhcpOptionsState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod.DefaultVpcDhcpOptions = js.native
}

