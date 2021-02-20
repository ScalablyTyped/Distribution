package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelHsbComponentInfo extends StObject {
  
  /**
    * The HSB brightness channel.
    */
  var b: Double = js.native
  
  /**
    * The HSB or HSL hue channel.
    */
  var h: Double = js.native
  
  /**
    * The HSB or HSL saturation channel.
    */
  var s: Double = js.native
}
object RaphaelHsbComponentInfo {
  
  @scala.inline
  def apply(b: Double, h: Double, s: Double): RaphaelHsbComponentInfo = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelHsbComponentInfo]
  }
  
  @scala.inline
  implicit class RaphaelHsbComponentInfoMutableBuilder[Self <: RaphaelHsbComponentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
