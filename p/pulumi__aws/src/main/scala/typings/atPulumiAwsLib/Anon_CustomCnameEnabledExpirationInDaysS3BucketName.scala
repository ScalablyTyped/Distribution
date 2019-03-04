package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomCnameEnabledExpirationInDaysS3BucketName extends js.Object {
  var customCname: java.lang.String
  var enabled: scala.Boolean
  var expirationInDays: scala.Double
  var s3BucketName: java.lang.String
}

object Anon_CustomCnameEnabledExpirationInDaysS3BucketName {
  @scala.inline
  def apply(
    customCname: java.lang.String,
    enabled: scala.Boolean,
    expirationInDays: scala.Double,
    s3BucketName: java.lang.String
  ): Anon_CustomCnameEnabledExpirationInDaysS3BucketName = {
    val __obj = js.Dynamic.literal(customCname = customCname, enabled = enabled, expirationInDays = expirationInDays, s3BucketName = s3BucketName)
  
    __obj.asInstanceOf[Anon_CustomCnameEnabledExpirationInDaysS3BucketName]
  }
}

