package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validation extends StObject {
  
  def errorFilter(errorMsg: String, errorCode: String, `type`: String): Unit
  
  var messages: StringDictionary[String]
  
  var overrideMessages: Boolean
}
object Validation {
  
  inline def apply(
    errorFilter: (String, String, String) => Unit,
    messages: StringDictionary[String],
    overrideMessages: Boolean
  ): Validation = {
    val __obj = js.Dynamic.literal(errorFilter = js.Any.fromFunction3(errorFilter), messages = messages.asInstanceOf[js.Any], overrideMessages = overrideMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validation]
  }
  
  extension [Self <: Validation](x: Self) {
    
    inline def setErrorFilter(value: (String, String, String) => Unit): Self = StObject.set(x, "errorFilter", js.Any.fromFunction3(value))
    
    inline def setMessages(value: StringDictionary[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setOverrideMessages(value: Boolean): Self = StObject.set(x, "overrideMessages", value.asInstanceOf[js.Any])
  }
}
