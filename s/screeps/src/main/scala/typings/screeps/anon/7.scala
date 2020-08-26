package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `7` extends js.Object {
  var attack: typings.screeps.screepsNumbers.`4` = js.native
}

object `7` {
  @scala.inline
  def apply(attack: typings.screeps.screepsNumbers.`4`): `7` = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  @scala.inline
  implicit class `7Ops`[Self <: `7`] (val x: Self) extends AnyVal {
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
    def setAttack(value: typings.screeps.screepsNumbers.`4`): Self = this.set("attack", value.asInstanceOf[js.Any])
  }
  
}

