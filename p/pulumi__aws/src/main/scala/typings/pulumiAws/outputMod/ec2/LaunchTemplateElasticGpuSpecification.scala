package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateElasticGpuSpecification extends StObject {
  
  /**
    * The [Elastic GPU Type](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-gpus.html#elastic-gpus-basics)
    */
  var `type`: String
}
object LaunchTemplateElasticGpuSpecification {
  
  @scala.inline
  def apply(`type`: String): LaunchTemplateElasticGpuSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateElasticGpuSpecification]
  }
  
  @scala.inline
  implicit class LaunchTemplateElasticGpuSpecificationMutableBuilder[Self <: LaunchTemplateElasticGpuSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
