package typings.reactNativeCalendars.mod

import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageURISource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandableCalendarProps
  extends StObject
     with CalendarListBaseProps {
  
  /**
    * whether to have shadow/elevation for the calendar
    */
  var allowShadow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * a threshold for closing the calendar with the pan gesture
    */
  var closeThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * an option to disable the pan gesture and disable the opening and closing of the calendar (initialPosition will persist)
    */
  var disablePan: js.UndefOr[Boolean] = js.undefined
  
  /**
    * whether to disable the week scroll in closed position
    */
  var disableWeekScroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * whether to hide the knob
    */
  var hideKnob: js.UndefOr[Boolean] = js.undefined
  
  /**
    * the initial position of the calendar ('open' or 'closed')
    */
  var initialPosition: js.UndefOr[Positions] = js.undefined
  
  /**
    * source for the left arrow image
    */
  var leftArrowImageSource: js.UndefOr[ImageSourcePropType] = js.undefined
  
  /**
    * callback that fires when the calendar is opened or closed
    */
  var onCalendarToggled: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
  
  /**
    * a threshold for opening the calendar with the pan gesture
    */
  var openThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * source for the right arrow image
    */
  var rightArrowImageSource: js.UndefOr[ImageSourcePropType] = js.undefined
}
object ExpandableCalendarProps {
  
  inline def apply(): ExpandableCalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandableCalendarProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpandableCalendarProps] (val x: Self) extends AnyVal {
    
    inline def setAllowShadow(value: Boolean): Self = StObject.set(x, "allowShadow", value.asInstanceOf[js.Any])
    
    inline def setAllowShadowUndefined: Self = StObject.set(x, "allowShadow", js.undefined)
    
    inline def setCloseThreshold(value: Double): Self = StObject.set(x, "closeThreshold", value.asInstanceOf[js.Any])
    
    inline def setCloseThresholdUndefined: Self = StObject.set(x, "closeThreshold", js.undefined)
    
    inline def setDisablePan(value: Boolean): Self = StObject.set(x, "disablePan", value.asInstanceOf[js.Any])
    
    inline def setDisablePanUndefined: Self = StObject.set(x, "disablePan", js.undefined)
    
    inline def setDisableWeekScroll(value: Boolean): Self = StObject.set(x, "disableWeekScroll", value.asInstanceOf[js.Any])
    
    inline def setDisableWeekScrollUndefined: Self = StObject.set(x, "disableWeekScroll", js.undefined)
    
    inline def setHideKnob(value: Boolean): Self = StObject.set(x, "hideKnob", value.asInstanceOf[js.Any])
    
    inline def setHideKnobUndefined: Self = StObject.set(x, "hideKnob", js.undefined)
    
    inline def setInitialPosition(value: Positions): Self = StObject.set(x, "initialPosition", value.asInstanceOf[js.Any])
    
    inline def setInitialPositionUndefined: Self = StObject.set(x, "initialPosition", js.undefined)
    
    inline def setLeftArrowImageSource(value: ImageSourcePropType): Self = StObject.set(x, "leftArrowImageSource", value.asInstanceOf[js.Any])
    
    inline def setLeftArrowImageSourceUndefined: Self = StObject.set(x, "leftArrowImageSource", js.undefined)
    
    inline def setLeftArrowImageSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "leftArrowImageSource", js.Array(value*))
    
    inline def setOnCalendarToggled(value: /* isOpen */ Boolean => Unit): Self = StObject.set(x, "onCalendarToggled", js.Any.fromFunction1(value))
    
    inline def setOnCalendarToggledUndefined: Self = StObject.set(x, "onCalendarToggled", js.undefined)
    
    inline def setOpenThreshold(value: Double): Self = StObject.set(x, "openThreshold", value.asInstanceOf[js.Any])
    
    inline def setOpenThresholdUndefined: Self = StObject.set(x, "openThreshold", js.undefined)
    
    inline def setRightArrowImageSource(value: ImageSourcePropType): Self = StObject.set(x, "rightArrowImageSource", value.asInstanceOf[js.Any])
    
    inline def setRightArrowImageSourceUndefined: Self = StObject.set(x, "rightArrowImageSource", js.undefined)
    
    inline def setRightArrowImageSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "rightArrowImageSource", js.Array(value*))
  }
}
