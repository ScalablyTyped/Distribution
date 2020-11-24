package typings.pulumiAws.outputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  }
}
