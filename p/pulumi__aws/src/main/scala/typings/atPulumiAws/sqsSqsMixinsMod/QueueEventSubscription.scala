package typings.atPulumiAws.sqsSqsMixinsMod

import typings.atPulumiAws.lambdaMod.EventSourceMapping
import typings.atPulumiAws.lambdaMod.EventSubscription
import typings.atPulumiAws.sqsSqsMixinsMod.sqsQueueMod.Queue
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sqs/sqsMixins", "QueueEventSubscription")
@js.native
class QueueEventSubscription protected () extends EventSubscription {
  def this(name: String, queue: Queue, handler: QueueEventHandler) = this()
  def this(name: String, queue: Queue, handler: QueueEventHandler, args: QueueEventSubscriptionArgs) = this()
  def this(
    name: String,
    queue: Queue,
    handler: QueueEventHandler,
    args: QueueEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  /**
    * The underlying sns object created for the subscription.
    */
  val eventSourceMapping: EventSourceMapping = js.native
  val queue: Queue = js.native
}

