package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceCreditSpecification extends StObject {
  
  var cpuCredits: String
}
object GetInstanceCreditSpecification {
  
  inline def apply(cpuCredits: String): GetInstanceCreditSpecification = {
    val __obj = js.Dynamic.literal(cpuCredits = cpuCredits.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceCreditSpecification]
  }
  
  extension [Self <: GetInstanceCreditSpecification](x: Self) {
    
    inline def setCpuCredits(value: String): Self = StObject.set(x, "cpuCredits", value.asInstanceOf[js.Any])
  }
}
