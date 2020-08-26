package typings.reactD3Graph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-d3-graph.react-d3-graph.NodeLevelNodeConfiguration> */
@js.native
trait GraphNode extends js.Object {
  var color: js.UndefOr[String] = js.native
  var fontColor: js.UndefOr[String] = js.native
  var id: String = js.native
  var labelProperty: js.UndefOr[NodeLabelProperty[NodeWithExtraParameters]] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var renderLabel: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[Double] = js.native
  var strokeColor: js.UndefOr[String] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
  var svg: js.UndefOr[String] = js.native
  var symbolType: js.UndefOr[String] = js.native
  var viewGenerator: js.UndefOr[js.Function1[/* node */ NodeWithExtraParameters, _]] = js.native
}

object GraphNode {
  @scala.inline
  def apply(id: String): GraphNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphNode]
  }
  @scala.inline
  implicit class GraphNodeOps[Self <: GraphNode] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    @scala.inline
    def setLabelPropertyFunction1(value: NodeWithExtraParameters => String): Self = this.set("labelProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setLabelProperty(value: NodeLabelProperty[NodeWithExtraParameters]): Self = this.set("labelProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelProperty: Self = this.set("labelProperty", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setRenderLabel(value: Boolean): Self = this.set("renderLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderLabel: Self = this.set("renderLabel", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setSvg(value: String): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
    @scala.inline
    def setSymbolType(value: String): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolType: Self = this.set("symbolType", js.undefined)
    @scala.inline
    def setViewGenerator(value: /* node */ NodeWithExtraParameters => _): Self = this.set("viewGenerator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteViewGenerator: Self = this.set("viewGenerator", js.undefined)
  }
  
}

