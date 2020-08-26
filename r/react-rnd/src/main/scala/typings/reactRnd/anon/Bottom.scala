package typings.reactRnd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bottom extends js.Object {
  var bottom: js.UndefOr[Boolean] = js.native
  var bottomLeft: js.UndefOr[Boolean] = js.native
  var bottomRight: js.UndefOr[Boolean] = js.native
  var left: js.UndefOr[Boolean] = js.native
  var right: js.UndefOr[Boolean] = js.native
  var top: js.UndefOr[Boolean] = js.native
  var topLeft: js.UndefOr[Boolean] = js.native
  var topRight: js.UndefOr[Boolean] = js.native
}

object Bottom {
  @scala.inline
  def apply(): Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bottom]
  }
  @scala.inline
  implicit class BottomOps[Self <: Bottom] (val x: Self) extends AnyVal {
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
    def setBottom(value: Boolean): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setBottomLeft(value: Boolean): Self = this.set("bottomLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomLeft: Self = this.set("bottomLeft", js.undefined)
    @scala.inline
    def setBottomRight(value: Boolean): Self = this.set("bottomRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomRight: Self = this.set("bottomRight", js.undefined)
    @scala.inline
    def setLeft(value: Boolean): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: Boolean): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: Boolean): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setTopLeft(value: Boolean): Self = this.set("topLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopLeft: Self = this.set("topLeft", js.undefined)
    @scala.inline
    def setTopRight(value: Boolean): Self = this.set("topRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopRight: Self = this.set("topRight", js.undefined)
  }
  
}

