package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Context Object
  * [](https://developer.spotify.com/web-api/object-model/#context-object)
  */
trait ContextObject extends js.Object {
  var external_urls: ExternalUrlObject | scala.Null
  var href: java.lang.String | scala.Null
  var `type`: ContextObjectType
  var uri: java.lang.String
}

object ContextObject {
  @scala.inline
  def apply(
    `type`: ContextObjectType,
    uri: java.lang.String,
    external_urls: ExternalUrlObject = null,
    href: java.lang.String = null
  ): ContextObject = {
    val __obj = js.Dynamic.literal(uri = uri)
    __obj.updateDynamic("type")(`type`)
    if (external_urls != null) __obj.updateDynamic("external_urls")(external_urls)
    if (href != null) __obj.updateDynamic("href")(href)
    __obj.asInstanceOf[ContextObject]
  }
}

