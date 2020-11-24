package typings.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewInformationRequestor extends js.Object {
  
  def onViewInformationReturned(viewGroups: ViewSelectorGroups): Unit = js.native
}
object ViewInformationRequestor {
  
  @scala.inline
  def apply(onViewInformationReturned: ViewSelectorGroups => Unit): ViewInformationRequestor = {
    val __obj = js.Dynamic.literal(onViewInformationReturned = js.Any.fromFunction1(onViewInformationReturned))
    __obj.asInstanceOf[ViewInformationRequestor]
  }
  
  @scala.inline
  implicit class ViewInformationRequestorOps[Self <: ViewInformationRequestor] (val x: Self) extends AnyVal {
    
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
    def setOnViewInformationReturned(value: ViewSelectorGroups => Unit): Self = this.set("onViewInformationReturned", js.Any.fromFunction1(value))
  }
}
