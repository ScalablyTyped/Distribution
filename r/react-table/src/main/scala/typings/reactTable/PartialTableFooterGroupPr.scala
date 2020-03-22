package typings.reactTable

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-table.react-table.TableFooterGroupProps> */
trait PartialTableFooterGroupPr extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialTableFooterGroupPr {
  @scala.inline
  def apply(className: String = null, key: Key = null, style: CSSProperties = null): PartialTableFooterGroupPr = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTableFooterGroupPr]
  }
}

