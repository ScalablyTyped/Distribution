package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceCreditSpecification extends StObject {
  
  /**
    * The credit option for CPU usage. Can be `"standard"` or `"unlimited"`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
    */
  var cpuCredits: js.UndefOr[Input[String]] = js.undefined
}
object InstanceCreditSpecification {
  
  @scala.inline
  def apply(): InstanceCreditSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCreditSpecification]
  }
  
  @scala.inline
  implicit class InstanceCreditSpecificationMutableBuilder[Self <: InstanceCreditSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpuCredits(value: Input[String]): Self = StObject.set(x, "cpuCredits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCreditsUndefined: Self = StObject.set(x, "cpuCredits", js.undefined)
  }
}
