package typings.reactDayPicker

import typings.react.mod.RefObject
import typings.reactDayPicker.anon.StyledComponentPickButton
import typings.reactDayPicker.stylesMod.StyledComponent
import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import typings.reactDayPicker.useSelectedDaysUseSelectedDaysMod.SelectedDays
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDayRenderUseDayRenderMod {
  
  @JSImport("react-day-picker/dist/hooks/useDayRender/useDayRender", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDayRender(
    /** The date to render. */
  day: js.Date,
    /** The month where the date is displayed (if not the same as `date`, it means it is an "outside" day). */
  displayMonth: js.Date,
    /** A ref to the button element that will be target of focus when rendered (if required). */
  buttonRef: RefObject[HTMLButtonElement]
  ): DayRender = (^.asInstanceOf[js.Dynamic].applyDynamic("useDayRender")(day.asInstanceOf[js.Any], displayMonth.asInstanceOf[js.Any], buttonRef.asInstanceOf[js.Any])).asInstanceOf[DayRender]
  
  trait DayRender extends StObject {
    
    /** The modifiers active for the given day. */
    var activeModifiers: ActiveModifiers
    
    /** The props to apply to the button element (when `isButton` is true). */
    var buttonProps: StyledComponentPickButton
    
    /** The props to apply to the div element (when `isButton` is false). */
    var divProps: StyledComponent
    
    /** Whether the day should be rendered a `button` instead of a `div` */
    var isButton: Boolean
    
    /** Whether the day should be hidden. */
    var isHidden: Boolean
    
    var selectedDays: SelectedDays
  }
  object DayRender {
    
    inline def apply(
      activeModifiers: ActiveModifiers,
      buttonProps: StyledComponentPickButton,
      divProps: StyledComponent,
      isButton: Boolean,
      isHidden: Boolean
    ): DayRender = {
      val __obj = js.Dynamic.literal(activeModifiers = activeModifiers.asInstanceOf[js.Any], buttonProps = buttonProps.asInstanceOf[js.Any], divProps = divProps.asInstanceOf[js.Any], isButton = isButton.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[DayRender]
    }
    
    extension [Self <: DayRender](x: Self) {
      
      inline def setActiveModifiers(value: ActiveModifiers): Self = StObject.set(x, "activeModifiers", value.asInstanceOf[js.Any])
      
      inline def setButtonProps(value: StyledComponentPickButton): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      inline def setDivProps(value: StyledComponent): Self = StObject.set(x, "divProps", value.asInstanceOf[js.Any])
      
      inline def setIsButton(value: Boolean): Self = StObject.set(x, "isButton", value.asInstanceOf[js.Any])
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setSelectedDays(value: SelectedDays): Self = StObject.set(x, "selectedDays", value.asInstanceOf[js.Any])
      
      inline def setSelectedDaysUndefined: Self = StObject.set(x, "selectedDays", js.undefined)
      
      inline def setSelectedDaysVarargs(value: js.Date*): Self = StObject.set(x, "selectedDays", js.Array(value*))
    }
  }
}
