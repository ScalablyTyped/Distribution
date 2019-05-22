package typings
package atPulumiAwsLib.sqsSqsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sqs/sqsMixins", "QueueEventSubscription")
@js.native
class QueueEventSubscription protected ()
  extends atPulumiAwsLib.lambdaMod.EventSubscription {
  def this(name: java.lang.String, queue: atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue, handler: QueueEventHandler) = this()
  def this(name: java.lang.String, queue: atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue, handler: QueueEventHandler, args: QueueEventSubscriptionArgs) = this()
  def this(name: java.lang.String, queue: atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue, handler: QueueEventHandler, args: QueueEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  /**
    * The underlying sns object created for the subscription.
    */
  val eventSourceMapping: atPulumiAwsLib.lambdaMod.EventSourceMapping = js.native
  val queue: atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue = js.native
}

