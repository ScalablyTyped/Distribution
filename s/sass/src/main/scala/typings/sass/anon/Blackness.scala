package typings.sass.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blackness extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var blackness: Double
  
  var hue: Double
  
  var whiteness: Double
}
object Blackness {
  
  inline def apply(blackness: Double, hue: Double, whiteness: Double): Blackness = {
    val __obj = js.Dynamic.literal(blackness = blackness.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], whiteness = whiteness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blackness]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Blackness] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setBlackness(value: Double): Self = StObject.set(x, "blackness", value.asInstanceOf[js.Any])
    
    inline def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    inline def setWhiteness(value: Double): Self = StObject.set(x, "whiteness", value.asInstanceOf[js.Any])
  }
}
