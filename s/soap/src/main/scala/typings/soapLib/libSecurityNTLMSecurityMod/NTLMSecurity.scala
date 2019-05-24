package typings
package soapLib.libSecurityNTLMSecurityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security/NTLMSecurity", "NTLMSecurity")
@js.native
class NTLMSecurity protected ()
  extends soapLib.libTypesMod.ISecurity {
  def this(defaults: js.Any) = this()
  var defaults: js.Any = js.native
  @JSName("addHeaders")
  def addHeaders_MNTLMSecurity(headers: soapLib.libTypesMod.IHeaders): scala.Unit = js.native
  @JSName("addOptions")
  def addOptions_MNTLMSecurity(options: js.Any): scala.Unit = js.native
  @JSName("toXML")
  def toXML_MNTLMSecurity(): java.lang.String = js.native
}

