package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTargetId extends js.Object {
  var amount: Double
  var targetId: String
}

object AnonTargetId {
  @scala.inline
  def apply(amount: Double, targetId: String): AnonTargetId = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTargetId]
  }
}

