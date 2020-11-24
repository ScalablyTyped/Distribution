package typings.reactNativeAppIntroSlider.mod

import typings.react.mod.ReactElement
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppIntroProps extends js.Object {
  
  var activeDotStyle: js.UndefOr[ViewStyle] = js.native
  
  var bottomButton: js.UndefOr[Boolean] = js.native
  
  var buttonStyle: js.UndefOr[ViewStyle] = js.native
  
  var buttonTextStyle: js.UndefOr[TextProps] = js.native
  
  var doneLabel: js.UndefOr[String] = js.native
  
  var dotStyle: js.UndefOr[ViewStyle] = js.native
  
  var hidePagination: js.UndefOr[Boolean] = js.native
  
  var nextLabel: js.UndefOr[String] = js.native
  
  var onDone: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSkip: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSlideChange: js.UndefOr[js.Function2[/* index */ Double, /* lastIndex */ Double, Unit]] = js.native
  
  var paginationStyle: js.UndefOr[ViewStyle] = js.native
  
  var prevLabel: js.UndefOr[String] = js.native
  
  var renderDoneButton: js.UndefOr[js.Function0[Unit]] = js.native
  
  var renderItem: js.UndefOr[js.Function1[/* item */ js.Any, ReactElement]] = js.native
  
  var renderNextButton: js.UndefOr[js.Function0[Unit]] = js.native
  
  var renderPrevButton: js.UndefOr[js.Function0[Unit]] = js.native
  
  var renderSkipButton: js.UndefOr[js.Function0[Unit]] = js.native
  
  var showDoneButton: js.UndefOr[Boolean] = js.native
  
  var showNextButton: js.UndefOr[Boolean] = js.native
  
  var showPrevButton: js.UndefOr[Boolean] = js.native
  
  var showSkipButton: js.UndefOr[Boolean] = js.native
  
  var skipLabel: js.UndefOr[String] = js.native
  
  var slides: js.Array[_] = js.native
}
object AppIntroProps {
  
  @scala.inline
  def apply(slides: js.Array[_]): AppIntroProps = {
    val __obj = js.Dynamic.literal(slides = slides.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppIntroProps]
  }
  
  @scala.inline
  implicit class AppIntroPropsOps[Self <: AppIntroProps] (val x: Self) extends AnyVal {
    
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
    def setSlidesVarargs(value: js.Any*): Self = this.set("slides", js.Array(value :_*))
    
    @scala.inline
    def setSlides(value: js.Array[_]): Self = this.set("slides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDotStyle(value: ViewStyle): Self = this.set("activeDotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveDotStyle: Self = this.set("activeDotStyle", js.undefined)
    
    @scala.inline
    def setBottomButton(value: Boolean): Self = this.set("bottomButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomButton: Self = this.set("bottomButton", js.undefined)
    
    @scala.inline
    def setButtonStyle(value: ViewStyle): Self = this.set("buttonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonStyle: Self = this.set("buttonStyle", js.undefined)
    
    @scala.inline
    def setButtonTextStyle(value: TextProps): Self = this.set("buttonTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonTextStyle: Self = this.set("buttonTextStyle", js.undefined)
    
    @scala.inline
    def setDoneLabel(value: String): Self = this.set("doneLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoneLabel: Self = this.set("doneLabel", js.undefined)
    
    @scala.inline
    def setDotStyle(value: ViewStyle): Self = this.set("dotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotStyle: Self = this.set("dotStyle", js.undefined)
    
    @scala.inline
    def setHidePagination(value: Boolean): Self = this.set("hidePagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidePagination: Self = this.set("hidePagination", js.undefined)
    
    @scala.inline
    def setNextLabel(value: String): Self = this.set("nextLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextLabel: Self = this.set("nextLabel", js.undefined)
    
    @scala.inline
    def setOnDone(value: () => Unit): Self = this.set("onDone", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDone: Self = this.set("onDone", js.undefined)
    
    @scala.inline
    def setOnSkip(value: () => Unit): Self = this.set("onSkip", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSkip: Self = this.set("onSkip", js.undefined)
    
    @scala.inline
    def setOnSlideChange(value: (/* index */ Double, /* lastIndex */ Double) => Unit): Self = this.set("onSlideChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSlideChange: Self = this.set("onSlideChange", js.undefined)
    
    @scala.inline
    def setPaginationStyle(value: ViewStyle): Self = this.set("paginationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationStyle: Self = this.set("paginationStyle", js.undefined)
    
    @scala.inline
    def setPrevLabel(value: String): Self = this.set("prevLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevLabel: Self = this.set("prevLabel", js.undefined)
    
    @scala.inline
    def setRenderDoneButton(value: () => Unit): Self = this.set("renderDoneButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderDoneButton: Self = this.set("renderDoneButton", js.undefined)
    
    @scala.inline
    def setRenderItem(value: /* item */ js.Any => ReactElement): Self = this.set("renderItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderItem: Self = this.set("renderItem", js.undefined)
    
    @scala.inline
    def setRenderNextButton(value: () => Unit): Self = this.set("renderNextButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderNextButton: Self = this.set("renderNextButton", js.undefined)
    
    @scala.inline
    def setRenderPrevButton(value: () => Unit): Self = this.set("renderPrevButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderPrevButton: Self = this.set("renderPrevButton", js.undefined)
    
    @scala.inline
    def setRenderSkipButton(value: () => Unit): Self = this.set("renderSkipButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderSkipButton: Self = this.set("renderSkipButton", js.undefined)
    
    @scala.inline
    def setShowDoneButton(value: Boolean): Self = this.set("showDoneButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDoneButton: Self = this.set("showDoneButton", js.undefined)
    
    @scala.inline
    def setShowNextButton(value: Boolean): Self = this.set("showNextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNextButton: Self = this.set("showNextButton", js.undefined)
    
    @scala.inline
    def setShowPrevButton(value: Boolean): Self = this.set("showPrevButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPrevButton: Self = this.set("showPrevButton", js.undefined)
    
    @scala.inline
    def setShowSkipButton(value: Boolean): Self = this.set("showSkipButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSkipButton: Self = this.set("showSkipButton", js.undefined)
    
    @scala.inline
    def setSkipLabel(value: String): Self = this.set("skipLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipLabel: Self = this.set("skipLabel", js.undefined)
  }
}
