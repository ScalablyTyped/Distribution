package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification extends StObject {
  
  /**
    * The ID of the launch template. Conflicts with `name`.
    */
  var id: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of the launch template. Conflicts with `id`.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Template version. Unlike the autoscaling equivalent, does not support `$Latest` or `$Default`, so use the launchTemplate resource's attribute, e.g. `"${aws_launch_template.foo.latest_version}"`. It will use the default version if omitted.
    */
  var version: js.UndefOr[Input[String]] = js.undefined
}
object SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification {
  
  inline def apply(): SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification]
  }
  
  extension [Self <: SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification](x: Self) {
    
    inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
