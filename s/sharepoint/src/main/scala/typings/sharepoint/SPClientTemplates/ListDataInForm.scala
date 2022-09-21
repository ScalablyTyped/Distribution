package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataInForm extends StObject {
  
  var Items: js.Array[Item]
}
object ListDataInForm {
  
  inline def apply(Items: js.Array[Item]): ListDataInForm = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataInForm]
  }
  
  extension [Self <: ListDataInForm](x: Self) {
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "Items", js.Array(value*))
  }
}
