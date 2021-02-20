package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validation extends StObject {
  
  def errorFilter(errorMsg: String, errorCode: String, `type`: String): Unit = js.native
  
  var messages: StringDictionary[String] = js.native
  
  var overrideMessages: Boolean = js.native
}
object Validation {
  
  @scala.inline
  def apply(
    errorFilter: (String, String, String) => Unit,
    messages: StringDictionary[String],
    overrideMessages: Boolean
  ): Validation = {
    val __obj = js.Dynamic.literal(errorFilter = js.Any.fromFunction3(errorFilter), messages = messages.asInstanceOf[js.Any], overrideMessages = overrideMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validation]
  }
  
  @scala.inline
  implicit class ValidationMutableBuilder[Self <: Validation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorFilter(value: (String, String, String) => Unit): Self = StObject.set(x, "errorFilter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMessages(value: StringDictionary[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideMessages(value: Boolean): Self = StObject.set(x, "overrideMessages", value.asInstanceOf[js.Any])
  }
}
