package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketConfigurationId extends js.Object {
  var bucket: Anon_ArnNameOwnerIdentity
  var configurationId: java.lang.String
  var `object`: Anon_ETag
  var s3SchemaVersion: java.lang.String
}

object Anon_BucketConfigurationId {
  @scala.inline
  def apply(
    bucket: Anon_ArnNameOwnerIdentity,
    configurationId: java.lang.String,
    `object`: Anon_ETag,
    s3SchemaVersion: java.lang.String
  ): Anon_BucketConfigurationId = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("bucket")(bucket)
    __obj.updateDynamic("configurationId")(configurationId)
    __obj.updateDynamic("s3SchemaVersion")(s3SchemaVersion)
    __obj.asInstanceOf[Anon_BucketConfigurationId]
  }
}

