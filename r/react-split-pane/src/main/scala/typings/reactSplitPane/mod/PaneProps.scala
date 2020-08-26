package typings.reactSplitPane.mod

import typings.react.mod.CSSProperties
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaneProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var eleRef: js.UndefOr[js.Function1[/* el */ HTMLDivElement, Unit]] = js.native
  var size: js.UndefOr[Size] = js.native
  var split: js.UndefOr[Split] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object PaneProps {
  @scala.inline
  def apply(): PaneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaneProps]
  }
  @scala.inline
  implicit class PanePropsOps[Self <: PaneProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setEleRef(value: /* el */ HTMLDivElement => Unit): Self = this.set("eleRef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEleRef: Self = this.set("eleRef", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSplit(value: Split): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

