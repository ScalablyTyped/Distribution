package typings
package reactDashNativeDashVersionDashCheckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppID extends js.Object {
  /**
    * App ID
    */
  var appID: js.UndefOr[java.lang.String] = js.undefined
  var appName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default true
    */
  var ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AppID {
  @scala.inline
  def apply(
    appID: java.lang.String = null,
    appName: java.lang.String = null,
    ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AppID = {
    val __obj = js.Dynamic.literal()
    if (appID != null) __obj.updateDynamic("appID")(appID)
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors)
    __obj.asInstanceOf[Anon_AppID]
  }
}

