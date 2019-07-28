package typings.soap.libSecurityNTLMSecurityMod

import typings.soap.libTypesMod.IHeaders
import typings.soap.libTypesMod.ISecurity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security/NTLMSecurity", "NTLMSecurity")
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

