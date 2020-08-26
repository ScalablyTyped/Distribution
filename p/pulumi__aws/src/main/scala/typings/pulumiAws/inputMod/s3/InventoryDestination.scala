package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryDestination extends js.Object {
  /**
    * The S3 bucket configuration where inventory results are published (documented below).
    */
  var bucket: Input[InventoryDestinationBucket] = js.native
}

object InventoryDestination {
  @scala.inline
  def apply(bucket: Input[InventoryDestinationBucket]): InventoryDestination = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDestination]
  }
  @scala.inline
  implicit class InventoryDestinationOps[Self <: InventoryDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucket(value: Input[InventoryDestinationBucket]): Self = this.set("bucket", value.asInstanceOf[js.Any])
  }
  
}

