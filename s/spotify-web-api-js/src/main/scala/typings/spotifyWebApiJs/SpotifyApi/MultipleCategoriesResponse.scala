package typings.spotifyWebApiJs.SpotifyApi

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

object MultipleCategoriesResponse {
  @scala.inline
  def apply(categories: PagingObject[CategoryObject]): MultipleCategoriesResponse = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleCategoriesResponse]
  }
}

