package typings.semanticUiDropdown.SemanticUI

import typings.semanticUiDropdown.JQuery
import typings.semanticUiDropdown.semanticUiDropdownStrings.`bind intent`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`bind mouse events`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`bind touch events`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`determine intent`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`determine select action`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`get default text`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`get item`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`get placeholder text`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`get text`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`get value`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`hide others`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`is animated`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`is hidden`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`is selection`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`is visible`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`remove active`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`remove selected`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`remove visible`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`restore default text`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`restore default value`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`restore defaults`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`restore placeholder text`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`save defaults`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`set active`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`set exactly`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`set selected`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`set text`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`set value`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`set visible`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`setup menu`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`unbind intent`
import typings.semanticUiDropdown.semanticUiDropdownStrings.clear
import typings.semanticUiDropdown.semanticUiDropdownStrings.destroy
import typings.semanticUiDropdown.semanticUiDropdownStrings.hide
import typings.semanticUiDropdown.semanticUiDropdownStrings.refresh
import typings.semanticUiDropdown.semanticUiDropdownStrings.setting
import typings.semanticUiDropdown.semanticUiDropdownStrings.show
import typings.semanticUiDropdown.semanticUiDropdownStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: Should 'value'/'values' parameters be of type 'string' instead of 'any'?
@js.native
trait Dropdown_ extends js.Object {
  var settings: DropdownSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Binds a click to document to determine if you click away from a dropdown
    */
  def apply(behavior: `bind intent`): JQuery = js.native
  /**
    * Adds mouse events to element
    */
  def apply(behavior: `bind mouse events`): JQuery = js.native
  /**
    * Adds touch events to element
    */
  def apply(behavior: `bind touch events`): JQuery = js.native
  /**
    * Returns whether event occurred inside dropdown
    */
  def apply(behavior: `determine intent`): Boolean = js.native
  /**
    * Triggers preset item selection action based on settings passing text/value
    */
  def apply(behavior: `determine select action`, text: String, value: js.Any): JQuery = js.native
  /**
    * Returns dropdown value as set on page load
    */
  def apply(behavior: `get default text`): String = js.native
  /**
    * Returns DOM element that matches a given input value
    */
  def apply(behavior: `get item`, value: js.Any): JQuery = js.native
  /**
    * Returns placeholder text
    */
  def apply(behavior: `get placeholder text`): String = js.native
  /**
    * Returns current dropdown text
    */
  def apply(behavior: `get text`): String = js.native
  /**
    * Returns current dropdown input value
    */
  def apply(behavior: `get value`): js.Any = js.native
  /**
    * Hides all other dropdowns that is not current dropdown
    */
  def apply(behavior: `hide others`): JQuery = js.native
  /**
    * Returns whether dropdown is animated
    */
  def apply(behavior: `is animated`): Boolean = js.native
  /**
    * Returns whether dropdown is hidden
    */
  def apply(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether dropdown is a selection dropdown
    */
  def apply(behavior: `is selection`): Boolean = js.native
  /**
    * Returns whether dropdown is visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Removes dropdown active state
    */
  def apply(behavior: `remove active`): JQuery = js.native
  /**
    * Remove value from selected
    */
  def apply(behavior: `remove selected`, value: js.Any): JQuery = js.native
  /**
    * Removes dropdown visible state
    */
  def apply(behavior: `remove visible`): JQuery = js.native
  /**
    * Restores dropdown text to its value on page load
    */
  def apply(behavior: `restore default text`): JQuery = js.native
  /**
    * Restores dropdown value to its value on page load
    */
  def apply(behavior: `restore default value`): JQuery = js.native
  /**
    * Restores dropdown text and value to its value on page load
    */
  def apply(behavior: `restore defaults`): JQuery = js.native
  /**
    * Restores dropdown text to its prompt, placeholder text
    */
  def apply(behavior: `restore placeholder text`): JQuery = js.native
  /**
    * Saves current text and value as new defaults (for use with restore)
    */
  def apply(behavior: `save defaults`): JQuery = js.native
  /**
    * Sets dropdown to active state
    */
  def apply(behavior: `set active`): JQuery = js.native
  /**
    * Sets selected values to exactly specified values, removing current selection
    */
  def apply(behavior: `set exactly`, values: js.Array[_]): JQuery = js.native
  /**
    * Sets value as selected
    */
  def apply(behavior: `set selected`, value: js.Any): JQuery = js.native
  /**
    * Adds a group of values as selected
    */
  def apply(behavior: `set selected`, values: js.Array[_]): JQuery = js.native
  /**
    * Sets dropdown text to a value
    */
  def apply(behavior: `set text`, text: String): JQuery = js.native
  /**
    * Sets dropdown input to value (does not update display state)
    */
  def apply(behavior: `set value`, value: js.Any): JQuery = js.native
  /**
    * Sets dropdown to visible state
    */
  def apply(behavior: `set visible`): JQuery = js.native
  /**
    * Recreates dropdown menu from select option values.
    */
  def apply(behavior: `setup menu`): JQuery = js.native
  /**
    * Unbinds document intent click
    */
  def apply(behavior: `unbind intent`): JQuery = js.native
  /**
    * Clears dropdown of selection
    */
  def apply(behavior: clear): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides dropdown
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Refreshes all cached selectors and data
    */
  def apply(behavior: refresh): JQuery = js.native
  def apply(behavior: setting, value: DropdownSettings): JQuery = js.native
  /**
    * Shows dropdown
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles current visibility of dropdown
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: DropdownSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

