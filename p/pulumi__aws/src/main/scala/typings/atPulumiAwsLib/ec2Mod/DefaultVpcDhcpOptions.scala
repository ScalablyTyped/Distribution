package typings
package atPulumiAwsLib.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "DefaultVpcDhcpOptions")
@js.native
class DefaultVpcDhcpOptions protected ()
  extends atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod.DefaultVpcDhcpOptions {
  /**
    * Create a DefaultVpcDhcpOptions resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod.DefaultVpcDhcpOptionsArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod.DefaultVpcDhcpOptionsArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2", "DefaultVpcDhcpOptions")
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

