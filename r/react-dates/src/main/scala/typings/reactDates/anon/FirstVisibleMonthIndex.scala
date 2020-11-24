package typings.reactDates.anon

import typings.moment.mod.Moment
import typings.react.mod.TransitionEvent
import typings.reactDates.mod.ModifiersShape
import typings.reactDates.mod.ScrollableOrientationShape
import typings.std.HTMLDivElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstVisibleMonthIndex extends js.Object {
  
  var firstVisibleMonthIndex: js.UndefOr[Double] = js.native
  
  var initialMonth: js.UndefOr[Moment] = js.native
  
  var isAnimating: js.UndefOr[Boolean] = js.native
  
  var isRTL: js.UndefOr[Boolean] = js.native
  
  var modifiers: js.UndefOr[Record[String, Record[String, ModifiersShape]]] = js.native
  
  var numberOfMonths: js.UndefOr[Double] = js.native
  
  var onMonthChange: js.UndefOr[js.Function1[/* newMonth */ Moment, Unit]] = js.native
  
  var onMonthTransitionEnd: js.UndefOr[js.Function1[/* event */ js.UndefOr[TransitionEvent[HTMLDivElement]], Unit]] = js.native
  
  var onYearChange: js.UndefOr[js.Function1[/* newMonth */ Moment, Unit]] = js.native
  
  var orientation: js.UndefOr[ScrollableOrientationShape] = js.native
  
  var transitionDuration: js.UndefOr[Double] = js.native
  
  var translationValue: js.UndefOr[Double | Null] = js.native
}
object FirstVisibleMonthIndex {
  
  @scala.inline
  def apply(): FirstVisibleMonthIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstVisibleMonthIndex]
  }
  
  @scala.inline
  implicit class FirstVisibleMonthIndexOps[Self <: FirstVisibleMonthIndex] (val x: Self) extends AnyVal {
    
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
    def setFirstVisibleMonthIndex(value: Double): Self = this.set("firstVisibleMonthIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstVisibleMonthIndex: Self = this.set("firstVisibleMonthIndex", js.undefined)
    
    @scala.inline
    def setInitialMonth(value: Moment): Self = this.set("initialMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialMonth: Self = this.set("initialMonth", js.undefined)
    
    @scala.inline
    def setIsAnimating(value: Boolean): Self = this.set("isAnimating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAnimating: Self = this.set("isAnimating", js.undefined)
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setModifiers(value: Record[String, Record[String, ModifiersShape]]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    
    @scala.inline
    def setNumberOfMonths(value: Double): Self = this.set("numberOfMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfMonths: Self = this.set("numberOfMonths", js.undefined)
    
    @scala.inline
    def setOnMonthChange(value: /* newMonth */ Moment => Unit): Self = this.set("onMonthChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMonthChange: Self = this.set("onMonthChange", js.undefined)
    
    @scala.inline
    def setOnMonthTransitionEnd(value: /* event */ js.UndefOr[TransitionEvent[HTMLDivElement]] => Unit): Self = this.set("onMonthTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMonthTransitionEnd: Self = this.set("onMonthTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnYearChange(value: /* newMonth */ Moment => Unit): Self = this.set("onYearChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnYearChange: Self = this.set("onYearChange", js.undefined)
    
    @scala.inline
    def setOrientation(value: ScrollableOrientationShape): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
    @scala.inline
    def setTranslationValue(value: Double): Self = this.set("translationValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslationValue: Self = this.set("translationValue", js.undefined)
    
    @scala.inline
    def setTranslationValueNull: Self = this.set("translationValue", null)
  }
}
