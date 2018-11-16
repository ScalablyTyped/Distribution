package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ShowSelectedButtonProps extends js.Object {
  /**
  	 * Bootstrap css style class for the button, e.g. 'btn-warning'
  	 */
  var btnContextual: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Glyphicon glyph string for the button, e.g. 'glyphicon-edit'
  	 */
  var btnGlyphicon: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Custom class for the button
  	 */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Function to be called to activate the normal onClick functionality for this button.
  	 */
  var onClick: js.UndefOr[js.Function1[/* e */ reactLib.reactMod.ReactNs.MouseEvent[_], scala.Unit]] = js.undefined
  /**
  	 * Label for when clicking the button will toggle the table back into "show all rows" mode.
  	 */
  var showAllText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Label for when clicking the button will toggle the table into "show only selected rows" mode.
  	 */
  var showOnlySelectText: js.UndefOr[java.lang.String] = js.undefined
}

