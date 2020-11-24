package typings.reactNavigationCore.anon

import typings.std.Extract
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetTypeEventName[EventName /* <: Extract[/* keyof T */ String, String] */, T /* <: Record[String, _] */] extends js.Object {
  
  var target: js.UndefOr[String] = js.native
  
  var `type`: EventName = js.native
}
object TargetTypeEventName {
  
  @scala.inline
  def apply[EventName /* <: Extract[/* keyof T */ String, String] */, T /* <: Record[String, _] */](`type`: EventName): TargetTypeEventName[EventName, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTypeEventName[EventName, T]]
  }
  
  @scala.inline
  implicit class TargetTypeEventNameOps[Self <: TargetTypeEventName[_, _], EventName /* <: Extract[/* keyof T */ String, String] */, T /* <: Record[String, _] */] (val x: Self with (TargetTypeEventName[EventName, T])) extends AnyVal {
    
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
    def setType(value: EventName): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
