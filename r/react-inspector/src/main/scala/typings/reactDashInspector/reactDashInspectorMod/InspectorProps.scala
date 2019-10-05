package typings.reactDashInspector.reactDashInspectorMod

import typings.react.reactMod.ReactNode
import typings.reactDashInspector.Anon_Data
import typings.reactDashInspector.reactDashInspectorStrings.chromeDark
import typings.reactDashInspector.reactDashInspectorStrings.chromeLight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InspectorProps extends js.Object {
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  var data: js.Any
  var expandLevel: js.UndefOr[Double] = js.undefined
  var expandPaths: js.UndefOr[String | js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nodeRenderer: js.UndefOr[typings.reactDashInspector.reactDashInspectorMod.nodeRenderer] = js.undefined
  var showNonenumerable: js.UndefOr[Boolean] = js.undefined
  var sortObjectKeys: js.UndefOr[Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])] = js.undefined
  var theme: js.UndefOr[chromeLight | chromeDark | Theme] = js.undefined
}

object InspectorProps {
  @scala.inline
  def apply(
    data: js.Any,
    columns: js.Array[String] = null,
    expandLevel: Int | Double = null,
    expandPaths: String | js.Array[String] = null,
    name: String = null,
    nodeRenderer: /* params */ Anon_Data => ReactNode = null,
    showNonenumerable: js.UndefOr[Boolean] = js.undefined,
    sortObjectKeys: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) = null,
    theme: chromeLight | chromeDark | Theme = null
  ): InspectorProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (expandLevel != null) __obj.updateDynamic("expandLevel")(expandLevel.asInstanceOf[js.Any])
    if (expandPaths != null) __obj.updateDynamic("expandPaths")(expandPaths.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (nodeRenderer != null) __obj.updateDynamic("nodeRenderer")(js.Any.fromFunction1(nodeRenderer))
    if (!js.isUndefined(showNonenumerable)) __obj.updateDynamic("showNonenumerable")(showNonenumerable)
    if (sortObjectKeys != null) __obj.updateDynamic("sortObjectKeys")(sortObjectKeys.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorProps]
  }
}

