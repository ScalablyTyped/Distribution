package typings.reactBootstrapTypeahead.mod

import typings.react.mod.CSSProperties
import typings.react.mod.LegacyRef
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var emptyLabel: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var innerRef: js.UndefOr[LegacyRef[HTMLUListElement]] = js.undefined
  
  var maxHeight: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object MenuProps {
  
  inline def apply(id: String): MenuProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
  
  extension [Self <: MenuProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setEmptyLabel(value: String): Self = StObject.set(x, "emptyLabel", value.asInstanceOf[js.Any])
    
    inline def setEmptyLabelUndefined: Self = StObject.set(x, "emptyLabel", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInnerRef(value: LegacyRef[HTMLUListElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefFunction1(value: /* instance */ HTMLUListElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
