package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketKey extends js.Object {
  var bucket: java.lang.String
  var key: java.lang.String
  var roleArn: java.lang.String
}

object Anon_BucketKey {
  @scala.inline
  def apply(bucket: java.lang.String, key: java.lang.String, roleArn: java.lang.String): Anon_BucketKey = {
    val __obj = js.Dynamic.literal(bucket = bucket, key = key, roleArn = roleArn)
  
    __obj.asInstanceOf[Anon_BucketKey]
  }
}

