package typings.reactSketchapp.typesMod

import typings.reactSketchapp.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchShadow extends StObject {
  
  var shadowColor: Color
  
  var shadowInner: Boolean
  
  var shadowOffset: Width
  
  var shadowOpacity: Double
  
  var shadowRadius: Double
  
  var shadowSpread: Double
}
object SketchShadow {
  
  inline def apply(
    shadowColor: Color,
    shadowInner: Boolean,
    shadowOffset: Width,
    shadowOpacity: Double,
    shadowRadius: Double,
    shadowSpread: Double
  ): SketchShadow = {
    val __obj = js.Dynamic.literal(shadowColor = shadowColor.asInstanceOf[js.Any], shadowInner = shadowInner.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], shadowOpacity = shadowOpacity.asInstanceOf[js.Any], shadowRadius = shadowRadius.asInstanceOf[js.Any], shadowSpread = shadowSpread.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchShadow]
  }
  
  extension [Self <: SketchShadow](x: Self) {
    
    inline def setShadowColor(value: Color): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowInner(value: Boolean): Self = StObject.set(x, "shadowInner", value.asInstanceOf[js.Any])
    
    inline def setShadowOffset(value: Width): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowOpacity(value: Double): Self = StObject.set(x, "shadowOpacity", value.asInstanceOf[js.Any])
    
    inline def setShadowRadius(value: Double): Self = StObject.set(x, "shadowRadius", value.asInstanceOf[js.Any])
    
    inline def setShadowSpread(value: Double): Self = StObject.set(x, "shadowSpread", value.asInstanceOf[js.Any])
  }
}
