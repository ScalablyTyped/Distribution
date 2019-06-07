package typings
package atPulumiAwsLib.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudformation", "StackSetInstance")
@js.native
class StackSetInstance protected ()
  extends atPulumiAwsLib.cloudformationStackSetInstanceMod.StackSetInstance {
  /**
    * Create a StackSetInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudformationStackSetInstanceMod.StackSetInstanceArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudformationStackSetInstanceMod.StackSetInstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudformationStackSetInstanceMod.StackSetInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudformationStackSetInstanceMod.StackSetInstanceState
  ): atPulumiAwsLib.cloudformationStackSetInstanceMod.StackSetInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudformationStackSetInstanceMod.StackSetInstanceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudformationStackSetInstanceMod.StackSetInstance = js.native
  /**
    * Returns true if the given object is an instance of StackSetInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSetInstance.StackSetInstance */ scala.Boolean = js.native
}

