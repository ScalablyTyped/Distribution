package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountHealType extends js.Object {
  var amount: scala.Double
  var healType: EventHealType
  // EVENT_HEAL
  var targetId: java.lang.String
}

object Anon_AmountHealType {
  @scala.inline
  def apply(amount: scala.Double, healType: EventHealType, targetId: java.lang.String): Anon_AmountHealType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("healType")(healType.asInstanceOf[js.Any])
    __obj.updateDynamic("targetId")(targetId)
    __obj.asInstanceOf[Anon_AmountHealType]
  }
}

