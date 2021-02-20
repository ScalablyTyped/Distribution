package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnInterfaceBasedOnValue[D /* <: js.Object */, V] extends StObject {
  
  var Cell: js.UndefOr[Renderer[CellProps[D, V]]] = js.native
}
object ColumnInterfaceBasedOnValue {
  
  @scala.inline
  def apply[D /* <: js.Object */, V](): ColumnInterfaceBasedOnValue[D, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnInterfaceBasedOnValue[D, V]]
  }
  
  @scala.inline
  implicit class ColumnInterfaceBasedOnValueMutableBuilder[Self <: ColumnInterfaceBasedOnValue[_, _], D /* <: js.Object */, V] (val x: Self with (ColumnInterfaceBasedOnValue[D, V])) extends AnyVal {
    
    @scala.inline
    def setCell(value: Renderer[CellProps[D, V]]): Self = StObject.set(x, "Cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "Cell", js.undefined)
  }
}
