package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVpcEndpointDnsEntry extends StObject {
  
  /**
    * The DNS name.
    */
  var dnsName: String = js.native
  
  /**
    * The ID of the private hosted zone.
    */
  var hostedZoneId: String = js.native
}
object GetVpcEndpointDnsEntry {
  
  @scala.inline
  def apply(dnsName: String, hostedZoneId: String): GetVpcEndpointDnsEntry = {
    val __obj = js.Dynamic.literal(dnsName = dnsName.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcEndpointDnsEntry]
  }
  
  @scala.inline
  implicit class GetVpcEndpointDnsEntryMutableBuilder[Self <: GetVpcEndpointDnsEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnsName(value: String): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneId(value: String): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
  }
}
