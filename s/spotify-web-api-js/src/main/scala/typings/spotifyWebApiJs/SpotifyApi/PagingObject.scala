package typings.spotifyWebApiJs.SpotifyApi

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
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PagingObject[T]]
  }
}

