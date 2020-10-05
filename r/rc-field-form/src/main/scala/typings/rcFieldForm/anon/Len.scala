package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.ValidateMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Len extends js.Object {
  var len: js.UndefOr[ValidateMessage] = js.native
  var max: js.UndefOr[ValidateMessage] = js.native
  var min: js.UndefOr[ValidateMessage] = js.native
  var range: js.UndefOr[ValidateMessage] = js.native
}

object Len {
  @scala.inline
  def apply(): Len = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Len]
  }
  @scala.inline
  implicit class LenOps[Self <: Len] (val x: Self) extends AnyVal {
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
    def setLenFunction0(value: () => String): Self = this.set("len", js.Any.fromFunction0(value))
    @scala.inline
    def setLen(value: ValidateMessage): Self = this.set("len", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLen: Self = this.set("len", js.undefined)
    @scala.inline
    def setMaxFunction0(value: () => String): Self = this.set("max", js.Any.fromFunction0(value))
    @scala.inline
    def setMax(value: ValidateMessage): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMinFunction0(value: () => String): Self = this.set("min", js.Any.fromFunction0(value))
    @scala.inline
    def setMin(value: ValidateMessage): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setRangeFunction0(value: () => String): Self = this.set("range", js.Any.fromFunction0(value))
    @scala.inline
    def setRange(value: ValidateMessage): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

