package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickerIOSItemProps extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
  
  var textColor: js.UndefOr[ProcessedColorValue] = js.undefined
  
  var value: js.UndefOr[String | Double] = js.undefined
}
object PickerIOSItemProps {
  
  @scala.inline
  def apply(): PickerIOSItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerIOSItemProps]
  }
  
  @scala.inline
  implicit class PickerIOSItemPropsMutableBuilder[Self <: PickerIOSItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setTextColor(value: ProcessedColorValue): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
