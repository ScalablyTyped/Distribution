package typings.atPulumiAws.typesOutputMod.acmpca

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
}

