package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerSectionProps extends js.Object {
  
  var divider: js.UndefOr[Boolean] = js.native
  
  var items: js.Array[DrawerSectionItem] = js.native
  
  var style: js.UndefOr[Item] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object DrawerSectionProps {
  
  @scala.inline
  def apply(items: js.Array[DrawerSectionItem]): DrawerSectionProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerSectionProps]
  }
  
  @scala.inline
  implicit class DrawerSectionPropsOps[Self <: DrawerSectionProps] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: DrawerSectionItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[DrawerSectionItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivider(value: Boolean): Self = this.set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    
    @scala.inline
    def setStyle(value: Item): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
