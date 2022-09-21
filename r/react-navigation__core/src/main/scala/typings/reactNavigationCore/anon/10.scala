package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.Keyof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10`[EventName /* <: Keyof[js.Object] */] extends StObject {
  
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
  ] = js.undefined
}
object `10` {
  
  inline def apply[EventName /* <: Keyof[js.Object] */](): `10`[EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`10`[EventName]]
  }
  
  extension [Self <: `10`[?], EventName /* <: Keyof[js.Object] */](x: Self & `10`[EventName]) {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
