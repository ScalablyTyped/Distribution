package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateMonitoring extends StObject {
  
  /**
    * If `true`, the launched EC2 instance will have detailed monitoring enabled.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
}
object LaunchTemplateMonitoring {
  
  @scala.inline
  def apply(): LaunchTemplateMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateMonitoring]
  }
  
  @scala.inline
  implicit class LaunchTemplateMonitoringMutableBuilder[Self <: LaunchTemplateMonitoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
