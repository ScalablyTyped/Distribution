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
  def apply(): GetCertificateAuthorityRevocationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificateAuthorityRevocationConfiguration]
  }
  @scala.inline
  implicit class GetCertificateAuthorityRevocationConfigurationOps[Self <: GetCertificateAuthorityRevocationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCrlConfigurationsVarargs(value: GetCertificateAuthorityRevocationConfigurationCrlConfiguration*): Self = this.set("crlConfigurations", js.Array(value :_*))
    @scala.inline
    def setCrlConfigurations(value: js.Array[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]): Self = this.set("crlConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrlConfigurations: Self = this.set("crlConfigurations", js.undefined)
  }
  
}

