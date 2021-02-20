package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetLaunchTemplateConfigLaunchTemplateSpecification extends StObject {
  
  /**
    * ID of the launch template.
    */
  var launchTemplateId: js.UndefOr[String] = js.native
  
  /**
    * Name of the launch template.
    */
  var launchTemplateName: js.UndefOr[String] = js.native
  
  /**
    * Version number of the launch template.
    */
  var version: String = js.native
}
object FleetLaunchTemplateConfigLaunchTemplateSpecification {
  
  @scala.inline
  def apply(version: String): FleetLaunchTemplateConfigLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetLaunchTemplateConfigLaunchTemplateSpecification]
  }
  
  @scala.inline
  implicit class FleetLaunchTemplateConfigLaunchTemplateSpecificationMutableBuilder[Self <: FleetLaunchTemplateConfigLaunchTemplateSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplateId(value: String): Self = StObject.set(x, "launchTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateIdUndefined: Self = StObject.set(x, "launchTemplateId", js.undefined)
    
    @scala.inline
    def setLaunchTemplateName(value: String): Self = StObject.set(x, "launchTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateNameUndefined: Self = StObject.set(x, "launchTemplateName", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
