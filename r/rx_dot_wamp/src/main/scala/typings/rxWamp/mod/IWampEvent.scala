package typings.rxWamp.mod

import typings.autobahn.mod.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWampEvent extends js.Object {
  
  var args: js.UndefOr[js.Array[_]] = js.native
  
  var details: js.UndefOr[IEvent] = js.native
  
  var kwargs: js.UndefOr[js.Any] = js.native
}
object IWampEvent {
  
  @scala.inline
  def apply(): IWampEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWampEvent]
  }
  
  @scala.inline
  implicit class IWampEventOps[Self <: IWampEvent] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setDetails(value: IEvent): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setKwargs(value: js.Any): Self = this.set("kwargs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKwargs: Self = this.set("kwargs", js.undefined)
  }
}
