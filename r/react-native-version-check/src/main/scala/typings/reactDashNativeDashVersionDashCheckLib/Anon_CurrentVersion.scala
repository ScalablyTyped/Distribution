package typings
package reactDashNativeDashVersionDashCheckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentVersion extends js.Object {
  /**
    * app's current version from getCurrentVersion()
    */
  var currentVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default Infinity
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * isomorphic-fetch options (https://github.github.io/fetch/)
    */
  var fetchOptions: js.UndefOr[nodeDashFetchLib.nodeDashFetchMod.RequestInit] = js.undefined
  /**
    * @default false
    */
  var forceUpdate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default true
    */
  var ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * app's latest version from getLatestVersion()
    */
  var latestVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * provider name or function that returns promise or value of the latest version
    */
  var provider: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

object Anon_CurrentVersion {
  @scala.inline
  def apply(
    currentVersion: java.lang.String = null,
    depth: scala.Int | scala.Double = null,
    fetchOptions: nodeDashFetchLib.nodeDashFetchMod.RequestInit = null,
    forceUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined,
    latestVersion: java.lang.String = null,
    provider: () => java.lang.String = null
  ): Anon_CurrentVersion = {
    val __obj = js.Dynamic.literal()
    if (currentVersion != null) __obj.updateDynamic("currentVersion")(currentVersion)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions)
    if (!js.isUndefined(forceUpdate)) __obj.updateDynamic("forceUpdate")(forceUpdate)
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors)
    if (latestVersion != null) __obj.updateDynamic("latestVersion")(latestVersion)
    if (provider != null) __obj.updateDynamic("provider")(js.Any.fromFunction0(provider))
    __obj.asInstanceOf[Anon_CurrentVersion]
  }
}

