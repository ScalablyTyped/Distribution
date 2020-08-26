package typings.pulumiAws.outputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityRevocationConfigurationCrlConfiguration extends js.Object {
  var customCname: String = js.native
  var enabled: Boolean = js.native
  var expirationInDays: Double = js.native
  var s3BucketName: String = js.native
}

object GetCertificateAuthorityRevocationConfigurationCrlConfiguration {
  @scala.inline
  def apply(customCname: String, enabled: Boolean, expirationInDays: Double, s3BucketName: String): GetCertificateAuthorityRevocationConfigurationCrlConfiguration = {
    val __obj = js.Dynamic.literal(customCname = customCname.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], expirationInDays = expirationInDays.asInstanceOf[js.Any], s3BucketName = s3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]
  }
  @scala.inline
  implicit class GetCertificateAuthorityRevocationConfigurationCrlConfigurationOps[Self <: GetCertificateAuthorityRevocationConfigurationCrlConfiguration] (val x: Self) extends AnyVal {
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
    def setCustomCname(value: String): Self = this.set("customCname", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationInDays(value: Double): Self = this.set("expirationInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3BucketName(value: String): Self = this.set("s3BucketName", value.asInstanceOf[js.Any])
  }
  
}

