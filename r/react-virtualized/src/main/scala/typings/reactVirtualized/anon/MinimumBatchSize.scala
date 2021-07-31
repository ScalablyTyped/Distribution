package typings.reactVirtualized.anon

import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedNumbers.`10`
import typings.reactVirtualized.reactVirtualizedNumbers.`15`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimumBatchSize extends StObject {
  
  var minimumBatchSize: `10`
  
  var rowCount: `0`
  
  var threshold: `15`
}
object MinimumBatchSize {
  
  @scala.inline
  def apply(): MinimumBatchSize = {
    val __obj = js.Dynamic.literal(minimumBatchSize = 10, rowCount = 0, threshold = 15)
    __obj.asInstanceOf[MinimumBatchSize]
  }
  
  @scala.inline
  implicit class MinimumBatchSizeMutableBuilder[Self <: MinimumBatchSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinimumBatchSize(value: `10`): Self = StObject.set(x, "minimumBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: `0`): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: `15`): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
