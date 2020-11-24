package typings.soap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subcode extends js.Object {
  
  var Subcode: js.UndefOr[Value] = js.native
  
  var Value: String = js.native
}
object Subcode {
  
  @scala.inline
  def apply(Value: String): Subcode = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subcode]
  }
  
  @scala.inline
  implicit class SubcodeOps[Self <: Subcode] (val x: Self) extends AnyVal {
    
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
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubcode(value: Value): Self = this.set("Subcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubcode: Self = this.set("Subcode", js.undefined)
  }
}
