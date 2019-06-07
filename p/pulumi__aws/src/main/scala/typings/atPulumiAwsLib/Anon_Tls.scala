package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tls extends js.Object {
  var tls: js.UndefOr[Anon_CertificateAuthorityArns] = js.undefined
}

object Anon_Tls {
  @scala.inline
  def apply(tls: Anon_CertificateAuthorityArns = null): Anon_Tls = {
    val __obj = js.Dynamic.literal()
    if (tls != null) __obj.updateDynamic("tls")(tls)
    __obj.asInstanceOf[Anon_Tls]
  }
}

