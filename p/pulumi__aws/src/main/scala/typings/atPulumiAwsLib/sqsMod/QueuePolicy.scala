package typings
package atPulumiAwsLib.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sqs", "QueuePolicy")
@js.native
class QueuePolicy protected ()
  extends atPulumiAwsLib.sqsQueuePolicyMod.QueuePolicy {
  /**
    * Create a QueuePolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.sqsQueuePolicyMod.QueuePolicyArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.sqsQueuePolicyMod.QueuePolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/sqs", "QueuePolicy")
@js.native
object QueuePolicy extends js.Object {
  /**
    * Get an existing QueuePolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sqsQueuePolicyMod.QueuePolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sqsQueuePolicyMod.QueuePolicyState
  ): atPulumiAwsLib.sqsQueuePolicyMod.QueuePolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sqsQueuePolicyMod.QueuePolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.sqsQueuePolicyMod.QueuePolicy = js.native
}

