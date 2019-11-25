package typings.reactDashNativeDashVersionDashCheck

import typings.nodeDashFetch.nodeDashFetchMod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentVersion extends js.Object {
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
    * provider name or function that returns promise or value of the latest version
    */
  var provider: js.UndefOr[js.Function0[String]] = js.undefined
}

object Anon_CurrentVersion {
  @scala.inline
  def apply(
    currentVersion: String = null,
    depth: Int | Double = null,
    fetchOptions: RequestInit = null,
    forceUpdate: js.UndefOr[Boolean] = js.undefined,
    ignoreErrors: js.UndefOr[Boolean] = js.undefined,
    latestVersion: String = null,
    provider: () => String = null
  ): Anon_CurrentVersion = {
    val __obj = js.Dynamic.literal()
    if (currentVersion != null) __obj.updateDynamic("currentVersion")(currentVersion.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(forceUpdate)) __obj.updateDynamic("forceUpdate")(forceUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.asInstanceOf[js.Any])
    if (latestVersion != null) __obj.updateDynamic("latestVersion")(latestVersion.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(js.Any.fromFunction0(provider))
    __obj.asInstanceOf[Anon_CurrentVersion]
  }
}

