package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentConfigTrafficRoutingConfigTimeBasedLinear extends StObject {
  
  /**
    * The number of minutes between each incremental traffic shift of a `TimeBasedLinear` deployment.
    */
  var interval: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The percentage of traffic that is shifted at the start of each increment of a `TimeBasedLinear` deployment.
    */
  var percentage: js.UndefOr[Input[Double]] = js.undefined
}
object DeploymentConfigTrafficRoutingConfigTimeBasedLinear {
  
  @scala.inline
  def apply(): DeploymentConfigTrafficRoutingConfigTimeBasedLinear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfigTrafficRoutingConfigTimeBasedLinear]
  }
  
  @scala.inline
  implicit class DeploymentConfigTrafficRoutingConfigTimeBasedLinearMutableBuilder[Self <: DeploymentConfigTrafficRoutingConfigTimeBasedLinear] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Input[Double]): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setPercentage(value: Input[Double]): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
  }
}
