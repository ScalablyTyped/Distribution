package typings.reactD3Graph

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactD3Graph.anon.AlphaTarget
import typings.reactD3Graph.anon.Height
import typings.reactD3Graph.reactD3GraphStrings.SAME
import typings.std.Element
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-d3-graph", "Graph")
  @js.native
  class Graph[N /* <: GraphNode */, L /* <: GraphLink */] protected ()
    extends Component[GraphProps[N, L], js.Any, js.Any] {
    def this(props: GraphProps[N, L], args: js.Any*) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MGraph(nextProps: js.Any): js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MGraph(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MGraph(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MGraph(): Unit = js.native
  }
  
  @JSImport("react-d3-graph", "Link")
  @js.native
  class Link protected ()
    extends Component[js.Any, js.Any, js.Any] {
    def this(args: js.Any*) = this()
  }
  
  @JSImport("react-d3-graph", "Node")
  @js.native
  class Node protected ()
    extends Component[js.Any, js.Any, js.Any] {
    def this(args: js.Any*) = this()
  }
  
  trait GraphConfiguration[N /* <: GraphNode */, L /* <: GraphLink */] extends StObject {
    
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
    def apply[N /* <: GraphNode */, L /* <: GraphLink */](
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
    implicit class GraphConfigurationMutableBuilder[Self <: GraphConfiguration[?, ?], N /* <: GraphNode */, L /* <: GraphLink */] (val x: Self & (GraphConfiguration[N, L])) extends AnyVal {
      
      @scala.inline
      def setAutomaticRearrangeAfterDropNode(value: Boolean): Self = StObject.set(x, "automaticRearrangeAfterDropNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setD3(value: AlphaTarget): Self = StObject.set(x, "d3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusAnimationDuration(value: Double): Self = StObject.set(x, "focusAnimationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusZoom(value: Double): Self = StObject.set(x, "focusZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightDegree(value: Double): Self = StObject.set(x, "highlightDegree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightOpacity(value: Double): Self = StObject.set(x, "highlightOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: Partial[GraphLevelLinkConfiguration[L]]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkHighlightBehavior(value: Boolean): Self = StObject.set(x, "linkHighlightBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: Partial[GraphLevelNodeConfiguration[N]]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeHighlightBehavior(value: Boolean): Self = StObject.set(x, "nodeHighlightBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanAndZoom(value: Boolean): Self = StObject.set(x, "panAndZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticGraph(value: Boolean): Self = StObject.set(x, "staticGraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticGraphWithDragAndDrop(value: Boolean): Self = StObject.set(x, "staticGraphWithDragAndDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait GraphData[N /* <: GraphNode */, L /* <: GraphLink */] extends StObject {
    
    var focusedNodeId: js.UndefOr[String] = js.undefined
    
    var links: js.Array[L]
    
    var nodes: js.Array[N]
  }
  object GraphData {
    
    @scala.inline
    def apply[N /* <: GraphNode */, L /* <: GraphLink */](links: js.Array[L], nodes: js.Array[N]): GraphData[N, L] = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphData[N, L]]
    }
    
    @scala.inline
    implicit class GraphDataMutableBuilder[Self <: GraphData[?, ?], N /* <: GraphNode */, L /* <: GraphLink */] (val x: Self & (GraphData[N, L])) extends AnyVal {
      
      @scala.inline
      def setFocusedNodeId(value: String): Self = StObject.set(x, "focusedNodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedNodeIdUndefined: Self = StObject.set(x, "focusedNodeId", js.undefined)
      
      @scala.inline
      def setLinks(value: js.Array[L]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksVarargs(value: L*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      @scala.inline
      def setNodes(value: js.Array[N]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: N*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  trait GraphEventCallbacks extends StObject {
    
    def onClickGraph(event: MouseEvent[Element, NativeMouseEvent]): Unit
    
    def onClickLink(source: String, target: String): Unit
    
    def onClickNode(nodeId: String): Unit
    
    def onDoubleClickNode(nodeId: String): Unit
    
    def onMouseOutLink(source: String, target: String): Unit
    
    def onMouseOutNode(nodeId: String): Unit
    
    def onMouseOverLink(source: String, target: String): Unit
    
    def onMouseOverNode(nodeId: String): Unit
    
    def onNodePositionChange(nodeId: String, x: Double, y: Double): Unit
    
    def onRightClickLink(event: MouseEvent[Element, NativeMouseEvent], source: String, target: String): Unit
    
    def onRightClickNode(event: MouseEvent[Element, NativeMouseEvent], nodeId: String): Unit
  }
  object GraphEventCallbacks {
    
    @scala.inline
    def apply(
      onClickGraph: MouseEvent[Element, NativeMouseEvent] => Unit,
      onClickLink: (String, String) => Unit,
      onClickNode: String => Unit,
      onDoubleClickNode: String => Unit,
      onMouseOutLink: (String, String) => Unit,
      onMouseOutNode: String => Unit,
      onMouseOverLink: (String, String) => Unit,
      onMouseOverNode: String => Unit,
      onNodePositionChange: (String, Double, Double) => Unit,
      onRightClickLink: (MouseEvent[Element, NativeMouseEvent], String, String) => Unit,
      onRightClickNode: (MouseEvent[Element, NativeMouseEvent], String) => Unit
    ): GraphEventCallbacks = {
      val __obj = js.Dynamic.literal(onClickGraph = js.Any.fromFunction1(onClickGraph), onClickLink = js.Any.fromFunction2(onClickLink), onClickNode = js.Any.fromFunction1(onClickNode), onDoubleClickNode = js.Any.fromFunction1(onDoubleClickNode), onMouseOutLink = js.Any.fromFunction2(onMouseOutLink), onMouseOutNode = js.Any.fromFunction1(onMouseOutNode), onMouseOverLink = js.Any.fromFunction2(onMouseOverLink), onMouseOverNode = js.Any.fromFunction1(onMouseOverNode), onNodePositionChange = js.Any.fromFunction3(onNodePositionChange), onRightClickLink = js.Any.fromFunction3(onRightClickLink), onRightClickNode = js.Any.fromFunction2(onRightClickNode))
      __obj.asInstanceOf[GraphEventCallbacks]
    }
    
    @scala.inline
    implicit class GraphEventCallbacksMutableBuilder[Self <: GraphEventCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClickGraph(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClickGraph", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickLink(value: (String, String) => Unit): Self = StObject.set(x, "onClickLink", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickNode(value: String => Unit): Self = StObject.set(x, "onClickNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickNode(value: String => Unit): Self = StObject.set(x, "onDoubleClickNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutLink(value: (String, String) => Unit): Self = StObject.set(x, "onMouseOutLink", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseOutNode(value: String => Unit): Self = StObject.set(x, "onMouseOutNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverLink(value: (String, String) => Unit): Self = StObject.set(x, "onMouseOverLink", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseOverNode(value: String => Unit): Self = StObject.set(x, "onMouseOverNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNodePositionChange(value: (String, Double, Double) => Unit): Self = StObject.set(x, "onNodePositionChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnRightClickLink(value: (MouseEvent[Element, NativeMouseEvent], String, String) => Unit): Self = StObject.set(x, "onRightClickLink", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnRightClickNode(value: (MouseEvent[Element, NativeMouseEvent], String) => Unit): Self = StObject.set(x, "onRightClickNode", js.Any.fromFunction2(value))
    }
  }
  
  trait GraphLevelLinkConfiguration[L /* <: GraphLink */]
    extends StObject
       with LinkLevelLinkConfiguration {
    
    var fontSize: Double
    
    var fontWeight: String
    
    var highlightColor: String
    
    var highlightFontSize: Double
    
    var highlightFontWeight: String
    
    var labelProperty: LinkLabelProperty[L]
    
    var markerHeight: Double
    
    var mouseCursor: String
    
    var renderLabel: Boolean
    
    var semanticStrokeWidth: Boolean
    
    var `type`: String
  }
  object GraphLevelLinkConfiguration {
    
    @scala.inline
    def apply[L /* <: GraphLink */](
      color: String,
      fontColor: String,
      fontSize: Double,
      fontWeight: String,
      highlightColor: String,
      highlightFontSize: Double,
      highlightFontWeight: String,
      labelProperty: LinkLabelProperty[L],
      markerHeight: Double,
      markerWidth: Double,
      mouseCursor: String,
      opacity: Double,
      renderLabel: Boolean,
      semanticStrokeWidth: Boolean,
      strokeWidth: Double,
      `type`: String
    ): GraphLevelLinkConfiguration[L] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], highlightFontSize = highlightFontSize.asInstanceOf[js.Any], highlightFontWeight = highlightFontWeight.asInstanceOf[js.Any], labelProperty = labelProperty.asInstanceOf[js.Any], markerHeight = markerHeight.asInstanceOf[js.Any], markerWidth = markerWidth.asInstanceOf[js.Any], mouseCursor = mouseCursor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], renderLabel = renderLabel.asInstanceOf[js.Any], semanticStrokeWidth = semanticStrokeWidth.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphLevelLinkConfiguration[L]]
    }
    
    @scala.inline
    implicit class GraphLevelLinkConfigurationMutableBuilder[Self <: GraphLevelLinkConfiguration[?], L /* <: GraphLink */] (val x: Self & GraphLevelLinkConfiguration[L]) extends AnyVal {
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightFontSize(value: Double): Self = StObject.set(x, "highlightFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightFontWeight(value: String): Self = StObject.set(x, "highlightFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelProperty(value: LinkLabelProperty[L]): Self = StObject.set(x, "labelProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPropertyFunction1(value: L => String): Self = StObject.set(x, "labelProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarkerHeight(value: Double): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseCursor(value: String): Self = StObject.set(x, "mouseCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderLabel(value: Boolean): Self = StObject.set(x, "renderLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSemanticStrokeWidth(value: Boolean): Self = StObject.set(x, "semanticStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GraphLevelNodeConfiguration[N /* <: GraphNode */] extends StObject {
    
    var color: String
    
    var fontColor: String
    
    var fontSize: Double
    
    var fontWeight: String
    
    var highlightColor: String
    
    var highlightFontSize: Double
    
    var highlightFontWeight: String
    
    var highlightStrokeColor: SAME | String
    
    var highlightStrokeWidth: SAME | Double
    
    var labelProperty: NodeLabelProperty[N]
    
    var mouseCursor: String
    
    var opacity: Double
    
    var renderLabel: Boolean
    
    var size: Double | Height
    
    var strokeColor: String
    
    var strokeWidth: Double
    
    var svg: String
    
    var symbolType: String
    
    def viewGenerator(node: N): js.Any
  }
  object GraphLevelNodeConfiguration {
    
    @scala.inline
    def apply[N /* <: GraphNode */](
      color: String,
      fontColor: String,
      fontSize: Double,
      fontWeight: String,
      highlightColor: String,
      highlightFontSize: Double,
      highlightFontWeight: String,
      highlightStrokeColor: SAME | String,
      highlightStrokeWidth: SAME | Double,
      labelProperty: NodeLabelProperty[N],
      mouseCursor: String,
      opacity: Double,
      renderLabel: Boolean,
      size: Double | Height,
      strokeColor: String,
      strokeWidth: Double,
      svg: String,
      symbolType: String,
      viewGenerator: N => js.Any
    ): GraphLevelNodeConfiguration[N] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], highlightFontSize = highlightFontSize.asInstanceOf[js.Any], highlightFontWeight = highlightFontWeight.asInstanceOf[js.Any], highlightStrokeColor = highlightStrokeColor.asInstanceOf[js.Any], highlightStrokeWidth = highlightStrokeWidth.asInstanceOf[js.Any], labelProperty = labelProperty.asInstanceOf[js.Any], mouseCursor = mouseCursor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], renderLabel = renderLabel.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], viewGenerator = js.Any.fromFunction1(viewGenerator))
      __obj.asInstanceOf[GraphLevelNodeConfiguration[N]]
    }
    
    @scala.inline
    implicit class GraphLevelNodeConfigurationMutableBuilder[Self <: GraphLevelNodeConfiguration[?], N /* <: GraphNode */] (val x: Self & GraphLevelNodeConfiguration[N]) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightFontSize(value: Double): Self = StObject.set(x, "highlightFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightFontWeight(value: String): Self = StObject.set(x, "highlightFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightStrokeColor(value: SAME | String): Self = StObject.set(x, "highlightStrokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightStrokeWidth(value: SAME | Double): Self = StObject.set(x, "highlightStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelProperty(value: NodeLabelProperty[N]): Self = StObject.set(x, "labelProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPropertyFunction1(value: N => String): Self = StObject.set(x, "labelProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseCursor(value: String): Self = StObject.set(x, "mouseCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderLabel(value: Boolean): Self = StObject.set(x, "renderLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double | Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolType(value: String): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewGenerator(value: N => js.Any): Self = StObject.set(x, "viewGenerator", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined parent std.Partial<react-d3-graph.react-d3-graph.LinkLevelLinkConfiguration> */
  trait GraphLink extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var fontColor: js.UndefOr[String] = js.undefined
    
    var markerWidth: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var source: String
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    var target: String
  }
  object GraphLink {
    
    @scala.inline
    def apply(source: String, target: String): GraphLink = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphLink]
    }
    
    @scala.inline
    implicit class GraphLinkMutableBuilder[Self <: GraphLink] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      @scala.inline
      def setMarkerWidth(value: Double): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<react-d3-graph.react-d3-graph.NodeLevelNodeConfiguration> */
  trait GraphNode extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var fontColor: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var labelProperty: js.UndefOr[NodeLabelProperty[NodeWithExtraParameters]] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var renderLabel: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double | Height] = js.undefined
    
    var strokeColor: js.UndefOr[String] = js.undefined
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    var svg: js.UndefOr[String] = js.undefined
    
    var symbolType: js.UndefOr[String] = js.undefined
    
    var viewGenerator: js.UndefOr[js.Function1[/* node */ NodeWithExtraParameters, js.Any]] = js.undefined
  }
  object GraphNode {
    
    @scala.inline
    def apply(id: String): GraphNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphNode]
    }
    
    @scala.inline
    implicit class GraphNodeMutableBuilder[Self <: GraphNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelProperty(value: NodeLabelProperty[NodeWithExtraParameters]): Self = StObject.set(x, "labelProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPropertyFunction1(value: NodeWithExtraParameters => String): Self = StObject.set(x, "labelProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLabelPropertyUndefined: Self = StObject.set(x, "labelProperty", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRenderLabel(value: Boolean): Self = StObject.set(x, "renderLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderLabelUndefined: Self = StObject.set(x, "renderLabel", js.undefined)
      
      @scala.inline
      def setSize(value: Double | Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
      
      @scala.inline
      def setSymbolType(value: String): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
      
      @scala.inline
      def setViewGenerator(value: /* node */ NodeWithExtraParameters => js.Any): Self = StObject.set(x, "viewGenerator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setViewGeneratorUndefined: Self = StObject.set(x, "viewGenerator", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<react-d3-graph.react-d3-graph.GraphEventCallbacks> */
  trait GraphProps[N /* <: GraphNode */, L /* <: GraphLink */] extends StObject {
    
    var config: js.UndefOr[Partial[GraphConfiguration[N, L]]] = js.undefined
    
    var data: js.UndefOr[GraphData[N, L]] = js.undefined
    
    var id: String
    
    var onClickGraph: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
    
    var onClickLink: js.UndefOr[js.Function2[/* source */ String, /* target */ String, Unit]] = js.undefined
    
    var onClickNode: js.UndefOr[js.Function1[/* nodeId */ String, Unit]] = js.undefined
    
    var onDoubleClickNode: js.UndefOr[js.Function1[/* nodeId */ String, Unit]] = js.undefined
    
    var onMouseOutLink: js.UndefOr[js.Function2[/* source */ String, /* target */ String, Unit]] = js.undefined
    
    var onMouseOutNode: js.UndefOr[js.Function1[/* nodeId */ String, Unit]] = js.undefined
    
    var onMouseOverLink: js.UndefOr[js.Function2[/* source */ String, /* target */ String, Unit]] = js.undefined
    
    var onMouseOverNode: js.UndefOr[js.Function1[/* nodeId */ String, Unit]] = js.undefined
    
    var onNodePositionChange: js.UndefOr[js.Function3[/* nodeId */ String, /* x */ Double, /* y */ Double, Unit]] = js.undefined
    
    var onRightClickLink: js.UndefOr[
        js.Function3[
          /* event */ MouseEvent[Element, NativeMouseEvent], 
          /* source */ String, 
          /* target */ String, 
          Unit
        ]
      ] = js.undefined
    
    var onRightClickNode: js.UndefOr[
        js.Function2[/* event */ MouseEvent[Element, NativeMouseEvent], /* nodeId */ String, Unit]
      ] = js.undefined
  }
  object GraphProps {
    
    @scala.inline
    def apply[N /* <: GraphNode */, L /* <: GraphLink */](id: String): GraphProps[N, L] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphProps[N, L]]
    }
    
    @scala.inline
    implicit class GraphPropsMutableBuilder[Self <: GraphProps[?, ?], N /* <: GraphNode */, L /* <: GraphLink */] (val x: Self & (GraphProps[N, L])) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Partial[GraphConfiguration[N, L]]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setData(value: GraphData[N, L]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickGraph(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClickGraph", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickGraphUndefined: Self = StObject.set(x, "onClickGraph", js.undefined)
      
      @scala.inline
      def setOnClickLink(value: (/* source */ String, /* target */ String) => Unit): Self = StObject.set(x, "onClickLink", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickLinkUndefined: Self = StObject.set(x, "onClickLink", js.undefined)
      
      @scala.inline
      def setOnClickNode(value: /* nodeId */ String => Unit): Self = StObject.set(x, "onClickNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickNodeUndefined: Self = StObject.set(x, "onClickNode", js.undefined)
      
      @scala.inline
      def setOnDoubleClickNode(value: /* nodeId */ String => Unit): Self = StObject.set(x, "onDoubleClickNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickNodeUndefined: Self = StObject.set(x, "onDoubleClickNode", js.undefined)
      
      @scala.inline
      def setOnMouseOutLink(value: (/* source */ String, /* target */ String) => Unit): Self = StObject.set(x, "onMouseOutLink", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseOutLinkUndefined: Self = StObject.set(x, "onMouseOutLink", js.undefined)
      
      @scala.inline
      def setOnMouseOutNode(value: /* nodeId */ String => Unit): Self = StObject.set(x, "onMouseOutNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutNodeUndefined: Self = StObject.set(x, "onMouseOutNode", js.undefined)
      
      @scala.inline
      def setOnMouseOverLink(value: (/* source */ String, /* target */ String) => Unit): Self = StObject.set(x, "onMouseOverLink", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseOverLinkUndefined: Self = StObject.set(x, "onMouseOverLink", js.undefined)
      
      @scala.inline
      def setOnMouseOverNode(value: /* nodeId */ String => Unit): Self = StObject.set(x, "onMouseOverNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverNodeUndefined: Self = StObject.set(x, "onMouseOverNode", js.undefined)
      
      @scala.inline
      def setOnNodePositionChange(value: (/* nodeId */ String, /* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "onNodePositionChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodePositionChangeUndefined: Self = StObject.set(x, "onNodePositionChange", js.undefined)
      
      @scala.inline
      def setOnRightClickLink(
        value: (/* event */ MouseEvent[Element, NativeMouseEvent], /* source */ String, /* target */ String) => Unit
      ): Self = StObject.set(x, "onRightClickLink", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnRightClickLinkUndefined: Self = StObject.set(x, "onRightClickLink", js.undefined)
      
      @scala.inline
      def setOnRightClickNode(value: (/* event */ MouseEvent[Element, NativeMouseEvent], /* nodeId */ String) => Unit): Self = StObject.set(x, "onRightClickNode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRightClickNodeUndefined: Self = StObject.set(x, "onRightClickNode", js.undefined)
    }
  }
  
  type LinkLabelProperty[L /* <: GraphLink */] = (js.Function1[/* node */ L, String]) | (/* keyof L */ String)
  
  trait LinkLevelLinkConfiguration extends StObject {
    
    var color: String
    
    var fontColor: String
    
    var markerWidth: Double
    
    var opacity: Double
    
    var strokeWidth: Double
  }
  object LinkLevelLinkConfiguration {
    
    @scala.inline
    def apply(color: String, fontColor: String, markerWidth: Double, opacity: Double, strokeWidth: Double): LinkLevelLinkConfiguration = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], markerWidth = markerWidth.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkLevelLinkConfiguration]
    }
    
    @scala.inline
    implicit class LinkLevelLinkConfigurationMutableBuilder[Self <: LinkLevelLinkConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerWidth(value: Double): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type NodeLabelProperty[N /* <: GraphNode */] = (js.Function1[/* node */ N, String]) | (/* keyof N */ String)
  
  trait NodeLevelNodeConfiguration extends StObject {
    
    var color: String
    
    var fontColor: String
    
    var labelProperty: NodeLabelProperty[NodeWithExtraParameters]
    
    var opacity: Double
    
    var renderLabel: Boolean
    
    var size: Double | Height
    
    var strokeColor: String
    
    var strokeWidth: Double
    
    var svg: String
    
    var symbolType: String
    
    def viewGenerator(node: NodeWithExtraParameters): js.Any
  }
  object NodeLevelNodeConfiguration {
    
    @scala.inline
    def apply(
      color: String,
      fontColor: String,
      labelProperty: NodeLabelProperty[NodeWithExtraParameters],
      opacity: Double,
      renderLabel: Boolean,
      size: Double | Height,
      strokeColor: String,
      strokeWidth: Double,
      svg: String,
      symbolType: String,
      viewGenerator: NodeWithExtraParameters => js.Any
    ): NodeLevelNodeConfiguration = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], labelProperty = labelProperty.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], renderLabel = renderLabel.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], viewGenerator = js.Any.fromFunction1(viewGenerator))
      __obj.asInstanceOf[NodeLevelNodeConfiguration]
    }
    
    @scala.inline
    implicit class NodeLevelNodeConfigurationMutableBuilder[Self <: NodeLevelNodeConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelProperty(value: NodeLabelProperty[NodeWithExtraParameters]): Self = StObject.set(x, "labelProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPropertyFunction1(value: NodeWithExtraParameters => String): Self = StObject.set(x, "labelProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderLabel(value: Boolean): Self = StObject.set(x, "renderLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double | Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolType(value: String): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewGenerator(value: NodeWithExtraParameters => js.Any): Self = StObject.set(x, "viewGenerator", js.Any.fromFunction1(value))
    }
  }
  
  trait NodeWithExtraParameters
    extends StObject
       with GraphNode
       with /* key */ StringDictionary[String]
  object NodeWithExtraParameters {
    
    @scala.inline
    def apply(id: String): NodeWithExtraParameters = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeWithExtraParameters]
    }
  }
}
