package typings.reachRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryListenerParameter extends js.Object {
  
  var action: HistoryActionType = js.native
  
  var location: HistoryLocation = js.native
}
object HistoryListenerParameter {
  
  @scala.inline
  def apply(action: HistoryActionType, location: HistoryLocation): HistoryListenerParameter = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryListenerParameter]
  }
  
  @scala.inline
  implicit class HistoryListenerParameterOps[Self <: HistoryListenerParameter] (val x: Self) extends AnyVal {
    
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
    def setAction(value: HistoryActionType): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: HistoryLocation): Self = this.set("location", value.asInstanceOf[js.Any])
  }
}
