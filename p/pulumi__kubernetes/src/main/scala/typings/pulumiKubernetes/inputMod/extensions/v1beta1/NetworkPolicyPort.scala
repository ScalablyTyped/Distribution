package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED 1.9 - This group version of NetworkPolicyPort is deprecated by networking/v1/NetworkPolicyPort.
  */
trait NetworkPolicyPort extends StObject {
  
  /**
    * If specified, the port on the given protocol.  This can either be a numerical or named port on a pod.  If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
    */
  var port: js.UndefOr[Input[Double | String]] = js.undefined
  
  /**
    * Optional.  The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
    */
  var protocol: js.UndefOr[Input[String]] = js.undefined
}
object NetworkPolicyPort {
  
  inline def apply(): NetworkPolicyPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicyPort]
  }
  
  extension [Self <: NetworkPolicyPort](x: Self) {
    
    inline def setPort(value: Input[Double | String]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
