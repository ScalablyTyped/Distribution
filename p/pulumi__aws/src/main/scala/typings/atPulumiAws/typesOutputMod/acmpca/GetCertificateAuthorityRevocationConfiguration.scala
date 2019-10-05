package typings.atPulumiAws.typesOutputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateAuthorityRevocationConfiguration extends js.Object {
  var crlConfigurations: js.Array[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]
}

object GetCertificateAuthorityRevocationConfiguration {
  @scala.inline
  def apply(crlConfigurations: js.Array[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]): GetCertificateAuthorityRevocationConfiguration = {
    val __obj = js.Dynamic.literal(crlConfigurations = crlConfigurations)
  
    __obj.asInstanceOf[GetCertificateAuthorityRevocationConfiguration]
  }
}

