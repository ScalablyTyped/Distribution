package typings.semanticUiDropdown.SemanticUI.Dropdown.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * @default '.addition'
    */
  var addition: String = js.native
  
  /**
    * @default '.ui.dropdown'
    */
  var dropdown: String = js.native
  
  /**
    * @default '> .dropdown.icon'
    */
  var icon: String = js.native
  
  /**
    * @default '> input[type="hidden"], > select'
    */
  var input: String = js.native
  
  /**
    * @default '.item'
    */
  var item: String = js.native
  
  /**
    * @default '> .label'
    */
  var label: String = js.native
  
  /**
    * @default '.menu'
    */
  var menu: String = js.native
  
  /**
    * @default '.dropdown.icon'
    */
  var menuIcon: String = js.native
  
  /**
    * @default '.message'
    */
  var message: String = js.native
  
  /**
    * @default '> .label > .delete.icon'
    */
  var remove: String = js.native
  
  /**
    * @default 'input.search, .menu > .search > input'
    */
  var search: String = js.native
  
  /**
    * @default '.label'
    */
  var siblingLabel: String = js.native
  
  /**
    * @default '> .text:not(.icon)'
    */
  var text: String = js.native
}
object Impl {
  
  @scala.inline
  def apply(
    addition: String,
    dropdown: String,
    icon: String,
    input: String,
    item: String,
    label: String,
    menu: String,
    menuIcon: String,
    message: String,
    remove: String,
    search: String,
    siblingLabel: String,
    text: String
  ): Impl = {
    val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], menuIcon = menuIcon.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], siblingLabel = siblingLabel.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    
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
    def setAddition(value: String): Self = this.set("addition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdown(value: String): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: String): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuIcon(value: String): Self = this.set("menuIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: String): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiblingLabel(value: String): Self = this.set("siblingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
