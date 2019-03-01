package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  var amount: js.UndefOr[scala.Double] = js.undefined
  var attackType: js.UndefOr[EventAttackType] = js.undefined
  var damage: js.UndefOr[scala.Double] = js.undefined
  var energySpent: js.UndefOr[scala.Double] = js.undefined
  var healType: js.UndefOr[EventHealType] = js.undefined
  var room: js.UndefOr[java.lang.String] = js.undefined
  var targetId: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[EventDestroyType] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Amount {
  @scala.inline
  def apply(
    amount: scala.Int | scala.Double = null,
    attackType: EventAttackType = null,
    damage: scala.Int | scala.Double = null,
    energySpent: scala.Int | scala.Double = null,
    healType: EventHealType = null,
    room: java.lang.String = null,
    targetId: java.lang.String = null,
    `type`: EventDestroyType = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Anon_Amount = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (attackType != null) __obj.updateDynamic("attackType")(attackType.asInstanceOf[js.Any])
    if (damage != null) __obj.updateDynamic("damage")(damage.asInstanceOf[js.Any])
    if (energySpent != null) __obj.updateDynamic("energySpent")(energySpent.asInstanceOf[js.Any])
    if (healType != null) __obj.updateDynamic("healType")(healType.asInstanceOf[js.Any])
    if (room != null) __obj.updateDynamic("room")(room)
    if (targetId != null) __obj.updateDynamic("targetId")(targetId)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Amount]
  }
}

