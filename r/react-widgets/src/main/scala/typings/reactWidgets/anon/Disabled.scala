package typings.reactWidgets.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled[TDataItem] extends StObject {
  
  var disabled: Boolean
  
  var index: Double
  
  var item: TDataItem
  
  var searchTerm: js.UndefOr[String] = js.undefined
  
  var text: String
  
  var value: Any
}
object Disabled {
  
  inline def apply[TDataItem](disabled: Boolean, index: Double, item: TDataItem, text: String, value: Any): Disabled[TDataItem] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled[TDataItem]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Disabled[?], TDataItem] (val x: Self & Disabled[TDataItem]) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setItem(value: TDataItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
    
    inline def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
