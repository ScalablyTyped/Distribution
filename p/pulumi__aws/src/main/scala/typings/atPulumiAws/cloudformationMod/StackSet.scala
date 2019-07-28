package typings.atPulumiAws.cloudformationMod

import typings.atPulumiAws.cloudformationStackSetMod.StackSetArgs
import typings.atPulumiAws.cloudformationStackSetMod.StackSetState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudformation", "StackSet")
@js.native
class StackSet protected ()
  extends typings.atPulumiAws.cloudformationStackSetMod.StackSet {
  /**
    * Create a StackSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: StackSetArgs) = this()
  def this(name: String, args: StackSetArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cloudformation", "StackSet")
@js.native
object StackSet extends js.Object {
  /**
    * Get an existing StackSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudformationStackSetMod.StackSet = js.native
  def get(name: String, id: Input[ID], state: StackSetState): typings.atPulumiAws.cloudformationStackSetMod.StackSet = js.native
  def get(name: String, id: Input[ID], state: StackSetState, opts: CustomResourceOptions): typings.atPulumiAws.cloudformationStackSetMod.StackSet = js.native
  /**
    * Returns true if the given object is an instance of StackSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSet.StackSet */ Boolean = js.native
}

