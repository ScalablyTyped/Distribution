package typings.reactDevtoolsInline.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSupported extends StObject {
  
  var isSupported: Boolean
  
  var validAttributes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IsSupported {
  
  inline def apply(isSupported: Boolean): IsSupported = {
    val __obj = js.Dynamic.literal(isSupported = isSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSupported]
  }
  
  extension [Self <: IsSupported](x: Self) {
    
    inline def setIsSupported(value: Boolean): Self = StObject.set(x, "isSupported", value.asInstanceOf[js.Any])
    
    inline def setValidAttributes(value: js.Array[String]): Self = StObject.set(x, "validAttributes", value.asInstanceOf[js.Any])
    
    inline def setValidAttributesNull: Self = StObject.set(x, "validAttributes", null)
    
    inline def setValidAttributesUndefined: Self = StObject.set(x, "validAttributes", js.undefined)
    
    inline def setValidAttributesVarargs(value: String*): Self = StObject.set(x, "validAttributes", js.Array(value*))
  }
}
