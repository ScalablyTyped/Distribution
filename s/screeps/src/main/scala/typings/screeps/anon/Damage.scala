package typings.screeps.anon

import typings.screeps.screepsNumbers.`0.7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Damage extends js.Object {
  var damage: `0.7` = js.native
}

object Damage {
  @scala.inline
  def apply(damage: `0.7`): Damage = {
    val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Damage]
  }
  @scala.inline
  implicit class DamageOps[Self <: Damage] (val x: Self) extends AnyVal {
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
    def setDamage(value: `0.7`): Self = this.set("damage", value.asInstanceOf[js.Any])
  }
  
}

