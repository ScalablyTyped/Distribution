package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Get a list of categories
     * 
     * GET /v1/browse/categories
     * https://developer.spotify.com/web-api/get-list-categories/
     */

trait MultipleCategoriesResponse extends js.Object {
  var categories: PagingObject[CategoryObject]
}

