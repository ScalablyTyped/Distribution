package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridErrorStateChanged extends IEventArgs {
  
  var bAnyErrors: Boolean = js.native
}
object GridErrorStateChanged {
  
  @scala.inline
  def apply(bAnyErrors: Boolean): GridErrorStateChanged = {
    val __obj = js.Dynamic.literal(bAnyErrors = bAnyErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridErrorStateChanged]
  }
  
  @scala.inline
  implicit class GridErrorStateChangedOps[Self <: GridErrorStateChanged] (val x: Self) extends AnyVal {
    
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
    def setBAnyErrors(value: Boolean): Self = this.set("bAnyErrors", value.asInstanceOf[js.Any])
  }
}
