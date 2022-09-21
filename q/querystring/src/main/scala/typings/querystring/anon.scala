package typings.querystring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DecodeURIComponent extends StObject {
    
    var decodeURIComponent: js.UndefOr[js.Function] = js.undefined
    
    var maxKeys: js.UndefOr[Double] = js.undefined
  }
  object DecodeURIComponent {
    
    inline def apply(): DecodeURIComponent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeURIComponent]
    }
    
    extension [Self <: DecodeURIComponent](x: Self) {
      
      inline def setDecodeURIComponent(value: js.Function): Self = StObject.set(x, "decodeURIComponent", value.asInstanceOf[js.Any])
      
      inline def setDecodeURIComponentUndefined: Self = StObject.set(x, "decodeURIComponent", js.undefined)
      
      inline def setMaxKeys(value: Double): Self = StObject.set(x, "maxKeys", value.asInstanceOf[js.Any])
      
      inline def setMaxKeysUndefined: Self = StObject.set(x, "maxKeys", js.undefined)
    }
  }
}
