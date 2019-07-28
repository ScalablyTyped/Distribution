package typings.atPulumiAws.autoscalingMod

import typings.atPulumiAws.autoscalingLifecycleHookMod.LifecycleHookArgs
import typings.atPulumiAws.autoscalingLifecycleHookMod.LifecycleHookState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/autoscaling", "LifecycleHook")
@js.native
class LifecycleHook protected ()
  extends typings.atPulumiAws.autoscalingLifecycleHookMod.LifecycleHook {
  /**
    * Create a LifecycleHook resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LifecycleHookArgs) = this()
  def this(name: String, args: LifecycleHookArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/autoscaling", "LifecycleHook")
@js.native
object LifecycleHook extends js.Object {
  /**
    * Get an existing LifecycleHook resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.autoscalingLifecycleHookMod.LifecycleHook = js.native
  def get(name: String, id: Input[ID], state: LifecycleHookState): typings.atPulumiAws.autoscalingLifecycleHookMod.LifecycleHook = js.native
  def get(name: String, id: Input[ID], state: LifecycleHookState, opts: CustomResourceOptions): typings.atPulumiAws.autoscalingLifecycleHookMod.LifecycleHook = js.native
  /**
    * Returns true if the given object is an instance of LifecycleHook.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/lifecycleHook.LifecycleHook */ Boolean = js.native
}

