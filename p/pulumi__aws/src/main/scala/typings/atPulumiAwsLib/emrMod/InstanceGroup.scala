package typings
package atPulumiAwsLib.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/emr", "InstanceGroup")
@js.native
class InstanceGroup protected ()
  extends atPulumiAwsLib.emrInstanceGroupMod.InstanceGroup {
  /**
    * Create a InstanceGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.emrInstanceGroupMod.InstanceGroupArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.emrInstanceGroupMod.InstanceGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/emr", "InstanceGroup")
@js.native
object InstanceGroup extends js.Object {
  /**
    * Get an existing InstanceGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.emrInstanceGroupMod.InstanceGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.emrInstanceGroupMod.InstanceGroupState
  ): atPulumiAwsLib.emrInstanceGroupMod.InstanceGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.emrInstanceGroupMod.InstanceGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.emrInstanceGroupMod.InstanceGroup = js.native
}

