package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionSheetIOSOptions extends StObject {
  
  var anchor: js.UndefOr[Double] = js.native
  
  var cancelButtonIndex: js.UndefOr[Double] = js.native
  
  var destructiveButtonIndex: js.UndefOr[Double] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var options: js.Array[String] = js.native
  
  var tintColor: js.UndefOr[ColorValue | ProcessedColorValue] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object ActionSheetIOSOptions {
  
  @scala.inline
  def apply(options: js.Array[String]): ActionSheetIOSOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetIOSOptions]
  }
  
  @scala.inline
  implicit class ActionSheetIOSOptionsMutableBuilder[Self <: ActionSheetIOSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setCancelButtonIndex(value: Double): Self = StObject.set(x, "cancelButtonIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonIndexUndefined: Self = StObject.set(x, "cancelButtonIndex", js.undefined)
    
    @scala.inline
    def setDestructiveButtonIndex(value: Double): Self = StObject.set(x, "destructiveButtonIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestructiveButtonIndexUndefined: Self = StObject.set(x, "destructiveButtonIndex", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setTintColor(value: ColorValue | ProcessedColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
