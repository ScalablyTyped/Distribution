package typings.reactNavigationCore.anon

import typings.std.Extract
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `10`[T /* <: Record[String, _] */, EventName /* <: Extract[/* keyof T */ String, String] */] extends StObject {
  
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['data'] */ js.Any
  ] = js.native
}
object `10` {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */, EventName /* <: Extract[/* keyof T */ String, String] */](): `10`[T, EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`10`[T, EventName]]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`[_, _], T /* <: Record[String, _] */, EventName /* <: Extract[/* keyof T */ String, String] */] (val x: Self with (`10`[T, EventName])) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['data'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
