package typings.reactWidgets.anon

import typings.reactWidgets.esmTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text[TDataItem] extends StObject {
  
  var dataKey: Value
  
  var item: TDataItem
  
  var text: String
}
object Text {
  
  inline def apply[TDataItem](dataKey: Value, item: TDataItem, text: String): Text[TDataItem] = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text[TDataItem]]
  }
  
  extension [Self <: Text[?], TDataItem](x: Self & Text[TDataItem]) {
    
    inline def setDataKey(value: Value): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    inline def setItem(value: TDataItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
