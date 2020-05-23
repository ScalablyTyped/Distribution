package typings.reactPhoneNumberInput.mod

import typings.reactPhoneNumberInput.anon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountrySelectComponentProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The list of all selectable countries (including "International")
    */
  var options: js.UndefOr[js.Array[Icon]] = js.undefined
  var tabIndex: js.UndefOr[Double | String] = js.undefined
  /**
    * The currently selected country code
    */
  var value: js.UndefOr[String] = js.undefined
}

object CountrySelectComponentProps {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onBlur: () => Unit = null,
    onChange: /* value */ js.UndefOr[String] => Unit = null,
    onFocus: () => Unit = null,
    options: js.Array[Icon] = null,
    tabIndex: Double | String = null,
    value: String = null
  ): CountrySelectComponentProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountrySelectComponentProps]
  }
}

