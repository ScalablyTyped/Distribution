package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeoutError
  extends StObject
     with BaseError {
  
  @JSName("name")
  var name_TimeoutError: typings.reactNativeAuth0.reactNativeAuth0Strings.TimeoutError
}
object TimeoutError {
  
  inline def apply(message: String): TimeoutError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "TimeoutError")
    __obj.asInstanceOf[TimeoutError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeoutError] (val x: Self) extends AnyVal {
    
    inline def setName(value: typings.reactNativeAuth0.reactNativeAuth0Strings.TimeoutError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
