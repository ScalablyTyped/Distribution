package typings.pulumiAws.redriveMod

import typings.pulumiAws.arnMod.ARN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedrivePolicy extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value of
    * `maxReceiveCount` is exceeded.
    */
  var deadLetterTargetArn: ARN = js.native
  /**
    * The number of times a message is delivered to the source queue before being moved to the dead-letter queue.
    *
    * Note: The dead-letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead-letter queue of a
    * standard queue must also be a standard queue.
    */
  var maxReceiveCount: Double = js.native
}

object RedrivePolicy {
  @scala.inline
  def apply(deadLetterTargetArn: ARN, maxReceiveCount: Double): RedrivePolicy = {
    val __obj = js.Dynamic.literal(deadLetterTargetArn = deadLetterTargetArn.asInstanceOf[js.Any], maxReceiveCount = maxReceiveCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedrivePolicy]
  }
}

