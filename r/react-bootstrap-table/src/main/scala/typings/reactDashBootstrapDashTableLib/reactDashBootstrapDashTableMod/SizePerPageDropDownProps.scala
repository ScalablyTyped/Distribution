package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizePerPageDropDownProps extends js.Object {
  /**
  	 * Bootstrap css style class for the button, e.g. 'btn-warning'
  	 */
  var btnContextual: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Custom class name to use for the component.
  	 */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Current size per page
  	 */
  var currSizePerPage: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Flag to indicate that the dropdown is currently hidden
  	 */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Callback function that should be triggered when the user clicks on the dropdown button.
  	 */
  var onClick: js.UndefOr[js.Function1[/* toggleDropDown */ js.Function0[scala.Unit], scala.Unit]] = js.undefined
  /**
  	 * Flag to indicate that the dropdown is open
  	 */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Size Per Page options list
  	 */
  var options: js.UndefOr[js.Array[scala.Double] | js.Array[reactDashBootstrapDashTableLib.Anon_Text]] = js.undefined
  /**
  	 * Whether the button menu should 'dropup' or 'dropdown'.
  	 */
  var variation: js.UndefOr[DropDirection] = js.undefined
}

