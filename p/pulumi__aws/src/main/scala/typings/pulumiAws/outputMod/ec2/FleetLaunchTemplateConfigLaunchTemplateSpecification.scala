package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetLaunchTemplateConfigLaunchTemplateSpecification extends StObject {
  
  /**
    * ID of the launch template.
    */
  var launchTemplateId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the launch template.
    */
  var launchTemplateName: js.UndefOr[String] = js.undefined
  
  /**
    * Version number of the launch template.
    */
  var version: String
}
object FleetLaunchTemplateConfigLaunchTemplateSpecification {
  
  inline def apply(version: String): FleetLaunchTemplateConfigLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetLaunchTemplateConfigLaunchTemplateSpecification]
  }
  
  extension [Self <: FleetLaunchTemplateConfigLaunchTemplateSpecification](x: Self) {
    
    inline def setLaunchTemplateId(value: String): Self = StObject.set(x, "launchTemplateId", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateIdUndefined: Self = StObject.set(x, "launchTemplateId", js.undefined)
    
    inline def setLaunchTemplateName(value: String): Self = StObject.set(x, "launchTemplateName", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateNameUndefined: Self = StObject.set(x, "launchTemplateName", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
