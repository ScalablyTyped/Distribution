package typings.atPulumiAws.typesOutputMod.glueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatalogTableStorageDescriptorSortColumn extends js.Object {
  /**
    * The name of the column.
    */
  var column: String
  /**
    * Indicates that the column is sorted in ascending order (== 1), or in descending order (==0).
    */
  var sortOrder: Double
}

object CatalogTableStorageDescriptorSortColumn {
  @scala.inline
  def apply(column: String, sortOrder: Double): CatalogTableStorageDescriptorSortColumn = {
    val __obj = js.Dynamic.literal(column = column, sortOrder = sortOrder)
  
    __obj.asInstanceOf[CatalogTableStorageDescriptorSortColumn]
  }
}

