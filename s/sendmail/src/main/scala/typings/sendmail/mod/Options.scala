package typings.sendmail.mod

import typings.sendmail.AnonDebug
import typings.sendmail.AnonKeySelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Default: localhost */
  var devHost: js.UndefOr[String] = js.undefined
  /** Default: False */
  var devPort: js.UndefOr[Double | Boolean] = js.undefined
  /** Default: False */
  var dkim: js.UndefOr[Boolean | AnonKeySelector] = js.undefined
  var logger: js.UndefOr[AnonDebug] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  /** Default: -1 - extra smtp host after resolveMX */
  var smtpHost: js.UndefOr[String | Double] = js.undefined
  /** Default: 25 */
  var smtpPort: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    devHost: String = null,
    devPort: Double | Boolean = null,
    dkim: Boolean | AnonKeySelector = null,
    logger: AnonDebug = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    smtpHost: String | Double = null,
    smtpPort: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (devHost != null) __obj.updateDynamic("devHost")(devHost.asInstanceOf[js.Any])
    if (devPort != null) __obj.updateDynamic("devPort")(devPort.asInstanceOf[js.Any])
    if (dkim != null) __obj.updateDynamic("dkim")(dkim.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (smtpHost != null) __obj.updateDynamic("smtpHost")(smtpHost.asInstanceOf[js.Any])
    if (smtpPort != null) __obj.updateDynamic("smtpPort")(smtpPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

