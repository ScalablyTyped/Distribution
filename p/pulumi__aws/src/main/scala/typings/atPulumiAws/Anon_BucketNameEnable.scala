package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameEnable extends js.Object {
  var bucketName: String
  var enable: Boolean
  var s3KeyPrefix: String
}

object Anon_BucketNameEnable {
  @scala.inline
  def apply(bucketName: String, enable: Boolean, s3KeyPrefix: String): Anon_BucketNameEnable = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, enable = enable, s3KeyPrefix = s3KeyPrefix)
  
    __obj.asInstanceOf[Anon_BucketNameEnable]
  }
}

