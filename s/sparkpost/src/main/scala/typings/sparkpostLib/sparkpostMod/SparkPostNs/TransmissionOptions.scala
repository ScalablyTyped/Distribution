package typings
package sparkpostLib.sparkpostMod.SparkPostNs

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

