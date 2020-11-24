package typings.reactNavigationCore.anon

import typings.std.Extract
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `11`[T /* <: Record[String, _] */, EventName /* <: Extract[/* keyof T */ String, String] */] extends js.Object {
  
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
  implicit class `11Ops`[Self <: `11`[_, _], T /* <: Record[String, _] */, EventName /* <: Extract[/* keyof T */ String, String] */] (val x: Self with (`11`[T, EventName])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['data'] */ js.Any
    ): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
