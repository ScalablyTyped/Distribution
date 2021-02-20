package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelGlowSettings extends StObject {
  
  /** The glow color, default is `black`. */
  var color: String = js.native
  
  /** Whether the glow effect will be filled, default is `false`. */
  var fill: Boolean = js.native
  
  /** Horizontal offset, default is `0`. */
  var offsetx: Double = js.native
  
  /** Vertical offset, default is `0`. */
  var offsety: Double = js.native
  
  /** Opacity of the glow effect, default is `0.5`. */
  var opacity: Double = js.native
  
  /** size of the glow, default is `10`. */
  var width: Double = js.native
}
object RaphaelGlowSettings {
  
  @scala.inline
  def apply(color: String, fill: Boolean, offsetx: Double, offsety: Double, opacity: Double, width: Double): RaphaelGlowSettings = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], offsetx = offsetx.asInstanceOf[js.Any], offsety = offsety.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelGlowSettings]
  }
  
  @scala.inline
  implicit class RaphaelGlowSettingsMutableBuilder[Self <: RaphaelGlowSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetx(value: Double): Self = StObject.set(x, "offsetx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsety(value: Double): Self = StObject.set(x, "offsety", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
