package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmountTargetId extends js.Object {
  var amount: Double
  var targetId: String
}

object AnonAmountTargetId {
  @scala.inline
  def apply(amount: Double, targetId: String): AnonAmountTargetId = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAmountTargetId]
  }
}

