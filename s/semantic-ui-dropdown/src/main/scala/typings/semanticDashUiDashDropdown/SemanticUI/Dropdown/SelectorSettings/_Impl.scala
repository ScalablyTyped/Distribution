package typings.semanticDashUiDashDropdown.SemanticUI.Dropdown.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '.addition'
    */
  var addition: String
  /**
    * @default '.ui.dropdown'
    */
  var dropdown: String
  /**
    * @default '> .dropdown.icon'
    */
  var icon: String
  /**
    * @default '> input[type="hidden"], > select'
    */
  var input: String
  /**
    * @default '.item'
    */
  var item: String
  /**
    * @default '> .label'
    */
  var label: String
  /**
    * @default '.menu'
    */
  var menu: String
  /**
    * @default '.dropdown.icon'
    */
  var menuIcon: String
  /**
    * @default '.message'
    */
  var message: String
  /**
    * @default '> .label > .delete.icon'
    */
  var remove: String
  /**
    * @default 'input.search, .menu > .search > input'
    */
  var search: String
  /**
    * @default '.label'
    */
  var siblingLabel: String
  /**
    * @default '> .text:not(.icon)'
    */
  var text: String
}

object _Impl {
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
  ): _Impl = {
    val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], menuIcon = menuIcon.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], siblingLabel = siblingLabel.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

