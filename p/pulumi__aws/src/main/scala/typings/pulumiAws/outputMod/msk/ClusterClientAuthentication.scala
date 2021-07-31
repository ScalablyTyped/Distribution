package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterClientAuthentication extends StObject {
  
  /**
    * Configuration block for specifying TLS client authentication. See below.
    */
  var tls: js.UndefOr[ClusterClientAuthenticationTls] = js.undefined
}
object ClusterClientAuthentication {
  
  @scala.inline
  def apply(): ClusterClientAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterClientAuthentication]
  }
  
  @scala.inline
  implicit class ClusterClientAuthenticationMutableBuilder[Self <: ClusterClientAuthentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTls(value: ClusterClientAuthenticationTls): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
