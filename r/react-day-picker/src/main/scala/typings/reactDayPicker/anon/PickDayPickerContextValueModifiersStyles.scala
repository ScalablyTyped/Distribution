package typings.reactDayPicker.anon

import typings.reactDayPicker.stylesMod.Styles
import typings.reactDayPicker.typesModifiersMod.ModifiersStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-day-picker.react-day-picker/dist/contexts/DayPicker.DayPickerContextValue, 'modifiersStyles' | 'styles'> */
trait PickDayPickerContextValueModifiersStyles extends StObject {
  
  var modifiersStyles: js.UndefOr[ModifiersStyles] = js.undefined
  
  var styles: Styles
}
object PickDayPickerContextValueModifiersStyles {
  
  inline def apply(styles: Styles): PickDayPickerContextValueModifiersStyles = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickDayPickerContextValueModifiersStyles]
  }
  
  extension [Self <: PickDayPickerContextValueModifiersStyles](x: Self) {
    
    inline def setModifiersStyles(value: ModifiersStyles): Self = StObject.set(x, "modifiersStyles", value.asInstanceOf[js.Any])
    
    inline def setModifiersStylesUndefined: Self = StObject.set(x, "modifiersStyles", js.undefined)
    
    inline def setStyles(value: Styles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
