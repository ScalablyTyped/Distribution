package typings.reactBootstrapTable2Toolkit.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportCSVButtonProps extends js.Object {
  var children: ReactNode = js.native
  var className: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  def onExport(): Unit = js.native
}

object ExportCSVButtonProps {
  @scala.inline
  def apply(onExport: () => Unit): ExportCSVButtonProps = {
    val __obj = js.Dynamic.literal(onExport = js.Any.fromFunction0(onExport))
    __obj.asInstanceOf[ExportCSVButtonProps]
  }
  @scala.inline
  implicit class ExportCSVButtonPropsOps[Self <: ExportCSVButtonProps] (val x: Self) extends AnyVal {
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
    def setOnExport(value: () => Unit): Self = this.set("onExport", js.Any.fromFunction0(value))
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

