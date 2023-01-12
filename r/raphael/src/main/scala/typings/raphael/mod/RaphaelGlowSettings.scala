package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaphaelGlowSettings extends StObject {
  
  /** The glow color, default is `black`. */
  var color: String
  
  /** Whether the glow effect will be filled, default is `false`. */
  var fill: Boolean
  
  /** Horizontal offset, default is `0`. */
  var offsetx: Double
  
  /** Vertical offset, default is `0`. */
  var offsety: Double
  
  /** Opacity of the glow effect, default is `0.5`. */
  var opacity: Double
  
  /** size of the glow, default is `10`. */
  var width: Double
}
object RaphaelGlowSettings {
  
  inline def apply(color: String, fill: Boolean, offsetx: Double, offsety: Double, opacity: Double, width: Double): RaphaelGlowSettings = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], offsetx = offsetx.asInstanceOf[js.Any], offsety = offsety.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelGlowSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RaphaelGlowSettings] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setOffsetx(value: Double): Self = StObject.set(x, "offsetx", value.asInstanceOf[js.Any])
    
    inline def setOffsety(value: Double): Self = StObject.set(x, "offsety", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
