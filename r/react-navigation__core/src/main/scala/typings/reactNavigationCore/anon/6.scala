package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.EventMapBase
import typings.reactNavigationCore.typesMod.Keyof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`[EventMap /* <: EventMapBase */, EventName /* <: Keyof[EventMap] */] extends StObject {
  
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
  ] = js.undefined
}
object `6` {
  
  inline def apply[EventMap /* <: EventMapBase */, EventName /* <: Keyof[EventMap] */](): `6`[EventMap, EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`[EventMap, EventName]]
  }
  
  extension [Self <: `6`[?, ?], EventMap /* <: EventMapBase */, EventName /* <: Keyof[EventMap] */](x: Self & (`6`[EventMap, EventName])) {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
