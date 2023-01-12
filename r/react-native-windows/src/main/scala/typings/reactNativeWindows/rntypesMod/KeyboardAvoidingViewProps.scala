package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.reactNativeWindowsStrings.height
import typings.reactNativeWindows.reactNativeWindowsStrings.padding
import typings.reactNativeWindows.reactNativeWindowsStrings.position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardAvoidingViewProps
  extends StObject
     with ViewProps {
  
  var behavior: js.UndefOr[height | position | padding] = js.undefined
  
  /**
    * The style of the content container(View) when behavior is 'position'.
    */
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Enables or disables the KeyboardAvoidingView.
    *
    * Default is true
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This is the distance between the top of the user screen and the react native view,
    * may be non-zero in some use cases.
    */
  var keyboardVerticalOffset: js.UndefOr[Double] = js.undefined
}
object KeyboardAvoidingViewProps {
  
  inline def apply(): KeyboardAvoidingViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardAvoidingViewProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardAvoidingViewProps] (val x: Self) extends AnyVal {
    
    inline def setBehavior(value: height | position | padding): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
    
    inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setKeyboardVerticalOffset(value: Double): Self = StObject.set(x, "keyboardVerticalOffset", value.asInstanceOf[js.Any])
    
    inline def setKeyboardVerticalOffsetUndefined: Self = StObject.set(x, "keyboardVerticalOffset", js.undefined)
  }
}
