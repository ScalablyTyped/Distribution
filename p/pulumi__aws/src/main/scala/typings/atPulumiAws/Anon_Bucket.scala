package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Bucket extends js.Object {
  var bucket: Anon_Arn = js.native
  var configurationId: String = js.native
  var `object`: Anon_ETag = js.native
  var s3SchemaVersion: String = js.native
}

object Anon_Bucket {
  @scala.inline
  def apply(bucket: Anon_Arn, configurationId: String, `object`: Anon_ETag, s3SchemaVersion: String): Anon_Bucket = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], configurationId = configurationId.asInstanceOf[js.Any], s3SchemaVersion = s3SchemaVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bucket]
  }
}

