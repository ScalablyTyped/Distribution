package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bucket extends js.Object {
  var bucket: Arn = js.native
  var configurationId: String = js.native
  var `object`: ETag = js.native
  var s3SchemaVersion: String = js.native
}

object Bucket {
  @scala.inline
  def apply(bucket: Arn, configurationId: String, `object`: ETag, s3SchemaVersion: String): Bucket = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], configurationId = configurationId.asInstanceOf[js.Any], s3SchemaVersion = s3SchemaVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
}

