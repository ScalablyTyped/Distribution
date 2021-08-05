package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SessionAffinityConfig represents the configurations of session affinity.
  */
trait SessionAffinityConfig extends StObject {
  
  /**
    * clientIP contains the configurations of Client IP based session affinity.
    */
  var clientIP: ClientIPConfig
}
object SessionAffinityConfig {
  
  inline def apply(clientIP: ClientIPConfig): SessionAffinityConfig = {
    val __obj = js.Dynamic.literal(clientIP = clientIP.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionAffinityConfig]
  }
  
  extension [Self <: SessionAffinityConfig](x: Self) {
    
    inline def setClientIP(value: ClientIPConfig): Self = StObject.set(x, "clientIP", value.asInstanceOf[js.Any])
  }
}
