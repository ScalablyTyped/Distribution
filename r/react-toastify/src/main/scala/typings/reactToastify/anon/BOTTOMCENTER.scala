package typings.reactToastify.anon

import typings.reactToastify.typesMod.ToastPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BOTTOMCENTER extends js.Object {
  var BOTTOM_CENTER: ToastPosition = js.native
  var BOTTOM_LEFT: ToastPosition = js.native
  var BOTTOM_RIGHT: ToastPosition = js.native
  var TOP_CENTER: ToastPosition = js.native
  var TOP_LEFT: ToastPosition = js.native
  var TOP_RIGHT: ToastPosition = js.native
}

object BOTTOMCENTER {
  @scala.inline
  def apply(
    BOTTOM_CENTER: ToastPosition,
    BOTTOM_LEFT: ToastPosition,
    BOTTOM_RIGHT: ToastPosition,
    TOP_CENTER: ToastPosition,
    TOP_LEFT: ToastPosition,
    TOP_RIGHT: ToastPosition
  ): BOTTOMCENTER = {
    val __obj = js.Dynamic.literal(BOTTOM_CENTER = BOTTOM_CENTER.asInstanceOf[js.Any], BOTTOM_LEFT = BOTTOM_LEFT.asInstanceOf[js.Any], BOTTOM_RIGHT = BOTTOM_RIGHT.asInstanceOf[js.Any], TOP_CENTER = TOP_CENTER.asInstanceOf[js.Any], TOP_LEFT = TOP_LEFT.asInstanceOf[js.Any], TOP_RIGHT = TOP_RIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[BOTTOMCENTER]
  }
  @scala.inline
  implicit class BOTTOMCENTEROps[Self <: BOTTOMCENTER] (val x: Self) extends AnyVal {
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
    def setBOTTOM_CENTER(value: ToastPosition): Self = this.set("BOTTOM_CENTER", value.asInstanceOf[js.Any])
    @scala.inline
    def setBOTTOM_LEFT(value: ToastPosition): Self = this.set("BOTTOM_LEFT", value.asInstanceOf[js.Any])
    @scala.inline
    def setBOTTOM_RIGHT(value: ToastPosition): Self = this.set("BOTTOM_RIGHT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOP_CENTER(value: ToastPosition): Self = this.set("TOP_CENTER", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOP_LEFT(value: ToastPosition): Self = this.set("TOP_LEFT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOP_RIGHT(value: ToastPosition): Self = this.set("TOP_RIGHT", value.asInstanceOf[js.Any])
  }
  
}

