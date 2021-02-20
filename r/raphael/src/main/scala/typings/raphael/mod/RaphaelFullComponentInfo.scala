package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.raphael.mod.RaphaelHslComponentInfo because var conflicts: h, s. Inlined l
- typings.raphael.mod.RaphaelHsbComponentInfo because var conflicts: b. Inlined h, s */ @js.native
trait RaphaelFullComponentInfo extends RaphaelRgbComponentInfo {
  
  /**
    * The HSB or HSL hue channel.
    */
  var h: Double = js.native
  
  /**
    * The HSL luminosity channel.
    */
  var l: Double = js.native
  
  /**
    * The HSB or HSL saturation channel.
    */
  var s: Double = js.native
}
object RaphaelFullComponentInfo {
  
  @scala.inline
  def apply(b: Double, g: Double, h: Double, hex: String, l: Double, r: Double, s: Double): RaphaelFullComponentInfo = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelFullComponentInfo]
  }
  
  @scala.inline
  implicit class RaphaelFullComponentInfoMutableBuilder[Self <: RaphaelFullComponentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
