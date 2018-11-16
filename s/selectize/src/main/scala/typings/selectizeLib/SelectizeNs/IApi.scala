package typings
package selectizeLib.SelectizeNs

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
  var options: ScalablyTyped.runtime.StringDictionary[U] = js.native
  /**
           * "Selects" an item. Adds it to the list at the current caret position.
           */
  def addItem(value: T): scala.Unit = js.native
  /**
           * "Selects" an item. Adds it to the list at the current caret position.
           */
  def addItem(value: T, silent: scala.Boolean): scala.Unit = js.native
  // Dropdown Options
  // ------------------------------------------------------------------------------------------------------------
  /**
           * Adds an available option. If it already exists, nothing will happen.
           * Note: this does not refresh the options list dropdown (use refreshOptions() for that).
           */
  def addOption(data: U): scala.Unit = js.native
  // Optgroups
  // ------------------------------------------------------------------------------------------------------------
  /**
           * Registers a new optgroup for options to be bucketed into.
           * The "id" argument refers to a value of the property in option identified by the "optgroupField" setting.
           */
  def addOptionGroup(id: java.lang.String, data: U): scala.Unit = js.native
  /**
           * Forces the control out of focus.
           */
  def blur(): scala.Unit = js.native
  // Selected Items
  // ------------------------------------------------------------------------------------------------------------
  /**
           * Resets / clears all selected items from the control.
           */
  def clear(): scala.Unit = js.native
  // Selected Items
  // ------------------------------------------------------------------------------------------------------------
  /**
           * Resets / clears all selected items from the control.
           */
  def clear(silent: scala.Boolean): scala.Unit = js.native
  /**
           * Clears the render cache. Takes an optional template argument (e.g. "option", "item") to clear only that cache.
           */
  def clearCache(): scala.Unit = js.native
  /**
           * Clears the render cache. Takes an optional template argument (e.g. "option", "item") to clear only that cache.
           */
  def clearCache(template: java.lang.String): scala.Unit = js.native
  /**
           * Removes all options from the control.
           */
  def clearOptions(): scala.Unit = js.native
  /**
           * Closes the autocomplete dropdown menu.
           */
  def close(): scala.Unit = js.native
  /**
           * Invokes the "create" method provided in the selectize options that should provide the data for the
           * new item, given the user input. Once this completes, it will be added to the item list.
           */
  def createItem(value: T): scala.Unit = js.native
  /**
           * Invokes the "create" method provided in the selectize options that should provide the data for the
           * new item, given the user input. Once this completes, it will be added to the item list.
           */
  def createItem(value: T, triggerDropdown: scala.Boolean): scala.Unit = js.native
  /**
           * Invokes the "create" method provided in the selectize options that should provide the data for the
           * new item, given the user input. Once this completes, it will be added to the item list.
           */
  def createItem(
    value: T,
    triggerDropdown: scala.Boolean,
    callback: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  // Other
  // ------------------------------------------------------------------------------------------------------------
  /**
           * Destroys the control and unbinds event listeners so that it can be garbage collected.
           */
  def destroy(): scala.Unit = js.native
  /**
           * Disables user input on the control completely. While disabled, it cannot receive focus.
           */
  def disable(): scala.Unit = js.native
  /**
           * Enables the control so that it can respond to focus and user input.
           */
  def enable(): scala.Unit = js.native
  /**
           * Brings the control into focus.
           */
  def focus(): scala.Unit = js.native
  /**
           * Retrieves the jQuery element for the previous or next option, relative to the currently highlighted option.
           * The "direction" argument should be 1 for "next" or -1 for "previous".
           */
  def getAdjacentOption(value: T, direction: scala.Double): scala.Unit = js.native
  /**
           * Returns the jQuery element of the item matching the given value.
           */
  def getItem(value: T): selectizeLib.JQuery = js.native
  /**
           * Retrieves the jQuery element for the option identified by the given value.
           */
  def getOption(value: T): selectizeLib.JQuery = js.native
  /**
           * Returns the value of the control. If multiple items can be selected (e.g. <select multiple>), this
           * returns an array. If only one item can be selected, this returns a string.
           */
  def getValue(): js.Any = js.native
  /**
           * Returns whether or not the user can select more items.
           */
  def isFull(): scala.Boolean = js.native
  /**
           * Loads options by invoking the the provided function. The function should accept one argument (callback)
           * and invoke the callback with the results once they are available.
           */
  def load(callback: js.Function1[/* results */ js.Any, _]): scala.Unit = js.native
  /**
           * Disables user input on the control (note: the control can still receive focus).
           */
  def lock(): scala.Unit = js.native
  /**
           * Removes an event listener. If no handler is provided, all event listeners are removed.
           */
  def off(eventName: java.lang.String): scala.Unit = js.native
  /**
           * Removes an event listener. If no handler is provided, all event listeners are removed.
           */
  def off(eventName: java.lang.String, handler: js.Function): scala.Unit = js.native
  // Events
  // ------------------------------------------------------------------------------------------------------------
  /**
           * Adds an event listener.
           */
  def on(eventName: java.lang.String, handler: js.Function): scala.Unit = js.native
  // Dropdown Actions
  // ------------------------------------------------------------------------------------------------------------
  /**
           * Shows the autocomplete dropdown containing the available options.
           */
  def open(): scala.Unit = js.native
  /**
           * Calculates and applies the appropriate position of the dropdown.
           */
  def positionDropdown(): scala.Unit = js.native
  /**
           * Re-renders the selected item lists.
           */
  def refreshItems(): scala.Unit = js.native
  /**
           * Refreshes the list of available options shown in the autocomplete dropdown menu.
           */
  def refreshOptions(triggerDropdown: scala.Boolean): scala.Unit = js.native
  /**
           * Removes the selected item matching the provided value.
           */
  def removeItem(value: T): scala.Unit = js.native
  /**
           * Removes the selected item matching the provided value.
           */
  def removeItem(value: T, silent: scala.Boolean): scala.Unit = js.native
  /**
           * Removes the option identified by the given value.
           */
  def removeOption(value: T): scala.Unit = js.native
  /**
           * Moves the caret to the specified position ("index" being the index in the list of selected items).
           */
  def setCaret(index: scala.Double): scala.Unit = js.native
  /**
           * Resets the selected items to the given value(s).
           */
  def setValue(value: T): scala.Unit = js.native
  /**
           * Resets the selected items to the given value(s).
           */
  def setValue(value: T, silent: scala.Boolean): scala.Unit = js.native
  def setValue(value: js.Array[T]): scala.Unit = js.native
  def setValue(value: js.Array[T], silent: scala.Boolean): scala.Unit = js.native
  /**
           * Triggers event listeners.
           */
  def trigger(eventName: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
           * Re-enables user input on the control.
           */
  def unlock(): scala.Unit = js.native
  /**
           * Updates an option available for selection. If it is visible in the selected items or options dropdown,
           * it will be re-rendered automatically.
           */
  def updateOption(value: T, data: U): scala.Unit = js.native
  /**
           * When the `settings.placeholder` value is changed, the new placeholder will be displayed.
           */
  def updatePlaceholder(): scala.Unit = js.native
}

