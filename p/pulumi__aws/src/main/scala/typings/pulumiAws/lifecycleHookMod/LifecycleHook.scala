package typings.pulumiAws.lifecycleHookMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/autoscaling/lifecycleHook", "LifecycleHook")
@js.native
class LifecycleHook protected () extends CustomResource {
  /**
    * Create a LifecycleHook resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LifecycleHookArgs) = this()
  def this(name: String, args: LifecycleHookArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The name of the Auto Scaling group to which you want to assign the lifecycle hook
    */
  val autoscalingGroupName: Output_[String] = js.native
  
  /**
    * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The value for this parameter can be either CONTINUE or ABANDON. The default value for this parameter is ABANDON.
    */
  val defaultResult: Output_[String] = js.native
  
  /**
    * Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the DefaultResult parameter
    */
  val heartbeatTimeout: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see [describe-lifecycle-hook-types](https://docs.aws.amazon.com/cli/latest/reference/autoscaling/describe-lifecycle-hook-types.html#examples)
    */
  val lifecycleTransition: Output_[String] = js.native
  
  /**
    * The name of the lifecycle hook.
    */
  val name: Output_[String] = js.native
  
  /**
    * Contains additional information that you want to include any time Auto Scaling sends a message to the notification target.
    */
  val notificationMetadata: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition state for the lifecycle hook. This ARN target can be either an SQS queue or an SNS topic.
    */
  val notificationTargetArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
    */
  val roleArn: Output_[js.UndefOr[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/autoscaling/lifecycleHook", "LifecycleHook")
@js.native
object LifecycleHook extends js.Object {
  
  /**
    * Get an existing LifecycleHook resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LifecycleHook = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LifecycleHook = js.native
  def get(name: String, id: Input[ID], state: LifecycleHookState): LifecycleHook = js.native
  def get(name: String, id: Input[ID], state: LifecycleHookState, opts: CustomResourceOptions): LifecycleHook = js.native
  
  /**
    * Returns true if the given object is an instance of LifecycleHook.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/lifecycleHook.LifecycleHook */ Boolean = js.native
}
