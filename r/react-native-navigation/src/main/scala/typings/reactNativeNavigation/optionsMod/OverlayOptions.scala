package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayOptions extends js.Object {
  
  /**
    * Control wether this Overlay should handle Keyboard events.
    * Set this to true if your Overlay contains a TextInput.
    */
  var handleKeyboardEvents: js.UndefOr[Boolean] = js.native
  
  /**
    * Capture touches outside of the Component View
    */
  var interceptTouchOutside: js.UndefOr[Boolean] = js.native
}
object OverlayOptions {
  
  @scala.inline
  def apply(): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayOptions]
  }
  
  @scala.inline
  implicit class OverlayOptionsOps[Self <: OverlayOptions] (val x: Self) extends AnyVal {
    
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
    def setHandleKeyboardEvents(value: Boolean): Self = this.set("handleKeyboardEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleKeyboardEvents: Self = this.set("handleKeyboardEvents", js.undefined)
    
    @scala.inline
    def setInterceptTouchOutside(value: Boolean): Self = this.set("interceptTouchOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterceptTouchOutside: Self = this.set("interceptTouchOutside", js.undefined)
  }
}
