package typings.reactBeautifulDnd.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragDropContextProps extends js.Object {
  var children: ReactNode | Null = js.native
  var dragHandleUsageInstructions: js.UndefOr[String] = js.native
  var enableDefaultSensors: js.UndefOr[Boolean] = js.native
  var nonce: js.UndefOr[String] = js.native
  var onBeforeCapture: js.UndefOr[js.Function1[/* before */ BeforeCapture, Unit]] = js.native
  var onBeforeDragStart: js.UndefOr[js.Function1[/* initial */ DragStart, Unit]] = js.native
  var onDragStart: js.UndefOr[js.Function2[/* initial */ DragStart, /* provided */ ResponderProvided, Unit]] = js.native
  var onDragUpdate: js.UndefOr[js.Function2[/* initial */ DragUpdate, /* provided */ ResponderProvided, Unit]] = js.native
  var sensors: js.UndefOr[js.Array[Sensor]] = js.native
  def onDragEnd(result: DropResult, provided: ResponderProvided): Unit = js.native
}

object DragDropContextProps {
  @scala.inline
  def apply(onDragEnd: (DropResult, ResponderProvided) => Unit): DragDropContextProps = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    __obj.asInstanceOf[DragDropContextProps]
  }
  @scala.inline
  implicit class DragDropContextPropsOps[Self <: DragDropContextProps] (val x: Self) extends AnyVal {
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
    def setOnDragEnd(value: (DropResult, ResponderProvided) => Unit): Self = this.set("onDragEnd", js.Any.fromFunction2(value))
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
    @scala.inline
    def setDragHandleUsageInstructions(value: String): Self = this.set("dragHandleUsageInstructions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragHandleUsageInstructions: Self = this.set("dragHandleUsageInstructions", js.undefined)
    @scala.inline
    def setEnableDefaultSensors(value: Boolean): Self = this.set("enableDefaultSensors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDefaultSensors: Self = this.set("enableDefaultSensors", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setOnBeforeCapture(value: /* before */ BeforeCapture => Unit): Self = this.set("onBeforeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeCapture: Self = this.set("onBeforeCapture", js.undefined)
    @scala.inline
    def setOnBeforeDragStart(value: /* initial */ DragStart => Unit): Self = this.set("onBeforeDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeDragStart: Self = this.set("onBeforeDragStart", js.undefined)
    @scala.inline
    def setOnDragStart(value: (/* initial */ DragStart, /* provided */ ResponderProvided) => Unit): Self = this.set("onDragStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDragUpdate(value: (/* initial */ DragUpdate, /* provided */ ResponderProvided) => Unit): Self = this.set("onDragUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDragUpdate: Self = this.set("onDragUpdate", js.undefined)
    @scala.inline
    def setSensorsVarargs(value: Sensor*): Self = this.set("sensors", js.Array(value :_*))
    @scala.inline
    def setSensors(value: js.Array[Sensor]): Self = this.set("sensors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensors: Self = this.set("sensors", js.undefined)
  }
  
}

