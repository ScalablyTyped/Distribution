package typings.pulumiAws.getBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketArgs extends js.Object {
  /**
    * The name of the bucket
    */
  val bucket: String = js.native
}

object GetBucketArgs {
  @scala.inline
  def apply(bucket: String): GetBucketArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketArgs]
  }
}

