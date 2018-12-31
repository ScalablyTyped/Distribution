package typings
package semanticDashUiDashDropdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("dropdown")
  var dropdown_Original: semanticDashUiDashDropdownLib.SemanticUINs.Dropdown = js.native
  def dropdown(): JQuery = js.native
  def dropdown(settings: semanticDashUiDashDropdownLib.SemanticUINs.DropdownSettings): JQuery = js.native
  /**
    * Binds a click to document to determine if you click away from a dropdown
    */
  @JSName("dropdown")
  def `dropdown_bind intent`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`bind intent`): JQuery = js.native
  /**
    * Adds mouse events to element
    */
  @JSName("dropdown")
  def `dropdown_bind mouse events`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`bind mouse events`): JQuery = js.native
  /**
    * Adds touch events to element
    */
  @JSName("dropdown")
  def `dropdown_bind touch events`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`bind touch events`): JQuery = js.native
  /**
    * Clears dropdown of selection
    */
  @JSName("dropdown")
  def dropdown_clear(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.clear): JQuery = js.native
  @JSName("dropdown")
  def dropdown_destroy(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.destroy): JQuery = js.native
  /**
    * Returns whether event occurred inside dropdown
    */
  @JSName("dropdown")
  def `dropdown_determine intent`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`determine intent`): scala.Boolean = js.native
  /**
    * Triggers preset item selection action based on settings passing text/value
    */
  @JSName("dropdown")
  def `dropdown_determine select action`(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`determine select action`,
    text: java.lang.String,
    value: js.Any
  ): JQuery = js.native
  /**
    * Returns dropdown value as set on page load
    */
  @JSName("dropdown")
  def `dropdown_get default text`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`get default text`): java.lang.String = js.native
  /**
    * Returns DOM element that matches a given input value
    */
  @JSName("dropdown")
  def `dropdown_get item`(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`get item`,
    value: js.Any
  ): JQuery = js.native
  /**
    * Returns placeholder text
    */
  @JSName("dropdown")
  def `dropdown_get placeholder text`(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`get placeholder text`
  ): java.lang.String = js.native
  /**
    * Returns current dropdown text
    */
  @JSName("dropdown")
  def `dropdown_get text`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`get text`): java.lang.String = js.native
  /**
    * Returns current dropdown input value
    */
  @JSName("dropdown")
  def `dropdown_get value`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`get value`): js.Any = js.native
  /**
    * Hides dropdown
    */
  @JSName("dropdown")
  def dropdown_hide(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.hide): JQuery = js.native
  /**
    * Hides all other dropdowns that is not current dropdown
    */
  @JSName("dropdown")
  def `dropdown_hide others`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`hide others`): JQuery = js.native
  /**
    * Returns whether dropdown is animated
    */
  @JSName("dropdown")
  def `dropdown_is animated`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`is animated`): scala.Boolean = js.native
  /**
    * Returns whether dropdown is hidden
    */
  @JSName("dropdown")
  def `dropdown_is hidden`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`is hidden`): scala.Boolean = js.native
  /**
    * Returns whether dropdown is a selection dropdown
    */
  @JSName("dropdown")
  def `dropdown_is selection`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`is selection`): scala.Boolean = js.native
  /**
    * Returns whether dropdown is visible
    */
  @JSName("dropdown")
  def `dropdown_is visible`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`is visible`): scala.Boolean = js.native
  /**
    * Refreshes all cached selectors and data
    */
  @JSName("dropdown")
  def dropdown_refresh(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.refresh): JQuery = js.native
  /**
    * Removes dropdown active state
    */
  @JSName("dropdown")
  def `dropdown_remove active`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`remove active`): JQuery = js.native
  /**
    * Remove value from selected
    */
  @JSName("dropdown")
  def `dropdown_remove selected`(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`remove selected`,
    value: js.Any
  ): JQuery = js.native
  /**
    * Removes dropdown visible state
    */
  @JSName("dropdown")
  def `dropdown_remove visible`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`remove visible`): JQuery = js.native
  /**
    * Restores dropdown text to its value on page load
    */
  @JSName("dropdown")
  def `dropdown_restore default text`(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`restore default text`
  ): JQuery = js.native
  /**
    * Restores dropdown value to its value on page load
    */
  @JSName("dropdown")
  def `dropdown_restore default value`(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`restore default value`
  ): JQuery = js.native
  /**
    * Restores dropdown text and value to its value on page load
    */
  @JSName("dropdown")
  def `dropdown_restore defaults`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`restore defaults`): JQuery = js.native
  /**
    * Restores dropdown text to its prompt, placeholder text
    */
  @JSName("dropdown")
  def `dropdown_restore placeholder text`(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`restore placeholder text`
  ): JQuery = js.native
  /**
    * Saves current text and value as new defaults (for use with restore)
    */
  @JSName("dropdown")
  def `dropdown_save defaults`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`save defaults`): JQuery = js.native
  /**
    * Sets dropdown to active state
    */
  @JSName("dropdown")
  def `dropdown_set active`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`set active`): JQuery = js.native
  /**
    * Sets selected values to exactly specified values, removing current selection
    */
  @JSName("dropdown")
  def `dropdown_set exactly`(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`set exactly`,
    values: js.Array[_]
  ): JQuery = js.native
  /**
    * Sets value as selected
    */
  @JSName("dropdown")
  def `dropdown_set selected`(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`set selected`,
    value: js.Any
  ): JQuery = js.native
  /**
    * Adds a group of values as selected
    */
  @JSName("dropdown")
  def `dropdown_set selected`(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`set selected`,
    values: js.Array[_]
  ): JQuery = js.native
  /**
    * Sets dropdown text to a value
    */
  @JSName("dropdown")
  def `dropdown_set text`(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`set text`,
    text: java.lang.String
  ): JQuery = js.native
  /**
    * Sets dropdown input to value (does not update display state)
    */
  @JSName("dropdown")
  def `dropdown_set value`(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`set value`,
    value: js.Any
  ): JQuery = js.native
  /**
    * Sets dropdown to visible state
    */
  @JSName("dropdown")
  def `dropdown_set visible`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`set visible`): JQuery = js.native
  @JSName("dropdown")
  def dropdown_setting(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.setting,
    value: semanticDashUiDashDropdownLib.SemanticUINs.DropdownSettings
  ): JQuery = js.native
  @JSName("dropdown")
  def dropdown_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl[K] */ js.Any = js.native
  @JSName("dropdown")
  def dropdown_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Recreates dropdown menu from select option values.
    */
  @JSName("dropdown")
  def `dropdown_setup menu`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`setup menu`): JQuery = js.native
  /**
    * Shows dropdown
    */
  @JSName("dropdown")
  def dropdown_show(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.show): JQuery = js.native
  /**
    * Toggles current visibility of dropdown
    */
  @JSName("dropdown")
  def dropdown_toggle(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.toggle): JQuery = js.native
  /**
    * Unbinds document intent click
    */
  @JSName("dropdown")
  def `dropdown_unbind intent`(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`unbind intent`): JQuery = js.native
}

