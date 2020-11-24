package typings.reactNavigationCore.anon

import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeEventName[EventName /* <: Extract[/* keyof {} */ String, String] */] extends js.Object {
  
  var target: js.UndefOr[String] = js.native
  
  var `type`: EventName = js.native
}
object TypeEventName {
  
  @scala.inline
  def apply[EventName /* <: Extract[/* keyof {} */ String, String] */](`type`: EventName): TypeEventName[EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeEventName[EventName]]
  }
  
  @scala.inline
  implicit class TypeEventNameOps[Self <: TypeEventName[_], EventName /* <: Extract[/* keyof {} */ String, String] */] (val x: Self with TypeEventName[EventName]) extends AnyVal {
    
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
