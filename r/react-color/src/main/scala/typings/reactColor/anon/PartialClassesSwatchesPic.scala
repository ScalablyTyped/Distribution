package typings.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/swatches/Swatches.SwatchesPickerStylesProps>> */
trait PartialClassesSwatchesPic extends StObject {
  
  var default: js.UndefOr[PartialSwatchesPickerStyl] = js.undefined
}
object PartialClassesSwatchesPic {
  
  inline def apply(): PartialClassesSwatchesPic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesSwatchesPic]
  }
  
  extension [Self <: PartialClassesSwatchesPic](x: Self) {
    
    inline def setDefault(value: PartialSwatchesPickerStyl): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
