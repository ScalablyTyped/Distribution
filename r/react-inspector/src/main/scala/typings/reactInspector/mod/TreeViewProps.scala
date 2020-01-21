package typings.reactInspector.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewProps extends js.Object {
  /**
    * Not required prop because we also allow undefined value.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * An integer specifying to which level the tree should be initially expanded.
    */
  var expandLevel: js.UndefOr[Double] = js.undefined
  /**
    * An array containing all the paths that should be expanded when the component is initialized, or a string of just one path.
    */
  var expandPaths: js.UndefOr[String | js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  /**
    * Provide a custom nodeRenderer.
    */
  var nodeRenderer: js.UndefOr[InspectorNodeRenderer] = js.undefined
}

object TreeViewProps {
  @scala.inline
  def apply(
    data: js.Any = null,
    expandLevel: Int | Double = null,
    expandPaths: String | js.Array[String] = null,
    name: String = null,
    nodeRenderer: /* params */ InspectorNodeParams => ReactNode = null
  ): TreeViewProps = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (expandLevel != null) __obj.updateDynamic("expandLevel")(expandLevel.asInstanceOf[js.Any])
    if (expandPaths != null) __obj.updateDynamic("expandPaths")(expandPaths.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodeRenderer != null) __obj.updateDynamic("nodeRenderer")(js.Any.fromFunction1(nodeRenderer))
    __obj.asInstanceOf[TreeViewProps]
  }
}

