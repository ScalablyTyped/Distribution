package typings.atPulumiAws.s3GetBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketArgs extends js.Object {
  /**
    * The name of the bucket
    */
  val bucket: String
}

object GetBucketArgs {
  @scala.inline
  def apply(bucket: String): GetBucketArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket)
  
    __obj.asInstanceOf[GetBucketArgs]
  }
}

