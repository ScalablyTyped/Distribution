package typings.soap

import typings.node.Buffer
import typings.soap.typesMod.ISecurity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soap/lib/security/ClientSSLSecurityPFX", JSImport.Namespace)
@js.native
object clientSSLSecurityPFXMod extends js.Object {
  
  @js.native
  class ClientSSLSecurityPFX protected () extends ISecurity {
    def this(pfx: String) = this()
    def this(pfx: Buffer) = this()
    def this(pfx: String, defaults: js.Any) = this()
    def this(pfx: Buffer, defaults: js.Any) = this()
    
    @JSName("addOptions")
    def addOptions_MClientSSLSecurityPFX(options: js.Any): Unit = js.native
    
    var defaults: js.Any = js.native
    
    var passphrase: js.Any = js.native
    
    var pfx: js.Any = js.native
    
    @JSName("toXML")
    def toXML_MClientSSLSecurityPFX(): String = js.native
  }
}
