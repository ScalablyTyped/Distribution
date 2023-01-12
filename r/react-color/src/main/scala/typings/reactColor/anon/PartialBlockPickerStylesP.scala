package typings.reactColor.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/block/Block.BlockPickerStylesProps> */
trait PartialBlockPickerStylesP extends StObject {
  
  var body: js.UndefOr[CSSProperties] = js.undefined
  
  var card: js.UndefOr[CSSProperties] = js.undefined
  
  var head: js.UndefOr[CSSProperties] = js.undefined
  
  var input: js.UndefOr[CSSProperties] = js.undefined
  
  var label: js.UndefOr[CSSProperties] = js.undefined
  
  var triangle: js.UndefOr[CSSProperties] = js.undefined
}
object PartialBlockPickerStylesP {
  
  inline def apply(): PartialBlockPickerStylesP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBlockPickerStylesP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialBlockPickerStylesP] (val x: Self) extends AnyVal {
    
    inline def setBody(value: CSSProperties): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCard(value: CSSProperties): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setHead(value: CSSProperties): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
    
    inline def setInput(value: CSSProperties): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLabel(value: CSSProperties): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setTriangle(value: CSSProperties): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
    
    inline def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
  }
}
