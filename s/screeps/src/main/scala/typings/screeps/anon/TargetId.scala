package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetId extends js.Object {
  var amount: Double
  var targetId: String
}

object TargetId {
  @scala.inline
  def apply(amount: Double, targetId: String): TargetId = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetId]
  }
}

