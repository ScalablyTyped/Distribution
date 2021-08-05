package typings.rgb2hex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alpha extends StObject {
    
    var alpha: Double
    
    var hex: String
  }
  object Alpha {
    
    inline def apply(alpha: Double, hex: String): Alpha = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alpha]
    }
    
    extension [Self <: Alpha](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    }
  }
}
