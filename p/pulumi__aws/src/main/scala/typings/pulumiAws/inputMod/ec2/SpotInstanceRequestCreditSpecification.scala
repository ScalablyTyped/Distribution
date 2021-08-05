package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotInstanceRequestCreditSpecification extends StObject {
  
  /**
    * The credit option for CPU usage. Can be `"standard"` or `"unlimited"`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
    */
  var cpuCredits: js.UndefOr[Input[String]] = js.undefined
}
object SpotInstanceRequestCreditSpecification {
  
  inline def apply(): SpotInstanceRequestCreditSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotInstanceRequestCreditSpecification]
  }
  
  extension [Self <: SpotInstanceRequestCreditSpecification](x: Self) {
    
    inline def setCpuCredits(value: Input[String]): Self = StObject.set(x, "cpuCredits", value.asInstanceOf[js.Any])
    
    inline def setCpuCreditsUndefined: Self = StObject.set(x, "cpuCredits", js.undefined)
  }
}
