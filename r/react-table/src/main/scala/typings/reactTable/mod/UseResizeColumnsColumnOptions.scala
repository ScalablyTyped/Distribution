package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseResizeColumnsColumnOptions[D /* <: js.Object */] extends StObject {
  
  var disableResizing: js.UndefOr[Boolean] = js.native
}
object UseResizeColumnsColumnOptions {
  
  @scala.inline
  def apply[D /* <: js.Object */](): UseResizeColumnsColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseResizeColumnsColumnOptions[D]]
  }
  
  @scala.inline
  implicit class UseResizeColumnsColumnOptionsMutableBuilder[Self <: UseResizeColumnsColumnOptions[_], D /* <: js.Object */] (val x: Self with UseResizeColumnsColumnOptions[D]) extends AnyVal {
    
    @scala.inline
    def setDisableResizing(value: Boolean): Self = StObject.set(x, "disableResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableResizingUndefined: Self = StObject.set(x, "disableResizing", js.undefined)
  }
}
