package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogTableStorageDescriptorSortColumn extends StObject {
  
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
  
  inline def apply(column: String, sortOrder: Double): CatalogTableStorageDescriptorSortColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTableStorageDescriptorSortColumn]
  }
  
  extension [Self <: CatalogTableStorageDescriptorSortColumn](x: Self) {
    
    inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: Double): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
  }
}
