package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Simplified Album Object
     * [album object (simplified)](https://developer.spotify.com/web-api/object-model/#album-object-simplified)
     */

trait AlbumObjectSimplified extends js.Object {
  var album_type: java.lang.String
  var available_markets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var external_urls: ExternalUrlObject
  var href: java.lang.String
  var id: java.lang.String
  var images: js.Array[ImageObject]
  var name: java.lang.String
  var `type`: spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.album
  var uri: java.lang.String
}

