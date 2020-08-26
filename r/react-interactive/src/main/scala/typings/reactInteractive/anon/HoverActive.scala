package typings.reactInteractive.anon

import typings.react.mod.CSSProperties
import typings.reactInteractive.mod.ActiveProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoverActive extends ActiveProps {
  var hoverActive: js.UndefOr[CSSProperties] = js.native
  var keyActive: js.UndefOr[CSSProperties] = js.native
  var touchActive: js.UndefOr[CSSProperties] = js.native
}

object HoverActive {
  @scala.inline
  def apply(): HoverActive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverActive]
  }
  @scala.inline
  implicit class HoverActiveOps[Self <: HoverActive] (val x: Self) extends AnyVal {
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
    def setHoverActive(value: CSSProperties): Self = this.set("hoverActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverActive: Self = this.set("hoverActive", js.undefined)
    @scala.inline
    def setKeyActive(value: CSSProperties): Self = this.set("keyActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyActive: Self = this.set("keyActive", js.undefined)
    @scala.inline
    def setTouchActive(value: CSSProperties): Self = this.set("touchActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchActive: Self = this.set("touchActive", js.undefined)
  }
  
}

