package typings.reactDashRouterDashNative.reactDashRouterDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeRouterProps extends js.Object {
  var getUserConfirmation: js.UndefOr[js.Function] = js.undefined
  var initialEntries: js.UndefOr[js.Array[String]] = js.undefined
  var initialIndex: js.UndefOr[Double] = js.undefined
  var keyLength: js.UndefOr[Double] = js.undefined
}

object NativeRouterProps {
  @scala.inline
  def apply(
    getUserConfirmation: js.Function = null,
    initialEntries: js.Array[String] = null,
    initialIndex: Int | Double = null,
    keyLength: Int | Double = null
  ): NativeRouterProps = {
    val __obj = js.Dynamic.literal()
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(getUserConfirmation)
    if (initialEntries != null) __obj.updateDynamic("initialEntries")(initialEntries)
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeRouterProps]
  }
}

