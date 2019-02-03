package typings
package atPulumiAwsLib.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sqs", "Queue")
@js.native
class Queue protected ()
  extends atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue {
  /**
    * Create a Queue resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.sqsQueueMod.QueueArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.sqsQueueMod.QueueArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/sqs", "Queue")
@js.native
object Queue extends js.Object {
  /**
    * Get an existing Queue resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sqsQueueMod.QueueState
  ): atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sqsQueueMod.QueueState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue = js.native
}

