package typings.reactNavigationCore.anon

import typings.std.Extract
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `11`[T /* <: Record[String, _] */, EventName /* <: Extract[/* keyof T */ String, String] */] extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['data'] */ js.Any = js.native
}
object `11` {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */, EventName /* <: Extract[/* keyof T */ String, String] */](
    data: /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['data'] */ js.Any
  ): `11`[T, EventName] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`[T, EventName]]
  }
  
  @scala.inline
  implicit class `11MutableBuilder`[Self <: `11`[_, _], T /* <: Record[String, _] */, EventName /* <: Extract[/* keyof T */ String, String] */] (val x: Self with (`11`[T, EventName])) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['data'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
