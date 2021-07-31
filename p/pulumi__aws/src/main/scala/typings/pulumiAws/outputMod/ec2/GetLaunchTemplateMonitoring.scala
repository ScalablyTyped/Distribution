package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchTemplateMonitoring extends StObject {
  
  var enabled: Boolean
}
object GetLaunchTemplateMonitoring {
  
  @scala.inline
  def apply(enabled: Boolean): GetLaunchTemplateMonitoring = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateMonitoring]
  }
  
  @scala.inline
  implicit class GetLaunchTemplateMonitoringMutableBuilder[Self <: GetLaunchTemplateMonitoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
