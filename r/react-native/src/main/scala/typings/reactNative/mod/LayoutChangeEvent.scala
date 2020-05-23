package typings.reactNative.mod

import typings.reactNative.anon.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutChangeEvent extends js.Object {
  var nativeEvent: Layout
}

object LayoutChangeEvent {
  @scala.inline
  def apply(nativeEvent: Layout): LayoutChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutChangeEvent]
  }
}

