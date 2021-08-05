package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputAccessoryViewProps extends StObject {
  
  var backgroundColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * An ID which is used to associate this InputAccessoryView to specified TextInput(s).
    */
  var nativeID: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object InputAccessoryViewProps {
  
  inline def apply(): InputAccessoryViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputAccessoryViewProps]
  }
  
  extension [Self <: InputAccessoryViewProps](x: Self) {
    
    inline def setBackgroundColor(value: ColorValue): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
