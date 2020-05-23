package typings.reactNativeVersionCheck.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppID extends js.Object {
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

object AppID {
  @scala.inline
  def apply(appID: String = null, appName: String = null, ignoreErrors: js.UndefOr[Boolean] = js.undefined): AppID = {
    val __obj = js.Dynamic.literal()
    if (appID != null) __obj.updateDynamic("appID")(appID.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppID]
  }
}

