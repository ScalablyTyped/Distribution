package typings.reactSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputValue extends StObject {
  
  var inputValue: String = js.native
}
object InputValue {
  
  @scala.inline
  def apply(inputValue: String): InputValue = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValue]
  }
  
  @scala.inline
  implicit class InputValueMutableBuilder[Self <: InputValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
  }
}
