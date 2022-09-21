package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resources extends StObject {
  
  var Conditions: js.UndefOr[ResourcesConditions] = js.undefined
  
  var Description: js.UndefOr[String] = js.undefined
  
  var Outputs: js.UndefOr[typings.serverless.awsProviderMod.Outputs] = js.undefined
  
  var Resources: CloudFormationResources
  
  var extensions: js.UndefOr[CloudFormationResources] = js.undefined
}
object Resources {
  
  inline def apply(Resources: CloudFormationResources): Resources = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resources]
  }
  
  extension [Self <: Resources](x: Self) {
    
    inline def setConditions(value: ResourcesConditions): Self = StObject.set(x, "Conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "Conditions", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExtensions(value: CloudFormationResources): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setOutputs(value: Outputs): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setResources(value: CloudFormationResources): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
  }
}
