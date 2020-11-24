package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewStateChangeInfo extends js.Object {
  
  var viewState: ViewportProps = js.native
}
object ViewStateChangeInfo {
  
  @scala.inline
  def apply(viewState: ViewportProps): ViewStateChangeInfo = {
    val __obj = js.Dynamic.literal(viewState = viewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewStateChangeInfo]
  }
  
  @scala.inline
  implicit class ViewStateChangeInfoOps[Self <: ViewStateChangeInfo] (val x: Self) extends AnyVal {
    
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
    def setViewState(value: ViewportProps): Self = this.set("viewState", value.asInstanceOf[js.Any])
  }
}
