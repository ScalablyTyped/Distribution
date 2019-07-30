package typings.atPulumiAws.lbMod

import typings.atPulumiAws.lbTargetGroupMod.TargetGroupArgs
import typings.atPulumiAws.lbTargetGroupMod.TargetGroupState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lb", "TargetGroup")
@js.native
class TargetGroup protected ()
  extends typings.atPulumiAws.lbTargetGroupMod.TargetGroup {
  /**
    * Create a TargetGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: TargetGroupArgs) = this()
  def this(name: String, args: TargetGroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/lb", "TargetGroup")
@js.native
object TargetGroup extends js.Object {
  /**
    * Get an existing TargetGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.lbTargetGroupMod.TargetGroup = js.native
  def get(name: String, id: Input[ID], state: TargetGroupState): typings.atPulumiAws.lbTargetGroupMod.TargetGroup = js.native
  def get(name: String, id: Input[ID], state: TargetGroupState, opts: CustomResourceOptions): typings.atPulumiAws.lbTargetGroupMod.TargetGroup = js.native
  /**
    * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/targetGroup.TargetGroup */ Boolean = js.native
}

