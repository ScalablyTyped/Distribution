package typings.reactTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Row[D /* <: js.Object */] extends StObject {
  
  var row: typings.reactTable.mod.Row[D] = js.native
}
object Row {
  
  @scala.inline
  def apply[D /* <: js.Object */](row: typings.reactTable.mod.Row[D]): Row[D] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row[D]]
  }
  
  @scala.inline
  implicit class RowMutableBuilder[Self <: Row[_], D /* <: js.Object */] (val x: Self with Row[D]) extends AnyVal {
    
    @scala.inline
    def setRow(value: typings.reactTable.mod.Row[D]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
