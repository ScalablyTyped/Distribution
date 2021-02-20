package typings.reactNativeToastNative

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-toast-native", JSImport.Default)
  @js.native
  val default: ToastNative = js.native
  
  @js.native
  trait Style extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    // iOS-only
    var borderColor: js.UndefOr[String] = js.native
    
    var borderRadius: js.UndefOr[Double] = js.native
    
    var borderWidth: js.UndefOr[Double] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var fontWeight: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var letterSpacing: js.UndefOr[Double] = js.native
    
    var lineHeight: js.UndefOr[Double] = js.native
    
    var lines: js.UndefOr[Double] = js.native
    
    var paddingBottom: js.UndefOr[Double] = js.native
    
    // Android-only
    var paddingLeft: js.UndefOr[Double] = js.native
    
    var paddingRight: js.UndefOr[Double] = js.native
    
    var paddingTop: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
    
    var xOffset: js.UndefOr[Double] = js.native
    
    var yOffset: js.UndefOr[Double] = js.native
  }
  object Style {
    
    @scala.inline
    def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      @scala.inline
      def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      @scala.inline
      def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      @scala.inline
      def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      @scala.inline
      def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
      
      @scala.inline
      def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
    }
  }
  
  @js.native
  trait ToastNative extends StObject {
    
    var BOTTOM: js.Any = js.native
    
    var CENTER: js.Any = js.native
    
    var LONG: js.Any = js.native
    
    // Toast duration constants
    var SHORT: js.Any = js.native
    
    // Toast gravity constants
    var TOP: js.Any = js.native
    
    def show(): Unit = js.native
    def show(message: String): Unit = js.native
    def show(message: String, duration: js.Any, position: js.Any, styles: Style): Unit = js.native
  }
  
  type _To = ToastNative
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ToastNative = default
}
