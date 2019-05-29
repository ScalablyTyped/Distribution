package typings
package reactDashNativeDashVersionDashCheckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FetchOptions extends js.Object {
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
    * provider name or function that returns promise or value of the latest version
    */
  var provider: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

object Anon_FetchOptions {
  @scala.inline
  def apply(
    fetchOptions: nodeDashFetchLib.nodeDashFetchMod.RequestInit = null,
    forceUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined,
    provider: () => java.lang.String = null
  ): Anon_FetchOptions = {
    val __obj = js.Dynamic.literal()
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions)
    if (!js.isUndefined(forceUpdate)) __obj.updateDynamic("forceUpdate")(forceUpdate)
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors)
    if (provider != null) __obj.updateDynamic("provider")(js.Any.fromFunction0(provider))
    __obj.asInstanceOf[Anon_FetchOptions]
  }
}

