package typings.reactNativePaper.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled extends StObject {
  
  /**
    * Accessibility label for the button. This is read by the screen reader when the user taps the button.
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    *  Custom color for back icon.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the button is disabled. A disabled button is greyed out and `onPress` is not called on touch.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Function to execute on press.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Optional icon size.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object Disabled {
  
  inline def apply(): Disabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disabled]
  }
  
  extension [Self <: Disabled](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
