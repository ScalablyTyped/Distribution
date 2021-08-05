package typings.pulumiKubernetes.outputMod.networking.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressTLS describes the transport layer security associated with an Ingress.
  */
trait IngressTLS extends StObject {
  
  /**
    * Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
    */
  var hosts: js.Array[String]
  
  /**
    * SecretName is the name of the secret used to terminate TLS traffic on port 443. Field is left optional to allow TLS routing based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
    */
  var secretName: String
}
object IngressTLS {
  
  inline def apply(hosts: js.Array[String], secretName: String): IngressTLS = {
    val __obj = js.Dynamic.literal(hosts = hosts.asInstanceOf[js.Any], secretName = secretName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressTLS]
  }
  
  extension [Self <: IngressTLS](x: Self) {
    
    inline def setHosts(value: js.Array[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsVarargs(value: String*): Self = StObject.set(x, "hosts", js.Array(value :_*))
    
    inline def setSecretName(value: String): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
  }
}
