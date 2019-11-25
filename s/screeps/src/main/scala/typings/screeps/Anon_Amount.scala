package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  var amount: js.UndefOr[Double] = js.undefined
  var attackType: js.UndefOr[EventAttackType] = js.undefined
  var damage: js.UndefOr[Double] = js.undefined
  var energySpent: js.UndefOr[Double] = js.undefined
  var healType: js.UndefOr[EventHealType] = js.undefined
  var room: js.UndefOr[String] = js.undefined
  var targetId: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[EventDestroyType] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object Anon_Amount {
  @scala.inline
  def apply(
    amount: Int | Double = null,
    attackType: EventAttackType = null,
    damage: Int | Double = null,
    energySpent: Int | Double = null,
    healType: EventHealType = null,
    room: String = null,
    targetId: String = null,
    `type`: EventDestroyType = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): Anon_Amount = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (attackType != null) __obj.updateDynamic("attackType")(attackType.asInstanceOf[js.Any])
    if (damage != null) __obj.updateDynamic("damage")(damage.asInstanceOf[js.Any])
    if (energySpent != null) __obj.updateDynamic("energySpent")(energySpent.asInstanceOf[js.Any])
    if (healType != null) __obj.updateDynamic("healType")(healType.asInstanceOf[js.Any])
    if (room != null) __obj.updateDynamic("room")(room.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Amount]
  }
}

