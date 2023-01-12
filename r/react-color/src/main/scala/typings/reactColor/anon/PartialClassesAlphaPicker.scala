package typings.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/alpha/Alpha.AlphaPickerStylesProps>> */
trait PartialClassesAlphaPicker extends StObject {
  
  var default: js.UndefOr[PartialAlphaPickerStylesP] = js.undefined
}
object PartialClassesAlphaPicker {
  
  inline def apply(): PartialClassesAlphaPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesAlphaPicker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialClassesAlphaPicker] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: PartialAlphaPickerStylesP): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
