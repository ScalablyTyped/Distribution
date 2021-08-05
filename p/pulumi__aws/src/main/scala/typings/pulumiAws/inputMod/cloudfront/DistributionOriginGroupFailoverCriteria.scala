package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionOriginGroupFailoverCriteria extends StObject {
  
  /**
    * A list of HTTP status codes for the origin group
    */
  var statusCodes: Input[js.Array[Input[Double]]]
}
object DistributionOriginGroupFailoverCriteria {
  
  inline def apply(statusCodes: Input[js.Array[Input[Double]]]): DistributionOriginGroupFailoverCriteria = {
    val __obj = js.Dynamic.literal(statusCodes = statusCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginGroupFailoverCriteria]
  }
  
  extension [Self <: DistributionOriginGroupFailoverCriteria](x: Self) {
    
    inline def setStatusCodes(value: Input[js.Array[Input[Double]]]): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
    
    inline def setStatusCodesVarargs(value: Input[Double]*): Self = StObject.set(x, "statusCodes", js.Array(value :_*))
  }
}
