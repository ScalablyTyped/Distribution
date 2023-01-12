package typings.reactDayPicker.distIndexDotesmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the {@link FocusContext}. */
trait FocusContextValue extends StObject {
  
  /** Blur the focused day. */
  def blur(): Unit
  
  /** Focus a day. */
  def focus(day: js.Date): Unit
  
  /** Focus the day after the focused day. */
  def focusDayAfter(): Unit
  
  /** Focus the day before the focused day. */
  def focusDayBefore(): Unit
  
  /* Focus the day at the end of the week of focused day. */
  def focusEndOfWeek(): Unit
  
  /* Focus the day in the month after the focused day. */
  def focusMonthAfter(): Unit
  
  /* Focus the day in the month before the focused day. */
  def focusMonthBefore(): Unit
  
  /* Focus the day at the start of the week of the focused day. */
  def focusStartOfWeek(): Unit
  
  /** Day that will be focused.  */
  var focusTarget: js.UndefOr[js.Date] = js.undefined
  
  /** Focus the day in the week after the focused day. */
  def focusWeekAfter(): Unit
  
  /** Focus the day in the week before the focused day. */
  def focusWeekBefore(): Unit
  
  /* Focus the day in the year after the focused day. */
  def focusYearAfter(): Unit
  
  /* Focus the day in the year before the focused day. */
  def focusYearBefore(): Unit
  
  /** The day currently focused. */
  var focusedDay: js.UndefOr[js.Date] = js.undefined
}
object FocusContextValue {
  
  inline def apply(
    blur: () => Unit,
    focus: js.Date => Unit,
    focusDayAfter: () => Unit,
    focusDayBefore: () => Unit,
    focusEndOfWeek: () => Unit,
    focusMonthAfter: () => Unit,
    focusMonthBefore: () => Unit,
    focusStartOfWeek: () => Unit,
    focusWeekAfter: () => Unit,
    focusWeekBefore: () => Unit,
    focusYearAfter: () => Unit,
    focusYearBefore: () => Unit
  ): FocusContextValue = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction1(focus), focusDayAfter = js.Any.fromFunction0(focusDayAfter), focusDayBefore = js.Any.fromFunction0(focusDayBefore), focusEndOfWeek = js.Any.fromFunction0(focusEndOfWeek), focusMonthAfter = js.Any.fromFunction0(focusMonthAfter), focusMonthBefore = js.Any.fromFunction0(focusMonthBefore), focusStartOfWeek = js.Any.fromFunction0(focusStartOfWeek), focusWeekAfter = js.Any.fromFunction0(focusWeekAfter), focusWeekBefore = js.Any.fromFunction0(focusWeekBefore), focusYearAfter = js.Any.fromFunction0(focusYearAfter), focusYearBefore = js.Any.fromFunction0(focusYearBefore))
    __obj.asInstanceOf[FocusContextValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusContextValue] (val x: Self) extends AnyVal {
    
    inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    inline def setFocus(value: js.Date => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
    
    inline def setFocusDayAfter(value: () => Unit): Self = StObject.set(x, "focusDayAfter", js.Any.fromFunction0(value))
    
    inline def setFocusDayBefore(value: () => Unit): Self = StObject.set(x, "focusDayBefore", js.Any.fromFunction0(value))
    
    inline def setFocusEndOfWeek(value: () => Unit): Self = StObject.set(x, "focusEndOfWeek", js.Any.fromFunction0(value))
    
    inline def setFocusMonthAfter(value: () => Unit): Self = StObject.set(x, "focusMonthAfter", js.Any.fromFunction0(value))
    
    inline def setFocusMonthBefore(value: () => Unit): Self = StObject.set(x, "focusMonthBefore", js.Any.fromFunction0(value))
    
    inline def setFocusStartOfWeek(value: () => Unit): Self = StObject.set(x, "focusStartOfWeek", js.Any.fromFunction0(value))
    
    inline def setFocusTarget(value: js.Date): Self = StObject.set(x, "focusTarget", value.asInstanceOf[js.Any])
    
    inline def setFocusTargetUndefined: Self = StObject.set(x, "focusTarget", js.undefined)
    
    inline def setFocusWeekAfter(value: () => Unit): Self = StObject.set(x, "focusWeekAfter", js.Any.fromFunction0(value))
    
    inline def setFocusWeekBefore(value: () => Unit): Self = StObject.set(x, "focusWeekBefore", js.Any.fromFunction0(value))
    
    inline def setFocusYearAfter(value: () => Unit): Self = StObject.set(x, "focusYearAfter", js.Any.fromFunction0(value))
    
    inline def setFocusYearBefore(value: () => Unit): Self = StObject.set(x, "focusYearBefore", js.Any.fromFunction0(value))
    
    inline def setFocusedDay(value: js.Date): Self = StObject.set(x, "focusedDay", value.asInstanceOf[js.Any])
    
    inline def setFocusedDayUndefined: Self = StObject.set(x, "focusedDay", js.undefined)
  }
}
