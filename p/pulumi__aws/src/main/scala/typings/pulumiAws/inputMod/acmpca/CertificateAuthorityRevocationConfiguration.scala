package typings.pulumiAws.inputMod.acmpca

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthorityRevocationConfiguration extends js.Object {
  /**
    * Nested argument containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority. Defined below.
    */
  var crlConfiguration: js.UndefOr[Input[CertificateAuthorityRevocationConfigurationCrlConfiguration]] = js.native
}

object CertificateAuthorityRevocationConfiguration {
  @scala.inline
  def apply(crlConfiguration: Input[CertificateAuthorityRevocationConfigurationCrlConfiguration] = null): CertificateAuthorityRevocationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (crlConfiguration != null) __obj.updateDynamic("crlConfiguration")(crlConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthorityRevocationConfiguration]
  }
}

