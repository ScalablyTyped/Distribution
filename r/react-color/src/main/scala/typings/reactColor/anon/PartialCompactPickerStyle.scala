package typings.reactColor.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/compact/Compact.CompactPickerStylesProps> */
trait PartialCompactPickerStyle extends StObject {
  
  var Compact: js.UndefOr[CSSProperties] = js.undefined
  
  var clear: js.UndefOr[CSSProperties] = js.undefined
  
  var compact: js.UndefOr[CSSProperties] = js.undefined
}
object PartialCompactPickerStyle {
  
  inline def apply(): PartialCompactPickerStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCompactPickerStyle]
  }
  
  extension [Self <: PartialCompactPickerStyle](x: Self) {
    
    inline def setClear(value: CSSProperties): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setCompact(value: CSSProperties): Self = StObject.set(x, "Compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "Compact", js.undefined)
  }
}
