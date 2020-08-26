package typings.pulumiAws.inputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityRevocationConfigurationCrlConfiguration extends js.Object {
  var customCname: js.UndefOr[String] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var expirationInDays: js.UndefOr[Double] = js.native
  var s3BucketName: js.UndefOr[String] = js.native
}

object GetCertificateAuthorityRevocationConfigurationCrlConfiguration {
  @scala.inline
  def apply(): GetCertificateAuthorityRevocationConfigurationCrlConfiguration = {
    val __obj = js.Dynamic.literal()
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
    def deleteCustomCname: Self = this.set("customCname", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setExpirationInDays(value: Double): Self = this.set("expirationInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationInDays: Self = this.set("expirationInDays", js.undefined)
    @scala.inline
    def setS3BucketName(value: String): Self = this.set("s3BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3BucketName: Self = this.set("s3BucketName", js.undefined)
  }
  
}

