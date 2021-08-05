package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentConfigTrafficRoutingConfig extends StObject {
  
  /**
    * The time based canary configuration information. If `type` is `TimeBasedLinear`, use `timeBasedLinear` instead.
    */
  var timeBasedCanary: js.UndefOr[Input[DeploymentConfigTrafficRoutingConfigTimeBasedCanary]] = js.undefined
  
  /**
    * The time based linear configuration information. If `type` is `TimeBasedCanary`, use `timeBasedCanary` instead.
    */
  var timeBasedLinear: js.UndefOr[Input[DeploymentConfigTrafficRoutingConfigTimeBasedLinear]] = js.undefined
  
  /**
    * Type of traffic routing config. One of `TimeBasedCanary`, `TimeBasedLinear`, `AllAtOnce`.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object DeploymentConfigTrafficRoutingConfig {
  
  inline def apply(): DeploymentConfigTrafficRoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfigTrafficRoutingConfig]
  }
  
  extension [Self <: DeploymentConfigTrafficRoutingConfig](x: Self) {
    
    inline def setTimeBasedCanary(value: Input[DeploymentConfigTrafficRoutingConfigTimeBasedCanary]): Self = StObject.set(x, "timeBasedCanary", value.asInstanceOf[js.Any])
    
    inline def setTimeBasedCanaryUndefined: Self = StObject.set(x, "timeBasedCanary", js.undefined)
    
    inline def setTimeBasedLinear(value: Input[DeploymentConfigTrafficRoutingConfigTimeBasedLinear]): Self = StObject.set(x, "timeBasedLinear", value.asInstanceOf[js.Any])
    
    inline def setTimeBasedLinearUndefined: Self = StObject.set(x, "timeBasedLinear", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
