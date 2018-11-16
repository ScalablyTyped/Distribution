package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Parameter Objects for searching
//
/**
     * Object for search parameters for searching for tracks, playlists, artists or albums.
     * See: [Search for an item](https://developer.spotify.com/web-api/search-item/)
     *
     * q and type are not optional in the API, however they are marked as optional here, since various libraries
     * implement them as function call parameters instead. This could be changed.
     *
     * @param q Required. The search query's keywords (and optional field filters and operators).
     * @param type Required. A comma-separated list of item types to search across. Valid types are: album, artist, playlist, and track.
     * @param market Optional. An ISO 3166-1 alpha-2 country code or the string from_token
     * @param limit Optional. The maximum number of results to return. Default: 20. Minimum: 1. Maximum: 50.
     * @param offset Optional. The index of the first result to return. Default: 0 (i.e., the first result). Maximum offset: 100.000. Use with limit to get the next page of search results.
     */

trait SearchForItemParameterObject extends js.Object {
  var limit: js.UndefOr[scala.Double] = js.undefined
  var market: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var q: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

