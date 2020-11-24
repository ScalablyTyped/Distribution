package typings.revalidate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedField extends js.Object {
  
  var baseName: String = js.native
  
  var fullName: String = js.native
  
  var isArray: Boolean = js.native
}
object ParsedField {
  
  @scala.inline
  def apply(baseName: String, fullName: String, isArray: Boolean): ParsedField = {
    val __obj = js.Dynamic.literal(baseName = baseName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedField]
  }
  
  @scala.inline
  implicit class ParsedFieldOps[Self <: ParsedField] (val x: Self) extends AnyVal {
    
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
    def setBaseName(value: String): Self = this.set("baseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsArray(value: Boolean): Self = this.set("isArray", value.asInstanceOf[js.Any])
  }
}
