package typings.reactabularDashTable.reactabularDashTableMod

import typings.std.CSSStyleDeclaration
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var headerRows: js.UndefOr[js.Array[Column]] = js.undefined
  var style: js.UndefOr[Partial[CSSStyleDeclaration]] = js.undefined
}

object HeaderProps {
  @scala.inline
  def apply(
    className: String = null,
    headerRows: js.Array[Column] = null,
    style: Partial[CSSStyleDeclaration] = null
  ): HeaderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (headerRows != null) __obj.updateDynamic("headerRows")(headerRows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProps]
  }
}

