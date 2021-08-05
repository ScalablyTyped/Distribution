package typings.reactColor.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/alpha/Alpha.AlphaPickerStylesProps> */
trait PartialAlphaPickerStylesP extends StObject {
  
  var alpha: js.UndefOr[CSSProperties] = js.undefined
  
  var picker: js.UndefOr[CSSProperties] = js.undefined
}
object PartialAlphaPickerStylesP {
  
  inline def apply(): PartialAlphaPickerStylesP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAlphaPickerStylesP]
  }
  
  extension [Self <: PartialAlphaPickerStylesP](x: Self) {
    
    inline def setAlpha(value: CSSProperties): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    
    inline def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
  }
}
