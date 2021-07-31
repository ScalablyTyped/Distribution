package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification extends StObject {
  
  /**
    * The ID of the launch template. Conflicts with `name`.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the launch template. Conflicts with `id`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Template version. Unlike the autoscaling equivalent, does not support `$Latest` or `$Default`, so use the launchTemplate resource's attribute, e.g. `"${aws_launch_template.foo.latest_version}"`. It will use the default version if omitted.
    */
  var version: js.UndefOr[String] = js.undefined
}
object SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification {
  
  @scala.inline
  def apply(): SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification]
  }
  
  @scala.inline
  implicit class SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationMutableBuilder[Self <: SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
