package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentConfigTrafficRoutingConfig extends StObject {
  
  /**
    * The time based canary configuration information. If `type` is `TimeBasedLinear`, use `timeBasedLinear` instead.
    */
  var timeBasedCanary: js.UndefOr[DeploymentConfigTrafficRoutingConfigTimeBasedCanary] = js.undefined
  
  /**
    * The time based linear configuration information. If `type` is `TimeBasedCanary`, use `timeBasedCanary` instead.
    */
  var timeBasedLinear: js.UndefOr[DeploymentConfigTrafficRoutingConfigTimeBasedLinear] = js.undefined
  
  /**
    * Type of traffic routing config. One of `TimeBasedCanary`, `TimeBasedLinear`, `AllAtOnce`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object DeploymentConfigTrafficRoutingConfig {
  
  @scala.inline
  def apply(): DeploymentConfigTrafficRoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfigTrafficRoutingConfig]
  }
  
  @scala.inline
  implicit class DeploymentConfigTrafficRoutingConfigMutableBuilder[Self <: DeploymentConfigTrafficRoutingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeBasedCanary(value: DeploymentConfigTrafficRoutingConfigTimeBasedCanary): Self = StObject.set(x, "timeBasedCanary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeBasedCanaryUndefined: Self = StObject.set(x, "timeBasedCanary", js.undefined)
    
    @scala.inline
    def setTimeBasedLinear(value: DeploymentConfigTrafficRoutingConfigTimeBasedLinear): Self = StObject.set(x, "timeBasedLinear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeBasedLinearUndefined: Self = StObject.set(x, "timeBasedLinear", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
