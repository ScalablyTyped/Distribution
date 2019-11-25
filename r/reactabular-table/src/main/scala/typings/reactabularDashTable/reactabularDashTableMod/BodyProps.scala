package typings.reactabularDashTable.reactabularDashTableMod

import typings.reactabularDashTable.Anon_RowIndex
import typings.std.CSSStyleDeclaration
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onRow: js.UndefOr[js.Function2[/* row */ js.Any, /* props */ Anon_RowIndex, _]] = js.undefined
  var rowKey: String
  var rows: js.Array[_]
  var style: js.UndefOr[Partial[CSSStyleDeclaration]] = js.undefined
}

object BodyProps {
  @scala.inline
  def apply(
    rowKey: String,
    rows: js.Array[_],
    className: String = null,
    onRow: (/* row */ js.Any, /* props */ Anon_RowIndex) => _ = null,
    style: Partial[CSSStyleDeclaration] = null
  ): BodyProps = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2(onRow))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyProps]
  }
}

