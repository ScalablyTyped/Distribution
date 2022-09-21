package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowOffset extends StObject {
  
  var shadowColor: Unit
  
  var shadowOffset: Unit
  
  var shadowOpacity: Unit
  
  var shadowRadius: Unit
}
object ShadowOffset {
  
  inline def apply(shadowColor: Unit, shadowOffset: Unit, shadowOpacity: Unit, shadowRadius: Unit): ShadowOffset = {
    val __obj = js.Dynamic.literal(shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], shadowOpacity = shadowOpacity.asInstanceOf[js.Any], shadowRadius = shadowRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowOffset]
  }
  
  extension [Self <: ShadowOffset](x: Self) {
    
    inline def setShadowColor(value: Unit): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowOffset(value: Unit): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowOpacity(value: Unit): Self = StObject.set(x, "shadowOpacity", value.asInstanceOf[js.Any])
    
    inline def setShadowRadius(value: Unit): Self = StObject.set(x, "shadowRadius", value.asInstanceOf[js.Any])
  }
}
