package typings.rgb2hex

import typings.rgb2hex.anon.Alpha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(rgb: String): Alpha = ^.asInstanceOf[js.Dynamic].apply(rgb.asInstanceOf[js.Any]).asInstanceOf[Alpha]
  
  @JSImport("rgb2hex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait HexColor extends StObject {
    
    var alpha: Double
    
    var hex: String
  }
  object HexColor {
    
    inline def apply(alpha: Double, hex: String): HexColor = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any])
      __obj.asInstanceOf[HexColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HexColor] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    }
  }
}
