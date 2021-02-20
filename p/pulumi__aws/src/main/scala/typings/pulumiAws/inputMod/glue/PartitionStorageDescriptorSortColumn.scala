package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionStorageDescriptorSortColumn extends StObject {
  
  /**
    * The name of the column.
    */
  var column: Input[String] = js.native
  
  /**
    * Indicates that the column is sorted in ascending order (== 1), or in descending order (==0).
    */
  var sortOrder: Input[Double] = js.native
}
object PartitionStorageDescriptorSortColumn {
  
  @scala.inline
  def apply(column: Input[String], sortOrder: Input[Double]): PartitionStorageDescriptorSortColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionStorageDescriptorSortColumn]
  }
  
  @scala.inline
  implicit class PartitionStorageDescriptorSortColumnMutableBuilder[Self <: PartitionStorageDescriptorSortColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Input[String]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrder(value: Input[Double]): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
  }
}
