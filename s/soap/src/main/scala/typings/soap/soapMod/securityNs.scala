package typings.soap.soapMod

import typings.node.Buffer
import typings.soap.libSecurityWSSecurityCertMod.IWSSecurityCertOptions
import typings.soap.libSecurityWSSecurityMod.IWSSecurityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "security")
@js.native
object securityNs extends js.Object {
  @js.native
  class BasicAuthSecurity protected ()
    extends typings.soap.libSecurityMod.BasicAuthSecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, defaults: js.Any) = this()
  }
  
  @js.native
  class BearerSecurity protected ()
    extends typings.soap.libSecurityMod.BearerSecurity {
    def this(token: String) = this()
    def this(token: String, defaults: js.Any) = this()
  }
  
  @js.native
  class ClientSSLSecurity protected ()
    extends typings.soap.libSecurityMod.ClientSSLSecurity {
    def this(key: String, cert: String) = this()
    def this(key: String, cert: Buffer) = this()
    def this(key: Buffer, cert: String) = this()
    def this(key: Buffer, cert: Buffer) = this()
    def this(key: String, cert: String, defaults: js.Any) = this()
    def this(key: String, cert: Buffer, defaults: js.Any) = this()
    def this(key: Buffer, cert: String, defaults: js.Any) = this()
    def this(key: Buffer, cert: Buffer, defaults: js.Any) = this()
  }
  
  @js.native
  class ClientSSLSecurityPFX protected ()
    extends typings.soap.libSecurityMod.ClientSSLSecurityPFX {
    def this(pfx: String) = this()
    def this(pfx: Buffer) = this()
    def this(pfx: String, defaults: js.Any) = this()
    def this(pfx: Buffer, defaults: js.Any) = this()
  }
  
  @js.native
  class NTLMSecurity protected ()
    extends typings.soap.libSecurityMod.NTLMSecurity {
    def this(defaults: js.Any) = this()
  }
  
  @js.native
  class WSSecurity protected ()
    extends typings.soap.libSecurityMod.WSSecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, options: String) = this()
    def this(username: String, password: String, options: IWSSecurityOptions) = this()
  }
  
  @js.native
  class WSSecurityCert protected ()
    extends typings.soap.libSecurityMod.WSSecurityCert {
    def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any) = this()
    def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any, options: IWSSecurityCertOptions) = this()
  }
  
}

