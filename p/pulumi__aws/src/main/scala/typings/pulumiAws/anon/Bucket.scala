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
  @scala.inline
  implicit class BucketOps[Self <: Bucket] (val x: Self) extends AnyVal {
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
    def setBucket(value: Arn): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationId(value: String): Self = this.set("configurationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: ETag): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3SchemaVersion(value: String): Self = this.set("s3SchemaVersion", value.asInstanceOf[js.Any])
  }
  
}

