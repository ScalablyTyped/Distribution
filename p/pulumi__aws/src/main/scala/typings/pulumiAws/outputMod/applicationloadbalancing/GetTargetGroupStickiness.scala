package typings.pulumiAws.outputMod.applicationloadbalancing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTargetGroupStickiness extends StObject {
  
  var cookieDuration: Double
  
  var enabled: Boolean
  
  var `type`: String
}
object GetTargetGroupStickiness {
  
  inline def apply(cookieDuration: Double, enabled: Boolean, `type`: String): GetTargetGroupStickiness = {
    val __obj = js.Dynamic.literal(cookieDuration = cookieDuration.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTargetGroupStickiness]
  }
  
  extension [Self <: GetTargetGroupStickiness](x: Self) {
    
    inline def setCookieDuration(value: Double): Self = StObject.set(x, "cookieDuration", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
