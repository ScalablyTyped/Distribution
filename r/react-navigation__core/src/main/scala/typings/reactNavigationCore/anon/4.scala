package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.EventMapBase
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[EventMap /* <: EventMapBase */, EventName /* <: Extract[/* keyof EventMap */ String, String] */] extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
}
object `4` {
  
  @scala.inline
  def apply[EventMap /* <: EventMapBase */, EventName /* <: Extract[/* keyof EventMap */ String, String] */](
    data: /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
  ): `4`[EventMap, EventName] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`[EventMap, EventName]]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`[?, ?], EventMap /* <: EventMapBase */, EventName /* <: Extract[/* keyof EventMap */ String, String] */] (val x: Self & (`4`[EventMap, EventName])) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
