package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomCnameEnabledExpirationInDaysS3BucketName extends js.Object {
  var customCname: String
  var enabled: Boolean
  var expirationInDays: Double
  var s3BucketName: String
}

object Anon_CustomCnameEnabledExpirationInDaysS3BucketName {
  @scala.inline
  def apply(customCname: String, enabled: Boolean, expirationInDays: Double, s3BucketName: String): Anon_CustomCnameEnabledExpirationInDaysS3BucketName = {
    val __obj = js.Dynamic.literal(customCname = customCname, enabled = enabled, expirationInDays = expirationInDays, s3BucketName = s3BucketName)
  
    __obj.asInstanceOf[Anon_CustomCnameEnabledExpirationInDaysS3BucketName]
  }
}

