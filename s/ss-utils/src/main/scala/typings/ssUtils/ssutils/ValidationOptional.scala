package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationOptional extends StObject {
  
  var errorFilter: js.UndefOr[
    js.Function3[/* errorMsg */ String, /* errorCode */ String, /* type */ String, Unit]
  ] = js.undefined
  
  var messages: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var overrideMessages: js.UndefOr[Boolean] = js.undefined
}
object ValidationOptional {
  
  @scala.inline
  def apply(): ValidationOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptional]
  }
  
  @scala.inline
  implicit class ValidationOptionalMutableBuilder[Self <: ValidationOptional] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorFilter(value: (/* errorMsg */ String, /* errorCode */ String, /* type */ String) => Unit): Self = StObject.set(x, "errorFilter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setErrorFilterUndefined: Self = StObject.set(x, "errorFilter", js.undefined)
    
    @scala.inline
    def setMessages(value: StringDictionary[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setOverrideMessages(value: Boolean): Self = StObject.set(x, "overrideMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideMessagesUndefined: Self = StObject.set(x, "overrideMessages", js.undefined)
  }
}
