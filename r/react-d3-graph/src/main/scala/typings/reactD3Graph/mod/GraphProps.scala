package typings.reactD3Graph.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<react-d3-graph.react-d3-graph.GraphEventCallbacks> */
@js.native
trait GraphProps[N /* <: GraphNode */, L /* <: GraphLink */] extends js.Object {
  
  var config: js.UndefOr[Partial[GraphConfiguration[N, L]]] = js.native
  
  var data: js.UndefOr[GraphData[N, L]] = js.native
  
  var id: String = js.native
  
  var onClickGraph: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.native
  
  var onClickLink: js.UndefOr[js.Function2[/* source */ String, /* target */ String, Unit]] = js.native
  
  var onClickNode: js.UndefOr[js.Function1[/* nodeId */ String, Unit]] = js.native
  
  var onDoubleClickNode: js.UndefOr[js.Function1[/* nodeId */ String, Unit]] = js.native
  
  var onMouseOutLink: js.UndefOr[js.Function2[/* source */ String, /* target */ String, Unit]] = js.native
  
  var onMouseOutNode: js.UndefOr[js.Function1[/* nodeId */ String, Unit]] = js.native
  
  var onMouseOverLink: js.UndefOr[js.Function2[/* source */ String, /* target */ String, Unit]] = js.native
  
  var onMouseOverNode: js.UndefOr[js.Function1[/* nodeId */ String, Unit]] = js.native
  
  var onNodePositionChange: js.UndefOr[js.Function3[/* nodeId */ String, /* x */ Double, /* y */ Double, Unit]] = js.native
  
  var onRightClickLink: js.UndefOr[
    js.Function3[
      /* event */ MouseEvent[Element, NativeMouseEvent], 
      /* source */ String, 
      /* target */ String, 
      Unit
    ]
  ] = js.native
  
  var onRightClickNode: js.UndefOr[
    js.Function2[/* event */ MouseEvent[Element, NativeMouseEvent], /* nodeId */ String, Unit]
  ] = js.native
}
object GraphProps {
  
  @scala.inline
  def apply[N /* <: GraphNode */, L /* <: GraphLink */](id: String): GraphProps[N, L] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphProps[N, L]]
  }
  
  @scala.inline
  implicit class GraphPropsOps[Self <: GraphProps[_, _], N /* <: GraphNode */, L /* <: GraphLink */] (val x: Self with (GraphProps[N, L])) extends AnyVal {
    
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
    def setConfig(value: Partial[GraphConfiguration[N, L]]): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setData(value: GraphData[N, L]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setOnClickGraph(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("onClickGraph", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClickGraph: Self = this.set("onClickGraph", js.undefined)
    
    @scala.inline
    def setOnClickLink(value: (/* source */ String, /* target */ String) => Unit): Self = this.set("onClickLink", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClickLink: Self = this.set("onClickLink", js.undefined)
    
    @scala.inline
    def setOnClickNode(value: /* nodeId */ String => Unit): Self = this.set("onClickNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClickNode: Self = this.set("onClickNode", js.undefined)
    
    @scala.inline
    def setOnDoubleClickNode(value: /* nodeId */ String => Unit): Self = this.set("onDoubleClickNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDoubleClickNode: Self = this.set("onDoubleClickNode", js.undefined)
    
    @scala.inline
    def setOnMouseOutLink(value: (/* source */ String, /* target */ String) => Unit): Self = this.set("onMouseOutLink", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseOutLink: Self = this.set("onMouseOutLink", js.undefined)
    
    @scala.inline
    def setOnMouseOutNode(value: /* nodeId */ String => Unit): Self = this.set("onMouseOutNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOutNode: Self = this.set("onMouseOutNode", js.undefined)
    
    @scala.inline
    def setOnMouseOverLink(value: (/* source */ String, /* target */ String) => Unit): Self = this.set("onMouseOverLink", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseOverLink: Self = this.set("onMouseOverLink", js.undefined)
    
    @scala.inline
    def setOnMouseOverNode(value: /* nodeId */ String => Unit): Self = this.set("onMouseOverNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOverNode: Self = this.set("onMouseOverNode", js.undefined)
    
    @scala.inline
    def setOnNodePositionChange(value: (/* nodeId */ String, /* x */ Double, /* y */ Double) => Unit): Self = this.set("onNodePositionChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnNodePositionChange: Self = this.set("onNodePositionChange", js.undefined)
    
    @scala.inline
    def setOnRightClickLink(
      value: (/* event */ MouseEvent[Element, NativeMouseEvent], /* source */ String, /* target */ String) => Unit
    ): Self = this.set("onRightClickLink", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnRightClickLink: Self = this.set("onRightClickLink", js.undefined)
    
    @scala.inline
    def setOnRightClickNode(value: (/* event */ MouseEvent[Element, NativeMouseEvent], /* nodeId */ String) => Unit): Self = this.set("onRightClickNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRightClickNode: Self = this.set("onRightClickNode", js.undefined)
  }
}
