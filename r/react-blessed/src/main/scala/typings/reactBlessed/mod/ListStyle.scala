package typings.reactBlessed.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStyle
  extends StObject
     with ElementStyle {
  
  var item: js.UndefOr[ItemStyle] = js.undefined
  
  var selected: js.UndefOr[ItemStyle] = js.undefined
}
object ListStyle {
  
  inline def apply(): ListStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStyle] (val x: Self) extends AnyVal {
    
    inline def setItem(value: ItemStyle): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setSelected(value: ItemStyle): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
