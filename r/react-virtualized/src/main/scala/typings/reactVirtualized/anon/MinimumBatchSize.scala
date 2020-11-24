package typings.reactVirtualized.anon

import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedNumbers.`10`
import typings.reactVirtualized.reactVirtualizedNumbers.`15`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinimumBatchSize extends js.Object {
  
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
  implicit class MinimumBatchSizeOps[Self <: MinimumBatchSize] (val x: Self) extends AnyVal {
    
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
    def setMinimumBatchSize(value: `10`): Self = this.set("minimumBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: `0`): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: `15`): Self = this.set("threshold", value.asInstanceOf[js.Any])
  }
}
