package typings
package reactDashScrollableDashAnchorLib.reactDashScrollableDashAnchorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureAnchorsOptions extends js.Object {
  var keepLastAnchorHash: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var scrollDuration: js.UndefOr[scala.Double] = js.undefined
}

object ConfigureAnchorsOptions {
  @scala.inline
  def apply(
    keepLastAnchorHash: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null,
    scrollDuration: scala.Int | scala.Double = null
  ): ConfigureAnchorsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepLastAnchorHash)) __obj.updateDynamic("keepLastAnchorHash")(keepLastAnchorHash)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (scrollDuration != null) __obj.updateDynamic("scrollDuration")(scrollDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureAnchorsOptions]
  }
}

