package typings
package sparkpostLib.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransmissionOptions extends js.Object {
  /** Whether click tracking is enabled for this transmission */
  var click_tracking: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to perform CSS inlining in HTML content */
  var inline_css: js.UndefOr[scala.Boolean] = js.undefined
  /** The ID of a dedicated IP pool associated with your account ( Note: SparkPost only ). */
  var ip_pool: js.UndefOr[java.lang.String] = js.undefined
  /** Whether open tracking is enabled for this transmission */
  var open_tracking: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to use the sandbox sending domain */
  var sandbox: js.UndefOr[scala.Boolean] = js.undefined
  /** SparkPost Enterprise API only: Whether or not to ignore customer suppression rules, for this transmission only. Only applicable if your configuration supports this parameter. */
  var skip_suppression: js.UndefOr[scala.Boolean] = js.undefined
  /** Delay generation of messages until this datetime. */
  var start_time: js.UndefOr[java.lang.String] = js.undefined
  /** Whether message is transactional or non-transactional for unsubscribe and suppression purposes */
  var transactional: js.UndefOr[scala.Boolean] = js.undefined
}

object TransmissionOptions {
  @scala.inline
  def apply(
    click_tracking: js.UndefOr[scala.Boolean] = js.undefined,
    inline_css: js.UndefOr[scala.Boolean] = js.undefined,
    ip_pool: java.lang.String = null,
    open_tracking: js.UndefOr[scala.Boolean] = js.undefined,
    sandbox: js.UndefOr[scala.Boolean] = js.undefined,
    skip_suppression: js.UndefOr[scala.Boolean] = js.undefined,
    start_time: java.lang.String = null,
    transactional: js.UndefOr[scala.Boolean] = js.undefined
  ): TransmissionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(click_tracking)) __obj.updateDynamic("click_tracking")(click_tracking)
    if (!js.isUndefined(inline_css)) __obj.updateDynamic("inline_css")(inline_css)
    if (ip_pool != null) __obj.updateDynamic("ip_pool")(ip_pool)
    if (!js.isUndefined(open_tracking)) __obj.updateDynamic("open_tracking")(open_tracking)
    if (!js.isUndefined(sandbox)) __obj.updateDynamic("sandbox")(sandbox)
    if (!js.isUndefined(skip_suppression)) __obj.updateDynamic("skip_suppression")(skip_suppression)
    if (start_time != null) __obj.updateDynamic("start_time")(start_time)
    if (!js.isUndefined(transactional)) __obj.updateDynamic("transactional")(transactional)
    __obj.asInstanceOf[TransmissionOptions]
  }
}

