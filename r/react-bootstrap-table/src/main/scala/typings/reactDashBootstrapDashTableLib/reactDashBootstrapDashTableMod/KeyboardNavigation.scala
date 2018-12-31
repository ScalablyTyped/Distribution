package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardNavigation extends js.Object {
  /**
  	 * Set to false to disable click to navigate, usually user wants to click to select row instead of navigation.
  	 */
  var clickToNav: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Return a style object which will be applied on the navigating cell.
  	 */
  var customStyle: js.UndefOr[
    js.Function2[/* cell */ js.Any, /* row */ js.Any, reactLib.reactMod.ReactNs.CSSProperties]
  ] = js.undefined
  /**
  	 * Return a style object which will be applied on the both of navigating and editing cell.
  	 */
  var customStyleOnEditCell: js.UndefOr[
    js.Function2[/* cell */ js.Any, /* row */ js.Any, reactLib.reactMod.ReactNs.CSSProperties]
  ] = js.undefined
  /**
  	 * When set to true, pressing ENTER will begin to edit the cell if cellEdit is also enabled.
  	 */
  var enterToEdit: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When set to true, pressing ENTER will expand or collapse the current row.
  	 */
  var enterToExpand: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When set to true, pressing ENTER will select or unselect the current row.
  	 */
  var enterToSelect: js.UndefOr[scala.Boolean] = js.undefined
}

