package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `16` extends js.Object {
  var OH: typings.screeps.screepsStrings.GH2O = js.native
}

object `16` {
  @scala.inline
  def apply(OH: typings.screeps.screepsStrings.GH2O): `16` = {
    val __obj = js.Dynamic.literal(OH = OH.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
  @scala.inline
  implicit class `16Ops`[Self <: `16`] (val x: Self) extends AnyVal {
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
    def setOH(value: typings.screeps.screepsStrings.GH2O): Self = this.set("OH", value.asInstanceOf[js.Any])
  }
  
}

