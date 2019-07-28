package typings.atPulumiAws.cloudformationMod

import typings.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstanceArgs
import typings.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstanceState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudformation", "StackSetInstance")
@js.native
class StackSetInstance protected ()
  extends typings.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstance {
  /**
    * Create a StackSetInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: StackSetInstanceArgs) = this()
  def this(name: String, args: StackSetInstanceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cloudformation", "StackSetInstance")
@js.native
object StackSetInstance extends js.Object {
  /**
    * Get an existing StackSetInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstance = js.native
  def get(name: String, id: Input[ID], state: StackSetInstanceState): typings.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstance = js.native
  def get(name: String, id: Input[ID], state: StackSetInstanceState, opts: CustomResourceOptions): typings.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstance = js.native
  /**
    * Returns true if the given object is an instance of StackSetInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSetInstance.StackSetInstance */ Boolean = js.native
}

