package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertificateAuthorityArns extends js.Object {
  var certificateAuthorityArns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_CertificateAuthorityArns {
  @scala.inline
  def apply(certificateAuthorityArns: js.Array[java.lang.String] = null): Anon_CertificateAuthorityArns = {
    val __obj = js.Dynamic.literal()
    if (certificateAuthorityArns != null) __obj.updateDynamic("certificateAuthorityArns")(certificateAuthorityArns)
    __obj.asInstanceOf[Anon_CertificateAuthorityArns]
  }
}

