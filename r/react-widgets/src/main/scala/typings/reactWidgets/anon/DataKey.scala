package typings.reactWidgets.anon

import typings.reactWidgets.cjsTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataKey[TDataItem] extends StObject {
  
  var dataKey: Value
  
  var item: TDataItem
  
  var text: String
}
object DataKey {
  
  inline def apply[TDataItem](dataKey: Value, item: TDataItem, text: String): DataKey[TDataItem] = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataKey[TDataItem]]
  }
  
  extension [Self <: DataKey[?], TDataItem](x: Self & DataKey[TDataItem]) {
    
    inline def setDataKey(value: Value): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    inline def setItem(value: TDataItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
