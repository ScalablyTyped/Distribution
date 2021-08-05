package typings.reactColor.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/circle/Circle.CirclePickerStylesProps> */
trait PartialCirclePickerStyles extends StObject {
  
  var card: js.UndefOr[CSSProperties] = js.undefined
}
object PartialCirclePickerStyles {
  
  inline def apply(): PartialCirclePickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCirclePickerStyles]
  }
  
  extension [Self <: PartialCirclePickerStyles](x: Self) {
    
    inline def setCard(value: CSSProperties): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
  }
}
