package typings
package reactDashAutocompleteLib.reactDashAutocompleteMod.AutocompleteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  /**
    * Index of the highlighted item, `null` if none currently is.
    */
  var highlightedIndex: scala.Double | scala.Null
  /**
    * True when the menu is visible. Provided to `onMenuVisibilityChange`.
    */
  var isOpen: scala.Boolean
  /**
    * These three `menu___` values are used in CSS to layout the menu.
    */
  var menuLeft: js.UndefOr[scala.Double] = js.undefined
  var menuTop: js.UndefOr[scala.Double] = js.undefined
  var menuWidth: js.UndefOr[scala.Double] = js.undefined
}

object State {
  @scala.inline
  def apply(
    isOpen: scala.Boolean,
    highlightedIndex: scala.Int | scala.Double = null,
    menuLeft: scala.Int | scala.Double = null,
    menuTop: scala.Int | scala.Double = null,
    menuWidth: scala.Int | scala.Double = null
  ): State = {
    val __obj = js.Dynamic.literal(isOpen = isOpen)
    if (highlightedIndex != null) __obj.updateDynamic("highlightedIndex")(highlightedIndex.asInstanceOf[js.Any])
    if (menuLeft != null) __obj.updateDynamic("menuLeft")(menuLeft.asInstanceOf[js.Any])
    if (menuTop != null) __obj.updateDynamic("menuTop")(menuTop.asInstanceOf[js.Any])
    if (menuWidth != null) __obj.updateDynamic("menuWidth")(menuWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

