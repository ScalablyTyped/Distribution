package typings.pulumiAws.getCertificateAuthorityMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.acmpca.GetCertificateAuthorityRevocationConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityArgs extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the certificate authority.
    */
  val arn: String = js.native
  /**
    * Nested attribute containing revocation configuration.
    * * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
    * * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
    * * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
    * * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
    * * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
    */
  val revocationConfigurations: js.UndefOr[js.Array[GetCertificateAuthorityRevocationConfiguration]] = js.native
  /**
    * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetCertificateAuthorityArgs {
  @scala.inline
  def apply(
    arn: String,
    revocationConfigurations: js.Array[GetCertificateAuthorityRevocationConfiguration] = null,
    tags: StringDictionary[js.Any] = null
  ): GetCertificateAuthorityArgs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    if (revocationConfigurations != null) __obj.updateDynamic("revocationConfigurations")(revocationConfigurations.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateAuthorityArgs]
  }
}

