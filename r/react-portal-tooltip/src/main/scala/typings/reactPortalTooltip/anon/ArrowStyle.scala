package typings.reactPortalTooltip.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowStyle extends js.Object {
  var arrowStyle: js.UndefOr[CSSProperties] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object ArrowStyle {
  @scala.inline
  def apply(): ArrowStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowStyle]
  }
  @scala.inline
  implicit class ArrowStyleOps[Self <: ArrowStyle] (val x: Self) extends AnyVal {
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
    def setArrowStyle(value: CSSProperties): Self = this.set("arrowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowStyle: Self = this.set("arrowStyle", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

