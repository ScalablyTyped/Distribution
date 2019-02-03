package typings
package atPulumiAwsLib.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/autoscaling", "LifecycleHook")
@js.native
class LifecycleHook protected ()
  extends atPulumiAwsLib.autoscalingLifecycleHookMod.LifecycleHook {
  /**
    * Create a LifecycleHook resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.autoscalingLifecycleHookMod.LifecycleHookArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.autoscalingLifecycleHookMod.LifecycleHookArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.autoscalingLifecycleHookMod.LifecycleHook = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.autoscalingLifecycleHookMod.LifecycleHookState
  ): atPulumiAwsLib.autoscalingLifecycleHookMod.LifecycleHook = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.autoscalingLifecycleHookMod.LifecycleHookState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.autoscalingLifecycleHookMod.LifecycleHook = js.native
}

