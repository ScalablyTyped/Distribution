package typings.reactD3Graph.mod

import typings.reactD3Graph.anon.AlphaTarget
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphConfiguration[N /* <: GraphNode */, L /* <: GraphLink */] extends js.Object {
  var automaticRearrangeAfterDropNode: Boolean
  var collapsible: Boolean
  var d3: AlphaTarget
  var directed: Boolean
  var focusAnimationDuration: Double
  var focusZoom: Double
  var height: Double
  var highlightDegree: Double
  var highlightOpacity: Double
  var link: Partial[GraphLevelLinkConfiguration[L]]
  var linkHighlightBehavior: Boolean
  var maxZoom: Double
  var minZoom: Double
  var node: Partial[GraphLevelNodeConfiguration[N]]
  var nodeHighlightBehavior: Boolean
  var panAndZoom: Boolean
  var staticGraph: Boolean
  var staticGraphWithDragAndDrop: Boolean
  var width: Double
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
}

