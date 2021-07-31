package typings.reactNativeLoadingSpinnerOverlay

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.fade
import typings.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.large
import typings.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.none
import typings.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.normal
import typings.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.slide
import typings.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-loading-spinner-overlay", JSImport.Default)
  @js.native
  class default ()
    extends Component[SpinnerProps, js.Object, js.Any]
  
  type Spinner = Component[SpinnerProps, js.Object, js.Any]
  
  trait SpinnerProps extends StObject {
    
    var animation: js.UndefOr[none | slide | fade] = js.undefined
    
    var cancelable: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var customIndicator: js.UndefOr[ReactElement] = js.undefined
    
    var overlayColor: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[normal | small | large] = js.undefined
    
    var textContent: js.UndefOr[String] = js.undefined
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object SpinnerProps {
    
    @scala.inline
    def apply(): SpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerProps]
    }
    
    @scala.inline
    implicit class SpinnerPropsMutableBuilder[Self <: SpinnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: none | slide | fade): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCustomIndicator(value: ReactElement): Self = StObject.set(x, "customIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomIndicatorUndefined: Self = StObject.set(x, "customIndicator", js.undefined)
      
      @scala.inline
      def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
      
      @scala.inline
      def setSize(value: normal | small | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
      
      @scala.inline
      def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
