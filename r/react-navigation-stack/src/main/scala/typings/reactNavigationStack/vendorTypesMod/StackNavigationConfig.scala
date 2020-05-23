package typings.reactNavigationStack.vendorTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackNavigationConfig extends js.Object {
  var headerMode: js.UndefOr[StackHeaderMode] = js.undefined
  /**
    * If `false`, the keyboard will NOT automatically dismiss when navigating to a new screen.
    * Defaults to `true`.
    */
  var keyboardHandlingEnabled: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[StackCardMode] = js.undefined
}

object StackNavigationConfig {
  @scala.inline
  def apply(
    headerMode: StackHeaderMode = null,
    keyboardHandlingEnabled: js.UndefOr[Boolean] = js.undefined,
    mode: StackCardMode = null
  ): StackNavigationConfig = {
    val __obj = js.Dynamic.literal()
    if (headerMode != null) __obj.updateDynamic("headerMode")(headerMode.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardHandlingEnabled)) __obj.updateDynamic("keyboardHandlingEnabled")(keyboardHandlingEnabled.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackNavigationConfig]
  }
}

