package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketStorageClassInput extends js.Object {
  var bucket: js.UndefOr[Input[String]] = js.undefined
  var storageClass: js.UndefOr[Input[String]] = js.undefined
}

object Anon_BucketStorageClassInput {
  @scala.inline
  def apply(bucket: Input[String] = null, storageClass: Input[String] = null): Anon_BucketStorageClassInput = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketStorageClassInput]
  }
}

