package typings
package soapLib.libSecurityClientSSLSecurityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security/ClientSSLSecurity", "ClientSSLSecurity")
@js.native
class ClientSSLSecurity protected ()
  extends soapLib.libTypesMod.ISecurity {
  def this(key: java.lang.String, cert: java.lang.String) = this()
  def this(key: java.lang.String, cert: nodeLib.Buffer) = this()
  def this(key: nodeLib.Buffer, cert: java.lang.String) = this()
  def this(key: nodeLib.Buffer, cert: nodeLib.Buffer) = this()
  def this(key: java.lang.String, cert: java.lang.String, defaults: js.Any) = this()
  def this(key: java.lang.String, cert: nodeLib.Buffer, defaults: js.Any) = this()
  def this(key: nodeLib.Buffer, cert: java.lang.String, defaults: js.Any) = this()
  def this(key: nodeLib.Buffer, cert: nodeLib.Buffer, defaults: js.Any) = this()
  var agent: js.Any = js.native
  var ca: js.Any = js.native
  var cert: js.Any = js.native
  var defaults: js.Any = js.native
  var key: js.Any = js.native
  @JSName("addOptions")
  def addOptions_MClientSSLSecurity(options: js.Any): scala.Unit = js.native
  @JSName("toXML")
  def toXML_MClientSSLSecurity(): java.lang.String = js.native
}

