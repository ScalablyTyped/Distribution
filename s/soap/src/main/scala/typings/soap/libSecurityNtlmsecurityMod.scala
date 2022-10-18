package typings.soap

import typings.soap.libTypesMod.IHeaders
import typings.soap.libTypesMod.ISecurity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityNtlmsecurityMod {
  
  @JSImport("soap/lib/security/NTLMSecurity", "NTLMSecurity")
  @js.native
  open class NTLMSecurity protected ()
    extends StObject
       with ISecurity {
    def this(defaults: Any) = this()
    
    @JSName("addHeaders")
    def addHeaders_MNTLMSecurity(headers: IHeaders): Unit = js.native
    
    @JSName("addOptions")
    def addOptions_MNTLMSecurity(options: Any): Unit = js.native
    
    /* private */ var defaults: Any = js.native
    
    @JSName("toXML")
    def toXML_MNTLMSecurity(): String = js.native
  }
}
