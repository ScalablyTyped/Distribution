package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNativeEvent extends js.Object {
  var nativeEvent: AnonLayoutAnonHeightWidth
}

object AnonNativeEvent {
  @scala.inline
  def apply(nativeEvent: AnonLayoutAnonHeightWidth): AnonNativeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNativeEvent]
  }
}

