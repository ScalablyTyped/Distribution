package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchTemplateCreditSpecification extends StObject {
  
  var cpuCredits: String
}
object GetLaunchTemplateCreditSpecification {
  
  inline def apply(cpuCredits: String): GetLaunchTemplateCreditSpecification = {
    val __obj = js.Dynamic.literal(cpuCredits = cpuCredits.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateCreditSpecification]
  }
  
  extension [Self <: GetLaunchTemplateCreditSpecification](x: Self) {
    
    inline def setCpuCredits(value: String): Self = StObject.set(x, "cpuCredits", value.asInstanceOf[js.Any])
  }
}
