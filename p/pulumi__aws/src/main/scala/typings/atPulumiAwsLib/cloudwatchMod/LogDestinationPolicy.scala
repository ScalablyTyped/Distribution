package typings
package atPulumiAwsLib.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "LogDestinationPolicy")
@js.native
class LogDestinationPolicy protected ()
  extends atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicy {
  /**
    * Create a LogDestinationPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicyArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch", "LogDestinationPolicy")
@js.native
object LogDestinationPolicy extends js.Object {
  /**
    * Get an existing LogDestinationPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicyState
  ): atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicy = js.native
}

