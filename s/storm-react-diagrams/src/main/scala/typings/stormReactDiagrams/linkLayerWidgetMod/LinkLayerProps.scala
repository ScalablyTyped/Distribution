package typings.stormReactDiagrams.linkLayerWidgetMod

import typings.std.MouseEvent
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.pointModelMod.PointModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkLayerProps extends BaseWidgetProps {
  var diagramEngine: DiagramEngine = js.native
  def pointAdded(point: PointModel, event: MouseEvent): js.Any = js.native
}

object LinkLayerProps {
  @scala.inline
  def apply(diagramEngine: DiagramEngine, pointAdded: (PointModel, MouseEvent) => js.Any): LinkLayerProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], pointAdded = js.Any.fromFunction2(pointAdded))
    __obj.asInstanceOf[LinkLayerProps]
  }
  @scala.inline
  implicit class LinkLayerPropsOps[Self <: LinkLayerProps] (val x: Self) extends AnyVal {
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
    def setPointAdded(value: (PointModel, MouseEvent) => js.Any): Self = this.set("pointAdded", js.Any.fromFunction2(value))
  }
  
}

