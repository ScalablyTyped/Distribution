package typings.reactBootstrapTable2Toolkit.mod

import typings.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleListProps extends js.Object {
  var btnClassName: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var columns: js.Array[ColumnDescription[_, _]]
  var contextual: js.UndefOr[String] = js.undefined
  /**
    * array of toggled columns
    */
  var toggles: js.Array[Boolean]
  def onColumnToggle(dataField: String): Unit
}

object ToggleListProps {
  @scala.inline
  def apply(
    columns: js.Array[ColumnDescription[_, _]],
    onColumnToggle: String => Unit,
    toggles: js.Array[Boolean],
    btnClassName: String = null,
    className: String = null,
    contextual: String = null
  ): ToggleListProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnToggle = js.Any.fromFunction1(onColumnToggle), toggles = toggles.asInstanceOf[js.Any])
    if (btnClassName != null) __obj.updateDynamic("btnClassName")(btnClassName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contextual != null) __obj.updateDynamic("contextual")(contextual.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleListProps]
  }
}

