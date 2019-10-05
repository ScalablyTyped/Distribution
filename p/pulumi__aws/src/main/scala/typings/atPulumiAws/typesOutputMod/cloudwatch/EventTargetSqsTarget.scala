package typings.atPulumiAws.typesOutputMod.cloudwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTargetSqsTarget extends js.Object {
  /**
    * The FIFO message group ID to use as the target.
    */
  var messageGroupId: js.UndefOr[String] = js.undefined
}

object EventTargetSqsTarget {
  @scala.inline
  def apply(messageGroupId: String = null): EventTargetSqsTarget = {
    val __obj = js.Dynamic.literal()
    if (messageGroupId != null) __obj.updateDynamic("messageGroupId")(messageGroupId)
    __obj.asInstanceOf[EventTargetSqsTarget]
  }
}

