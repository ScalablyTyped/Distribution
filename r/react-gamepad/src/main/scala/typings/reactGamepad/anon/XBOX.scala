package typings.reactGamepad.anon

import typings.reactGamepad.mod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XBOX extends js.Object {
  var XBOX: Layout = js.native
}

object XBOX {
  @scala.inline
  def apply(XBOX: Layout): XBOX = {
    val __obj = js.Dynamic.literal(XBOX = XBOX.asInstanceOf[js.Any])
    __obj.asInstanceOf[XBOX]
  }
  @scala.inline
  implicit class XBOXOps[Self <: XBOX] (val x: Self) extends AnyVal {
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
    def setXBOX(value: Layout): Self = this.set("XBOX", value.asInstanceOf[js.Any])
  }
  
}

