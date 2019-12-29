package typings.reactDashInspector.reactDashInspectorMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMInspectorProps
  extends TreeViewProps
     with ThemedComponentProps {
  @JSName("data")
  var data_DOMInspectorProps: js.Object
}

object DOMInspectorProps {
  @scala.inline
  def apply(
    data: js.Object,
    expandLevel: Int | Double = null,
    expandPaths: String | js.Array[String] = null,
    name: String = null,
    nodeRenderer: /* params */ InspectorNodeParams => ReactNode = null,
    theme: InspectorTheme = null
  ): DOMInspectorProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (expandLevel != null) __obj.updateDynamic("expandLevel")(expandLevel.asInstanceOf[js.Any])
    if (expandPaths != null) __obj.updateDynamic("expandPaths")(expandPaths.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodeRenderer != null) __obj.updateDynamic("nodeRenderer")(js.Any.fromFunction1(nodeRenderer))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMInspectorProps]
  }
}

