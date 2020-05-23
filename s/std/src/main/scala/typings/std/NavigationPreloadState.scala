package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPreloadState extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var headerValue: js.UndefOr[java.lang.String] = js.undefined
}

object NavigationPreloadState {
  @scala.inline
  def apply(enabled: js.UndefOr[scala.Boolean] = js.undefined, headerValue: java.lang.String = null): NavigationPreloadState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (headerValue != null) __obj.updateDynamic("headerValue")(headerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPreloadState]
  }
}

