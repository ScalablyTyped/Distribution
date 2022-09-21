package typings.soap

import typings.node.bufferMod.global.Buffer
import typings.soap.wssecurityMod.IWSSecurityOptions
import typings.soap.wssecuritycertMod.IWSSecurityCertOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securityMod {
  
  @JSImport("soap/lib/security", "BasicAuthSecurity")
  @js.native
  open class BasicAuthSecurity protected ()
    extends typings.soap.basicAuthSecurityMod.BasicAuthSecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, defaults: Any) = this()
  }
  
  @JSImport("soap/lib/security", "BearerSecurity")
  @js.native
  open class BearerSecurity protected ()
    extends typings.soap.bearerSecurityMod.BearerSecurity {
    def this(token: String) = this()
    def this(token: String, defaults: Any) = this()
  }
  
  @JSImport("soap/lib/security", "ClientSSLSecurity")
  @js.native
  open class ClientSSLSecurity protected ()
    extends typings.soap.clientSSLSecurityMod.ClientSSLSecurity {
    def this(key: String, cert: String) = this()
    def this(key: String, cert: Buffer) = this()
    def this(key: Buffer, cert: String) = this()
    def this(key: Buffer, cert: Buffer) = this()
    def this(key: String, cert: String, ca: String) = this()
    def this(key: String, cert: String, ca: js.Array[Any]) = this()
    def this(key: String, cert: String, ca: Any) = this()
    def this(key: String, cert: String, ca: Buffer) = this()
    def this(key: String, cert: Buffer, ca: String) = this()
    def this(key: String, cert: Buffer, ca: js.Array[Any]) = this()
    def this(key: String, cert: Buffer, ca: Any) = this()
    def this(key: String, cert: Buffer, ca: Buffer) = this()
    def this(key: Buffer, cert: String, ca: String) = this()
    def this(key: Buffer, cert: String, ca: js.Array[Any]) = this()
    def this(key: Buffer, cert: String, ca: Any) = this()
    def this(key: Buffer, cert: String, ca: Buffer) = this()
    def this(key: Buffer, cert: Buffer, ca: String) = this()
    def this(key: Buffer, cert: Buffer, ca: js.Array[Any]) = this()
    def this(key: Buffer, cert: Buffer, ca: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: Buffer) = this()
    def this(key: String, cert: String, ca: String, defaults: Any) = this()
    def this(key: String, cert: String, ca: js.Array[Any], defaults: Any) = this()
    def this(key: String, cert: String, ca: Any, defaults: Any) = this()
    def this(key: String, cert: String, ca: Unit, defaults: Any) = this()
    def this(key: String, cert: String, ca: Buffer, defaults: Any) = this()
    def this(key: String, cert: Buffer, ca: String, defaults: Any) = this()
    def this(key: String, cert: Buffer, ca: js.Array[Any], defaults: Any) = this()
    def this(key: String, cert: Buffer, ca: Any, defaults: Any) = this()
    def this(key: String, cert: Buffer, ca: Unit, defaults: Any) = this()
    def this(key: String, cert: Buffer, ca: Buffer, defaults: Any) = this()
    def this(key: Buffer, cert: String, ca: String, defaults: Any) = this()
    def this(key: Buffer, cert: String, ca: js.Array[Any], defaults: Any) = this()
    def this(key: Buffer, cert: String, ca: Any, defaults: Any) = this()
    def this(key: Buffer, cert: String, ca: Unit, defaults: Any) = this()
    def this(key: Buffer, cert: String, ca: Buffer, defaults: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: String, defaults: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: js.Array[Any], defaults: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: Any, defaults: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: Unit, defaults: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: Buffer, defaults: Any) = this()
  }
  
  @JSImport("soap/lib/security", "ClientSSLSecurityPFX")
  @js.native
  open class ClientSSLSecurityPFX protected ()
    extends typings.soap.clientSSLSecurityPFXMod.ClientSSLSecurityPFX {
    def this(pfx: String) = this()
    def this(pfx: Buffer) = this()
    def this(pfx: String, defaults: Any) = this()
    def this(pfx: String, passphrase: String) = this()
    def this(pfx: Buffer, defaults: Any) = this()
    def this(pfx: Buffer, passphrase: String) = this()
    def this(pfx: String, passphrase: String, defaults: Any) = this()
    def this(pfx: Buffer, passphrase: String, defaults: Any) = this()
  }
  
  @JSImport("soap/lib/security", "NTLMSecurity")
  @js.native
  open class NTLMSecurity protected ()
    extends typings.soap.ntlmsecurityMod.NTLMSecurity {
    def this(defaults: Any) = this()
  }
  
  @JSImport("soap/lib/security", "WSSecurity")
  @js.native
  open class WSSecurity protected ()
    extends typings.soap.wssecurityMod.WSSecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, options: String) = this()
    def this(username: String, password: String, options: IWSSecurityOptions) = this()
  }
  
  @JSImport("soap/lib/security", "WSSecurityCert")
  @js.native
  open class WSSecurityCert protected ()
    extends typings.soap.wssecuritycertMod.WSSecurityCert {
    def this(privatePEM: Any, publicP12PEM: Any, password: Any) = this()
    def this(privatePEM: Any, publicP12PEM: Any, password: Any, options: IWSSecurityCertOptions) = this()
  }
}
