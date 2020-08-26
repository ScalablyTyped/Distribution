package typings.reactDayPicker.modifiersMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterModifier extends _Modifier {
  var after: Date = js.native
}

object AfterModifier {
  @scala.inline
  def apply(after: Date): AfterModifier = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterModifier]
  }
  @scala.inline
  implicit class AfterModifierOps[Self <: AfterModifier] (val x: Self) extends AnyVal {
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
    def setAfter(value: Date): Self = this.set("after", value.asInstanceOf[js.Any])
  }
  
}

