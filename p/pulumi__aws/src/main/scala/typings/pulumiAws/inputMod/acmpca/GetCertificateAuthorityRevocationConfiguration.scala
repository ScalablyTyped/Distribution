package typings.pulumiAws.inputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityRevocationConfiguration extends js.Object {
  var crlConfigurations: js.UndefOr[js.Array[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]] = js.native
}

object GetCertificateAuthorityRevocationConfiguration {
  @scala.inline
  def apply(crlConfigurations: js.Array[GetCertificateAuthorityRevocationConfigurationCrlConfiguration] = null): GetCertificateAuthorityRevocationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (crlConfigurations != null) __obj.updateDynamic("crlConfigurations")(crlConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateAuthorityRevocationConfiguration]
  }
}

