package typings.reactInspector.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewProps extends js.Object {
  /**
    * Not required prop because we also allow undefined value.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * An integer specifying to which level the tree should be initially expanded.
    */
  var expandLevel: js.UndefOr[Double] = js.native
  /**
    * An array containing all the paths that should be expanded when the component is initialized, or a string of just one path.
    */
  var expandPaths: js.UndefOr[String | js.Array[String]] = js.native
  var name: js.UndefOr[String] = js.native
  /**
    * Provide a custom nodeRenderer.
    */
  var nodeRenderer: js.UndefOr[InspectorNodeRenderer] = js.native
}

object TreeViewProps {
  @scala.inline
  def apply(): TreeViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeViewProps]
  }
  @scala.inline
  implicit class TreeViewPropsOps[Self <: TreeViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setExpandLevel(value: Double): Self = this.set("expandLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandLevel: Self = this.set("expandLevel", js.undefined)
    @scala.inline
    def setExpandPathsVarargs(value: String*): Self = this.set("expandPaths", js.Array(value :_*))
    @scala.inline
    def setExpandPaths(value: String | js.Array[String]): Self = this.set("expandPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandPaths: Self = this.set("expandPaths", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNodeRenderer(value: /* params */ InspectorNodeParams => ReactNode): Self = this.set("nodeRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeRenderer: Self = this.set("nodeRenderer", js.undefined)
  }
  
}

