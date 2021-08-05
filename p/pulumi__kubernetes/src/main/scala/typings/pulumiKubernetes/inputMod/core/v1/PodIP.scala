package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IP address information for entries in the (plural) PodIPs field. Each entry includes:
  *    IP: An IP address allocated to the pod. Routable at least within the cluster.
  */
trait PodIP extends StObject {
  
  /**
    * ip is an IP address (IPv4 or IPv6) assigned to the pod
    */
  var ip: js.UndefOr[Input[String]] = js.undefined
}
object PodIP {
  
  inline def apply(): PodIP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodIP]
  }
  
  extension [Self <: PodIP](x: Self) {
    
    inline def setIp(value: Input[String]): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
  }
}
