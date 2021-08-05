package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionOriginGroupMember extends StObject {
  
  /**
    * The unique identifier of the member origin
    */
  var originId: Input[String]
}
object DistributionOriginGroupMember {
  
  inline def apply(originId: Input[String]): DistributionOriginGroupMember = {
    val __obj = js.Dynamic.literal(originId = originId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginGroupMember]
  }
  
  extension [Self <: DistributionOriginGroupMember](x: Self) {
    
    inline def setOriginId(value: Input[String]): Self = StObject.set(x, "originId", value.asInstanceOf[js.Any])
  }
}
