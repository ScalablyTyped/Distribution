package typings.reactDashInspector.reactDashInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableInspectorProps extends ThemedComponentProps {
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
}

object TableInspectorProps {
  @scala.inline
  def apply(columns: js.Array[String] = null, data: js.Any = null, theme: InspectorTheme = null): TableInspectorProps = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableInspectorProps]
  }
}

