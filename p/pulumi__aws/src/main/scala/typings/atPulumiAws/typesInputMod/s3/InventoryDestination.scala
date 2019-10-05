package typings.atPulumiAws.typesInputMod.s3

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryDestination extends js.Object {
  /**
    * The S3 bucket configuration where inventory results are published (documented below).
    */
  var bucket: Input[InventoryDestinationBucket]
}

object InventoryDestination {
  @scala.inline
  def apply(bucket: Input[InventoryDestinationBucket]): InventoryDestination = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InventoryDestination]
  }
}

