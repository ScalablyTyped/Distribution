package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData
  extends /* key */ org.scalablytyped.runtime.NumberDictionary[scala.Null | Anon_Amount] {
  var `1`: Anon_AttackType
  var `10`: Anon_Room
  var `2`: Anon_TypeEventDestroyType
  var `3`: scala.Null
   // EVENT_ATTACK_CONTROLLER
  var `4`: Anon_AmountEnergySpent
  var `5`: Anon_AmountTargetId
  var `6`: Anon_AmountHealType
  var `7`: Anon_AmountEnergySpent
  var `8`: Anon_AmountNumber
  var `9`: Anon_AmountEnergySpentNumber
}

object EventData {
  @scala.inline
  def apply(
    `1`: Anon_AttackType,
    `10`: Anon_Room,
    `2`: Anon_TypeEventDestroyType,
    `3`: scala.Null,
    `4`: Anon_AmountEnergySpent,
    `5`: Anon_AmountTargetId,
    `6`: Anon_AmountHealType,
    `7`: Anon_AmountEnergySpent,
    `8`: Anon_AmountNumber,
    `9`: Anon_AmountEnergySpentNumber,
    NumberDictionary: /* key */ org.scalablytyped.runtime.NumberDictionary[scala.Null | Anon_Amount] = null
  ): EventData = {
    val __obj = js.Dynamic.literal(`1` = `1`, `10` = `10`, `2` = `2`, `3` = `3`, `4` = `4`, `5` = `5`, `6` = `6`, `7` = `7`, `8` = `8`, `9` = `9`)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[EventData]
  }
}

