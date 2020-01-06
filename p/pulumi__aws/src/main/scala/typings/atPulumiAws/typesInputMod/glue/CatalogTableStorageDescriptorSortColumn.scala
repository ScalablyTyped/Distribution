package typings.atPulumiAws.typesInputMod.glue

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTableStorageDescriptorSortColumn extends js.Object {
  /**
    * The name of the column.
    */
  var column: Input[String] = js.native
  /**
    * Indicates that the column is sorted in ascending order (== 1), or in descending order (==0).
    */
  var sortOrder: Input[Double] = js.native
}

object CatalogTableStorageDescriptorSortColumn {
  @scala.inline
  def apply(column: Input[String], sortOrder: Input[Double]): CatalogTableStorageDescriptorSortColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CatalogTableStorageDescriptorSortColumn]
  }
}

