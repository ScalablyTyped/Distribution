package typings
package reactDashBetterDashPasswordLib.reactDashBetterDashPasswordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var mask: js.UndefOr[
    reactDashBetterDashPasswordLib.reactDashBetterDashPasswordLibStrings.BACKSLASHu2022 | java.lang.String
  ] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object PasswordProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    mask: reactDashBetterDashPasswordLib.reactDashBetterDashPasswordLibStrings.BACKSLASHu2022 | java.lang.String = null,
    onChange: js.Function1[/* value */ java.lang.String, scala.Unit] = null,
    placeholder: java.lang.String = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    value: java.lang.String = null
  ): PasswordProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PasswordProps]
  }
}

