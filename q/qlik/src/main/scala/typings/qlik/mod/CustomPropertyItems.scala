package typings.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import typings.qlik.qlikStrings.items
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
  implicit class CustomPropertyItemsOps[Self <: CustomPropertyItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItems(value: StringDictionary[CustomProperty]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: items): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
