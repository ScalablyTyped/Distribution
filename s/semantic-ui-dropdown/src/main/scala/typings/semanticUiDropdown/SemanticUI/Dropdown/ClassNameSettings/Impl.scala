package typings.semanticUiDropdown.SemanticUI.Dropdown.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: String = js.native
  /**
    * @default 'addition'
    */
  var addition: String = js.native
  /**
    * @default 'animating'
    */
  var animating: String = js.native
  /**
    * @default 'disabled'
    */
  var disabled: String = js.native
  /**
    * @default 'ui dropdown'
    */
  var dropdown: String = js.native
  /**
    * @default 'filtered'
    */
  var filtered: String = js.native
  /**
    * @default 'hidden transition'
    */
  var hidden: String = js.native
  /**
    * @default 'item'
    */
  var item: String = js.native
  /**
    * @default 'ui label'
    */
  var label: String = js.native
  /**
    * @default 'loading'
    */
  var loading: String = js.native
  /**
    * @default 'menu'
    */
  var menu: String = js.native
  /**
    * @default 'message'
    */
  var message: String = js.native
  /**
    * @default 'multiple'
    */
  var multiple: String = js.native
  /**
    * @default 'default'
    */
  var placeholder: String = js.native
  /**
    * @default 'search'
    */
  var search: String = js.native
  /**
    * @default 'selected'
    */
  var selected: String = js.native
  /**
    * @default 'selection'
    */
  var selection: String = js.native
  /**
    * @default 'upward'
    */
  var upward: String = js.native
  /**
    * @default 'visible'
    */
  var visible: String = js.native
}

object Impl {
  @scala.inline
  def apply(
    active: String,
    addition: String,
    animating: String,
    disabled: String,
    dropdown: String,
    filtered: String,
    hidden: String,
    item: String,
    label: String,
    loading: String,
    menu: String,
    message: String,
    multiple: String,
    placeholder: String,
    search: String,
    selected: String,
    selection: String,
    upward: String,
    visible: String
  ): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addition = addition.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], filtered = filtered.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], upward = upward.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddition(value: String): Self = this.set("addition", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimating(value: String): Self = this.set("animating", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropdown(value: String): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltered(value: String): Self = this.set("filtered", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenu(value: String): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiple(value: String): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelection(value: String): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpward(value: String): Self = this.set("upward", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: String): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

