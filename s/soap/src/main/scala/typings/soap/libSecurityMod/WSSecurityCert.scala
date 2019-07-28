package typings.soap.libSecurityMod

import typings.soap.libSecurityWSSecurityCertMod.IWSSecurityCertOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security", "WSSecurityCert")
@js.native
class WSSecurityCert protected ()
  extends typings.soap.libSecurityWSSecurityCertMod.WSSecurityCert {
  def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any) = this()
  def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any, options: IWSSecurityCertOptions) = this()
}

