package typings.reactFrameComponent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameContextProps extends js.Object {
  
  var document: js.UndefOr[js.Any] = js.native
  
  var window: js.UndefOr[js.Any] = js.native
}
object FrameContextProps {
  
  @scala.inline
  def apply(): FrameContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameContextProps]
  }
  
  @scala.inline
  implicit class FrameContextPropsOps[Self <: FrameContextProps] (val x: Self) extends AnyVal {
    
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
    def setDocument(value: js.Any): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    
    @scala.inline
    def setWindow(value: js.Any): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
}
