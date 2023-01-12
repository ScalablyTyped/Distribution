package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.reactNativeWindowsStrings.dark
import typings.reactNativeWindows.reactNativeWindowsStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSheetIOSOptions extends StObject {
  
  var anchor: js.UndefOr[Double] = js.undefined
  
  var cancelButtonIndex: js.UndefOr[Double] = js.undefined
  
  var destructiveButtonIndex: js.UndefOr[Double] = js.undefined
  
  var disabledButtonIndices: js.UndefOr[js.Array[Double]] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var options: js.Array[String]
  
  var tintColor: js.UndefOr[ColorValue | ProcessedColorValue] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var userInterfaceStyle: js.UndefOr[light | dark] = js.undefined
}
object ActionSheetIOSOptions {
  
  inline def apply(options: js.Array[String]): ActionSheetIOSOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetIOSOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionSheetIOSOptions] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setCancelButtonIndex(value: Double): Self = StObject.set(x, "cancelButtonIndex", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonIndexUndefined: Self = StObject.set(x, "cancelButtonIndex", js.undefined)
    
    inline def setDestructiveButtonIndex(value: Double): Self = StObject.set(x, "destructiveButtonIndex", value.asInstanceOf[js.Any])
    
    inline def setDestructiveButtonIndexUndefined: Self = StObject.set(x, "destructiveButtonIndex", js.undefined)
    
    inline def setDisabledButtonIndices(value: js.Array[Double]): Self = StObject.set(x, "disabledButtonIndices", value.asInstanceOf[js.Any])
    
    inline def setDisabledButtonIndicesUndefined: Self = StObject.set(x, "disabledButtonIndices", js.undefined)
    
    inline def setDisabledButtonIndicesVarargs(value: Double*): Self = StObject.set(x, "disabledButtonIndices", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setTintColor(value: ColorValue | ProcessedColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUserInterfaceStyle(value: light | dark): Self = StObject.set(x, "userInterfaceStyle", value.asInstanceOf[js.Any])
    
    inline def setUserInterfaceStyleUndefined: Self = StObject.set(x, "userInterfaceStyle", js.undefined)
  }
}
