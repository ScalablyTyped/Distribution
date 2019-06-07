package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TlsAnonCertificateAuthorityArnsArray extends js.Object {
  var tls: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_CertificateAuthorityArnsArray]] = js.undefined
}

object Anon_TlsAnonCertificateAuthorityArnsArray {
  @scala.inline
  def apply(tls: atPulumiPulumiLib.outputMod.Input[Anon_CertificateAuthorityArnsArray] = null): Anon_TlsAnonCertificateAuthorityArnsArray = {
    val __obj = js.Dynamic.literal()
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TlsAnonCertificateAuthorityArnsArray]
  }
}

