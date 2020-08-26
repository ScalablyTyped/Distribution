package typings.stremioAddonSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountryWhitelist extends js.Object {
  /**
    * Hints it's restricted to particular countries.
    *
    * Array of ISO 3166-1 alpha-3 country codes in lowercase in which the stream is accessible.
    */
  var countryWhitelist: js.UndefOr[js.Array[String]] = js.native
  /**
    * If defined, addons with the same behaviorHints.group will be chosen automatically for binge watching.
    *
    * This should be something that identifies the stream's nature within your addon.
    * For example, if your addon is called "gobsAddon", and the stream is 720p, the group should be "gobsAddon-720p".
    * If the next episode has a stream with the same group, stremio should select that stream implicitly.
    */
  var group: js.UndefOr[String] = js.native
  /**
    * **Not implemented yet!**
    *
    * HTTP headers to use when trying to playback url.
    * Only applies to urls.
    *
    * @readonly
    * @ignore
    */
  var headers: js.UndefOr[js.Any] = js.native
  /**
    * Applies if the protocol of the url is http(s).
    *
    * Needs to be set to true if the URL does not support https or is not an MP4 file.
    */
  var notWebReady: js.UndefOr[Boolean] = js.native
}

object CountryWhitelist {
  @scala.inline
  def apply(): CountryWhitelist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryWhitelist]
  }
  @scala.inline
  implicit class CountryWhitelistOps[Self <: CountryWhitelist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCountryWhitelistVarargs(value: String*): Self = this.set("countryWhitelist", js.Array(value :_*))
    @scala.inline
    def setCountryWhitelist(value: js.Array[String]): Self = this.set("countryWhitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryWhitelist: Self = this.set("countryWhitelist", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setNotWebReady(value: Boolean): Self = this.set("notWebReady", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotWebReady: Self = this.set("notWebReady", js.undefined)
  }
  
}

