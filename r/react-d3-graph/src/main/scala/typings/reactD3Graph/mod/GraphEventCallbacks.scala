package typings.reactD3Graph.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphEventCallbacks extends js.Object {
  def onClickGraph(event: MouseEvent[Element, NativeMouseEvent]): Unit = js.native
  def onClickLink(source: String, target: String): Unit = js.native
  def onClickNode(nodeId: String): Unit = js.native
  def onDoubleClickNode(nodeId: String): Unit = js.native
  def onMouseOutLink(source: String, target: String): Unit = js.native
  def onMouseOutNode(nodeId: String): Unit = js.native
  def onMouseOverLink(source: String, target: String): Unit = js.native
  def onMouseOverNode(nodeId: String): Unit = js.native
  def onNodePositionChange(nodeId: String, x: Double, y: Double): Unit = js.native
  def onRightClickLink(event: MouseEvent[Element, NativeMouseEvent], source: String, target: String): Unit = js.native
  def onRightClickNode(event: MouseEvent[Element, NativeMouseEvent], nodeId: String): Unit = js.native
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
  implicit class GraphEventCallbacksOps[Self <: GraphEventCallbacks] (val x: Self) extends AnyVal {
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
    def setOnClickGraph(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("onClickGraph", js.Any.fromFunction1(value))
    @scala.inline
    def setOnClickLink(value: (String, String) => Unit): Self = this.set("onClickLink", js.Any.fromFunction2(value))
    @scala.inline
    def setOnClickNode(value: String => Unit): Self = this.set("onClickNode", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDoubleClickNode(value: String => Unit): Self = this.set("onDoubleClickNode", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseOutLink(value: (String, String) => Unit): Self = this.set("onMouseOutLink", js.Any.fromFunction2(value))
    @scala.inline
    def setOnMouseOutNode(value: String => Unit): Self = this.set("onMouseOutNode", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseOverLink(value: (String, String) => Unit): Self = this.set("onMouseOverLink", js.Any.fromFunction2(value))
    @scala.inline
    def setOnMouseOverNode(value: String => Unit): Self = this.set("onMouseOverNode", js.Any.fromFunction1(value))
    @scala.inline
    def setOnNodePositionChange(value: (String, Double, Double) => Unit): Self = this.set("onNodePositionChange", js.Any.fromFunction3(value))
    @scala.inline
    def setOnRightClickLink(value: (MouseEvent[Element, NativeMouseEvent], String, String) => Unit): Self = this.set("onRightClickLink", js.Any.fromFunction3(value))
    @scala.inline
    def setOnRightClickNode(value: (MouseEvent[Element, NativeMouseEvent], String) => Unit): Self = this.set("onRightClickNode", js.Any.fromFunction2(value))
  }
  
}

