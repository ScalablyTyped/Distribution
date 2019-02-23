package typings
package atPulumiAwsLib.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "LogResourcePolicy")
@js.native
class LogResourcePolicy protected ()
  extends atPulumiAwsLib.cloudwatchLogResourcePolicyMod.LogResourcePolicy {
  /**
    * Create a LogResourcePolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogResourcePolicyMod.LogResourcePolicyArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogResourcePolicyMod.LogResourcePolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch", "LogResourcePolicy")
@js.native
object LogResourcePolicy extends js.Object {
  /**
    * Get an existing LogResourcePolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchLogResourcePolicyMod.LogResourcePolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchLogResourcePolicyMod.LogResourcePolicyState
  ): atPulumiAwsLib.cloudwatchLogResourcePolicyMod.LogResourcePolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchLogResourcePolicyMod.LogResourcePolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudwatchLogResourcePolicyMod.LogResourcePolicy = js.native
}

