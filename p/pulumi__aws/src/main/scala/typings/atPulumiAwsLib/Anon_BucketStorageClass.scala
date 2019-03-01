package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketStorageClass extends js.Object {
  var bucket: java.lang.String
  var storageClass: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BucketStorageClass {
  @scala.inline
  def apply(bucket: java.lang.String, storageClass: java.lang.String = null): Anon_BucketStorageClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucket")(bucket)
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass)
    __obj.asInstanceOf[Anon_BucketStorageClass]
  }
}

