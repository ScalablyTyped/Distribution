package typings.qlik.mod

import typings.qlik.qlikStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertyArray
  extends CustomPropertyCommon
     with CustomProperty {
  
  var addTranslation: js.UndefOr[String] = js.native
  
  var allowAdd: js.UndefOr[Boolean] = js.native
  
  var allowMove: js.UndefOr[Boolean] = js.native
  
  var allowRemove: js.UndefOr[Boolean] = js.native
  
  var component: js.UndefOr[scala.Nothing] = js.native
  
  var itemTitleRef: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_CustomPropertyArray: array = js.native
}
object CustomPropertyArray {
  
  @scala.inline
  def apply(`type`: array): CustomPropertyArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyArray]
  }
  
  @scala.inline
  implicit class CustomPropertyArrayOps[Self <: CustomPropertyArray] (val x: Self) extends AnyVal {
    
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
    def setType(value: array): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddTranslation(value: String): Self = this.set("addTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddTranslation: Self = this.set("addTranslation", js.undefined)
    
    @scala.inline
    def setAllowAdd(value: Boolean): Self = this.set("allowAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAdd: Self = this.set("allowAdd", js.undefined)
    
    @scala.inline
    def setAllowMove(value: Boolean): Self = this.set("allowMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMove: Self = this.set("allowMove", js.undefined)
    
    @scala.inline
    def setAllowRemove(value: Boolean): Self = this.set("allowRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRemove: Self = this.set("allowRemove", js.undefined)
    
    @scala.inline
    def setItemTitleRef(value: String): Self = this.set("itemTitleRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTitleRef: Self = this.set("itemTitleRef", js.undefined)
  }
}
