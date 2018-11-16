package typings
package semanticDashUiDashDropdownLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: Should 'value'/'values' parameters be of type 'string' instead of 'any'?
@js.native
trait Dropdown extends js.Object {
  var settings: DropdownSettings = js.native
  def apply(): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Binds a click to document to determine if you click away from a dropdown
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`bind intent`): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Adds mouse events to element
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`bind mouse events`): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Adds touch events to element
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`bind touch events`): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Returns whether event occurred inside dropdown
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`determine intent`): scala.Boolean = js.native
  /**
           * Triggers preset item selection action based on settings passing text/value
           */
  def apply(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`determine select action`,
    text: java.lang.String,
    value: js.Any
  ): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Returns dropdown value as set on page load
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`get default text`): java.lang.String = js.native
  /**
           * Returns DOM element that matches a given input value
           */
  def apply(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`get item`,
    value: js.Any
  ): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Returns placeholder text
           */
  def apply(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`get placeholder text`
  ): java.lang.String = js.native
  /**
           * Returns current dropdown text
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`get text`): java.lang.String = js.native
  /**
           * Returns current dropdown input value
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`get value`): js.Any = js.native
  /**
           * Hides all other dropdowns that is not current dropdown
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`hide others`): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Returns whether dropdown is animated
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`is animated`): scala.Boolean = js.native
  /**
           * Returns whether dropdown is hidden
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`is hidden`): scala.Boolean = js.native
  /**
           * Returns whether dropdown is a selection dropdown
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`is selection`): scala.Boolean = js.native
  /**
           * Returns whether dropdown is visible
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`is visible`): scala.Boolean = js.native
  /**
           * Removes dropdown active state
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`remove active`): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Remove value from selected
           */
  def apply(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`remove selected`,
    value: js.Any
  ): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Removes dropdown visible state
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`remove visible`): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Restores dropdown text to its value on page load
           */
  def apply(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`restore default text`
  ): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Restores dropdown value to its value on page load
           */
  def apply(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`restore default value`
  ): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Restores dropdown text and value to its value on page load
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`restore defaults`): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Restores dropdown text to its prompt, placeholder text
           */
  def apply(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`restore placeholder text`
  ): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Saves current text and value as new defaults (for use with restore)
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`save defaults`): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Sets dropdown to active state
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`set active`): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Sets selected values to exactly specified values, removing current selection
           */
  def apply(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`set exactly`,
    values: js.Array[_]
  ): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Sets value as selected
           */
  def apply(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`set selected`,
    value: js.Any
  ): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Adds a group of values as selected
           */
  def apply(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`set selected`,
    values: js.Array[_]
  ): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Sets dropdown text to a value
           */
  def apply(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`set text`,
    text: java.lang.String
  ): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Sets dropdown input to value (does not update display state)
           */
  def apply(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`set value`,
    value: js.Any
  ): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Sets dropdown to visible state
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`set visible`): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Recreates dropdown menu from select option values.
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`setup menu`): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Unbinds document intent click
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.`unbind intent`): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Clears dropdown of selection
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.clear): semanticDashUiDashDropdownLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.destroy): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Hides dropdown
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.hide): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Refreshes all cached selectors and data
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.refresh): semanticDashUiDashDropdownLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.setting,
    value: DropdownSettings
  ): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Shows dropdown
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.show): semanticDashUiDashDropdownLib.JQuery = js.native
  /**
           * Toggles current visibility of dropdown
           */
  def apply(behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.toggle): semanticDashUiDashDropdownLib.JQuery = js.native
  def apply(settings: DropdownSettings): semanticDashUiDashDropdownLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.setting, name: K): js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.setting,
    name: K,
    value: js.Any
  ): semanticDashUiDashDropdownLib.JQuery = js.native
}

