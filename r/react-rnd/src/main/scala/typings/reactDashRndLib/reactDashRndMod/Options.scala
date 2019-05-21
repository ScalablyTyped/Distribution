package typings
package reactDashRndLib.reactDashRndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bounds: reactDashRndLib.reactDashRndLibStrings.parent | reactDashRndLib.reactDashRndLibStrings.window | reactDashRndLib.reactDashRndLibStrings.body | java.lang.String
  var className: java.lang.String
  var default: reactDashRndLib.Anon_Height
  var disableDragging: js.UndefOr[scala.Boolean] = js.undefined
  var enableResizing: js.UndefOr[Enable] = js.undefined
  var height: scala.Double | java.lang.String
  var lockAspectRatio: scala.Boolean
  var maxHeight: scala.Double | java.lang.String
  var maxWidth: scala.Double | java.lang.String
  var minHeight: scala.Double | java.lang.String
  var minWidth: scala.Double | java.lang.String
  var onDrag: DraggableEventHandler
  var onDragStart: DraggableEventHandler
  var onDragStop: DraggableEventHandler
  var onResizeStop: ResizeHandler
  var position: js.UndefOr[reactDashRndLib.Anon_X] = js.undefined
  var resizeHandleClasses: HandleClasses
  var resizeHandleStyles: HandleStyles
  var style: js.Any
  var width: scala.Double | java.lang.String
  var z: scala.Double
  def onResize(): scala.Unit
  def onResizeStart(): scala.Unit
}

object Options {
  @scala.inline
  def apply(
    bounds: reactDashRndLib.reactDashRndLibStrings.parent | reactDashRndLib.reactDashRndLibStrings.window | reactDashRndLib.reactDashRndLibStrings.body | java.lang.String,
    className: java.lang.String,
    default: reactDashRndLib.Anon_Height,
    height: scala.Double | java.lang.String,
    lockAspectRatio: scala.Boolean,
    maxHeight: scala.Double | java.lang.String,
    maxWidth: scala.Double | java.lang.String,
    minHeight: scala.Double | java.lang.String,
    minWidth: scala.Double | java.lang.String,
    onDrag: DraggableEventHandler,
    onDragStart: DraggableEventHandler,
    onDragStop: DraggableEventHandler,
    onResize: () => scala.Unit,
    onResizeStart: () => scala.Unit,
    onResizeStop: ResizeHandler,
    resizeHandleClasses: HandleClasses,
    resizeHandleStyles: HandleStyles,
    style: js.Any,
    width: scala.Double | java.lang.String,
    z: scala.Double,
    disableDragging: js.UndefOr[scala.Boolean] = js.undefined,
    enableResizing: Enable = null,
    position: reactDashRndLib.Anon_X = null
  ): Options = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], className = className, default = default, height = height.asInstanceOf[js.Any], lockAspectRatio = lockAspectRatio, maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], onDrag = onDrag, onDragStart = onDragStart, onDragStop = onDragStop, onResize = js.Any.fromFunction0(onResize), onResizeStart = js.Any.fromFunction0(onResizeStart), onResizeStop = onResizeStop, resizeHandleClasses = resizeHandleClasses, resizeHandleStyles = resizeHandleStyles, style = style, width = width.asInstanceOf[js.Any], z = z)
    if (!js.isUndefined(disableDragging)) __obj.updateDynamic("disableDragging")(disableDragging)
    if (enableResizing != null) __obj.updateDynamic("enableResizing")(enableResizing)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Options]
  }
}

