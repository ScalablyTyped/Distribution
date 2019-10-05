package typings.atPulumiAws.typesOutputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateAuthorityRevocationConfigurationCrlConfiguration extends js.Object {
  /**
    * Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public.
    */
  var customCname: js.UndefOr[String] = js.undefined
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of days until a certificate expires. Must be between 1 and 5000.
    */
  var expirationInDays: Double
  /**
    * Name of the S3 bucket that contains the CRL. If you do not provide a value for the `customCname` argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket.
    */
  var s3BucketName: js.UndefOr[String] = js.undefined
}

object CertificateAuthorityRevocationConfigurationCrlConfiguration {
  @scala.inline
  def apply(
    expirationInDays: Double,
    customCname: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    s3BucketName: String = null
  ): CertificateAuthorityRevocationConfigurationCrlConfiguration = {
    val __obj = js.Dynamic.literal(expirationInDays = expirationInDays)
    if (customCname != null) __obj.updateDynamic("customCname")(customCname)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName)
    __obj.asInstanceOf[CertificateAuthorityRevocationConfigurationCrlConfiguration]
  }
}

