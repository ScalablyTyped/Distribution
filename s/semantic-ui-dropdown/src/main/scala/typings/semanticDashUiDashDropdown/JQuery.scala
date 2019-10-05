package typings.semanticDashUiDashDropdown

import typings.semanticDashUiDashDropdown.SemanticUI.Dropdown
import typings.semanticDashUiDashDropdown.SemanticUI.DropdownSettings
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`bind intent`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`bind mouse events`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`bind touch events`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`determine intent`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`determine select action`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`get default text`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`get item`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`get placeholder text`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`get text`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`get value`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`hide others`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`is animated`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`is hidden`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`is selection`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`is visible`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`remove active`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`remove selected`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`remove visible`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`restore default text`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`restore default value`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`restore defaults`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`restore placeholder text`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`save defaults`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`set active`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`set exactly`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`set selected`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`set text`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`set value`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`set visible`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`setup menu`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.`unbind intent`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.clear
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.destroy
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.hide
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.refresh
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.setting
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.show
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("dropdown")
  var dropdown_Original: Dropdown = js.native
  def dropdown(): JQuery = js.native
  def dropdown(settings: DropdownSettings): JQuery = js.native
  /**
    * Binds a click to document to determine if you click away from a dropdown
    */
  @JSName("dropdown")
  def dropdown_bindintent(behavior: `bind intent`): JQuery = js.native
  /**
    * Adds mouse events to element
    */
  @JSName("dropdown")
  def dropdown_bindmouseevents(behavior: `bind mouse events`): JQuery = js.native
  /**
    * Adds touch events to element
    */
  @JSName("dropdown")
  def dropdown_bindtouchevents(behavior: `bind touch events`): JQuery = js.native
  /**
    * Clears dropdown of selection
    */
  @JSName("dropdown")
  def dropdown_clear(behavior: clear): JQuery = js.native
  @JSName("dropdown")
  def dropdown_destroy(behavior: destroy): JQuery = js.native
  /**
    * Returns whether event occurred inside dropdown
    */
  @JSName("dropdown")
  def dropdown_determineintent(behavior: `determine intent`): Boolean = js.native
  /**
    * Triggers preset item selection action based on settings passing text/value
    */
  @JSName("dropdown")
  def dropdown_determineselectaction(behavior: `determine select action`, text: String, value: js.Any): JQuery = js.native
  /**
    * Returns dropdown value as set on page load
    */
  @JSName("dropdown")
  def dropdown_getdefaulttext(behavior: `get default text`): String = js.native
  /**
    * Returns DOM element that matches a given input value
    */
  @JSName("dropdown")
  def dropdown_getitem(behavior: `get item`, value: js.Any): JQuery = js.native
  /**
    * Returns placeholder text
    */
  @JSName("dropdown")
  def dropdown_getplaceholdertext(behavior: `get placeholder text`): String = js.native
  /**
    * Returns current dropdown text
    */
  @JSName("dropdown")
  def dropdown_gettext(behavior: `get text`): String = js.native
  /**
    * Returns current dropdown input value
    */
  @JSName("dropdown")
  def dropdown_getvalue(behavior: `get value`): js.Any = js.native
  /**
    * Hides dropdown
    */
  @JSName("dropdown")
  def dropdown_hide(behavior: hide): JQuery = js.native
  /**
    * Hides all other dropdowns that is not current dropdown
    */
  @JSName("dropdown")
  def dropdown_hideothers(behavior: `hide others`): JQuery = js.native
  /**
    * Returns whether dropdown is animated
    */
  @JSName("dropdown")
  def dropdown_isanimated(behavior: `is animated`): Boolean = js.native
  /**
    * Returns whether dropdown is hidden
    */
  @JSName("dropdown")
  def dropdown_ishidden(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether dropdown is a selection dropdown
    */
  @JSName("dropdown")
  def dropdown_isselection(behavior: `is selection`): Boolean = js.native
  /**
    * Returns whether dropdown is visible
    */
  @JSName("dropdown")
  def dropdown_isvisible(behavior: `is visible`): Boolean = js.native
  /**
    * Refreshes all cached selectors and data
    */
  @JSName("dropdown")
  def dropdown_refresh(behavior: refresh): JQuery = js.native
  /**
    * Removes dropdown active state
    */
  @JSName("dropdown")
  def dropdown_removeactive(behavior: `remove active`): JQuery = js.native
  /**
    * Remove value from selected
    */
  @JSName("dropdown")
  def dropdown_removeselected(behavior: `remove selected`, value: js.Any): JQuery = js.native
  /**
    * Removes dropdown visible state
    */
  @JSName("dropdown")
  def dropdown_removevisible(behavior: `remove visible`): JQuery = js.native
  /**
    * Restores dropdown text and value to its value on page load
    */
  @JSName("dropdown")
  def dropdown_restoredefaults(behavior: `restore defaults`): JQuery = js.native
  /**
    * Restores dropdown text to its value on page load
    */
  @JSName("dropdown")
  def dropdown_restoredefaulttext(behavior: `restore default text`): JQuery = js.native
  /**
    * Restores dropdown value to its value on page load
    */
  @JSName("dropdown")
  def dropdown_restoredefaultvalue(behavior: `restore default value`): JQuery = js.native
  /**
    * Restores dropdown text to its prompt, placeholder text
    */
  @JSName("dropdown")
  def dropdown_restoreplaceholdertext(behavior: `restore placeholder text`): JQuery = js.native
  /**
    * Saves current text and value as new defaults (for use with restore)
    */
  @JSName("dropdown")
  def dropdown_savedefaults(behavior: `save defaults`): JQuery = js.native
  /**
    * Sets dropdown to active state
    */
  @JSName("dropdown")
  def dropdown_setactive(behavior: `set active`): JQuery = js.native
  /**
    * Sets selected values to exactly specified values, removing current selection
    */
  @JSName("dropdown")
  def dropdown_setexactly(behavior: `set exactly`, values: js.Array[_]): JQuery = js.native
  /**
    * Sets value as selected
    */
  @JSName("dropdown")
  def dropdown_setselected(behavior: `set selected`, value: js.Any): JQuery = js.native
  /**
    * Adds a group of values as selected
    */
  @JSName("dropdown")
  def dropdown_setselected(behavior: `set selected`, values: js.Array[_]): JQuery = js.native
  /**
    * Sets dropdown text to a value
    */
  @JSName("dropdown")
  def dropdown_settext(behavior: `set text`, text: String): JQuery = js.native
  @JSName("dropdown")
  def dropdown_setting(behavior: setting, value: DropdownSettings): JQuery = js.native
  @JSName("dropdown")
  def dropdown_setting[K /* <: String */](behavior: setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl[K] */ js.Any = js.native
  @JSName("dropdown")
  def dropdown_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Recreates dropdown menu from select option values.
    */
  @JSName("dropdown")
  def dropdown_setupmenu(behavior: `setup menu`): JQuery = js.native
  /**
    * Sets dropdown input to value (does not update display state)
    */
  @JSName("dropdown")
  def dropdown_setvalue(behavior: `set value`, value: js.Any): JQuery = js.native
  /**
    * Sets dropdown to visible state
    */
  @JSName("dropdown")
  def dropdown_setvisible(behavior: `set visible`): JQuery = js.native
  /**
    * Shows dropdown
    */
  @JSName("dropdown")
  def dropdown_show(behavior: show): JQuery = js.native
  /**
    * Toggles current visibility of dropdown
    */
  @JSName("dropdown")
  def dropdown_toggle(behavior: toggle): JQuery = js.native
  /**
    * Unbinds document intent click
    */
  @JSName("dropdown")
  def dropdown_unbindintent(behavior: `unbind intent`): JQuery = js.native
}

