package typings.reactVirtualized.anon

import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedStrings.edges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disabled extends StObject {
  
  var disabled: `false` = js.native
  
  var isControlled: `false` = js.native
  
  var mode: edges = js.native
  
  var scrollToColumn: `0` = js.native
  
  var scrollToRow: `0` = js.native
}
object Disabled {
  
  @scala.inline
  def apply(disabled: `false`, isControlled: `false`, mode: edges, scrollToColumn: `0`, scrollToRow: `0`): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], isControlled = isControlled.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  
  @scala.inline
  implicit class DisabledMutableBuilder[Self <: Disabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: `false`): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsControlled(value: `false`): Self = StObject.set(x, "isControlled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: edges): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToColumn(value: `0`): Self = StObject.set(x, "scrollToColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToRow(value: `0`): Self = StObject.set(x, "scrollToRow", value.asInstanceOf[js.Any])
  }
}
