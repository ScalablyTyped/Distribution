package typings.reactQuery.typesCoreQueryMod

import typings.reactQuery.reactQueryStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorAction[TError]
  extends StObject
     with Action[Any, TError] {
  
  var error: TError
  
  var `type`: error
}
object ErrorAction {
  
  inline def apply[TError](error: TError): ErrorAction[TError] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[ErrorAction[TError]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorAction[?], TError] (val x: Self & ErrorAction[TError]) extends AnyVal {
    
    inline def setError(value: TError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
