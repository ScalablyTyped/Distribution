package typings.reactBootstrapTable2Toolkit.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportCSVButtonProps extends js.Object {
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  def onExport(): Unit
}

object ExportCSVButtonProps {
  @scala.inline
  def apply(
    onExport: () => Unit,
    children: ReactNode = null,
    className: String = null,
    style: CSSProperties = null
  ): ExportCSVButtonProps = {
    val __obj = js.Dynamic.literal(onExport = js.Any.fromFunction0(onExport))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportCSVButtonProps]
  }
}

