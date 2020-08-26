package typings.reactNativeTextInputMask.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeEventText extends js.Object {
  var nativeEvent: Text = js.native
}

object NativeEventText {
  @scala.inline
  def apply(nativeEvent: Text): NativeEventText = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEventText]
  }
  @scala.inline
  implicit class NativeEventTextOps[Self <: NativeEventText] (val x: Self) extends AnyVal {
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
    def setNativeEvent(value: Text): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
  }
  
}

