package typings.spotifyDashApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Paging Object wrapper used for retrieving collections from the Spotify API.
  * [](https://developer.spotify.com/web-api/object-model/#paging-object)
  */
trait PagingObject[T] extends js.Object {
  var href: String
  var items: js.Array[T]
  var limit: Double
  var next: String
  var offset: Double
  var previous: String
  var total: Double
}

object PagingObject {
  @scala.inline
  def apply[T](
    href: String,
    items: js.Array[T],
    limit: Double,
    next: String,
    offset: Double,
    previous: String,
    total: Double
  ): PagingObject[T] = {
    val __obj = js.Dynamic.literal(href = href, items = items, limit = limit, next = next, offset = offset, previous = previous, total = total)
  
    __obj.asInstanceOf[PagingObject[T]]
  }
}

