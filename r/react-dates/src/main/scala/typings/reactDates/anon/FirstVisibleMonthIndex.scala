package typings.reactDates.anon

import typings.moment.mod.Moment
import typings.react.mod.TransitionEvent
import typings.reactDates.mod.ModifiersShape
import typings.reactDates.mod.ScrollableOrientationShape
import typings.std.HTMLDivElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstVisibleMonthIndex extends StObject {
  
  var firstVisibleMonthIndex: js.UndefOr[Double] = js.undefined
  
  var initialMonth: js.UndefOr[Moment] = js.undefined
  
  var isAnimating: js.UndefOr[Boolean] = js.undefined
  
  var isRTL: js.UndefOr[Boolean] = js.undefined
  
  var modifiers: js.UndefOr[Record[String, Record[String, ModifiersShape]]] = js.undefined
  
  var numberOfMonths: js.UndefOr[Double] = js.undefined
  
  var onMonthChange: js.UndefOr[js.Function1[/* newMonth */ Moment, Unit]] = js.undefined
  
  var onMonthTransitionEnd: js.UndefOr[js.Function1[/* event */ js.UndefOr[TransitionEvent[HTMLDivElement]], Unit]] = js.undefined
  
  var onYearChange: js.UndefOr[js.Function1[/* newMonth */ Moment, Unit]] = js.undefined
  
  var orientation: js.UndefOr[ScrollableOrientationShape] = js.undefined
  
  var transitionDuration: js.UndefOr[Double] = js.undefined
  
  var translationValue: js.UndefOr[Double | Null] = js.undefined
}
object FirstVisibleMonthIndex {
  
  inline def apply(): FirstVisibleMonthIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstVisibleMonthIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstVisibleMonthIndex] (val x: Self) extends AnyVal {
    
    inline def setFirstVisibleMonthIndex(value: Double): Self = StObject.set(x, "firstVisibleMonthIndex", value.asInstanceOf[js.Any])
    
    inline def setFirstVisibleMonthIndexUndefined: Self = StObject.set(x, "firstVisibleMonthIndex", js.undefined)
    
    inline def setInitialMonth(value: Moment): Self = StObject.set(x, "initialMonth", value.asInstanceOf[js.Any])
    
    inline def setInitialMonthUndefined: Self = StObject.set(x, "initialMonth", js.undefined)
    
    inline def setIsAnimating(value: Boolean): Self = StObject.set(x, "isAnimating", value.asInstanceOf[js.Any])
    
    inline def setIsAnimatingUndefined: Self = StObject.set(x, "isAnimating", js.undefined)
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
    
    inline def setModifiers(value: Record[String, Record[String, ModifiersShape]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
    
    inline def setOnMonthChange(value: /* newMonth */ Moment => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
    
    inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
    
    inline def setOnMonthTransitionEnd(value: /* event */ js.UndefOr[TransitionEvent[HTMLDivElement]] => Unit): Self = StObject.set(x, "onMonthTransitionEnd", js.Any.fromFunction1(value))
    
    inline def setOnMonthTransitionEndUndefined: Self = StObject.set(x, "onMonthTransitionEnd", js.undefined)
    
    inline def setOnYearChange(value: /* newMonth */ Moment => Unit): Self = StObject.set(x, "onYearChange", js.Any.fromFunction1(value))
    
    inline def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
    
    inline def setOrientation(value: ScrollableOrientationShape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    inline def setTranslationValue(value: Double): Self = StObject.set(x, "translationValue", value.asInstanceOf[js.Any])
    
    inline def setTranslationValueNull: Self = StObject.set(x, "translationValue", null)
    
    inline def setTranslationValueUndefined: Self = StObject.set(x, "translationValue", js.undefined)
  }
}
