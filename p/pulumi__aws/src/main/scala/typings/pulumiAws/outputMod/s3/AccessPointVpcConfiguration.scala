package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPointVpcConfiguration extends StObject {
  
  /**
    * This access point will only allow connections from the specified VPC ID.
    */
  var vpcId: String
}
object AccessPointVpcConfiguration {
  
  inline def apply(vpcId: String): AccessPointVpcConfiguration = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPointVpcConfiguration]
  }
  
  extension [Self <: AccessPointVpcConfiguration](x: Self) {
    
    inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
