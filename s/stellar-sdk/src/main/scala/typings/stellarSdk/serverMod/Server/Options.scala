package typings.stellarSdk.serverMod.Server

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
    if (!js.isUndefined(allowHttp)) __obj.updateDynamic("allowHttp")(allowHttp.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

