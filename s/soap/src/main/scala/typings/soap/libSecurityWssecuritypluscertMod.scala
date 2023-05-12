package typings.soap

import typings.soap.libSecurityWssecurityMod.WSSecurity
import typings.soap.libSecurityWssecuritycertMod.WSSecurityCert
import typings.soap.libTypesMod.ISecurity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityWssecuritypluscertMod {
  
  @JSImport("soap/lib/security/WSSecurityPlusCert", "WSSecurityPlusCert")
  @js.native
  open class WSSecurityPlusCert protected ()
    extends StObject
       with ISecurity {
    def this(wsSecurity: WSSecurity, wsSecurityCert: WSSecurityCert) = this()
    
    @JSName("postProcess")
    def postProcess_MWSSecurityPlusCert(xml: String, envelopeKey: String): String = js.native
    
    /* private */ val wsSecurity: Any = js.native
    
    /* private */ val wsSecurityCert: Any = js.native
  }
}
