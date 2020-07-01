package typings.reactBeautifulDnd.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropContextProps extends js.Object {
  var children: ReactNode | Null
  var dragHandleUsageInstructions: js.UndefOr[String] = js.undefined
  var enableDefaultSensors: js.UndefOr[Boolean] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var onBeforeCapture: js.UndefOr[js.Function1[/* before */ BeforeCapture, Unit]] = js.undefined
  var onBeforeDragStart: js.UndefOr[js.Function1[/* initial */ DragStart, Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function2[/* initial */ DragStart, /* provided */ ResponderProvided, Unit]] = js.undefined
  var onDragUpdate: js.UndefOr[js.Function2[/* initial */ DragUpdate, /* provided */ ResponderProvided, Unit]] = js.undefined
  var sensors: js.UndefOr[js.Array[Sensor]] = js.undefined
  def onDragEnd(result: DropResult, provided: ResponderProvided): Unit
}

object DragDropContextProps {
  @scala.inline
  def apply(
    onDragEnd: (DropResult, ResponderProvided) => Unit,
    children: js.UndefOr[Null | ReactNode] = js.undefined,
    dragHandleUsageInstructions: String = null,
    enableDefaultSensors: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    onBeforeCapture: /* before */ BeforeCapture => Unit = null,
    onBeforeDragStart: /* initial */ DragStart => Unit = null,
    onDragStart: (/* initial */ DragStart, /* provided */ ResponderProvided) => Unit = null,
    onDragUpdate: (/* initial */ DragUpdate, /* provided */ ResponderProvided) => Unit = null,
    sensors: js.Array[Sensor] = null
  ): DragDropContextProps = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dragHandleUsageInstructions != null) __obj.updateDynamic("dragHandleUsageInstructions")(dragHandleUsageInstructions.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDefaultSensors)) __obj.updateDynamic("enableDefaultSensors")(enableDefaultSensors.get.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (onBeforeCapture != null) __obj.updateDynamic("onBeforeCapture")(js.Any.fromFunction1(onBeforeCapture))
    if (onBeforeDragStart != null) __obj.updateDynamic("onBeforeDragStart")(js.Any.fromFunction1(onBeforeDragStart))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction2(onDragStart))
    if (onDragUpdate != null) __obj.updateDynamic("onDragUpdate")(js.Any.fromFunction2(onDragUpdate))
    if (sensors != null) __obj.updateDynamic("sensors")(sensors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDropContextProps]
  }
}

