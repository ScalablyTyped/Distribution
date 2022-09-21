package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.Keyof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11`[EventName /* <: Keyof[js.Object] */] extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
}
object `11` {
  
  inline def apply[EventName /* <: Keyof[js.Object] */](
    data: /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
  ): `11`[EventName] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`[EventName]]
  }
  
  extension [Self <: `11`[?], EventName /* <: Keyof[js.Object] */](x: Self & `11`[EventName]) {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
