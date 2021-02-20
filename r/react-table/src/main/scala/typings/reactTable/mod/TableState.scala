package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableState[D /* <: js.Object */] extends StObject {
  
  var hiddenColumns: js.UndefOr[js.Array[IdType[D]]] = js.native
}
object TableState {
  
  @scala.inline
  def apply[D /* <: js.Object */](): TableState[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableState[D]]
  }
  
  @scala.inline
  implicit class TableStateMutableBuilder[Self <: TableState[_], D /* <: js.Object */] (val x: Self with TableState[D]) extends AnyVal {
    
    @scala.inline
    def setHiddenColumns(value: js.Array[IdType[D]]): Self = StObject.set(x, "hiddenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenColumnsUndefined: Self = StObject.set(x, "hiddenColumns", js.undefined)
    
    @scala.inline
    def setHiddenColumnsVarargs(value: IdType[D]*): Self = StObject.set(x, "hiddenColumns", js.Array(value :_*))
  }
}
