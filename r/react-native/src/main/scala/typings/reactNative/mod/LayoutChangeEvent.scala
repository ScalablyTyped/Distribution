package typings.reactNative.mod

import typings.reactNative.AnonLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutChangeEvent extends js.Object {
  var nativeEvent: AnonLayout
}

object LayoutChangeEvent {
  @scala.inline
  def apply(nativeEvent: AnonLayout): LayoutChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LayoutChangeEvent]
  }
}

