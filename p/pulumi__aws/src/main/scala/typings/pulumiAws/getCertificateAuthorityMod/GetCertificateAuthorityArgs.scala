package typings.pulumiAws.getCertificateAuthorityMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.acmpca.GetCertificateAuthorityRevocationConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}
object GetCertificateAuthorityArgs {
  
  @scala.inline
  def apply(arn: String): GetCertificateAuthorityArgs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateAuthorityArgs]
  }
  
  @scala.inline
  implicit class GetCertificateAuthorityArgsOps[Self <: GetCertificateAuthorityArgs] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocationConfigurationsVarargs(value: GetCertificateAuthorityRevocationConfiguration*): Self = this.set("revocationConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setRevocationConfigurations(value: js.Array[GetCertificateAuthorityRevocationConfiguration]): Self = this.set("revocationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevocationConfigurations: Self = this.set("revocationConfigurations", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
