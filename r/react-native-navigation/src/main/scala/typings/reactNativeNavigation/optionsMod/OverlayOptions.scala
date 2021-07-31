package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayOptions extends StObject {
  
  /**
    * Control wether this Overlay should handle Keyboard events.
    * Set this to true if your Overlay contains a TextInput.
    */
  var handleKeyboardEvents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Capture touches outside of the Component View
    */
  var interceptTouchOutside: js.UndefOr[Boolean] = js.undefined
}
object OverlayOptions {
  
  @scala.inline
  def apply(): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayOptions]
  }
  
  @scala.inline
  implicit class OverlayOptionsMutableBuilder[Self <: OverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleKeyboardEvents(value: Boolean): Self = StObject.set(x, "handleKeyboardEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleKeyboardEventsUndefined: Self = StObject.set(x, "handleKeyboardEvents", js.undefined)
    
    @scala.inline
    def setInterceptTouchOutside(value: Boolean): Self = StObject.set(x, "interceptTouchOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterceptTouchOutsideUndefined: Self = StObject.set(x, "interceptTouchOutside", js.undefined)
  }
}
