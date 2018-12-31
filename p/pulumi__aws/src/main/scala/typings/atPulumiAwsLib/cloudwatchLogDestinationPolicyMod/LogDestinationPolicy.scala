package typings
package atPulumiAwsLib.cloudwatchLogDestinationPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/logDestinationPolicy", "LogDestinationPolicy")
@js.native
class LogDestinationPolicy protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a LogDestinationPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: LogDestinationPolicyArgs) = this()
  def this(name: java.lang.String, args: LogDestinationPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The policy document. This is a JSON formatted string.
    */
  val accessPolicy: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A name for the subscription filter
    */
  val destinationName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

@JSImport("@pulumi/aws/cloudwatch/logDestinationPolicy", "LogDestinationPolicy")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicyState
  ): atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicy = js.native
}

