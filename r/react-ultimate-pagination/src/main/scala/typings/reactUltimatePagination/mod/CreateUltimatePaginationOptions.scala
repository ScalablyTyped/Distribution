package typings.reactUltimatePagination.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUltimatePaginationOptions extends js.Object {
  
  /**
    * A React.js component that will be used as a wrapper for pagination items
    */
  var WrapperComponent: js.UndefOr[String | ComponentType[_]] = js.native
  
  /**
    * An object that is used as a map from the item type to the React.js component that will be used to render this item
    */
  var itemTypeToComponent: ItemTypeToComponent = js.native
}
object CreateUltimatePaginationOptions {
  
  @scala.inline
  def apply(itemTypeToComponent: ItemTypeToComponent): CreateUltimatePaginationOptions = {
    val __obj = js.Dynamic.literal(itemTypeToComponent = itemTypeToComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUltimatePaginationOptions]
  }
  
  @scala.inline
  implicit class CreateUltimatePaginationOptionsOps[Self <: CreateUltimatePaginationOptions] (val x: Self) extends AnyVal {
    
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
    def setItemTypeToComponent(value: ItemTypeToComponent): Self = this.set("itemTypeToComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperComponent(value: String | ComponentType[_]): Self = this.set("WrapperComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperComponent: Self = this.set("WrapperComponent", js.undefined)
  }
}
