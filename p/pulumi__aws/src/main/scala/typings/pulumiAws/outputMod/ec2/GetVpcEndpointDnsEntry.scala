package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVpcEndpointDnsEntry extends StObject {
  
  /**
    * The DNS name.
    */
  var dnsName: String
  
  /**
    * The ID of the private hosted zone.
    */
  var hostedZoneId: String
}
object GetVpcEndpointDnsEntry {
  
  inline def apply(dnsName: String, hostedZoneId: String): GetVpcEndpointDnsEntry = {
    val __obj = js.Dynamic.literal(dnsName = dnsName.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcEndpointDnsEntry]
  }
  
  extension [Self <: GetVpcEndpointDnsEntry](x: Self) {
    
    inline def setDnsName(value: String): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneId(value: String): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
  }
}
