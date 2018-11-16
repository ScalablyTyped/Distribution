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

