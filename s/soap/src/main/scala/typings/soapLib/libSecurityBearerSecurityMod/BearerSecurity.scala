package typings
package soapLib.libSecurityBearerSecurityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security/BearerSecurity", "BearerSecurity")
@js.native
class BearerSecurity protected ()
  extends soapLib.libTypesMod.ISecurity {
  def this(token: java.lang.String) = this()
  def this(token: java.lang.String, defaults: js.Any) = this()
  var _token: js.Any = js.native
  var defaults: js.Any = js.native
  @JSName("addHeaders")
  def addHeaders_MBearerSecurity(headers: soapLib.libTypesMod.IHeaders): scala.Unit = js.native
  @JSName("addOptions")
  def addOptions_MBearerSecurity(options: js.Any): scala.Unit = js.native
  @JSName("toXML")
  def toXML_MBearerSecurity(): java.lang.String = js.native
}

