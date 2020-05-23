package typings.reactD3Graph.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-d3-graph.react-d3-graph.GraphEventCallbacks> */
trait GraphProps[N /* <: GraphNode */, L /* <: GraphLink */] extends js.Object {
  var config: js.UndefOr[Partial[GraphConfiguration[N, L]]] = js.undefined
  var data: js.UndefOr[GraphData[N, L]] = js.undefined
  var id: String
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
  def apply[N, L](
    id: String,
    config: Partial[GraphConfiguration[N, L]] = null,
    data: GraphData[N, L] = null,
    onClickLink: (/* source */ String, /* target */ String) => Unit = null,
    onClickNode: /* nodeId */ String => Unit = null,
    onDoubleClickNode: /* nodeId */ String => Unit = null,
    onMouseOutLink: (/* source */ String, /* target */ String) => Unit = null,
    onMouseOutNode: /* nodeId */ String => Unit = null,
    onMouseOverLink: (/* source */ String, /* target */ String) => Unit = null,
    onMouseOverNode: /* nodeId */ String => Unit = null,
    onNodePositionChange: (/* nodeId */ String, /* x */ Double, /* y */ Double) => Unit = null,
    onRightClickLink: (/* event */ MouseEvent[Element, NativeMouseEvent], /* source */ String, /* target */ String) => Unit = null,
    onRightClickNode: (/* event */ MouseEvent[Element, NativeMouseEvent], /* nodeId */ String) => Unit = null
  ): GraphProps[N, L] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (onClickLink != null) __obj.updateDynamic("onClickLink")(js.Any.fromFunction2(onClickLink))
    if (onClickNode != null) __obj.updateDynamic("onClickNode")(js.Any.fromFunction1(onClickNode))
    if (onDoubleClickNode != null) __obj.updateDynamic("onDoubleClickNode")(js.Any.fromFunction1(onDoubleClickNode))
    if (onMouseOutLink != null) __obj.updateDynamic("onMouseOutLink")(js.Any.fromFunction2(onMouseOutLink))
    if (onMouseOutNode != null) __obj.updateDynamic("onMouseOutNode")(js.Any.fromFunction1(onMouseOutNode))
    if (onMouseOverLink != null) __obj.updateDynamic("onMouseOverLink")(js.Any.fromFunction2(onMouseOverLink))
    if (onMouseOverNode != null) __obj.updateDynamic("onMouseOverNode")(js.Any.fromFunction1(onMouseOverNode))
    if (onNodePositionChange != null) __obj.updateDynamic("onNodePositionChange")(js.Any.fromFunction3(onNodePositionChange))
    if (onRightClickLink != null) __obj.updateDynamic("onRightClickLink")(js.Any.fromFunction3(onRightClickLink))
    if (onRightClickNode != null) __obj.updateDynamic("onRightClickNode")(js.Any.fromFunction2(onRightClickNode))
    __obj.asInstanceOf[GraphProps[N, L]]
  }
}

