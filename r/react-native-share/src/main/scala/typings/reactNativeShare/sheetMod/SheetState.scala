package typings.reactNativeShare.sheetMod

import typings.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetState extends js.Object {
  var bottom: Value
}

object SheetState {
  @scala.inline
  def apply(bottom: Value): SheetState = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetState]
  }
}

