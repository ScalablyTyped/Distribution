package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountTargetId extends js.Object {
  var amount: Double
  // EVENT_HARVEST
  var targetId: String
}

object Anon_AmountTargetId {
  @scala.inline
  def apply(amount: Double, targetId: String): Anon_AmountTargetId = {
    val __obj = js.Dynamic.literal(amount = amount, targetId = targetId)
  
    __obj.asInstanceOf[Anon_AmountTargetId]
  }
}

