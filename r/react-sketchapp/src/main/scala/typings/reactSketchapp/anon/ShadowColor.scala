package typings.reactSketchapp.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowColor extends StObject {
  
  var shadowColor: Requireable[String | Double]
  
  var shadowInner: Requireable[Boolean]
  
  var shadowOffset: Requireable[InferProps[Height]]
  
  var shadowOpacity: Requireable[Double]
  
  var shadowRadius: Requireable[Double]
  
  var shadowSpread: Requireable[Double]
}
object ShadowColor {
  
  inline def apply(
    shadowColor: Requireable[String | Double],
    shadowInner: Requireable[Boolean],
    shadowOffset: Requireable[InferProps[Height]],
    shadowOpacity: Requireable[Double],
    shadowRadius: Requireable[Double],
    shadowSpread: Requireable[Double]
  ): ShadowColor = {
    val __obj = js.Dynamic.literal(shadowColor = shadowColor.asInstanceOf[js.Any], shadowInner = shadowInner.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], shadowOpacity = shadowOpacity.asInstanceOf[js.Any], shadowRadius = shadowRadius.asInstanceOf[js.Any], shadowSpread = shadowSpread.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowColor] (val x: Self) extends AnyVal {
    
    inline def setShadowColor(value: Requireable[String | Double]): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowInner(value: Requireable[Boolean]): Self = StObject.set(x, "shadowInner", value.asInstanceOf[js.Any])
    
    inline def setShadowOffset(value: Requireable[InferProps[Height]]): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowOpacity(value: Requireable[Double]): Self = StObject.set(x, "shadowOpacity", value.asInstanceOf[js.Any])
    
    inline def setShadowRadius(value: Requireable[Double]): Self = StObject.set(x, "shadowRadius", value.asInstanceOf[js.Any])
    
    inline def setShadowSpread(value: Requireable[Double]): Self = StObject.set(x, "shadowSpread", value.asInstanceOf[js.Any])
  }
}
