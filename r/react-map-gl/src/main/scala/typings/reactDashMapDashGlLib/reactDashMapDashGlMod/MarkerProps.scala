package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerProps extends BaseControlProps {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var latitude: scala.Double
  var longitude: scala.Double
  var offsetLeft: js.UndefOr[scala.Double] = js.undefined
  var offsetTop: js.UndefOr[scala.Double] = js.undefined
  var onDrag: js.UndefOr[js.Function1[/* event */ DragEvent, scala.Unit]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* event */ DragEvent, scala.Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent, scala.Unit]] = js.undefined
}

object MarkerProps {
  @scala.inline
  def apply(
    latitude: scala.Double,
    longitude: scala.Double,
    captureClick: js.UndefOr[scala.Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[scala.Boolean] = js.undefined,
    captureDrag: js.UndefOr[scala.Boolean] = js.undefined,
    captureScroll: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    offsetLeft: scala.Int | scala.Double = null,
    offsetTop: scala.Int | scala.Double = null,
    onDrag: /* event */ DragEvent => scala.Unit = null,
    onDragEnd: /* event */ DragEvent => scala.Unit = null,
    onDragStart: /* event */ DragEvent => scala.Unit = null
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

