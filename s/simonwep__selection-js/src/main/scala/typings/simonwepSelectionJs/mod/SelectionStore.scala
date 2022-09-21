package typings.simonwepSelectionJs.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionStore extends StObject {
  
  var changed: ChangedElements
  
  var selected: js.Array[Element]
  
  var stored: js.Array[Element]
  
  var touched: js.Array[Element]
}
object SelectionStore {
  
  inline def apply(
    changed: ChangedElements,
    selected: js.Array[Element],
    stored: js.Array[Element],
    touched: js.Array[Element]
  ): SelectionStore = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionStore]
  }
  
  extension [Self <: SelectionStore](x: Self) {
    
    inline def setChanged(value: ChangedElements): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: js.Array[Element]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedVarargs(value: Element*): Self = StObject.set(x, "selected", js.Array(value*))
    
    inline def setStored(value: js.Array[Element]): Self = StObject.set(x, "stored", value.asInstanceOf[js.Any])
    
    inline def setStoredVarargs(value: Element*): Self = StObject.set(x, "stored", js.Array(value*))
    
    inline def setTouched(value: js.Array[Element]): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    inline def setTouchedVarargs(value: Element*): Self = StObject.set(x, "touched", js.Array(value*))
  }
}
