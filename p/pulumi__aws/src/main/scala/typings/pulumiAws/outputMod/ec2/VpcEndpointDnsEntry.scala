package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcEndpointDnsEntry extends StObject {
  
  /**
    * The DNS name.
    */
  var dnsName: String
  
  /**
    * The ID of the private hosted zone.
    */
  var hostedZoneId: String
}
object VpcEndpointDnsEntry {
  
  inline def apply(dnsName: String, hostedZoneId: String): VpcEndpointDnsEntry = {
    val __obj = js.Dynamic.literal(dnsName = dnsName.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointDnsEntry]
  }
  
  extension [Self <: VpcEndpointDnsEntry](x: Self) {
    
    inline def setDnsName(value: String): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneId(value: String): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
  }
}
