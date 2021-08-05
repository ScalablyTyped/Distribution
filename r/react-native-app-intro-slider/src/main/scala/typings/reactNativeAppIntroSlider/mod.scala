package typings.reactNativeAppIntroSlider

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-app-intro-slider", JSImport.Default)
  @js.native
  class default ()
    extends Component[AppIntroProps, js.Object, js.Any]
  
  trait AppIntroProps extends StObject {
    
    var activeDotStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var bottomButton: js.UndefOr[Boolean] = js.undefined
    
    var buttonStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var buttonTextStyle: js.UndefOr[TextProps] = js.undefined
    
    var doneLabel: js.UndefOr[String] = js.undefined
    
    var dotStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var hidePagination: js.UndefOr[Boolean] = js.undefined
    
    var nextLabel: js.UndefOr[String] = js.undefined
    
    var onDone: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSkip: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSlideChange: js.UndefOr[js.Function2[/* index */ Double, /* lastIndex */ Double, Unit]] = js.undefined
    
    var paginationStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var prevLabel: js.UndefOr[String] = js.undefined
    
    var renderDoneButton: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var renderItem: js.UndefOr[js.Function1[/* item */ js.Any, ReactElement]] = js.undefined
    
    var renderNextButton: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var renderPrevButton: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var renderSkipButton: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showDoneButton: js.UndefOr[Boolean] = js.undefined
    
    var showNextButton: js.UndefOr[Boolean] = js.undefined
    
    var showPrevButton: js.UndefOr[Boolean] = js.undefined
    
    var showSkipButton: js.UndefOr[Boolean] = js.undefined
    
    var skipLabel: js.UndefOr[String] = js.undefined
    
    var slides: js.Array[js.Any]
  }
  object AppIntroProps {
    
    inline def apply(slides: js.Array[js.Any]): AppIntroProps = {
      val __obj = js.Dynamic.literal(slides = slides.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppIntroProps]
    }
    
    extension [Self <: AppIntroProps](x: Self) {
      
      inline def setActiveDotStyle(value: ViewStyle): Self = StObject.set(x, "activeDotStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveDotStyleUndefined: Self = StObject.set(x, "activeDotStyle", js.undefined)
      
      inline def setBottomButton(value: Boolean): Self = StObject.set(x, "bottomButton", value.asInstanceOf[js.Any])
      
      inline def setBottomButtonUndefined: Self = StObject.set(x, "bottomButton", js.undefined)
      
      inline def setButtonStyle(value: ViewStyle): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      inline def setButtonTextStyle(value: TextProps): Self = StObject.set(x, "buttonTextStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonTextStyleUndefined: Self = StObject.set(x, "buttonTextStyle", js.undefined)
      
      inline def setDoneLabel(value: String): Self = StObject.set(x, "doneLabel", value.asInstanceOf[js.Any])
      
      inline def setDoneLabelUndefined: Self = StObject.set(x, "doneLabel", js.undefined)
      
      inline def setDotStyle(value: ViewStyle): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      inline def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      inline def setHidePagination(value: Boolean): Self = StObject.set(x, "hidePagination", value.asInstanceOf[js.Any])
      
      inline def setHidePaginationUndefined: Self = StObject.set(x, "hidePagination", js.undefined)
      
      inline def setNextLabel(value: String): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      inline def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
      
      inline def setOnDone(value: () => Unit): Self = StObject.set(x, "onDone", js.Any.fromFunction0(value))
      
      inline def setOnDoneUndefined: Self = StObject.set(x, "onDone", js.undefined)
      
      inline def setOnSkip(value: () => Unit): Self = StObject.set(x, "onSkip", js.Any.fromFunction0(value))
      
      inline def setOnSkipUndefined: Self = StObject.set(x, "onSkip", js.undefined)
      
      inline def setOnSlideChange(value: (/* index */ Double, /* lastIndex */ Double) => Unit): Self = StObject.set(x, "onSlideChange", js.Any.fromFunction2(value))
      
      inline def setOnSlideChangeUndefined: Self = StObject.set(x, "onSlideChange", js.undefined)
      
      inline def setPaginationStyle(value: ViewStyle): Self = StObject.set(x, "paginationStyle", value.asInstanceOf[js.Any])
      
      inline def setPaginationStyleUndefined: Self = StObject.set(x, "paginationStyle", js.undefined)
      
      inline def setPrevLabel(value: String): Self = StObject.set(x, "prevLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevLabelUndefined: Self = StObject.set(x, "prevLabel", js.undefined)
      
      inline def setRenderDoneButton(value: () => Unit): Self = StObject.set(x, "renderDoneButton", js.Any.fromFunction0(value))
      
      inline def setRenderDoneButtonUndefined: Self = StObject.set(x, "renderDoneButton", js.undefined)
      
      inline def setRenderItem(value: /* item */ js.Any => ReactElement): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      inline def setRenderNextButton(value: () => Unit): Self = StObject.set(x, "renderNextButton", js.Any.fromFunction0(value))
      
      inline def setRenderNextButtonUndefined: Self = StObject.set(x, "renderNextButton", js.undefined)
      
      inline def setRenderPrevButton(value: () => Unit): Self = StObject.set(x, "renderPrevButton", js.Any.fromFunction0(value))
      
      inline def setRenderPrevButtonUndefined: Self = StObject.set(x, "renderPrevButton", js.undefined)
      
      inline def setRenderSkipButton(value: () => Unit): Self = StObject.set(x, "renderSkipButton", js.Any.fromFunction0(value))
      
      inline def setRenderSkipButtonUndefined: Self = StObject.set(x, "renderSkipButton", js.undefined)
      
      inline def setShowDoneButton(value: Boolean): Self = StObject.set(x, "showDoneButton", value.asInstanceOf[js.Any])
      
      inline def setShowDoneButtonUndefined: Self = StObject.set(x, "showDoneButton", js.undefined)
      
      inline def setShowNextButton(value: Boolean): Self = StObject.set(x, "showNextButton", value.asInstanceOf[js.Any])
      
      inline def setShowNextButtonUndefined: Self = StObject.set(x, "showNextButton", js.undefined)
      
      inline def setShowPrevButton(value: Boolean): Self = StObject.set(x, "showPrevButton", value.asInstanceOf[js.Any])
      
      inline def setShowPrevButtonUndefined: Self = StObject.set(x, "showPrevButton", js.undefined)
      
      inline def setShowSkipButton(value: Boolean): Self = StObject.set(x, "showSkipButton", value.asInstanceOf[js.Any])
      
      inline def setShowSkipButtonUndefined: Self = StObject.set(x, "showSkipButton", js.undefined)
      
      inline def setSkipLabel(value: String): Self = StObject.set(x, "skipLabel", value.asInstanceOf[js.Any])
      
      inline def setSkipLabelUndefined: Self = StObject.set(x, "skipLabel", js.undefined)
      
      inline def setSlides(value: js.Array[js.Any]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
      
      inline def setSlidesVarargs(value: js.Any*): Self = StObject.set(x, "slides", js.Array(value :_*))
    }
  }
  
  type AppIntroSlider = Component[AppIntroProps, js.Object, js.Any]
}
