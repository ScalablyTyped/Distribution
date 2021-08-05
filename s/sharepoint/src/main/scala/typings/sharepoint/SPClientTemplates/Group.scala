package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  var Items: js.Array[Item]
}
object Group {
  
  inline def apply(Items: js.Array[Item]): Group = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "Items", js.Array(value :_*))
  }
}
