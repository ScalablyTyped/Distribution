package typings.reactNativeAppIntroSlider

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-app-intro-slider", JSImport.Default)
  @js.native
  class default ()
    extends Component[AppIntroProps, js.Object, js.Any]
  
  @js.native
  trait AppIntroProps extends StObject {
    
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
    implicit class AppIntroPropsMutableBuilder[Self <: AppIntroProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveDotStyle(value: ViewStyle): Self = StObject.set(x, "activeDotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveDotStyleUndefined: Self = StObject.set(x, "activeDotStyle", js.undefined)
      
      @scala.inline
      def setBottomButton(value: Boolean): Self = StObject.set(x, "bottomButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomButtonUndefined: Self = StObject.set(x, "bottomButton", js.undefined)
      
      @scala.inline
      def setButtonStyle(value: ViewStyle): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      @scala.inline
      def setButtonTextStyle(value: TextProps): Self = StObject.set(x, "buttonTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextStyleUndefined: Self = StObject.set(x, "buttonTextStyle", js.undefined)
      
      @scala.inline
      def setDoneLabel(value: String): Self = StObject.set(x, "doneLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoneLabelUndefined: Self = StObject.set(x, "doneLabel", js.undefined)
      
      @scala.inline
      def setDotStyle(value: ViewStyle): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      @scala.inline
      def setHidePagination(value: Boolean): Self = StObject.set(x, "hidePagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidePaginationUndefined: Self = StObject.set(x, "hidePagination", js.undefined)
      
      @scala.inline
      def setNextLabel(value: String): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
      
      @scala.inline
      def setOnDone(value: () => Unit): Self = StObject.set(x, "onDone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDoneUndefined: Self = StObject.set(x, "onDone", js.undefined)
      
      @scala.inline
      def setOnSkip(value: () => Unit): Self = StObject.set(x, "onSkip", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSkipUndefined: Self = StObject.set(x, "onSkip", js.undefined)
      
      @scala.inline
      def setOnSlideChange(value: (/* index */ Double, /* lastIndex */ Double) => Unit): Self = StObject.set(x, "onSlideChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSlideChangeUndefined: Self = StObject.set(x, "onSlideChange", js.undefined)
      
      @scala.inline
      def setPaginationStyle(value: ViewStyle): Self = StObject.set(x, "paginationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationStyleUndefined: Self = StObject.set(x, "paginationStyle", js.undefined)
      
      @scala.inline
      def setPrevLabel(value: String): Self = StObject.set(x, "prevLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevLabelUndefined: Self = StObject.set(x, "prevLabel", js.undefined)
      
      @scala.inline
      def setRenderDoneButton(value: () => Unit): Self = StObject.set(x, "renderDoneButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderDoneButtonUndefined: Self = StObject.set(x, "renderDoneButton", js.undefined)
      
      @scala.inline
      def setRenderItem(value: /* item */ js.Any => ReactElement): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      @scala.inline
      def setRenderNextButton(value: () => Unit): Self = StObject.set(x, "renderNextButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderNextButtonUndefined: Self = StObject.set(x, "renderNextButton", js.undefined)
      
      @scala.inline
      def setRenderPrevButton(value: () => Unit): Self = StObject.set(x, "renderPrevButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderPrevButtonUndefined: Self = StObject.set(x, "renderPrevButton", js.undefined)
      
      @scala.inline
      def setRenderSkipButton(value: () => Unit): Self = StObject.set(x, "renderSkipButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderSkipButtonUndefined: Self = StObject.set(x, "renderSkipButton", js.undefined)
      
      @scala.inline
      def setShowDoneButton(value: Boolean): Self = StObject.set(x, "showDoneButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDoneButtonUndefined: Self = StObject.set(x, "showDoneButton", js.undefined)
      
      @scala.inline
      def setShowNextButton(value: Boolean): Self = StObject.set(x, "showNextButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNextButtonUndefined: Self = StObject.set(x, "showNextButton", js.undefined)
      
      @scala.inline
      def setShowPrevButton(value: Boolean): Self = StObject.set(x, "showPrevButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPrevButtonUndefined: Self = StObject.set(x, "showPrevButton", js.undefined)
      
      @scala.inline
      def setShowSkipButton(value: Boolean): Self = StObject.set(x, "showSkipButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSkipButtonUndefined: Self = StObject.set(x, "showSkipButton", js.undefined)
      
      @scala.inline
      def setSkipLabel(value: String): Self = StObject.set(x, "skipLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipLabelUndefined: Self = StObject.set(x, "skipLabel", js.undefined)
      
      @scala.inline
      def setSlides(value: js.Array[_]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesVarargs(value: js.Any*): Self = StObject.set(x, "slides", js.Array(value :_*))
    }
  }
  
  type AppIntroSlider = Component[AppIntroProps, js.Object, js.Any]
}
