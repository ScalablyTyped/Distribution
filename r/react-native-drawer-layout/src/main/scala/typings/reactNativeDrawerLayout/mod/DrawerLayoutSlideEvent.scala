package typings.reactNativeDrawerLayout.mod

import typings.reactNativeDrawerLayout.anon.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerLayoutSlideEvent extends js.Object {
  var nativeEvent: Offset
}

object DrawerLayoutSlideEvent {
  @scala.inline
  def apply(nativeEvent: Offset): DrawerLayoutSlideEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutSlideEvent]
  }
}

