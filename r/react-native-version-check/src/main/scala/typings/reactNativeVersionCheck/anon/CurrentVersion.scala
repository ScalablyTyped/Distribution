package typings.reactNativeVersionCheck.anon

import typings.nodeFetch.mod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentVersion extends js.Object {
  /**
    * app's current version from getCurrentVersion()
    */
  var currentVersion: js.UndefOr[String] = js.undefined
  /**
    * @default Infinity
    */
  var depth: js.UndefOr[Double] = js.undefined
  /**
    * isomorphic-fetch options (https://github.github.io/fetch/)
    */
  var fetchOptions: js.UndefOr[RequestInit] = js.undefined
  /**
    * @default false
    */
  var forceUpdate: js.UndefOr[Boolean] = js.undefined
  /**
    * @default true
    */
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * app's latest version from getLatestVersion()
    */
  var latestVersion: js.UndefOr[String] = js.undefined
  /**
    * app's Package Name
    */
  var packageName: js.UndefOr[String] = js.undefined
  /**
    * provider name or function that returns promise or value of the latest version
    */
  var provider: js.UndefOr[js.Function0[String] | String] = js.undefined
}

object CurrentVersion {
  @scala.inline
  def apply(
    currentVersion: String = null,
    depth: js.UndefOr[Double] = js.undefined,
    fetchOptions: RequestInit = null,
    forceUpdate: js.UndefOr[Boolean] = js.undefined,
    ignoreErrors: js.UndefOr[Boolean] = js.undefined,
    latestVersion: String = null,
    packageName: String = null,
    provider: js.Function0[String] | String = null
  ): CurrentVersion = {
    val __obj = js.Dynamic.literal()
    if (currentVersion != null) __obj.updateDynamic("currentVersion")(currentVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(forceUpdate)) __obj.updateDynamic("forceUpdate")(forceUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.get.asInstanceOf[js.Any])
    if (latestVersion != null) __obj.updateDynamic("latestVersion")(latestVersion.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentVersion]
  }
}

