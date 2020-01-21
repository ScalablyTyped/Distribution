package typings.soap

import typings.soap.typesMod.IHeaders
import typings.soap.typesMod.ISecurity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security/NTLMSecurity", JSImport.Namespace)
@js.native
object ntlmsecurityMod extends js.Object {
  @js.native
  class NTLMSecurity protected () extends ISecurity {
    def this(defaults: js.Any) = this()
    var defaults: js.Any = js.native
    @JSName("addHeaders")
    def addHeaders_MNTLMSecurity(headers: IHeaders): Unit = js.native
    @JSName("addOptions")
    def addOptions_MNTLMSecurity(options: js.Any): Unit = js.native
    @JSName("toXML")
    def toXML_MNTLMSecurity(): String = js.native
  }
  
}

