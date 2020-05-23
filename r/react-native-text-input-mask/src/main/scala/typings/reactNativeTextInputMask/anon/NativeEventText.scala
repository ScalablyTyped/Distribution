package typings.reactNativeTextInputMask.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeEventText extends js.Object {
  var nativeEvent: Text
}

object NativeEventText {
  @scala.inline
  def apply(nativeEvent: Text): NativeEventText = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEventText]
  }
}

