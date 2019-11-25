package typings.reactDashNativeDashVersionDashCheck

import typings.nodeDashFetch.nodeDashFetchMod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FetchOptions extends js.Object {
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
    * provider name or function that returns promise or value of the latest version
    */
  var provider: js.UndefOr[js.Function0[String]] = js.undefined
}

object Anon_FetchOptions {
  @scala.inline
  def apply(
    fetchOptions: RequestInit = null,
    forceUpdate: js.UndefOr[Boolean] = js.undefined,
    ignoreErrors: js.UndefOr[Boolean] = js.undefined,
    provider: () => String = null
  ): Anon_FetchOptions = {
    val __obj = js.Dynamic.literal()
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(forceUpdate)) __obj.updateDynamic("forceUpdate")(forceUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(js.Any.fromFunction0(provider))
    __obj.asInstanceOf[Anon_FetchOptions]
  }
}

