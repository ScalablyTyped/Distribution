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

object SizePerPageDropDownProps {
  @scala.inline
  def apply(
    btnContextual: java.lang.String = null,
    className: java.lang.String = null,
    currSizePerPage: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: /* toggleDropDown */ js.Function0[scala.Unit] => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    options: js.Array[scala.Double] | js.Array[reactDashBootstrapDashTableLib.Anon_Text] = null,
    variation: DropDirection = null
  ): SizePerPageDropDownProps = {
    val __obj = js.Dynamic.literal()
    if (btnContextual != null) __obj.updateDynamic("btnContextual")(btnContextual)
    if (className != null) __obj.updateDynamic("className")(className)
    if (currSizePerPage != null) __obj.updateDynamic("currSizePerPage")(currSizePerPage)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (variation != null) __obj.updateDynamic("variation")(variation)
    __obj.asInstanceOf[SizePerPageDropDownProps]
  }
}

