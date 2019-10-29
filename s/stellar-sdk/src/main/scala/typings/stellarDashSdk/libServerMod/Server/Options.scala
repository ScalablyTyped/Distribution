package typings.stellarDashSdk.libServerMod.Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowHttp: js.UndefOr[Boolean] = js.undefined
  var appName: js.UndefOr[String] = js.undefined
  var appVersion: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(allowHttp: js.UndefOr[Boolean] = js.undefined, appName: String = null, appVersion: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHttp)) __obj.updateDynamic("allowHttp")(allowHttp)
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion)
    __obj.asInstanceOf[Options]
  }
}

