package typings.screeps.anon

import typings.screeps.screepsStrings.ZHO2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `20` extends js.Object {
  var OH: ZHO2 = js.native
}

object `20` {
  @scala.inline
  def apply(OH: ZHO2): `20` = {
    val __obj = js.Dynamic.literal(OH = OH.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  @scala.inline
  implicit class `20Ops`[Self <: `20`] (val x: Self) extends AnyVal {
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
    def setOH(value: ZHO2): Self = this.set("OH", value.asInstanceOf[js.Any])
  }
  
}

