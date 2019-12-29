package typings.reactDashInspector.reactDashInspectorMod

import typings.react.reactMod.ReactNode
import typings.reactDashInspector.reactDashInspectorBooleans.`false`
import typings.reactDashInspector.reactDashInspectorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashInspector.reactDashInspectorMod.InspectorAsTableProps
  - typings.reactDashInspector.reactDashInspectorMod.InspectorAsTreeProps
*/
trait InspectorProps extends js.Object

object InspectorProps {
  @scala.inline
  def InspectorAsTableProps(table: `true`, columns: js.Array[String] = null, data: js.Any = null, theme: InspectorTheme = null): InspectorProps = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorProps]
  }
  @scala.inline
  def InspectorAsTreeProps(
    data: js.Any = null,
    expandLevel: Int | Double = null,
    expandPaths: String | js.Array[String] = null,
    name: String = null,
    nodeRenderer: /* params */ InspectorNodeParams => ReactNode = null,
    showNonenumerable: js.UndefOr[Boolean] = js.undefined,
    sortObjectKeys: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) = null,
    table: `false` = null,
    theme: InspectorTheme = null
  ): InspectorProps = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (expandLevel != null) __obj.updateDynamic("expandLevel")(expandLevel.asInstanceOf[js.Any])
    if (expandPaths != null) __obj.updateDynamic("expandPaths")(expandPaths.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodeRenderer != null) __obj.updateDynamic("nodeRenderer")(js.Any.fromFunction1(nodeRenderer))
    if (!js.isUndefined(showNonenumerable)) __obj.updateDynamic("showNonenumerable")(showNonenumerable.asInstanceOf[js.Any])
    if (sortObjectKeys != null) __obj.updateDynamic("sortObjectKeys")(sortObjectKeys.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorProps]
  }
}

