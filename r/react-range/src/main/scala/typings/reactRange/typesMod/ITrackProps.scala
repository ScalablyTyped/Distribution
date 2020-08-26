package typings.reactRange.typesMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefObject
import typings.react.mod.TouchEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITrackProps extends js.Object {
  var ref: RefObject[_] = js.native
  var style: CSSProperties = js.native
  def onMouseDown(e: MouseEvent[Element, NativeMouseEvent]): Unit = js.native
  def onTouchStart(e: TouchEvent[Element]): Unit = js.native
}

object ITrackProps {
  @scala.inline
  def apply(
    onMouseDown: MouseEvent[Element, NativeMouseEvent] => Unit,
    onTouchStart: TouchEvent[Element] => Unit,
    ref: RefObject[_],
    style: CSSProperties
  ): ITrackProps = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart), ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrackProps]
  }
  @scala.inline
  implicit class ITrackPropsOps[Self <: ITrackProps] (val x: Self) extends AnyVal {
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
    def setOnMouseDown(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTouchStart(value: TouchEvent[Element] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: RefObject[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

