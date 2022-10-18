package typings.reactTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[D /* <: js.Object */] extends StObject {
  
  var accessor: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof D extends never ? react-table.react-table.IdType<D> | react-table.react-table.Accessor<D> : react-table.react-table.Accessor<D> */ js.Any
  ] = js.undefined
}
object `0` {
  
  inline def apply[D /* <: js.Object */](): `0`[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[D]]
  }
  
  extension [Self <: `0`[?], D /* <: js.Object */](x: Self & `0`[D]) {
    
    inline def setAccessor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof D extends never ? react-table.react-table.IdType<D> | react-table.react-table.Accessor<D> : react-table.react-table.Accessor<D> */ js.Any
    ): Self = StObject.set(x, "accessor", value.asInstanceOf[js.Any])
    
    inline def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
  }
}
