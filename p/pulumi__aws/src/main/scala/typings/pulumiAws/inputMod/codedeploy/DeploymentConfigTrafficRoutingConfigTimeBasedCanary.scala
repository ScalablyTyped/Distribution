package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentConfigTrafficRoutingConfigTimeBasedCanary extends StObject {
  
  /**
    * The number of minutes between the first and second traffic shifts of a `TimeBasedCanary` deployment.
    */
  var interval: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The percentage of traffic to shift in the first increment of a `TimeBasedCanary` deployment.
    */
  var percentage: js.UndefOr[Input[Double]] = js.undefined
}
object DeploymentConfigTrafficRoutingConfigTimeBasedCanary {
  
  inline def apply(): DeploymentConfigTrafficRoutingConfigTimeBasedCanary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfigTrafficRoutingConfigTimeBasedCanary]
  }
  
  extension [Self <: DeploymentConfigTrafficRoutingConfigTimeBasedCanary](x: Self) {
    
    inline def setInterval(value: Input[Double]): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setPercentage(value: Input[Double]): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
  }
}
