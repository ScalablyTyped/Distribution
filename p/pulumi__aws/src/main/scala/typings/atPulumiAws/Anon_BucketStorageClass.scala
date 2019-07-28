package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketStorageClass extends js.Object {
  var bucket: String
  var storageClass: js.UndefOr[String] = js.undefined
}

object Anon_BucketStorageClass {
  @scala.inline
  def apply(bucket: String, storageClass: String = null): Anon_BucketStorageClass = {
    val __obj = js.Dynamic.literal(bucket = bucket)
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass)
    __obj.asInstanceOf[Anon_BucketStorageClass]
  }
}

