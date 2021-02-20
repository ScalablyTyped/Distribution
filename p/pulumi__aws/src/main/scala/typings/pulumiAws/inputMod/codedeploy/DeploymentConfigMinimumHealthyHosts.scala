package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentConfigMinimumHealthyHosts extends StObject {
  
  /**
    * The type can either be `FLEET_PERCENT` or `HOST_COUNT`.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
  
  /**
    * The value when the type is `FLEET_PERCENT` represents the minimum number of healthy instances as
    * a percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the
    * deployment, AWS CodeDeploy converts the percentage to the equivalent number of instance and rounds up fractional instances.
    * When the type is `HOST_COUNT`, the value represents the minimum number of healthy instances as an absolute value.
    */
  var value: js.UndefOr[Input[Double]] = js.native
}
object DeploymentConfigMinimumHealthyHosts {
  
  @scala.inline
  def apply(): DeploymentConfigMinimumHealthyHosts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfigMinimumHealthyHosts]
  }
  
  @scala.inline
  implicit class DeploymentConfigMinimumHealthyHostsMutableBuilder[Self <: DeploymentConfigMinimumHealthyHosts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Input[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
