package typings.reactNativeSvg.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformedProps extends StObject {
  
  var originX: Double
  
  var originY: Double
  
  var rotation: Double
  
  var scaleX: Double
  
  var scaleY: Double
  
  var skewX: Double
  
  var skewY: Double
  
  var x: Double
  
  var y: Double
}
object TransformedProps {
  
  inline def apply(
    originX: Double,
    originY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    skewX: Double,
    skewY: Double,
    x: Double,
    y: Double
  ): TransformedProps = {
    val __obj = js.Dynamic.literal(originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformedProps]
  }
  
  extension [Self <: TransformedProps](x: Self) {
    
    inline def setOriginX(value: Double): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
    
    inline def setOriginY(value: Double): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setSkewX(value: Double): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
    
    inline def setSkewY(value: Double): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
