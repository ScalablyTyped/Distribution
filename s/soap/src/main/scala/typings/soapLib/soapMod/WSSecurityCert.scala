package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "WSSecurityCert")
@js.native
class WSSecurityCert protected ()
  extends soapLib.libSecurityMod.WSSecurityCert {
  def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any) = this()
  def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any, options: soapLib.libSecurityWSSecurityCertMod.IWSSecurityCertOptions) = this()
}

