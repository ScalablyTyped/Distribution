package typings.soap

import typings.soap.typesMod.IHeaders
import typings.soap.typesMod.ISecurity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security/BearerSecurity", JSImport.Namespace)
@js.native
object bearerSecurityMod extends js.Object {
  @js.native
  class BearerSecurity protected () extends ISecurity {
    def this(token: String) = this()
    def this(token: String, defaults: js.Any) = this()
    var _token: js.Any = js.native
    var defaults: js.Any = js.native
    @JSName("addHeaders")
    def addHeaders_MBearerSecurity(headers: IHeaders): Unit = js.native
    @JSName("addOptions")
    def addOptions_MBearerSecurity(options: js.Any): Unit = js.native
    @JSName("toXML")
    def toXML_MBearerSecurity(): String = js.native
  }
  
}

