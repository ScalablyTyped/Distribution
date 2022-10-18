package typings.soap

import typings.node.bufferMod.global.Buffer
import typings.soap.libTypesMod.ISecurity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityClientSSLSecurityPFXMod {
  
  @JSImport("soap/lib/security/ClientSSLSecurityPFX", "ClientSSLSecurityPFX")
  @js.native
  open class ClientSSLSecurityPFX protected ()
    extends StObject
       with ISecurity {
    def this(pfx: String) = this()
    def this(pfx: Buffer) = this()
    def this(pfx: String, defaults: Any) = this()
    def this(pfx: String, passphrase: String) = this()
    def this(pfx: Buffer, defaults: Any) = this()
    def this(pfx: Buffer, passphrase: String) = this()
    def this(pfx: String, passphrase: String, defaults: Any) = this()
    def this(pfx: Buffer, passphrase: String, defaults: Any) = this()
    
    @JSName("addOptions")
    def addOptions_MClientSSLSecurityPFX(options: Any): Unit = js.native
    
    /* private */ var defaults: Any = js.native
    
    /* private */ var passphrase: Any = js.native
    
    /* private */ var pfx: Any = js.native
    
    @JSName("toXML")
    def toXML_MClientSSLSecurityPFX(): String = js.native
  }
}
