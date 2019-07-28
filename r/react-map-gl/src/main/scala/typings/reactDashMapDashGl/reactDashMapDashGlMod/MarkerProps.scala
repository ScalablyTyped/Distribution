package typings.reactDashMapDashGl.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerProps extends DraggableControlProps {
  var className: js.UndefOr[String] = js.undefined
  var latitude: Double
  var longitude: Double
  var offsetLeft: js.UndefOr[Double] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
}

object MarkerProps {
  @scala.inline
  def apply(
    latitude: Double,
    longitude: Double,
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    offsetLeft: Int | Double = null,
    offsetTop: Int | Double = null,
    onDrag: /* event */ DragEvent => Unit = null,
    onDragEnd: /* event */ DragEvent => Unit = null,
    onDragStart: /* event */ DragEvent => Unit = null
  ): MarkerProps = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick)
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick)
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag)
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    __obj.asInstanceOf[MarkerProps]
  }
}

