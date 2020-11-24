package typings.roll.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidInputError extends Error {
  
  @JSName("name")
  var name_InvalidInputError: typings.roll.rollStrings.InvalidInputError = js.native
}
object InvalidInputError {
  
  @scala.inline
  def apply(message: String, name: typings.roll.rollStrings.InvalidInputError): InvalidInputError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidInputError]
  }
  
  @scala.inline
  implicit class InvalidInputErrorOps[Self <: InvalidInputError] (val x: Self) extends AnyVal {
    
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
    def setName(value: typings.roll.rollStrings.InvalidInputError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
