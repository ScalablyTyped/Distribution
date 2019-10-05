package typings.reactDashRnd.reactDashRndMod

import typings.reactDashRnd.Anon_Height
import typings.reactDashRnd.Anon_X
import typings.reactDashRnd.reactDashRndNumbers.`false`
import typings.reactDashRnd.reactDashRndStrings.body
import typings.reactDashRnd.reactDashRndStrings.parent
import typings.reactDashRnd.reactDashRndStrings.window
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bounds: parent | window | body | String
  var className: String
  var default: Anon_Height
  var disableDragging: js.UndefOr[Boolean] = js.undefined
  var enableResizing: js.UndefOr[Enable] = js.undefined
  var height: Double | String
  var lockAspectRatio: Boolean
  var maxHeight: Double | String
  var maxWidth: Double | String
  var minHeight: Double | String
  var minWidth: Double | String
  var onDrag: DraggableEventHandler
  var onDragStart: DraggableEventHandler
  var onDragStop: DraggableEventHandler
  var onResizeStop: ResizeHandler
  var position: js.UndefOr[Anon_X] = js.undefined
  var resizeHandleClasses: HandleClasses
  var resizeHandleStyles: HandleStyles
  var style: js.Any
  var width: Double | String
  var z: Double
  def onResize(): Unit
  def onResizeStart(): Unit
}

object Options {
  @scala.inline
  def apply(
    bounds: parent | window | body | String,
    className: String,
    default: Anon_Height,
    height: Double | String,
    lockAspectRatio: Boolean,
    maxHeight: Double | String,
    maxWidth: Double | String,
    minHeight: Double | String,
    minWidth: Double | String,
    onDrag: (/* e */ MouseEvent | TouchEvent, /* data */ DraggableData) => Unit | `false`,
    onDragStart: (/* e */ MouseEvent | TouchEvent, /* data */ DraggableData) => Unit | `false`,
    onDragStop: (/* e */ MouseEvent | TouchEvent, /* data */ DraggableData) => Unit | `false`,
    onResize: () => Unit,
    onResizeStart: () => Unit,
    onResizeStop: (/* e */ MouseEvent | TouchEvent, /* direction */ Direction, /* ref */ HTMLDivElement, /* delta */ Size, /* position */ Position) => Unit,
    resizeHandleClasses: HandleClasses,
    resizeHandleStyles: HandleStyles,
    style: js.Any,
    width: Double | String,
    z: Double,
    disableDragging: js.UndefOr[Boolean] = js.undefined,
    enableResizing: Enable = null,
    position: Anon_X = null
  ): Options = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], className = className, default = default, height = height.asInstanceOf[js.Any], lockAspectRatio = lockAspectRatio, maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], onDrag = js.Any.fromFunction2(onDrag), onDragStart = js.Any.fromFunction2(onDragStart), onDragStop = js.Any.fromFunction2(onDragStop), onResize = js.Any.fromFunction0(onResize), onResizeStart = js.Any.fromFunction0(onResizeStart), onResizeStop = js.Any.fromFunction5(onResizeStop), resizeHandleClasses = resizeHandleClasses, resizeHandleStyles = resizeHandleStyles, style = style, width = width.asInstanceOf[js.Any], z = z)
    if (!js.isUndefined(disableDragging)) __obj.updateDynamic("disableDragging")(disableDragging)
    if (enableResizing != null) __obj.updateDynamic("enableResizing")(enableResizing)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Options]
  }
}

