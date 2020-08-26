package typings.pulumiAws.inputMod.acmpca

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthorityRevocationConfigurationCrlConfiguration extends js.Object {
  /**
    * Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public.
    */
  var customCname: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Number of days until a certificate expires. Must be between 1 and 5000.
    */
  var expirationInDays: Input[Double] = js.native
  /**
    * Name of the S3 bucket that contains the CRL. If you do not provide a value for the `customCname` argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket.
    */
  var s3BucketName: js.UndefOr[Input[String]] = js.native
}

object CertificateAuthorityRevocationConfigurationCrlConfiguration {
  @scala.inline
  def apply(expirationInDays: Input[Double]): CertificateAuthorityRevocationConfigurationCrlConfiguration = {
    val __obj = js.Dynamic.literal(expirationInDays = expirationInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthorityRevocationConfigurationCrlConfiguration]
  }
  @scala.inline
  implicit class CertificateAuthorityRevocationConfigurationCrlConfigurationOps[Self <: CertificateAuthorityRevocationConfigurationCrlConfiguration] (val x: Self) extends AnyVal {
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
    def setExpirationInDays(value: Input[Double]): Self = this.set("expirationInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomCname(value: Input[String]): Self = this.set("customCname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomCname: Self = this.set("customCname", js.undefined)
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setS3BucketName(value: Input[String]): Self = this.set("s3BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3BucketName: Self = this.set("s3BucketName", js.undefined)
  }
  
}

