package typings
package soapLib.libSecurityBasicAuthSecurityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security/BasicAuthSecurity", "BasicAuthSecurity")
@js.native
class BasicAuthSecurity protected ()
  extends soapLib.libTypesMod.ISecurity {
  def this(username: java.lang.String, password: java.lang.String) = this()
  def this(username: java.lang.String, password: java.lang.String, defaults: js.Any) = this()
  var _password: js.Any = js.native
  var _username: js.Any = js.native
  var defaults: js.Any = js.native
  @JSName("addHeaders")
  def addHeaders_MBasicAuthSecurity(headers: soapLib.libTypesMod.IHeaders): scala.Unit = js.native
  @JSName("addOptions")
  def addOptions_MBasicAuthSecurity(options: js.Any): scala.Unit = js.native
  @JSName("toXML")
  def toXML_MBasicAuthSecurity(): java.lang.String = js.native
}

