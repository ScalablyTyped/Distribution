package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnInterfaceBasedOnValue[D /* <: js.Object */, V] extends StObject {
  
  var Cell: js.UndefOr[Renderer[CellProps[D, V]]] = js.undefined
}
object ColumnInterfaceBasedOnValue {
  
  @scala.inline
  def apply[D /* <: js.Object */, V](): ColumnInterfaceBasedOnValue[D, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnInterfaceBasedOnValue[D, V]]
  }
  
  @scala.inline
  implicit class ColumnInterfaceBasedOnValueMutableBuilder[Self <: ColumnInterfaceBasedOnValue[?, ?], D /* <: js.Object */, V] (val x: Self & (ColumnInterfaceBasedOnValue[D, V])) extends AnyVal {
    
    @scala.inline
    def setCell(value: Renderer[CellProps[D, V]]): Self = StObject.set(x, "Cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "Cell", js.undefined)
  }
}
