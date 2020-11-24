package typings.pulumiAws.outputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateAuthorityRevocationConfigurationCrlConfiguration extends js.Object {
  
  /**
    * Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public. Must be less than or equal to 253 characters in length.
    */
  var customCname: js.UndefOr[String] = js.native
  
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of days until a certificate expires. Must be between 1 and 5000.
    */
  var expirationInDays: Double = js.native
  
  /**
    * Name of the S3 bucket that contains the CRL. If you do not provide a value for the `customCname` argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket. Must be less than or equal to 255 characters in length.
    */
  var s3BucketName: js.UndefOr[String] = js.native
}
object CertificateAuthorityRevocationConfigurationCrlConfiguration {
  
  @scala.inline
  def apply(expirationInDays: Double): CertificateAuthorityRevocationConfigurationCrlConfiguration = {
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
    def setExpirationInDays(value: Double): Self = this.set("expirationInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCname(value: String): Self = this.set("customCname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomCname: Self = this.set("customCname", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: String): Self = this.set("s3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketName: Self = this.set("s3BucketName", js.undefined)
  }
}
