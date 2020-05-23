package typings.reactD3Graph.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphEventCallbacks extends js.Object {
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
    val __obj = js.Dynamic.literal(onClickLink = js.Any.fromFunction2(onClickLink), onClickNode = js.Any.fromFunction1(onClickNode), onDoubleClickNode = js.Any.fromFunction1(onDoubleClickNode), onMouseOutLink = js.Any.fromFunction2(onMouseOutLink), onMouseOutNode = js.Any.fromFunction1(onMouseOutNode), onMouseOverLink = js.Any.fromFunction2(onMouseOverLink), onMouseOverNode = js.Any.fromFunction1(onMouseOverNode), onNodePositionChange = js.Any.fromFunction3(onNodePositionChange), onRightClickLink = js.Any.fromFunction3(onRightClickLink), onRightClickNode = js.Any.fromFunction2(onRightClickNode))
    __obj.asInstanceOf[GraphEventCallbacks]
  }
}

