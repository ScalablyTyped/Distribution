package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HO extends js.Object {
  var H: typings.screeps.screepsStrings.GH = js.native
  var O: typings.screeps.screepsStrings.GO = js.native
}

object HO {
  @scala.inline
  def apply(H: typings.screeps.screepsStrings.GH, O: typings.screeps.screepsStrings.GO): HO = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    __obj.asInstanceOf[HO]
  }
  @scala.inline
  implicit class HOOps[Self <: HO] (val x: Self) extends AnyVal {
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
    def setH(value: typings.screeps.screepsStrings.GH): Self = this.set("H", value.asInstanceOf[js.Any])
    @scala.inline
    def setO(value: typings.screeps.screepsStrings.GO): Self = this.set("O", value.asInstanceOf[js.Any])
  }
  
}

