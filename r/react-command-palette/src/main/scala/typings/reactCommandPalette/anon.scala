package typings.reactCommandPalette

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MaxDisplayed extends StObject {
    
    var maxDisplayed: Double
  }
  object MaxDisplayed {
    
    inline def apply(maxDisplayed: Double): MaxDisplayed = {
      val __obj = js.Dynamic.literal(maxDisplayed = maxDisplayed.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxDisplayed]
    }
    
    extension [Self <: MaxDisplayed](x: Self) {
      
      inline def setMaxDisplayed(value: Double): Self = StObject.set(x, "maxDisplayed", value.asInstanceOf[js.Any])
    }
  }
}
