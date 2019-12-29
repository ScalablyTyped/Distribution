package typings.reactDashBetterDashPassword.reactDashBetterDashPasswordMod

import typings.reactDashBetterDashPassword.reactDashBetterDashPasswordStrings.Bullet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var mask: js.UndefOr[Bullet | String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object PasswordProps {
  @scala.inline
  def apply(
    className: String = null,
    mask: Bullet | String = null,
    onChange: /* value */ String => Unit = null,
    placeholder: String = null,
    show: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    value: String = null
  ): PasswordProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordProps]
  }
}

