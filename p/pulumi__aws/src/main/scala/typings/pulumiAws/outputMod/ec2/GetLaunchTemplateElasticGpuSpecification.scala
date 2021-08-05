package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchTemplateElasticGpuSpecification extends StObject {
  
  var `type`: String
}
object GetLaunchTemplateElasticGpuSpecification {
  
  inline def apply(`type`: String): GetLaunchTemplateElasticGpuSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateElasticGpuSpecification]
  }
  
  extension [Self <: GetLaunchTemplateElasticGpuSpecification](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
