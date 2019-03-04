package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameEnable extends js.Object {
  var bucketName: java.lang.String
  var enable: scala.Boolean
  var s3KeyPrefix: java.lang.String
}

object Anon_BucketNameEnable {
  @scala.inline
  def apply(bucketName: java.lang.String, enable: scala.Boolean, s3KeyPrefix: java.lang.String): Anon_BucketNameEnable = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, enable = enable, s3KeyPrefix = s3KeyPrefix)
  
    __obj.asInstanceOf[Anon_BucketNameEnable]
  }
}

