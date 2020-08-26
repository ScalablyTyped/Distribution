package typings.reactNotificationSystem.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainersStyle extends js.Object {
  var DefaultStyle: CSSProperties = js.native
  var bc: js.UndefOr[CSSProperties] = js.native
  var bl: js.UndefOr[CSSProperties] = js.native
  var br: js.UndefOr[CSSProperties] = js.native
  var tc: js.UndefOr[CSSProperties] = js.native
  var tl: js.UndefOr[CSSProperties] = js.native
  var tr: js.UndefOr[CSSProperties] = js.native
}

object ContainersStyle {
  @scala.inline
  def apply(DefaultStyle: CSSProperties): ContainersStyle = {
    val __obj = js.Dynamic.literal(DefaultStyle = DefaultStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainersStyle]
  }
  @scala.inline
  implicit class ContainersStyleOps[Self <: ContainersStyle] (val x: Self) extends AnyVal {
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
    def setDefaultStyle(value: CSSProperties): Self = this.set("DefaultStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setBc(value: CSSProperties): Self = this.set("bc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBc: Self = this.set("bc", js.undefined)
    @scala.inline
    def setBl(value: CSSProperties): Self = this.set("bl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBl: Self = this.set("bl", js.undefined)
    @scala.inline
    def setBr(value: CSSProperties): Self = this.set("br", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBr: Self = this.set("br", js.undefined)
    @scala.inline
    def setTc(value: CSSProperties): Self = this.set("tc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTc: Self = this.set("tc", js.undefined)
    @scala.inline
    def setTl(value: CSSProperties): Self = this.set("tl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTl: Self = this.set("tl", js.undefined)
    @scala.inline
    def setTr(value: CSSProperties): Self = this.set("tr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTr: Self = this.set("tr", js.undefined)
  }
  
}

