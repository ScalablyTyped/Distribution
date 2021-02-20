package typings.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import typings.qlik.qlikStrings.items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertyItems
  extends CustomPropertyCommon
     with CustomProperty {
  
  var items: StringDictionary[CustomProperty] = js.native
  
  @JSName("type")
  var type_CustomPropertyItems: items = js.native
}
object CustomPropertyItems {
  
  @scala.inline
  def apply(items: StringDictionary[CustomProperty], `type`: items): CustomPropertyItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyItems]
  }
  
  @scala.inline
  implicit class CustomPropertyItemsMutableBuilder[Self <: CustomPropertyItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: StringDictionary[CustomProperty]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: items): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
