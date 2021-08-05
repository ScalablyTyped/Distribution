package typings.reactNavigationCore.anon

import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8`[EventName /* <: Extract[/* keyof {} */ String, String] */] extends StObject {
  
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
  ] = js.undefined
}
object `8` {
  
  inline def apply[EventName /* <: Extract[/* keyof {} */ String, String] */](): `8`[EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`[EventName]]
  }
  
  extension [Self <: `8`[?], EventName /* <: Extract[/* keyof {} */ String, String] */](x: Self & `8`[EventName]) {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
