package typings.smallweiAvue.anon

import typings.smallweiAvue.ValidateMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var format: js.UndefOr[ValidateMessage[js.Array[Any]]] = js.undefined
  
  var invalid: js.UndefOr[ValidateMessage[js.Array[Any]]] = js.undefined
  
  var parse: js.UndefOr[ValidateMessage[js.Array[Any]]] = js.undefined
}
object Format {
  
  inline def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: ValidateMessage[js.Array[Any]]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Array[Any] => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInvalid(value: ValidateMessage[js.Array[Any]]): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidFunction1(value: js.Array[Any] => String): Self = StObject.set(x, "invalid", js.Any.fromFunction1(value))
    
    inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    inline def setParse(value: ValidateMessage[js.Array[Any]]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseFunction1(value: js.Array[Any] => String): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
  }
}
