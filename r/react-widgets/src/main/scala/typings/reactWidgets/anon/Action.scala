package typings.reactWidgets.anon

import typings.reactWidgets.reactWidgetsStrings.insert
import typings.reactWidgets.reactWidgetsStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends js.Object {
  
  var action: insert | remove = js.native
  
  var dataItem: js.Any = js.native
  
  var lastValue: js.UndefOr[js.Array[_]] = js.native
  
  var originalEvent: js.UndefOr[js.Any] = js.native
  
  var searchTerm: js.UndefOr[String] = js.native
}
object Action {
  
  @scala.inline
  def apply(action: insert | remove, dataItem: js.Any): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    
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
    def setAction(value: insert | remove): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataItem(value: js.Any): Self = this.set("dataItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastValueVarargs(value: js.Any*): Self = this.set("lastValue", js.Array(value :_*))
    
    @scala.inline
    def setLastValue(value: js.Array[_]): Self = this.set("lastValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastValue: Self = this.set("lastValue", js.undefined)
    
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
    
    @scala.inline
    def setSearchTerm(value: String): Self = this.set("searchTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchTerm: Self = this.set("searchTerm", js.undefined)
  }
}
