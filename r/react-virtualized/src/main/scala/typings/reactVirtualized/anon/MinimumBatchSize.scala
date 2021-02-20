package typings.reactVirtualized.anon

import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedNumbers.`10`
import typings.reactVirtualized.reactVirtualizedNumbers.`15`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinimumBatchSize extends StObject {
  
  var minimumBatchSize: `10` = js.native
  
  var rowCount: `0` = js.native
  
  var threshold: `15` = js.native
}
object MinimumBatchSize {
  
  @scala.inline
  def apply(minimumBatchSize: `10`, rowCount: `0`, threshold: `15`): MinimumBatchSize = {
    val __obj = js.Dynamic.literal(minimumBatchSize = minimumBatchSize.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
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
