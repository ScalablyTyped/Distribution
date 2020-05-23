package typings.reactNativeVersionCheck.anon

import typings.nodeFetch.mod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions extends js.Object {
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
    * Package name or function that returns promise or value of package name
    */
  var packageName: js.UndefOr[String | js.Function0[String]] = js.undefined
  /**
    * provider name or function that returns promise or value of the latest version
    */
  var provider: js.UndefOr[js.Function0[String] | String] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply(
    fetchOptions: RequestInit = null,
    forceUpdate: js.UndefOr[Boolean] = js.undefined,
    ignoreErrors: js.UndefOr[Boolean] = js.undefined,
    packageName: String | js.Function0[String] = null,
    provider: js.Function0[String] | String = null
  ): FetchOptions = {
    val __obj = js.Dynamic.literal()
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(forceUpdate)) __obj.updateDynamic("forceUpdate")(forceUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.get.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOptions]
  }
}

