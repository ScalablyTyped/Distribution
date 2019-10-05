package typings.atPulumiAws.typesInputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateAuthorityRevocationConfiguration extends js.Object {
  var crlConfigurations: js.UndefOr[js.Array[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]] = js.undefined
}

object GetCertificateAuthorityRevocationConfiguration {
  @scala.inline
  def apply(crlConfigurations: js.Array[GetCertificateAuthorityRevocationConfigurationCrlConfiguration] = null): GetCertificateAuthorityRevocationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (crlConfigurations != null) __obj.updateDynamic("crlConfigurations")(crlConfigurations)
    __obj.asInstanceOf[GetCertificateAuthorityRevocationConfiguration]
  }
}

