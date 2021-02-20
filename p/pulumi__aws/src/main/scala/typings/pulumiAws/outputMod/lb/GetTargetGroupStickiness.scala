package typings.pulumiAws.outputMod.lb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTargetGroupStickiness extends StObject {
  
  var cookieDuration: Double = js.native
  
  var enabled: Boolean = js.native
  
  var `type`: String = js.native
}
object GetTargetGroupStickiness {
  
  @scala.inline
  def apply(cookieDuration: Double, enabled: Boolean, `type`: String): GetTargetGroupStickiness = {
    val __obj = js.Dynamic.literal(cookieDuration = cookieDuration.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTargetGroupStickiness]
  }
  
  @scala.inline
  implicit class GetTargetGroupStickinessMutableBuilder[Self <: GetTargetGroupStickiness] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookieDuration(value: Double): Self = StObject.set(x, "cookieDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
