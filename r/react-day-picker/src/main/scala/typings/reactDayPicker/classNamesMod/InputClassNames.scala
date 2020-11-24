package typings.reactDayPicker.classNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputClassNames extends js.Object {
  
  var container: String = js.native
  
  var overlay: String = js.native
  
  var overlayWrapper: String = js.native
}
object InputClassNames {
  
  @scala.inline
  def apply(container: String, overlay: String, overlayWrapper: String): InputClassNames = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], overlayWrapper = overlayWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputClassNames]
  }
  
  @scala.inline
  implicit class InputClassNamesOps[Self <: InputClassNames] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlay(value: String): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayWrapper(value: String): Self = this.set("overlayWrapper", value.asInstanceOf[js.Any])
  }
}
