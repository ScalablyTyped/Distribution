package typings.screeps.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictpart extends /* part */ StringDictionary[StringDictionary[StringDictionary[Double]]] {
  var attack: UH
  var carry: KH
  var heal: LHO2
  var move: XZHO2
  var ranged_attack: KHO2
  var tough: GHO2
  var work: GH
}

object Dictpart {
  @scala.inline
  def apply(
    attack: UH,
    carry: KH,
    heal: LHO2,
    move: XZHO2,
    ranged_attack: KHO2,
    tough: GHO2,
    work: GH,
    StringDictionary: /* part */ StringDictionary[StringDictionary[StringDictionary[Double]]] = null
  ): Dictpart = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any], carry = carry.asInstanceOf[js.Any], heal = heal.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], ranged_attack = ranged_attack.asInstanceOf[js.Any], tough = tough.asInstanceOf[js.Any], work = work.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictpart]
  }
}

