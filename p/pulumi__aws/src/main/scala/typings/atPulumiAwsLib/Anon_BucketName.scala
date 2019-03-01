package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketName extends js.Object {
  var bucketName: java.lang.String
  var key: java.lang.String
  var roleArn: java.lang.String
}

object Anon_BucketName {
  @scala.inline
  def apply(bucketName: java.lang.String, key: java.lang.String, roleArn: java.lang.String): Anon_BucketName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucketName")(bucketName)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[Anon_BucketName]
  }
}

