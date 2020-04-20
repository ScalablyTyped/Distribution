package typings.reactNativeSafeArea.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventPayload extends js.Object {
  var safeAreaInsets: SafeAreaInsets
}

object EventPayload {
  @scala.inline
  def apply(safeAreaInsets: SafeAreaInsets): EventPayload = {
    val __obj = js.Dynamic.literal(safeAreaInsets = safeAreaInsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPayload]
  }
}

