package typings.reactTable.anon

import typings.reactTable.mod.HeaderGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column[D /* <: js.Object */] extends StObject {
  
  var column: HeaderGroup[D] = js.native
}
object Column {
  
  @scala.inline
  def apply[D /* <: js.Object */](column: HeaderGroup[D]): Column[D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[D]]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column[_], D /* <: js.Object */] (val x: Self with Column[D]) extends AnyVal {
    
    @scala.inline
    def setColumn(value: HeaderGroup[D]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
