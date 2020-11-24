package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.ValidateMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mismatch extends js.Object {
  
  var mismatch: js.UndefOr[ValidateMessage] = js.native
}
object Mismatch {
  
  @scala.inline
  def apply(): Mismatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mismatch]
  }
  
  @scala.inline
  implicit class MismatchOps[Self <: Mismatch] (val x: Self) extends AnyVal {
    
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
    def setMismatchFunction0(value: () => String): Self = this.set("mismatch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMismatch(value: ValidateMessage): Self = this.set("mismatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMismatch: Self = this.set("mismatch", js.undefined)
  }
}
