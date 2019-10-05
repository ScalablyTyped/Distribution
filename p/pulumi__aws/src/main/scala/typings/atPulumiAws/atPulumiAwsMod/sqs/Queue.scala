package typings.atPulumiAws.atPulumiAwsMod.sqs

import typings.atPulumiAws.sqsQueueMod.QueueArgs
import typings.atPulumiAws.sqsQueueMod.QueueState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sqs.Queue")
@js.native
class Queue protected ()
  extends typings.atPulumiAws.sqsMod.Queue {
  /**
    * Create a Queue resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: QueueArgs) = this()
  def this(name: String, args: QueueArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "sqs.Queue")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.sqsSqsMixinsMod.sqsQueueMod.Queue = js.native
  def get(name: String, id: Input[ID], state: QueueState): typings.atPulumiAws.sqsSqsMixinsMod.sqsQueueMod.Queue = js.native
  def get(name: String, id: Input[ID], state: QueueState, opts: CustomResourceOptions): typings.atPulumiAws.sqsSqsMixinsMod.sqsQueueMod.Queue = js.native
  /**
    * Returns true if the given object is an instance of Queue.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sqs/sqsMixins.@pulumi/aws/sqs/queue.Queue */ Boolean = js.native
}

