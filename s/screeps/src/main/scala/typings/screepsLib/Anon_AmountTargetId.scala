package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountTargetId extends js.Object {
  var amount: scala.Double
  // EVENT_HARVEST
  var targetId: java.lang.String
}

object Anon_AmountTargetId {
  @scala.inline
  def apply(amount: scala.Double, targetId: java.lang.String): Anon_AmountTargetId = {
    val __obj = js.Dynamic.literal(amount = amount, targetId = targetId)
  
    __obj.asInstanceOf[Anon_AmountTargetId]
  }
}

