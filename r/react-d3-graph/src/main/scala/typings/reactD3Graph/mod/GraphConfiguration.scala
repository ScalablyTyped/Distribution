package typings.reactD3Graph.mod

import typings.reactD3Graph.anon.AlphaTarget
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphConfiguration[N /* <: GraphNode */, L /* <: GraphLink */] extends js.Object {
  var automaticRearrangeAfterDropNode: Boolean = js.native
  var collapsible: Boolean = js.native
  var d3: AlphaTarget = js.native
  var directed: Boolean = js.native
  var focusAnimationDuration: Double = js.native
  var focusZoom: Double = js.native
  var height: Double = js.native
  var highlightDegree: Double = js.native
  var highlightOpacity: Double = js.native
  var link: Partial[GraphLevelLinkConfiguration[L]] = js.native
  var linkHighlightBehavior: Boolean = js.native
  var maxZoom: Double = js.native
  var minZoom: Double = js.native
  var node: Partial[GraphLevelNodeConfiguration[N]] = js.native
  var nodeHighlightBehavior: Boolean = js.native
  var panAndZoom: Boolean = js.native
  var staticGraph: Boolean = js.native
  var staticGraphWithDragAndDrop: Boolean = js.native
  var width: Double = js.native
}

object GraphConfiguration {
  @scala.inline
  def apply[/* <: typings.reactD3Graph.mod.GraphNode */ N, /* <: typings.reactD3Graph.mod.GraphLink */ L](
    automaticRearrangeAfterDropNode: Boolean,
    collapsible: Boolean,
    d3: AlphaTarget,
    directed: Boolean,
    focusAnimationDuration: Double,
    focusZoom: Double,
    height: Double,
    highlightDegree: Double,
    highlightOpacity: Double,
    link: Partial[GraphLevelLinkConfiguration[L]],
    linkHighlightBehavior: Boolean,
    maxZoom: Double,
    minZoom: Double,
    node: Partial[GraphLevelNodeConfiguration[N]],
    nodeHighlightBehavior: Boolean,
    panAndZoom: Boolean,
    staticGraph: Boolean,
    staticGraphWithDragAndDrop: Boolean,
    width: Double
  ): GraphConfiguration[N, L] = {
    val __obj = js.Dynamic.literal(automaticRearrangeAfterDropNode = automaticRearrangeAfterDropNode.asInstanceOf[js.Any], collapsible = collapsible.asInstanceOf[js.Any], d3 = d3.asInstanceOf[js.Any], directed = directed.asInstanceOf[js.Any], focusAnimationDuration = focusAnimationDuration.asInstanceOf[js.Any], focusZoom = focusZoom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], highlightDegree = highlightDegree.asInstanceOf[js.Any], highlightOpacity = highlightOpacity.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkHighlightBehavior = linkHighlightBehavior.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeHighlightBehavior = nodeHighlightBehavior.asInstanceOf[js.Any], panAndZoom = panAndZoom.asInstanceOf[js.Any], staticGraph = staticGraph.asInstanceOf[js.Any], staticGraphWithDragAndDrop = staticGraphWithDragAndDrop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphConfiguration[N, L]]
  }
  @scala.inline
  implicit class GraphConfigurationOps[Self <: GraphConfiguration[_, _], /* <: typings.reactD3Graph.mod.GraphNode */ N, /* <: typings.reactD3Graph.mod.GraphLink */ L] (val x: Self with (GraphConfiguration[N, L])) extends AnyVal {
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
    def setAutomaticRearrangeAfterDropNode(value: Boolean): Self = this.set("automaticRearrangeAfterDropNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def setD3(value: AlphaTarget): Self = this.set("d3", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirected(value: Boolean): Self = this.set("directed", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusAnimationDuration(value: Double): Self = this.set("focusAnimationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusZoom(value: Double): Self = this.set("focusZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightDegree(value: Double): Self = this.set("highlightDegree", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightOpacity(value: Double): Self = this.set("highlightOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: Partial[GraphLevelLinkConfiguration[L]]): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkHighlightBehavior(value: Boolean): Self = this.set("linkHighlightBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: Partial[GraphLevelNodeConfiguration[N]]): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeHighlightBehavior(value: Boolean): Self = this.set("nodeHighlightBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanAndZoom(value: Boolean): Self = this.set("panAndZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaticGraph(value: Boolean): Self = this.set("staticGraph", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaticGraphWithDragAndDrop(value: Boolean): Self = this.set("staticGraphWithDragAndDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

