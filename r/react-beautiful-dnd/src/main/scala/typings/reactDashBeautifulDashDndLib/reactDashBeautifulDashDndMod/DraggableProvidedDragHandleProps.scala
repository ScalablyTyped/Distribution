package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableProvidedDragHandleProps extends js.Object {
  var `aria-grabbed`: scala.Boolean = js.native
  var `aria-roledescription`: java.lang.String = js.native
  var `data-react-beautiful-dnd-drag-handle`: java.lang.String = js.native
  var draggable: scala.Boolean = js.native
  @JSName("onDragStart")
  var onDragStart_Original: reactLib.reactMod.ReactNs.DragEventHandler[_] = js.native
  @JSName("onKeyDown")
  var onKeyDown_Original: reactLib.reactMod.ReactNs.KeyboardEventHandler[_] = js.native
  @JSName("onMouseDown")
  var onMouseDown_Original: reactLib.reactMod.ReactNs.MouseEventHandler[_] = js.native
  @JSName("onTouchMove")
  var onTouchMove_Original: reactLib.reactMod.ReactNs.TouchEventHandler[_] = js.native
  @JSName("onTouchStart")
  var onTouchStart_Original: reactLib.reactMod.ReactNs.TouchEventHandler[_] = js.native
  var tabIndex: scala.Double = js.native
  def onDragStart(event: reactLib.reactMod.ReactNs.DragEvent[_]): scala.Unit = js.native
  def onKeyDown(event: reactLib.reactMod.ReactNs.KeyboardEvent[_]): scala.Unit = js.native
  def onMouseDown(event: reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent]): scala.Unit = js.native
  def onTouchMove(event: reactLib.reactMod.ReactNs.TouchEvent[_]): scala.Unit = js.native
  def onTouchStart(event: reactLib.reactMod.ReactNs.TouchEvent[_]): scala.Unit = js.native
}

