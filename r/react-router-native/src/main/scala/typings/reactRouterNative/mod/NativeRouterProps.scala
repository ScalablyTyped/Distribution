package typings.reactRouterNative.mod

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
    initialIndex: js.UndefOr[Double] = js.undefined,
    keyLength: js.UndefOr[Double] = js.undefined
  ): NativeRouterProps = {
    val __obj = js.Dynamic.literal()
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(getUserConfirmation.asInstanceOf[js.Any])
    if (initialEntries != null) __obj.updateDynamic("initialEntries")(initialEntries.asInstanceOf[js.Any])
    if (!js.isUndefined(initialIndex)) __obj.updateDynamic("initialIndex")(initialIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyLength)) __obj.updateDynamic("keyLength")(keyLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeRouterProps]
  }
}

