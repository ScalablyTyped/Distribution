package typings.qlikVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomArray extends ICustomControl {
  
  var addTranslation: String = js.native
  
  var allowAdd: Boolean = js.native
  
  var allowMove: Boolean = js.native
  
  var allowRemove: Boolean = js.native
  
  var itemTitleRef: String = js.native
}
object ICustomArray {
  
  @scala.inline
  def apply(
    addTranslation: String,
    allowAdd: Boolean,
    allowMove: Boolean,
    allowRemove: Boolean,
    itemTitleRef: String,
    label: String,
    ref: String,
    `type`: String
  ): ICustomArray = {
    val __obj = js.Dynamic.literal(addTranslation = addTranslation.asInstanceOf[js.Any], allowAdd = allowAdd.asInstanceOf[js.Any], allowMove = allowMove.asInstanceOf[js.Any], allowRemove = allowRemove.asInstanceOf[js.Any], itemTitleRef = itemTitleRef.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomArray]
  }
  
  @scala.inline
  implicit class ICustomArrayOps[Self <: ICustomArray] (val x: Self) extends AnyVal {
    
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
    def setAddTranslation(value: String): Self = this.set("addTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAdd(value: Boolean): Self = this.set("allowAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMove(value: Boolean): Self = this.set("allowMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRemove(value: Boolean): Self = this.set("allowRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTitleRef(value: String): Self = this.set("itemTitleRef", value.asInstanceOf[js.Any])
  }
}
