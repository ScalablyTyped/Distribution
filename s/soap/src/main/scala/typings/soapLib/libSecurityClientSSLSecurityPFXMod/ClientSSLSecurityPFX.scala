package typings
package soapLib.libSecurityClientSSLSecurityPFXMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security/ClientSSLSecurityPFX", "ClientSSLSecurityPFX")
@js.native
class ClientSSLSecurityPFX protected ()
  extends soapLib.libTypesMod.ISecurity {
  def this(pfx: java.lang.String) = this()
  def this(pfx: nodeLib.Buffer) = this()
  def this(pfx: java.lang.String, defaults: js.Any) = this()
  def this(pfx: nodeLib.Buffer, defaults: js.Any) = this()
  var defaults: js.Any = js.native
  var passphrase: js.Any = js.native
  var pfx: js.Any = js.native
  @JSName("addOptions")
  def addOptions_MClientSSLSecurityPFX(options: js.Any): scala.Unit = js.native
  @JSName("toXML")
  def toXML_MClientSSLSecurityPFX(): java.lang.String = js.native
}

