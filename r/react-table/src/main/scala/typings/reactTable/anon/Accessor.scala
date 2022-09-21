package typings.reactTable.anon

import typings.reactTable.mod.CellValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accessor[D /* <: js.Object */] extends StObject {
  
  var accessor: js.UndefOr[typings.reactTable.mod.Accessor[D]] = js.undefined
}
object Accessor {
  
  inline def apply[D /* <: js.Object */](): Accessor[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accessor[D]]
  }
  
  extension [Self <: Accessor[?], D /* <: js.Object */](x: Self & Accessor[D]) {
    
    inline def setAccessor(value: (D, /* index */ Double, /* sub */ Data[D]) => CellValue[Any]): Self = StObject.set(x, "accessor", js.Any.fromFunction3(value))
    
    inline def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
  }
}
