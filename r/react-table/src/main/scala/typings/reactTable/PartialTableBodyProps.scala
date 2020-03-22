package typings.reactTable

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-table.react-table.TableBodyProps> */
trait PartialTableBodyProps extends js.Object {
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialTableBodyProps {
  @scala.inline
  def apply(style: CSSProperties = null): PartialTableBodyProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTableBodyProps]
  }
}

