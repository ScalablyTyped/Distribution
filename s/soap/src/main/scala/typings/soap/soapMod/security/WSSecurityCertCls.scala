package typings.soap.soapMod.security

import typings.soap.libSecurityMod.WSSecurityCert
import typings.soap.libSecurityWSSecurityCertMod.IWSSecurityCertOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "security.WSSecurityCert")
@js.native
class WSSecurityCertCls protected () extends WSSecurityCert {
  def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any) = this()
  def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any, options: IWSSecurityCertOptions) = this()
}

