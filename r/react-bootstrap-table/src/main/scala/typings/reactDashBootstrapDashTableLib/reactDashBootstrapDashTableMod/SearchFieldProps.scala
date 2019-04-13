package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFieldProps extends js.Object {
  /**
  	 * Custom css class name
  	 */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Default value for the search field
  	 */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * callback funciton to call when a key is released
  	 */
  var onKeyUp: js.UndefOr[js.Function1[/* e */ reactLib.reactMod.KeyboardEvent[_], scala.Unit]] = js.undefined
  /**
  	 * Placeholder text for the search field
  	 */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
}

object SearchFieldProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    defaultValue: java.lang.String = null,
    onKeyUp: /* e */ reactLib.reactMod.KeyboardEvent[_] => scala.Unit = null,
    placeholder: java.lang.String = null
  ): SearchFieldProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[SearchFieldProps]
  }
}

