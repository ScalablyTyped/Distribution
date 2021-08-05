package typings.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/compact/Compact.CompactPickerStylesProps>> */
trait PartialClassesCompactPick extends StObject {
  
  var default: js.UndefOr[PartialCompactPickerStyle] = js.undefined
}
object PartialClassesCompactPick {
  
  inline def apply(): PartialClassesCompactPick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesCompactPick]
  }
  
  extension [Self <: PartialClassesCompactPick](x: Self) {
    
    inline def setDefault(value: PartialCompactPickerStyle): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
