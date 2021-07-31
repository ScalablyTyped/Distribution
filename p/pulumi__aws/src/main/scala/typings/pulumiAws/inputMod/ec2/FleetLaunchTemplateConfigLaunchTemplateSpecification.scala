package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetLaunchTemplateConfigLaunchTemplateSpecification extends StObject {
  
  /**
    * ID of the launch template.
    */
  var launchTemplateId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Name of the launch template.
    */
  var launchTemplateName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Version number of the launch template.
    */
  var version: Input[String]
}
object FleetLaunchTemplateConfigLaunchTemplateSpecification {
  
  @scala.inline
  def apply(version: Input[String]): FleetLaunchTemplateConfigLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetLaunchTemplateConfigLaunchTemplateSpecification]
  }
  
  @scala.inline
  implicit class FleetLaunchTemplateConfigLaunchTemplateSpecificationMutableBuilder[Self <: FleetLaunchTemplateConfigLaunchTemplateSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplateId(value: Input[String]): Self = StObject.set(x, "launchTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateIdUndefined: Self = StObject.set(x, "launchTemplateId", js.undefined)
    
    @scala.inline
    def setLaunchTemplateName(value: Input[String]): Self = StObject.set(x, "launchTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateNameUndefined: Self = StObject.set(x, "launchTemplateName", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
