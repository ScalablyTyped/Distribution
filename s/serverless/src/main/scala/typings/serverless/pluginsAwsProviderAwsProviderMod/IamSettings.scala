package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamSettings extends StObject {
  
  var deploymentRole: js.UndefOr[String] = js.undefined
  
  var role: js.UndefOr[String | IamRole] = js.undefined
}
object IamSettings {
  
  inline def apply(): IamSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamSettings]
  }
  
  extension [Self <: IamSettings](x: Self) {
    
    inline def setDeploymentRole(value: String): Self = StObject.set(x, "deploymentRole", value.asInstanceOf[js.Any])
    
    inline def setDeploymentRoleUndefined: Self = StObject.set(x, "deploymentRole", js.undefined)
    
    inline def setRole(value: String | IamRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
