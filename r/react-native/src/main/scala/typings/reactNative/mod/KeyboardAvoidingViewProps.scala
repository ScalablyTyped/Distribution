package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.height
import typings.reactNative.reactNativeStrings.padding
import typings.reactNative.reactNativeStrings.position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardAvoidingViewProps extends ViewProps {
  
  var behavior: js.UndefOr[height | position | padding] = js.native
  
  /**
    * The style of the content container(View) when behavior is 'position'.
    */
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Enables or disables the KeyboardAvoidingView.
    *
    * Default is true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * This is the distance between the top of the user screen and the react native view,
    * may be non-zero in some use cases.
    */
  var keyboardVerticalOffset: js.UndefOr[Double] = js.native
}
object KeyboardAvoidingViewProps {
  
  @scala.inline
  def apply(): KeyboardAvoidingViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardAvoidingViewProps]
  }
  
  @scala.inline
  implicit class KeyboardAvoidingViewPropsMutableBuilder[Self <: KeyboardAvoidingViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehavior(value: height | position | padding): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    @scala.inline
    def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
    
    @scala.inline
    def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setKeyboardVerticalOffset(value: Double): Self = StObject.set(x, "keyboardVerticalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardVerticalOffsetUndefined: Self = StObject.set(x, "keyboardVerticalOffset", js.undefined)
  }
}
