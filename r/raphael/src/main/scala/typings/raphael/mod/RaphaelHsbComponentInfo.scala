package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaphaelHsbComponentInfo extends StObject {
  
  /**
    * The HSB brightness channel.
    */
  var b: Double
  
  /**
    * The HSB or HSL hue channel.
    */
  var h: Double
  
  /**
    * The HSB or HSL saturation channel.
    */
  var s: Double
}
object RaphaelHsbComponentInfo {
  
  inline def apply(b: Double, h: Double, s: Double): RaphaelHsbComponentInfo = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelHsbComponentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RaphaelHsbComponentInfo] (val x: Self) extends AnyVal {
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
