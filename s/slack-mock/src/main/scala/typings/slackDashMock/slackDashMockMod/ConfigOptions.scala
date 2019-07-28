package typings.slackDashMock.slackDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var logLevel: js.UndefOr[String] = js.undefined
  var rtmPort: js.UndefOr[Double] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(logLevel: String = null, rtmPort: Int | Double = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (rtmPort != null) __obj.updateDynamic("rtmPort")(rtmPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

