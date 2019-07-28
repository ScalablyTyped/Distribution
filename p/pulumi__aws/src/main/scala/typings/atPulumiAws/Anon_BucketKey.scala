package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketKey extends js.Object {
  var bucket: String
  var key: String
  var roleArn: String
}

object Anon_BucketKey {
  @scala.inline
  def apply(bucket: String, key: String, roleArn: String): Anon_BucketKey = {
    val __obj = js.Dynamic.literal(bucket = bucket, key = key, roleArn = roleArn)
  
    __obj.asInstanceOf[Anon_BucketKey]
  }
}

