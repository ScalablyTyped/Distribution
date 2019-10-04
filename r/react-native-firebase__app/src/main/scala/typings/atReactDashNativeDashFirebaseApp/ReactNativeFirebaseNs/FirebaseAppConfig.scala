package typings.atReactDashNativeDashFirebaseApp.ReactNativeFirebaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseAppConfig extends js.Object {
  /**
    *
    */
  var automaticDataCollectionEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true it indicates that Firebase should close database connections
    * automatically when the app is in the background. Disabled by default.
    */
  var automaticResourceManagement: js.UndefOr[Boolean] = js.undefined
  /**
    * The Firebase App name, defaults to [DEFAULT] if none provided.
    */
  var name: js.UndefOr[String] = js.undefined
}

object FirebaseAppConfig {
  @scala.inline
  def apply(
    automaticDataCollectionEnabled: js.UndefOr[Boolean] = js.undefined,
    automaticResourceManagement: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): FirebaseAppConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automaticDataCollectionEnabled)) __obj.updateDynamic("automaticDataCollectionEnabled")(automaticDataCollectionEnabled)
    if (!js.isUndefined(automaticResourceManagement)) __obj.updateDynamic("automaticResourceManagement")(automaticResourceManagement)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[FirebaseAppConfig]
  }
}

