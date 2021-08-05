package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceDeploymentController extends StObject {
  
  /**
    * Type of deployment controller. Valid values: `CODE_DEPLOY`, `ECS`, `EXTERNAL`. Default: `ECS`.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object ServiceDeploymentController {
  
  inline def apply(): ServiceDeploymentController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceDeploymentController]
  }
  
  extension [Self <: ServiceDeploymentController](x: Self) {
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
