package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputAccessoryViewProps extends StObject {
  
  var backgroundColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * An ID which is used to associate this InputAccessoryView to specified TextInput(s).
    */
  var nativeID: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object InputAccessoryViewProps {
  
  @scala.inline
  def apply(): InputAccessoryViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputAccessoryViewProps]
  }
  
  @scala.inline
  implicit class InputAccessoryViewPropsMutableBuilder[Self <: InputAccessoryViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: ColorValue): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
