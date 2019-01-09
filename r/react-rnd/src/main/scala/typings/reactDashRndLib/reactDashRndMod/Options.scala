package typings
package reactDashRndLib.reactDashRndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var bounds: reactDashRndLib.reactDashRndLibStrings.parent | reactDashRndLib.reactDashRndLibStrings.window | reactDashRndLib.reactDashRndLibStrings.body | java.lang.String = js.native
  var className: java.lang.String = js.native
  var default: reactDashRndLib.Anon_Height = js.native
  var disableDragging: js.UndefOr[scala.Boolean] = js.native
  var enableResizing: js.UndefOr[Enable] = js.native
  var height: scala.Double | java.lang.String = js.native
  var lockAspectRatio: scala.Boolean = js.native
  var maxHeight: scala.Double | java.lang.String = js.native
  var maxWidth: scala.Double | java.lang.String = js.native
  var minHeight: scala.Double | java.lang.String = js.native
  var minWidth: scala.Double | java.lang.String = js.native
  @JSName("onDragStart")
  var onDragStart_Original: DraggableEventHandler = js.native
  @JSName("onDragStop")
  var onDragStop_Original: DraggableEventHandler = js.native
  @JSName("onDrag")
  var onDrag_Original: DraggableEventHandler = js.native
  @JSName("onResizeStop")
  var onResizeStop_Original: ResizeHandler = js.native
  var resizeHandleClasses: HandleClasses = js.native
  var resizeHandleStyles: HandleStyles = js.native
  var style: js.Any = js.native
  var width: scala.Double | java.lang.String = js.native
  var z: scala.Double = js.native
  def onDrag(e: reactLib.MouseEvent | reactLib.TouchEvent, data: DraggableData): scala.Unit | reactDashRndLib.reactDashRndLibNumbers.`false` = js.native
  def onDragStart(e: reactLib.MouseEvent | reactLib.TouchEvent, data: DraggableData): scala.Unit | reactDashRndLib.reactDashRndLibNumbers.`false` = js.native
  def onDragStop(e: reactLib.MouseEvent | reactLib.TouchEvent, data: DraggableData): scala.Unit | reactDashRndLib.reactDashRndLibNumbers.`false` = js.native
  def onResize(): scala.Unit = js.native
  def onResizeStart(): scala.Unit = js.native
  def onResizeStop(
    e: reactLib.MouseEvent | reactLib.TouchEvent,
    direction: Direction,
    ref: reactLib.HTMLDivElement,
    delta: Size,
    position: Position
  ): scala.Unit = js.native
}

