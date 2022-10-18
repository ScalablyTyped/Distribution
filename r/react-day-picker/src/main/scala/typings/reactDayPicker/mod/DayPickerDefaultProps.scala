package typings.reactDayPicker.mod

import typings.reactDayPicker.reactDayPickerStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The props for the {@link DayPicker} component when using `mode="default"` or `undefined`. */
trait DayPickerDefaultProps
  extends StObject
     with DayPickerBase
     with DayPickerProps {
  
  var mode: js.UndefOr[default] = js.undefined
}
object DayPickerDefaultProps {
  
  inline def apply(): DayPickerDefaultProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPickerDefaultProps]
  }
  
  extension [Self <: DayPickerDefaultProps](x: Self) {
    
    inline def setMode(value: default): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
