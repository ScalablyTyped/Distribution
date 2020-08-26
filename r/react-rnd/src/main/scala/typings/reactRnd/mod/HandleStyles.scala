package typings.reactRnd.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleStyles extends js.Object {
  var bottom: js.UndefOr[CSSProperties] = js.native
  var bottomLeft: js.UndefOr[CSSProperties] = js.native
  var bottomRight: js.UndefOr[CSSProperties] = js.native
  var left: js.UndefOr[CSSProperties] = js.native
  var right: js.UndefOr[CSSProperties] = js.native
  var top: js.UndefOr[CSSProperties] = js.native
  var topLeft: js.UndefOr[CSSProperties] = js.native
  var topRight: js.UndefOr[CSSProperties] = js.native
}

object HandleStyles {
  @scala.inline
  def apply(): HandleStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleStyles]
  }
  @scala.inline
  implicit class HandleStylesOps[Self <: HandleStyles] (val x: Self) extends AnyVal {
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
    def setBottom(value: CSSProperties): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setBottomLeft(value: CSSProperties): Self = this.set("bottomLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomLeft: Self = this.set("bottomLeft", js.undefined)
    @scala.inline
    def setBottomRight(value: CSSProperties): Self = this.set("bottomRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomRight: Self = this.set("bottomRight", js.undefined)
    @scala.inline
    def setLeft(value: CSSProperties): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: CSSProperties): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: CSSProperties): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setTopLeft(value: CSSProperties): Self = this.set("topLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopLeft: Self = this.set("topLeft", js.undefined)
    @scala.inline
    def setTopRight(value: CSSProperties): Self = this.set("topRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopRight: Self = this.set("topRight", js.undefined)
  }
  
}

