package typings.rcFieldForm.fieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldState extends js.Object {
  var resetCount: Double = js.native
}

object FieldState {
  @scala.inline
  def apply(resetCount: Double): FieldState = {
    val __obj = js.Dynamic.literal(resetCount = resetCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldState]
  }
  @scala.inline
  implicit class FieldStateOps[Self <: FieldState] (val x: Self) extends AnyVal {
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
    def setResetCount(value: Double): Self = this.set("resetCount", value.asInstanceOf[js.Any])
  }
  
}

