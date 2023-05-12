package typings.sentryBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxStringLength extends StObject {
  
  var maxStringLength: js.UndefOr[Double] = js.undefined
  
  var serializeAttribute: js.UndefOr[String | js.Array[String]] = js.undefined
}
object MaxStringLength {
  
  inline def apply(): MaxStringLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxStringLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxStringLength] (val x: Self) extends AnyVal {
    
    inline def setMaxStringLength(value: Double): Self = StObject.set(x, "maxStringLength", value.asInstanceOf[js.Any])
    
    inline def setMaxStringLengthUndefined: Self = StObject.set(x, "maxStringLength", js.undefined)
    
    inline def setSerializeAttribute(value: String | js.Array[String]): Self = StObject.set(x, "serializeAttribute", value.asInstanceOf[js.Any])
    
    inline def setSerializeAttributeUndefined: Self = StObject.set(x, "serializeAttribute", js.undefined)
    
    inline def setSerializeAttributeVarargs(value: String*): Self = StObject.set(x, "serializeAttribute", js.Array(value*))
  }
}
