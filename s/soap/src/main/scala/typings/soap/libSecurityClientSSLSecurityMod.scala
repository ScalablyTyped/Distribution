package typings.soap

import typings.node.Buffer
import typings.soap.libTypesMod.ISecurity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security/ClientSSLSecurity", JSImport.Namespace)
@js.native
object libSecurityClientSSLSecurityMod extends js.Object {
  @js.native
  class ClientSSLSecurity protected () extends ISecurity {
    def this(key: String, cert: String) = this()
    def this(key: String, cert: Buffer) = this()
    def this(key: Buffer, cert: String) = this()
    def this(key: Buffer, cert: Buffer) = this()
    def this(key: String, cert: String, defaults: js.Any) = this()
    def this(key: String, cert: Buffer, defaults: js.Any) = this()
    def this(key: Buffer, cert: String, defaults: js.Any) = this()
    def this(key: Buffer, cert: Buffer, defaults: js.Any) = this()
    var agent: js.Any = js.native
    var ca: js.Any = js.native
    var cert: js.Any = js.native
    var defaults: js.Any = js.native
    var key: js.Any = js.native
    @JSName("addOptions")
    def addOptions_MClientSSLSecurity(options: js.Any): Unit = js.native
    @JSName("toXML")
    def toXML_MClientSSLSecurity(): String = js.native
  }
  
}

