package typings.reactNativeCommunityPicker.anon

import typings.reactNativeCommunityPicker.pickerMod.ItemValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemIndex extends js.Object {
  
  var itemIndex: Double = js.native
  
  var itemValue: ItemValue = js.native
}
object ItemIndex {
  
  @scala.inline
  def apply(itemIndex: Double, itemValue: ItemValue): ItemIndex = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemIndex]
  }
  
  @scala.inline
  implicit class ItemIndexOps[Self <: ItemIndex] (val x: Self) extends AnyVal {
    
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
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemValue(value: ItemValue): Self = this.set("itemValue", value.asInstanceOf[js.Any])
  }
}
