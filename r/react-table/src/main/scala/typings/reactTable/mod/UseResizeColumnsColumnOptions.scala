package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseResizeColumnsColumnOptions[D /* <: js.Object */] extends StObject {
  
  var disableResizing: js.UndefOr[Boolean] = js.undefined
}
object UseResizeColumnsColumnOptions {
  
  inline def apply[D /* <: js.Object */](): UseResizeColumnsColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseResizeColumnsColumnOptions[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseResizeColumnsColumnOptions[?], D /* <: js.Object */] (val x: Self & UseResizeColumnsColumnOptions[D]) extends AnyVal {
    
    inline def setDisableResizing(value: Boolean): Self = StObject.set(x, "disableResizing", value.asInstanceOf[js.Any])
    
    inline def setDisableResizingUndefined: Self = StObject.set(x, "disableResizing", js.undefined)
  }
}
