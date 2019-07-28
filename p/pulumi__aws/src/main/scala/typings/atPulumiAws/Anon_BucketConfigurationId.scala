package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketConfigurationId extends js.Object {
  var bucket: Anon_ArnNameOwnerIdentity
  var configurationId: String
  var `object`: Anon_ETag
  var s3SchemaVersion: String
}

object Anon_BucketConfigurationId {
  @scala.inline
  def apply(
    bucket: Anon_ArnNameOwnerIdentity,
    configurationId: String,
    `object`: Anon_ETag,
    s3SchemaVersion: String
  ): Anon_BucketConfigurationId = {
    val __obj = js.Dynamic.literal(bucket = bucket, configurationId = configurationId, s3SchemaVersion = s3SchemaVersion)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[Anon_BucketConfigurationId]
  }
}

