package typings.screeps

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictpart extends /* part */ StringDictionary[StringDictionary[StringDictionary[Double]]] {
  var attack: AnonUH
  var carry: AnonKH
  var heal: AnonLHO2
  var move: AnonXZHO2
  var ranged_attack: AnonKHO2
  var tough: AnonGHO2
  var work: AnonLH
}

object AnonDictpart {
  @scala.inline
  def apply(
    attack: AnonUH,
    carry: AnonKH,
    heal: AnonLHO2,
    move: AnonXZHO2,
    ranged_attack: AnonKHO2,
    tough: AnonGHO2,
    work: AnonLH,
    StringDictionary: /* part */ StringDictionary[StringDictionary[StringDictionary[Double]]] = null
  ): AnonDictpart = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any], carry = carry.asInstanceOf[js.Any], heal = heal.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], ranged_attack = ranged_attack.asInstanceOf[js.Any], tough = tough.asInstanceOf[js.Any], work = work.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictpart]
  }
}

