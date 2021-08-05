package typings.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/chrome/Chrome.ChromePickerStylesProps>> */
trait PartialClassesChromePicke extends StObject {
  
  var default: js.UndefOr[PartialChromePickerStyles] = js.undefined
}
object PartialClassesChromePicke {
  
  inline def apply(): PartialClassesChromePicke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesChromePicke]
  }
  
  extension [Self <: PartialClassesChromePicke](x: Self) {
    
    inline def setDefault(value: PartialChromePickerStyles): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
