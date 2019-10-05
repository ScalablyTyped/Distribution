package typings.atPulumiAws.typesInputMod.cloudwatch

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTargetSqsTarget extends js.Object {
  /**
    * The FIFO message group ID to use as the target.
    */
  var messageGroupId: js.UndefOr[Input[String]] = js.undefined
}

object EventTargetSqsTarget {
  @scala.inline
  def apply(messageGroupId: Input[String] = null): EventTargetSqsTarget = {
    val __obj = js.Dynamic.literal()
    if (messageGroupId != null) __obj.updateDynamic("messageGroupId")(messageGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetSqsTarget]
  }
}

