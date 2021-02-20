package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLaunchTemplateElasticGpuSpecification extends StObject {
  
  var `type`: String = js.native
}
object GetLaunchTemplateElasticGpuSpecification {
  
  @scala.inline
  def apply(`type`: String): GetLaunchTemplateElasticGpuSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateElasticGpuSpecification]
  }
  
  @scala.inline
  implicit class GetLaunchTemplateElasticGpuSpecificationMutableBuilder[Self <: GetLaunchTemplateElasticGpuSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
