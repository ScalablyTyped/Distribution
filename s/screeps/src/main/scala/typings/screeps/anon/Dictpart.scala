package typings.screeps.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictpart extends /* part */ StringDictionary[StringDictionary[StringDictionary[Double]]] {
  var attack: UH = js.native
  var carry: KH = js.native
  var heal: LHO2 = js.native
  var move: XZHO2 = js.native
  var ranged_attack: KHO2 = js.native
  var tough: GHO2 = js.native
  var work: GH = js.native
}

object Dictpart {
  @scala.inline
  def apply(attack: UH, carry: KH, heal: LHO2, move: XZHO2, ranged_attack: KHO2, tough: GHO2, work: GH): Dictpart = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any], carry = carry.asInstanceOf[js.Any], heal = heal.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], ranged_attack = ranged_attack.asInstanceOf[js.Any], tough = tough.asInstanceOf[js.Any], work = work.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictpart]
  }
  @scala.inline
  implicit class DictpartOps[Self <: Dictpart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttack(value: UH): Self = this.set("attack", value.asInstanceOf[js.Any])
    @scala.inline
    def setCarry(value: KH): Self = this.set("carry", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeal(value: LHO2): Self = this.set("heal", value.asInstanceOf[js.Any])
    @scala.inline
    def setMove(value: XZHO2): Self = this.set("move", value.asInstanceOf[js.Any])
    @scala.inline
    def setRanged_attack(value: KHO2): Self = this.set("ranged_attack", value.asInstanceOf[js.Any])
    @scala.inline
    def setTough(value: GHO2): Self = this.set("tough", value.asInstanceOf[js.Any])
    @scala.inline
    def setWork(value: GH): Self = this.set("work", value.asInstanceOf[js.Any])
  }
  
}

