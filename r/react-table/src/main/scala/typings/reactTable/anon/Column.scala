package typings.reactTable.anon

import typings.reactTable.mod.HeaderGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column[D /* <: js.Object */] extends StObject {
  
  var column: HeaderGroup[D]
}
object Column {
  
  inline def apply[D /* <: js.Object */](column: HeaderGroup[D]): Column[D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[D]]
  }
  
  extension [Self <: Column[?], D /* <: js.Object */](x: Self & Column[D]) {
    
    inline def setColumn(value: HeaderGroup[D]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
