package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.EventMapBase
import typings.reactNavigationCore.typesMod.Keyof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`[EventMap /* <: EventMapBase */, EventName /* <: Keyof[EventMap] */] extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
}
object `7` {
  
  inline def apply[EventMap /* <: EventMapBase */, EventName /* <: Keyof[EventMap] */](
    data: /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
  ): `7`[EventMap, EventName] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`[EventMap, EventName]]
  }
  
  extension [Self <: `7`[?, ?], EventMap /* <: EventMapBase */, EventName /* <: Keyof[EventMap] */](x: Self & (`7`[EventMap, EventName])) {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
