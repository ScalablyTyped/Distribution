package typings.reactTable

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-table.react-table.TableProps> */
trait PartialTableProps extends js.Object {
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialTableProps {
  @scala.inline
  def apply(style: CSSProperties = null): PartialTableProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTableProps]
  }
}

