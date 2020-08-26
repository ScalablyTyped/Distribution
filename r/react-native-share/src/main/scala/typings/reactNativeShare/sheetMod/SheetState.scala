package typings.reactNativeShare.sheetMod

import typings.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetState extends js.Object {
  var bottom: Value = js.native
}

object SheetState {
  @scala.inline
  def apply(bottom: Value): SheetState = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetState]
  }
  @scala.inline
  implicit class SheetStateOps[Self <: SheetState] (val x: Self) extends AnyVal {
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
    def setBottom(value: Value): Self = this.set("bottom", value.asInstanceOf[js.Any])
  }
  
}

