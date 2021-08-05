package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterClientAuthentication extends StObject {
  
  /**
    * Configuration block for specifying TLS client authentication. See below.
    */
  var tls: js.UndefOr[Input[ClusterClientAuthenticationTls]] = js.undefined
}
object ClusterClientAuthentication {
  
  inline def apply(): ClusterClientAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterClientAuthentication]
  }
  
  extension [Self <: ClusterClientAuthentication](x: Self) {
    
    inline def setTls(value: Input[ClusterClientAuthenticationTls]): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
