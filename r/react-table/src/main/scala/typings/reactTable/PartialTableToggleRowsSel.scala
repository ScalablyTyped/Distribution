package typings.reactTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-table.react-table.TableToggleRowsSelectedProps> */
trait PartialTableToggleRowsSel extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[AnonCursor] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PartialTableToggleRowsSel {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    onChange: () => Unit = null,
    style: AnonCursor = null,
    title: String = null
  ): PartialTableToggleRowsSel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction0(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTableToggleRowsSel]
  }
}

