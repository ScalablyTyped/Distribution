package typings.sassEmbedded.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Whiteness extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var blackness: js.UndefOr[Double] = js.undefined
  
  var hue: js.UndefOr[Double] = js.undefined
  
  var whiteness: js.UndefOr[Double] = js.undefined
}
object Whiteness {
  
  inline def apply(): Whiteness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Whiteness]
  }
  
  extension [Self <: Whiteness](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setBlackness(value: Double): Self = StObject.set(x, "blackness", value.asInstanceOf[js.Any])
    
    inline def setBlacknessUndefined: Self = StObject.set(x, "blackness", js.undefined)
    
    inline def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    inline def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
    
    inline def setWhiteness(value: Double): Self = StObject.set(x, "whiteness", value.asInstanceOf[js.Any])
    
    inline def setWhitenessUndefined: Self = StObject.set(x, "whiteness", js.undefined)
  }
}
