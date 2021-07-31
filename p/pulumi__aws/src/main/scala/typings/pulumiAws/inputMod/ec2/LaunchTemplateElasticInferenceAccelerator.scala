package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateElasticInferenceAccelerator extends StObject {
  
  /**
    * Accelerator type.
    */
  var `type`: Input[String]
}
object LaunchTemplateElasticInferenceAccelerator {
  
  @scala.inline
  def apply(`type`: Input[String]): LaunchTemplateElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateElasticInferenceAccelerator]
  }
  
  @scala.inline
  implicit class LaunchTemplateElasticInferenceAcceleratorMutableBuilder[Self <: LaunchTemplateElasticInferenceAccelerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
