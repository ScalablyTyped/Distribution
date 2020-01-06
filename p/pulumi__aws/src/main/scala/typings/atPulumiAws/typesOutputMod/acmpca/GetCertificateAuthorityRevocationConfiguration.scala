package typings.atPulumiAws.typesOutputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityRevocationConfiguration extends js.Object {
  var crlConfigurations: js.Array[GetCertificateAuthorityRevocationConfigurationCrlConfiguration] = js.native
}

object GetCertificateAuthorityRevocationConfiguration {
  @scala.inline
  def apply(crlConfigurations: js.Array[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]): GetCertificateAuthorityRevocationConfiguration = {
    val __obj = js.Dynamic.literal(crlConfigurations = crlConfigurations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCertificateAuthorityRevocationConfiguration]
  }
}

