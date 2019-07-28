package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketName extends js.Object {
  var bucketName: String
  var key: String
  var roleArn: String
}

object Anon_BucketName {
  @scala.inline
  def apply(bucketName: String, key: String, roleArn: String): Anon_BucketName = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, key = key, roleArn = roleArn)
  
    __obj.asInstanceOf[Anon_BucketName]
  }
}

