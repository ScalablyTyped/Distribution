package typings.storybookTheming.distCreateC2b2ce6dMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  val float: Keyframes
  
  val glow: Keyframes
  
  val hoverable: SerializedStyles
  
  val inlineGlow: SerializedStyles
  
  val jiggle: Keyframes
  
  val rotate360: Keyframes
}
object Animation {
  
  inline def apply(
    float: Keyframes,
    glow: Keyframes,
    hoverable: SerializedStyles,
    inlineGlow: SerializedStyles,
    jiggle: Keyframes,
    rotate360: Keyframes
  ): Animation = {
    val __obj = js.Dynamic.literal(float = float.asInstanceOf[js.Any], glow = glow.asInstanceOf[js.Any], hoverable = hoverable.asInstanceOf[js.Any], inlineGlow = inlineGlow.asInstanceOf[js.Any], jiggle = jiggle.asInstanceOf[js.Any], rotate360 = rotate360.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    inline def setFloat(value: Keyframes): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    inline def setGlow(value: Keyframes): Self = StObject.set(x, "glow", value.asInstanceOf[js.Any])
    
    inline def setHoverable(value: SerializedStyles): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
    
    inline def setInlineGlow(value: SerializedStyles): Self = StObject.set(x, "inlineGlow", value.asInstanceOf[js.Any])
    
    inline def setJiggle(value: Keyframes): Self = StObject.set(x, "jiggle", value.asInstanceOf[js.Any])
    
    inline def setRotate360(value: Keyframes): Self = StObject.set(x, "rotate360", value.asInstanceOf[js.Any])
  }
}
