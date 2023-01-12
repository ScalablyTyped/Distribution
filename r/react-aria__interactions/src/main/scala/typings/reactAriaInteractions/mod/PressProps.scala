package typings.reactAriaInteractions.mod

import typings.reactTypesShared.srcEventsMod.PressEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressProps
  extends StObject
     with PressEvents {
  
  /** Whether text selection should be enabled on the pressable element. */
  var allowTextSelectionOnPress: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the press events should be disabled. */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the target is in a controlled press state (e.g. an overlay it triggers is open). */
  var isPressed: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the target should not receive focus on press. */
  var preventFocusOnPress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether press events should be canceled when the pointer leaves the target while pressed.
    * By default, this is `false`, which means if the pointer returns back over the target while
    * still pressed, onPressStart will be fired again. If set to `true`, the press is canceled
    * when the pointer leaves the target and onPressStart will not be fired if the pointer returns.
    */
  var shouldCancelOnPointerExit: js.UndefOr[Boolean] = js.undefined
}
object PressProps {
  
  inline def apply(): PressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PressProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PressProps] (val x: Self) extends AnyVal {
    
    inline def setAllowTextSelectionOnPress(value: Boolean): Self = StObject.set(x, "allowTextSelectionOnPress", value.asInstanceOf[js.Any])
    
    inline def setAllowTextSelectionOnPressUndefined: Self = StObject.set(x, "allowTextSelectionOnPress", js.undefined)
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    inline def setIsPressed(value: Boolean): Self = StObject.set(x, "isPressed", value.asInstanceOf[js.Any])
    
    inline def setIsPressedUndefined: Self = StObject.set(x, "isPressed", js.undefined)
    
    inline def setPreventFocusOnPress(value: Boolean): Self = StObject.set(x, "preventFocusOnPress", value.asInstanceOf[js.Any])
    
    inline def setPreventFocusOnPressUndefined: Self = StObject.set(x, "preventFocusOnPress", js.undefined)
    
    inline def setShouldCancelOnPointerExit(value: Boolean): Self = StObject.set(x, "shouldCancelOnPointerExit", value.asInstanceOf[js.Any])
    
    inline def setShouldCancelOnPointerExitUndefined: Self = StObject.set(x, "shouldCancelOnPointerExit", js.undefined)
  }
}
