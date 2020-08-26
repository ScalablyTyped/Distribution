package typings.reactNative.mod

import typings.reactNative.anon.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutChangeEvent extends js.Object {
  var nativeEvent: Layout = js.native
}

object LayoutChangeEvent {
  @scala.inline
  def apply(nativeEvent: Layout): LayoutChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutChangeEvent]
  }
  @scala.inline
  implicit class LayoutChangeEventOps[Self <: LayoutChangeEvent] (val x: Self) extends AnyVal {
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
    def setNativeEvent(value: Layout): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
  }
  
}

