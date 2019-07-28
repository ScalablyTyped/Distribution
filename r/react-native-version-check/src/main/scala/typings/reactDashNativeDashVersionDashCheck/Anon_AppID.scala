package typings.reactDashNativeDashVersionDashCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppID extends js.Object {
  /**
    * App ID
    */
  var appID: js.UndefOr[String] = js.undefined
  var appName: js.UndefOr[String] = js.undefined
  /**
    * @default true
    */
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
}

object Anon_AppID {
  @scala.inline
  def apply(appID: String = null, appName: String = null, ignoreErrors: js.UndefOr[Boolean] = js.undefined): Anon_AppID = {
    val __obj = js.Dynamic.literal()
    if (appID != null) __obj.updateDynamic("appID")(appID)
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors)
    __obj.asInstanceOf[Anon_AppID]
  }
}

