package typings
package simplecrawlerLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InspectOptions extends js.Object {
  var breakLength: js.UndefOr[scala.Double] = js.undefined
  var colors: js.UndefOr[scala.Boolean] = js.undefined
  var customInspect: js.UndefOr[scala.Boolean] = js.undefined
  var depth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var maxArrayLength: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var showHidden: js.UndefOr[scala.Boolean] = js.undefined
  var showProxy: js.UndefOr[scala.Boolean] = js.undefined
}

object InspectOptions {
  @scala.inline
  def apply(
    breakLength: scala.Int | scala.Double = null,
    colors: js.UndefOr[scala.Boolean] = js.undefined,
    customInspect: js.UndefOr[scala.Boolean] = js.undefined,
    depth: scala.Int | scala.Double = null,
    maxArrayLength: scala.Int | scala.Double = null,
    showHidden: js.UndefOr[scala.Boolean] = js.undefined,
    showProxy: js.UndefOr[scala.Boolean] = js.undefined
  ): InspectOptions = {
    val __obj = js.Dynamic.literal()
    if (breakLength != null) __obj.updateDynamic("breakLength")(breakLength.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(customInspect)) __obj.updateDynamic("customInspect")(customInspect)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (maxArrayLength != null) __obj.updateDynamic("maxArrayLength")(maxArrayLength.asInstanceOf[js.Any])
    if (!js.isUndefined(showHidden)) __obj.updateDynamic("showHidden")(showHidden)
    if (!js.isUndefined(showProxy)) __obj.updateDynamic("showProxy")(showProxy)
    __obj.asInstanceOf[InspectOptions]
  }
}

