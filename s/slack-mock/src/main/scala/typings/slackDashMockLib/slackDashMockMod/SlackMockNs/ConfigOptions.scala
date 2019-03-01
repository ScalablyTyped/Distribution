package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var logLevel: js.UndefOr[java.lang.String] = js.undefined
  var rtmPort: js.UndefOr[scala.Double] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(logLevel: java.lang.String = null, rtmPort: scala.Int | scala.Double = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (rtmPort != null) __obj.updateDynamic("rtmPort")(rtmPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

