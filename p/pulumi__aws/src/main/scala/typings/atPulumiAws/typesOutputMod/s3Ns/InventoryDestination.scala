package typings.atPulumiAws.typesOutputMod.s3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryDestination extends js.Object {
  /**
    * The S3 bucket configuration where inventory results are published (documented below).
    */
  var bucket: InventoryDestinationBucket
}

object InventoryDestination {
  @scala.inline
  def apply(bucket: InventoryDestinationBucket): InventoryDestination = {
    val __obj = js.Dynamic.literal(bucket = bucket)
  
    __obj.asInstanceOf[InventoryDestination]
  }
}

