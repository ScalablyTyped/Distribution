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
}

