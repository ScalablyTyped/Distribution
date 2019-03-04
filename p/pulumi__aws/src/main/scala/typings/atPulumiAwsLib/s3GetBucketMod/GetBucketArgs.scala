package typings
package atPulumiAwsLib.s3GetBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketArgs extends js.Object {
  /**
    * The name of the bucket
    */
  val bucket: java.lang.String
}

object GetBucketArgs {
  @scala.inline
  def apply(bucket: java.lang.String): GetBucketArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket)
  
    __obj.asInstanceOf[GetBucketArgs]
  }
}

