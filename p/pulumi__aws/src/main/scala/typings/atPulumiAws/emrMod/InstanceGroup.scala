package typings.atPulumiAws.emrMod

import typings.atPulumiAws.emrInstanceGroupMod.InstanceGroupArgs
import typings.atPulumiAws.emrInstanceGroupMod.InstanceGroupState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/emr", "InstanceGroup")
@js.native
class InstanceGroup protected ()
  extends typings.atPulumiAws.emrInstanceGroupMod.InstanceGroup {
  /**
    * Create a InstanceGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: InstanceGroupArgs) = this()
  def this(name: String, args: InstanceGroupArgs, opts: CustomResourceOptions) = this()
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.emrInstanceGroupMod.InstanceGroup = js.native
  def get(name: String, id: Input[ID], state: InstanceGroupState): typings.atPulumiAws.emrInstanceGroupMod.InstanceGroup = js.native
  def get(name: String, id: Input[ID], state: InstanceGroupState, opts: CustomResourceOptions): typings.atPulumiAws.emrInstanceGroupMod.InstanceGroup = js.native
  /**
    * Returns true if the given object is an instance of InstanceGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/instanceGroup.InstanceGroup */ Boolean = js.native
}

