package typings.roxBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoxFlagOptions extends js.Object {
  var freeze: js.UndefOr[RoxFlagFreezeLevel] = js.native
}

object RoxFlagOptions {
  @scala.inline
  def apply(): RoxFlagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoxFlagOptions]
  }
  @scala.inline
  implicit class RoxFlagOptionsOps[Self <: RoxFlagOptions] (val x: Self) extends AnyVal {
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
    def setFreeze(value: RoxFlagFreezeLevel): Self = this.set("freeze", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeze: Self = this.set("freeze", js.undefined)
  }
  
}

