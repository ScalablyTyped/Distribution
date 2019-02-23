package typings
package atPulumiAwsLib.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ecr", "LifecyclePolicy")
@js.native
class LifecyclePolicy protected ()
  extends atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicy {
  /**
    * Create a LifecyclePolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicyArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ecr", "LifecyclePolicy")
@js.native
object LifecyclePolicy extends js.Object {
  /**
    * Get an existing LifecyclePolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicyState
  ): atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
}

