package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketArn extends js.Object {
  var bucketArn: java.lang.String
  var fileKey: java.lang.String
  var roleArn: java.lang.String
}

object Anon_BucketArn {
  @scala.inline
  def apply(bucketArn: java.lang.String, fileKey: java.lang.String, roleArn: java.lang.String): Anon_BucketArn = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn, fileKey = fileKey, roleArn = roleArn)
  
    __obj.asInstanceOf[Anon_BucketArn]
  }
}

