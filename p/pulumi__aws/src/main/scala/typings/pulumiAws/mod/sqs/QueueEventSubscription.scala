package typings.pulumiAws.mod.sqs

import typings.pulumiAws.sqsMixinsMod.QueueEventHandler
import typings.pulumiAws.sqsMixinsMod.QueueEventSubscriptionArgs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sqs.QueueEventSubscription")
@js.native
class QueueEventSubscription protected ()
  extends typings.pulumiAws.sqsMod.QueueEventSubscription {
  def this(name: String, queue: typings.pulumiAws.sqsQueueMod.Queue, handler: QueueEventHandler) = this()
  def this(
    name: String,
    queue: typings.pulumiAws.sqsQueueMod.Queue,
    handler: QueueEventHandler,
    args: QueueEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    queue: typings.pulumiAws.sqsQueueMod.Queue,
    handler: QueueEventHandler,
    args: QueueEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

