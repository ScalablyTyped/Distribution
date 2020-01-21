package typings.reactInspector.mod

import typings.reactInspector.reactInspectorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InspectorAsTableProps
  extends TableInspectorProps
     with InspectorBaseProps
     with InspectorProps {
  @JSName("table")
  var table_InspectorAsTableProps: `true`
}

object InspectorAsTableProps {
  @scala.inline
  def apply(table: `true`, columns: js.Array[String] = null, data: js.Any = null, theme: InspectorTheme = null): InspectorAsTableProps = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorAsTableProps]
  }
}

