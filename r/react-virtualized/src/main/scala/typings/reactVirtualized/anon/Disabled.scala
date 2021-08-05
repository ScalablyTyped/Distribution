package typings.reactVirtualized.anon

import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedStrings.edges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled extends StObject {
  
  var disabled: `false`
  
  var isControlled: `false`
  
  var mode: edges
  
  var scrollToColumn: `0`
  
  var scrollToRow: `0`
}
object Disabled {
  
  inline def apply(): Disabled = {
    val __obj = js.Dynamic.literal(disabled = false, isControlled = false, mode = "edges", scrollToColumn = 0, scrollToRow = 0)
    __obj.asInstanceOf[Disabled]
  }
  
  extension [Self <: Disabled](x: Self) {
    
    inline def setDisabled(value: `false`): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setIsControlled(value: `false`): Self = StObject.set(x, "isControlled", value.asInstanceOf[js.Any])
    
    inline def setMode(value: edges): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setScrollToColumn(value: `0`): Self = StObject.set(x, "scrollToColumn", value.asInstanceOf[js.Any])
    
    inline def setScrollToRow(value: `0`): Self = StObject.set(x, "scrollToRow", value.asInstanceOf[js.Any])
  }
}
