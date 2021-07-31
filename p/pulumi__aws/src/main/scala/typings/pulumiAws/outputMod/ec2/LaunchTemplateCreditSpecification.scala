package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateCreditSpecification extends StObject {
  
  /**
    * The credit option for CPU usage. Can be `"standard"` or `"unlimited"`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
    */
  var cpuCredits: js.UndefOr[String] = js.undefined
}
object LaunchTemplateCreditSpecification {
  
  @scala.inline
  def apply(): LaunchTemplateCreditSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateCreditSpecification]
  }
  
  @scala.inline
  implicit class LaunchTemplateCreditSpecificationMutableBuilder[Self <: LaunchTemplateCreditSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpuCredits(value: String): Self = StObject.set(x, "cpuCredits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCreditsUndefined: Self = StObject.set(x, "cpuCredits", js.undefined)
  }
}
