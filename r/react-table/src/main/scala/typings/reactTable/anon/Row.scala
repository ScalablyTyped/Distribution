package typings.reactTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row[D /* <: js.Object */] extends StObject {
  
  var row: typings.reactTable.mod.Row[D]
}
object Row {
  
  inline def apply[D /* <: js.Object */](row: typings.reactTable.mod.Row[D]): Row[D] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Row[?], D /* <: js.Object */] (val x: Self & Row[D]) extends AnyVal {
    
    inline def setRow(value: typings.reactTable.mod.Row[D]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
