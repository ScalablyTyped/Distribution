package typings.stormReactDiagrams.defaultNodeWidgetMod

import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.defaultNodeModelMod.DefaultNodeModel
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultNodeProps extends BaseWidgetProps {
  var diagramEngine: DiagramEngine = js.native
  var node: DefaultNodeModel = js.native
}

object DefaultNodeProps {
  @scala.inline
  def apply(diagramEngine: DiagramEngine, node: DefaultNodeModel): DefaultNodeProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultNodeProps]
  }
  @scala.inline
  implicit class DefaultNodePropsOps[Self <: DefaultNodeProps] (val x: Self) extends AnyVal {
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
    def setDiagramEngine(value: DiagramEngine): Self = this.set("diagramEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: DefaultNodeModel): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

