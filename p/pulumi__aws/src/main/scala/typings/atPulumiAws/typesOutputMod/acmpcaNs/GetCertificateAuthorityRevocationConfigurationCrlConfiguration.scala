package typings.atPulumiAws.typesOutputMod.acmpcaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateAuthorityRevocationConfigurationCrlConfiguration extends js.Object {
  var customCname: String
  var enabled: Boolean
  var expirationInDays: Double
  var s3BucketName: String
}

object GetCertificateAuthorityRevocationConfigurationCrlConfiguration {
  @scala.inline
  def apply(customCname: String, enabled: Boolean, expirationInDays: Double, s3BucketName: String): GetCertificateAuthorityRevocationConfigurationCrlConfiguration = {
    val __obj = js.Dynamic.literal(customCname = customCname, enabled = enabled, expirationInDays = expirationInDays, s3BucketName = s3BucketName)
  
    __obj.asInstanceOf[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]
  }
}

