package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "security")
@js.native
object securityNs extends js.Object {
  @js.native
  class BasicAuthSecurity protected ()
    extends soapLib.libSecurityMod.BasicAuthSecurity {
    def this(username: java.lang.String, password: java.lang.String) = this()
    def this(username: java.lang.String, password: java.lang.String, defaults: js.Any) = this()
  }
  
  @js.native
  class BearerSecurity protected ()
    extends soapLib.libSecurityMod.BearerSecurity {
    def this(token: java.lang.String) = this()
    def this(token: java.lang.String, defaults: js.Any) = this()
  }
  
  @js.native
  class ClientSSLSecurity protected ()
    extends soapLib.libSecurityMod.ClientSSLSecurity {
    def this(key: java.lang.String, cert: java.lang.String) = this()
    def this(key: java.lang.String, cert: nodeLib.Buffer) = this()
    def this(key: nodeLib.Buffer, cert: java.lang.String) = this()
    def this(key: nodeLib.Buffer, cert: nodeLib.Buffer) = this()
    def this(key: java.lang.String, cert: java.lang.String, defaults: js.Any) = this()
    def this(key: java.lang.String, cert: nodeLib.Buffer, defaults: js.Any) = this()
    def this(key: nodeLib.Buffer, cert: java.lang.String, defaults: js.Any) = this()
    def this(key: nodeLib.Buffer, cert: nodeLib.Buffer, defaults: js.Any) = this()
  }
  
  @js.native
  class ClientSSLSecurityPFX protected ()
    extends soapLib.libSecurityMod.ClientSSLSecurityPFX {
    def this(pfx: java.lang.String) = this()
    def this(pfx: nodeLib.Buffer) = this()
    def this(pfx: java.lang.String, defaults: js.Any) = this()
    def this(pfx: nodeLib.Buffer, defaults: js.Any) = this()
  }
  
  @js.native
  class NTLMSecurity protected ()
    extends soapLib.libSecurityMod.NTLMSecurity {
    def this(defaults: js.Any) = this()
  }
  
  @js.native
  class WSSecurity protected ()
    extends soapLib.libSecurityMod.WSSecurity {
    def this(username: java.lang.String, password: java.lang.String) = this()
    def this(username: java.lang.String, password: java.lang.String, options: java.lang.String) = this()
    def this(username: java.lang.String, password: java.lang.String, options: soapLib.libSecurityWSSecurityMod.IWSSecurityOptions) = this()
  }
  
  @js.native
  class WSSecurityCert protected ()
    extends soapLib.libSecurityMod.WSSecurityCert {
    def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any) = this()
    def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any, options: soapLib.libSecurityWSSecurityCertMod.IWSSecurityCertOptions) = this()
  }
  
}

