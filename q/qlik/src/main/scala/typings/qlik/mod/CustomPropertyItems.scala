package typings.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import typings.qlik.qlikStrings.items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyItems
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var items: StringDictionary[CustomProperty]
  
  @JSName("type")
  var type_CustomPropertyItems: items
}
object CustomPropertyItems {
  
  inline def apply(items: StringDictionary[CustomProperty]): CustomPropertyItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("items")
    __obj.asInstanceOf[CustomPropertyItems]
  }
  
  extension [Self <: CustomPropertyItems](x: Self) {
    
    inline def setItems(value: StringDictionary[CustomProperty]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setType(value: items): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
