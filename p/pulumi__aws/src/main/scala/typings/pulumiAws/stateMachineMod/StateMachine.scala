package typings.pulumiAws.stateMachineMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sfn/stateMachine", "StateMachine")
@js.native
class StateMachine protected () extends CustomResource {
  /**
    * Create a StateMachine resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: StateMachineArgs) = this()
  def this(name: String, args: StateMachineArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the state machine.
    */
  val arn: Output_[String] = js.native
  /**
    * The date the state machine was created.
    */
  val creationDate: Output_[String] = js.native
  /**
    * The Amazon States Language definition of the state machine.
    */
  val definition: Output_[String] = js.native
  /**
    * The name of the state machine.
    */
  val name: Output_[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
    */
  val roleArn: Output_[String] = js.native
  /**
    * The current status of the state machine. Either "ACTIVE" or "DELETING".
    */
  val status: Output_[String] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/sfn/stateMachine", "StateMachine")
@js.native
object StateMachine extends js.Object {
  /**
    * Get an existing StateMachine resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): StateMachine = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): StateMachine = js.native
  def get(name: String, id: Input[ID], state: StateMachineState): StateMachine = js.native
  def get(name: String, id: Input[ID], state: StateMachineState, opts: CustomResourceOptions): StateMachine = js.native
  /**
    * Returns true if the given object is an instance of StateMachine.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sfn/stateMachine.StateMachine */ Boolean = js.native
}

