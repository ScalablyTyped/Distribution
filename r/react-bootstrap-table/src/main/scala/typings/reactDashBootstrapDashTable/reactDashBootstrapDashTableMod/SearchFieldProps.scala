package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import typings.react.reactMod.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFieldProps extends js.Object {
  /**
  	 * Custom css class name
  	 */
  var className: js.UndefOr[String] = js.undefined
  /**
  	 * Default value for the search field
  	 */
  var defaultValue: js.UndefOr[String] = js.undefined
  /**
  	 * callback funciton to call when a key is released
  	 */
  var onKeyUp: js.UndefOr[js.Function1[/* e */ KeyboardEvent[_], Unit]] = js.undefined
  /**
  	 * Placeholder text for the search field
  	 */
  var placeholder: js.UndefOr[String] = js.undefined
}

object SearchFieldProps {
  @scala.inline
  def apply(
    className: String = null,
    defaultValue: String = null,
    onKeyUp: /* e */ KeyboardEvent[_] => Unit = null,
    placeholder: String = null
  ): SearchFieldProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFieldProps]
  }
}

