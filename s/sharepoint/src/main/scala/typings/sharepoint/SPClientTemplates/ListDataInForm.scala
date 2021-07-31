package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataInForm extends StObject {
  
  var Items: js.Array[Item]
}
object ListDataInForm {
  
  @scala.inline
  def apply(Items: js.Array[Item]): ListDataInForm = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataInForm]
  }
  
  @scala.inline
  implicit class ListDataInFormMutableBuilder[Self <: ListDataInForm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = StObject.set(x, "Items", js.Array(value :_*))
  }
}
