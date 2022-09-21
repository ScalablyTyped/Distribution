package typings.reactDayPicker

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationNavigationMod {
  
  @JSImport("react-day-picker/dist/components/Navigation/Navigation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Navigation(props: NavigationProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Navigation")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait NavigationProps extends StObject {
    
    /** The month where the caption is displayed. */
    var displayMonth: js.Date
    
    /** Hide the next button. */
    var hideNext: Boolean
    
    /** Hide the previous button. */
    var hidePrevious: Boolean
    
    /** The next month. */
    var nextMonth: js.UndefOr[js.Date] = js.undefined
    
    /** Event handler when the next button is clicked. */
    var onNextClick: MouseEventHandler[HTMLButtonElement]
    
    /** Event handler when the previous button is clicked. */
    var onPreviousClick: MouseEventHandler[HTMLButtonElement]
    
    /** The previous month. */
    var previousMonth: js.UndefOr[js.Date] = js.undefined
  }
  object NavigationProps {
    
    inline def apply(
      displayMonth: js.Date,
      hideNext: Boolean,
      hidePrevious: Boolean,
      onNextClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
      onPreviousClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit
    ): NavigationProps = {
      val __obj = js.Dynamic.literal(displayMonth = displayMonth.asInstanceOf[js.Any], hideNext = hideNext.asInstanceOf[js.Any], hidePrevious = hidePrevious.asInstanceOf[js.Any], onNextClick = js.Any.fromFunction1(onNextClick), onPreviousClick = js.Any.fromFunction1(onPreviousClick))
      __obj.asInstanceOf[NavigationProps]
    }
    
    extension [Self <: NavigationProps](x: Self) {
      
      inline def setDisplayMonth(value: js.Date): Self = StObject.set(x, "displayMonth", value.asInstanceOf[js.Any])
      
      inline def setHideNext(value: Boolean): Self = StObject.set(x, "hideNext", value.asInstanceOf[js.Any])
      
      inline def setHidePrevious(value: Boolean): Self = StObject.set(x, "hidePrevious", value.asInstanceOf[js.Any])
      
      inline def setNextMonth(value: js.Date): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
      
      inline def setNextMonthUndefined: Self = StObject.set(x, "nextMonth", js.undefined)
      
      inline def setOnNextClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onNextClick", js.Any.fromFunction1(value))
      
      inline def setOnPreviousClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onPreviousClick", js.Any.fromFunction1(value))
      
      inline def setPreviousMonth(value: js.Date): Self = StObject.set(x, "previousMonth", value.asInstanceOf[js.Any])
      
      inline def setPreviousMonthUndefined: Self = StObject.set(x, "previousMonth", js.undefined)
    }
  }
}
