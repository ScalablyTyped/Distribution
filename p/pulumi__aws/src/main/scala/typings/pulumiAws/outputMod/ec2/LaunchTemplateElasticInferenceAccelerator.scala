package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateElasticInferenceAccelerator extends StObject {
  
  /**
    * Accelerator type.
    */
  var `type`: String = js.native
}
object LaunchTemplateElasticInferenceAccelerator {
  
  @scala.inline
  def apply(`type`: String): LaunchTemplateElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateElasticInferenceAccelerator]
  }
  
  @scala.inline
  implicit class LaunchTemplateElasticInferenceAcceleratorMutableBuilder[Self <: LaunchTemplateElasticInferenceAccelerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
