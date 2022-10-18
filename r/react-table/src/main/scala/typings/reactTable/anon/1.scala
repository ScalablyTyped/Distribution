package typings.reactTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[D /* <: js.Object */] extends StObject {
  
  var accessor: /* import warning: importer.ImportType#apply Failed type conversion: keyof D extends never ? react-table.react-table.IdType<D> : never */ js.Any
}
object `1` {
  
  inline def apply[D /* <: js.Object */](
    accessor: /* import warning: importer.ImportType#apply Failed type conversion: keyof D extends never ? react-table.react-table.IdType<D> : never */ js.Any
  ): `1`[D] = {
    val __obj = js.Dynamic.literal(accessor = accessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[D]]
  }
  
  extension [Self <: `1`[?], D /* <: js.Object */](x: Self & `1`[D]) {
    
    inline def setAccessor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof D extends never ? react-table.react-table.IdType<D> : never */ js.Any
    ): Self = StObject.set(x, "accessor", value.asInstanceOf[js.Any])
  }
}
