package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcEndpointDnsEntry extends StObject {
  
  /**
    * The DNS name.
    */
  var dnsName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The ID of the private hosted zone.
    */
  var hostedZoneId: js.UndefOr[Input[String]] = js.undefined
}
object VpcEndpointDnsEntry {
  
  inline def apply(): VpcEndpointDnsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointDnsEntry]
  }
  
  extension [Self <: VpcEndpointDnsEntry](x: Self) {
    
    inline def setDnsName(value: Input[String]): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
    
    inline def setHostedZoneId(value: Input[String]): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneIdUndefined: Self = StObject.set(x, "hostedZoneId", js.undefined)
  }
}
