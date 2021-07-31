package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorWithParam extends StObject {
  
  var message: String
  
  var param: String
  
  var value: String | Null
}
object ErrorWithParam {
  
  @scala.inline
  def apply(message: String, param: String): ErrorWithParam = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[ErrorWithParam]
  }
  
  @scala.inline
  implicit class ErrorWithParamMutableBuilder[Self <: ErrorWithParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
  }
}
