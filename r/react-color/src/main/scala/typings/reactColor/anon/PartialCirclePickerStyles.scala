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
  
  @scala.inline
  def apply(): PartialCirclePickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCirclePickerStyles]
  }
  
  @scala.inline
  implicit class PartialCirclePickerStylesMutableBuilder[Self <: PartialCirclePickerStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCard(value: CSSProperties): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
  }
}
