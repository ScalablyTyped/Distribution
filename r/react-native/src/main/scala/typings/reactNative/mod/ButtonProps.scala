package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[ColorValue] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  def onPress(ev: NativeSyntheticEvent[NativeTouchEvent]): Unit
  
  /**
    * Used to locate this button in end-to-end tests.
    */
  var testID: js.UndefOr[String] = js.undefined
  
  var title: String
}
object ButtonProps {
  
  inline def apply(onPress: NativeSyntheticEvent[NativeTouchEvent] => Unit, title: String): ButtonProps = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
  
  extension [Self <: ButtonProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnPress(value: NativeSyntheticEvent[NativeTouchEvent] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
