package typings
package sendmailLib.sendmailMod.sendMailFactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Default: localhost */
  var devHost: js.UndefOr[java.lang.String] = js.undefined
  /** Default: False */
  var devPort: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /** Default: False */
  var dkim: js.UndefOr[scala.Boolean | sendmailLib.Anon_KeySelector] = js.undefined
  var logger: js.UndefOr[sendmailLib.Anon_Debug] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /** Default: -1 - extra smtp host after resolveMX */
  var smtpHost: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Default: 25 */
  var smtpPort: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    devHost: java.lang.String = null,
    devPort: scala.Double | scala.Boolean = null,
    dkim: scala.Boolean | sendmailLib.Anon_KeySelector = null,
    logger: sendmailLib.Anon_Debug = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    smtpHost: java.lang.String | scala.Double = null,
    smtpPort: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (devHost != null) __obj.updateDynamic("devHost")(devHost)
    if (devPort != null) __obj.updateDynamic("devPort")(devPort.asInstanceOf[js.Any])
    if (dkim != null) __obj.updateDynamic("dkim")(dkim.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (smtpHost != null) __obj.updateDynamic("smtpHost")(smtpHost.asInstanceOf[js.Any])
    if (smtpPort != null) __obj.updateDynamic("smtpPort")(smtpPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

