package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnGroupInterface[D /* <: js.Object */] extends StObject {
  
  var columns: js.Array[Column[D]] = js.native
}
object ColumnGroupInterface {
  
  @scala.inline
  def apply[D /* <: js.Object */](columns: js.Array[Column[D]]): ColumnGroupInterface[D] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupInterface[D]]
  }
  
  @scala.inline
  implicit class ColumnGroupInterfaceMutableBuilder[Self <: ColumnGroupInterface[_], D /* <: js.Object */] (val x: Self with ColumnGroupInterface[D]) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[Column[D]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: Column[D]*): Self = StObject.set(x, "columns", js.Array(value :_*))
  }
}
