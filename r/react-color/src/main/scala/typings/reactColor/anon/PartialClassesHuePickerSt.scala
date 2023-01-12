package typings.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/hue/Hue.HuePickerStylesProps>> */
trait PartialClassesHuePickerSt extends StObject {
  
  var default: js.UndefOr[PartialHuePickerStylesPro] = js.undefined
}
object PartialClassesHuePickerSt {
  
  inline def apply(): PartialClassesHuePickerSt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesHuePickerSt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialClassesHuePickerSt] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: PartialHuePickerStylesPro): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
