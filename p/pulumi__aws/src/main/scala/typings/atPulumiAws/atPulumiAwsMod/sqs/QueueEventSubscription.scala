package typings.atPulumiAws.atPulumiAwsMod.sqs

import typings.atPulumiAws.sqsSqsMixinsMod.QueueEventHandler
import typings.atPulumiAws.sqsSqsMixinsMod.QueueEventSubscriptionArgs
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sqs.QueueEventSubscription")
@js.native
class QueueEventSubscription protected ()
  extends typings.atPulumiAws.sqsMod.QueueEventSubscription {
  def this(
    name: String,
    queue: typings.atPulumiAws.sqsSqsMixinsMod.sqsQueueMod.Queue,
    handler: QueueEventHandler
  ) = this()
  def this(
    name: String,
    queue: typings.atPulumiAws.sqsSqsMixinsMod.sqsQueueMod.Queue,
    handler: QueueEventHandler,
    args: QueueEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    queue: typings.atPulumiAws.sqsSqsMixinsMod.sqsQueueMod.Queue,
    handler: QueueEventHandler,
    args: QueueEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

