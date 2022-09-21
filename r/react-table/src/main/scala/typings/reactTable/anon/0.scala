package typings.reactTable.anon

import typings.reactTable.mod.CellValue
import typings.reactTable.mod.IdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[D /* <: js.Object */] extends StObject {
  
  var accessor: js.UndefOr[typings.reactTable.mod.Accessor[D] | IdType[D]] = js.undefined
}
object `0` {
  
  inline def apply[D /* <: js.Object */](): `0`[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[D]]
  }
  
  extension [Self <: `0`[?], D /* <: js.Object */](x: Self & `0`[D]) {
    
    inline def setAccessor(value: typings.reactTable.mod.Accessor[D] | IdType[D]): Self = StObject.set(x, "accessor", value.asInstanceOf[js.Any])
    
    inline def setAccessorFunction3(value: (D, /* index */ Double, /* sub */ Data[D]) => CellValue[Any]): Self = StObject.set(x, "accessor", js.Any.fromFunction3(value))
    
    inline def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
  }
}
