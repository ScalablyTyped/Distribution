package typings.selectize.Selectize

import org.scalablytyped.runtime.StringDictionary
import typings.selectize.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see https://github.com/brianreavis/selectize.js/blob/master/docs/api.md
@js.native
trait IApi[T, U] extends js.Object {
  /**
    * An array of selected values.
    */
  var items: js.Array[T] = js.native
  /**
    * An object containing the entire pool of options. The object is keyed by each object's value.
    */
  var options: StringDictionary[U] = js.native
  /**
    * "Selects" an item. Adds it to the list at the current caret position.
    */
  def addItem(value: T): Unit = js.native
  def addItem(value: T, silent: Boolean): Unit = js.native
  // Dropdown Options
  // ------------------------------------------------------------------------------------------------------------
  /**
    * Adds an available option. If it already exists, nothing will happen.
    * Note: this does not refresh the options list dropdown (use refreshOptions() for that).
    */
  def addOption(data: U): Unit = js.native
  // Optgroups
  // ------------------------------------------------------------------------------------------------------------
  /**
    * Registers a new optgroup for options to be bucketed into.
    * The "id" argument refers to a value of the property in option identified by the "optgroupField" setting.
    */
  def addOptionGroup(id: String, data: U): Unit = js.native
  /**
    * Forces the control out of focus.
    */
  def blur(): Unit = js.native
  // Selected Items
  // ------------------------------------------------------------------------------------------------------------
  /**
    * Resets / clears all selected items from the control.
    */
  def clear(): Unit = js.native
  def clear(silent: Boolean): Unit = js.native
  /**
    * Clears the render cache. Takes an optional template argument (e.g. "option", "item") to clear only that cache.
    */
  def clearCache(): Unit = js.native
  def clearCache(template: String): Unit = js.native
  /**
    * Removes all options from the control.
    */
  def clearOptions(): Unit = js.native
  /**
    * Closes the autocomplete dropdown menu.
    */
  def close(): Unit = js.native
  /**
    * Invokes the "create" method provided in the selectize options that should provide the data for the
    * new item, given the user input. Once this completes, it will be added to the item list.
    */
  def createItem(value: T): Unit = js.native
  def createItem(value: T, triggerDropdown: Boolean): Unit = js.native
  def createItem(value: T, triggerDropdown: Boolean, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
  // Other
  // ------------------------------------------------------------------------------------------------------------
  /**
    * Destroys the control and unbinds event listeners so that it can be garbage collected.
    */
  def destroy(): Unit = js.native
  /**
    * Disables user input on the control completely. While disabled, it cannot receive focus.
    */
  def disable(): Unit = js.native
  /**
    * Enables the control so that it can respond to focus and user input.
    */
  def enable(): Unit = js.native
  /**
    * Brings the control into focus.
    */
  def focus(): Unit = js.native
  /**
    * Retrieves the jQuery element for the previous or next option, relative to the currently highlighted option.
    * The "direction" argument should be 1 for "next" or -1 for "previous".
    */
  def getAdjacentOption(value: T, direction: Double): Unit = js.native
  /**
    * Returns the jQuery element of the item matching the given value.
    */
  def getItem(value: T): JQuery = js.native
  /**
    * Retrieves the jQuery element for the option identified by the given value.
    */
  def getOption(value: T): JQuery = js.native
  /**
    * Returns the value of the control. If multiple items can be selected (e.g. <select multiple>), this
    * returns an array. If only one item can be selected, this returns a string.
    */
  def getValue(): js.Any = js.native
  /**
    * Returns whether or not the user can select more items.
    */
  def isFull(): Boolean = js.native
  /**
    * Loads options by invoking the the provided function. The function should accept one argument (callback)
    * and invoke the callback with the results once they are available.
    */
  def load(callback: js.Function1[/* results */ js.Any, _]): Unit = js.native
  /**
    * Disables user input on the control (note: the control can still receive focus).
    */
  def lock(): Unit = js.native
  /**
    * Removes an event listener. If no handler is provided, all event listeners are removed.
    */
  def off(eventName: String): Unit = js.native
  def off(eventName: String, handler: js.Function): Unit = js.native
  // Events
  // ------------------------------------------------------------------------------------------------------------
  /**
    * Adds an event listener.
    */
  def on(eventName: String, handler: js.Function): Unit = js.native
  // Dropdown Actions
  // ------------------------------------------------------------------------------------------------------------
  /**
    * Shows the autocomplete dropdown containing the available options.
    */
  def open(): Unit = js.native
  /**
    * Calculates and applies the appropriate position of the dropdown.
    */
  def positionDropdown(): Unit = js.native
  /**
    * Re-renders the selected item lists.
    */
  def refreshItems(): Unit = js.native
  /**
    * Refreshes the list of available options shown in the autocomplete dropdown menu.
    */
  def refreshOptions(triggerDropdown: Boolean): Unit = js.native
  /**
    * Removes the selected item matching the provided value.
    */
  def removeItem(value: T): Unit = js.native
  def removeItem(value: T, silent: Boolean): Unit = js.native
  /**
    * Removes the option identified by the given value.
    */
  def removeOption(value: T): Unit = js.native
  /**
    * Moves the caret to the specified position ("index" being the index in the list of selected items).
    */
  def setCaret(index: Double): Unit = js.native
  /**
    * Resets the selected items to the given value(s).
    */
  def setValue(value: T): Unit = js.native
  def setValue(value: T, silent: Boolean): Unit = js.native
  def setValue(value: js.Array[T]): Unit = js.native
  def setValue(value: js.Array[T], silent: Boolean): Unit = js.native
  /**
    * Triggers event listeners.
    */
  def trigger(eventName: String, args: js.Any*): Unit = js.native
  /**
    * Re-enables user input on the control.
    */
  def unlock(): Unit = js.native
  /**
    * Updates an option available for selection. If it is visible in the selected items or options dropdown,
    * it will be re-rendered automatically.
    */
  def updateOption(value: T, data: U): Unit = js.native
  /**
    * When the `settings.placeholder` value is changed, the new placeholder will be displayed.
    */
  def updatePlaceholder(): Unit = js.native
}

