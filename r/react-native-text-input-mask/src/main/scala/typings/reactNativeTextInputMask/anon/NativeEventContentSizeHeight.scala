package typings.reactNativeTextInputMask.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeEventContentSizeHeight extends js.Object {
  var nativeEvent: ContentSizeHeight = js.native
}

object NativeEventContentSizeHeight {
  @scala.inline
  def apply(nativeEvent: ContentSizeHeight): NativeEventContentSizeHeight = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEventContentSizeHeight]
  }
  @scala.inline
  implicit class NativeEventContentSizeHeightOps[Self <: NativeEventContentSizeHeight] (val x: Self) extends AnyVal {
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
    def setNativeEvent(value: ContentSizeHeight): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
  }
  
}

