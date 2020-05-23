package typings.stremioAddonSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryWhitelist extends js.Object {
  /**
    * Hints it's restricted to particular countries.
    *
    * Array of ISO 3166-1 alpha-3 country codes in lowercase in which the stream is accessible.
    */
  var countryWhitelist: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If defined, addons with the same behaviorHints.group will be chosen automatically for binge watching.
    *
    * This should be something that identifies the stream's nature within your addon.
    * For example, if your addon is called "gobsAddon", and the stream is 720p, the group should be "gobsAddon-720p".
    * If the next episode has a stream with the same group, stremio should select that stream implicitly.
    */
  var group: js.UndefOr[String] = js.undefined
  /**
    * **Not implemented yet!**
    *
    * HTTP headers to use when trying to playback url.
    * Only applies to urls.
    *
    * @readonly
    * @ignore
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  /**
    * Applies if the protocol of the url is http(s).
    *
    * Needs to be set to true if the URL does not support https or is not an MP4 file.
    */
  var notWebReady: js.UndefOr[Boolean] = js.undefined
}

object CountryWhitelist {
  @scala.inline
  def apply(
    countryWhitelist: js.Array[String] = null,
    group: String = null,
    headers: js.Any = null,
    notWebReady: js.UndefOr[Boolean] = js.undefined
  ): CountryWhitelist = {
    val __obj = js.Dynamic.literal()
    if (countryWhitelist != null) __obj.updateDynamic("countryWhitelist")(countryWhitelist.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(notWebReady)) __obj.updateDynamic("notWebReady")(notWebReady.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryWhitelist]
  }
}

