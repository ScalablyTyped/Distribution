package typings
package atPulumiAwsLib.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudhsmv2", "Hsm")
@js.native
class Hsm protected ()
  extends atPulumiAwsLib.cloudhsmv2HsmMod.Hsm {
  /**
    * Create a Hsm resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudhsmv2HsmMod.HsmArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudhsmv2HsmMod.HsmArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/cloudhsmv2", "Hsm")
@js.native
object Hsm extends js.Object {
  /**
    * Get an existing Hsm resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudhsmv2HsmMod.Hsm = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudhsmv2HsmMod.HsmState
  ): atPulumiAwsLib.cloudhsmv2HsmMod.Hsm = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudhsmv2HsmMod.HsmState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudhsmv2HsmMod.Hsm = js.native
}

