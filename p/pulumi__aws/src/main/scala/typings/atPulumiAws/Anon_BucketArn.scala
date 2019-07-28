package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketArn extends js.Object {
  var bucketArn: String
  var fileKey: String
  var roleArn: String
}

object Anon_BucketArn {
  @scala.inline
  def apply(bucketArn: String, fileKey: String, roleArn: String): Anon_BucketArn = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn, fileKey = fileKey, roleArn = roleArn)
  
    __obj.asInstanceOf[Anon_BucketArn]
  }
}

