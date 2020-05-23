package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cursor Based Paging Object wrappers used for retrieving collections from the Spotify API.
  * [](https://developer.spotify.com/web-api/object-model/#cursor-based-paging-object)
  */
trait CursorBasedPagingObject[T] extends js.Object {
  var cursors: CursorObject
  var href: String
  var items: js.Array[T]
  var limit: Double
  var next: String
  var total: js.UndefOr[Double] = js.undefined
}

object CursorBasedPagingObject {
  @scala.inline
  def apply[T](
    cursors: CursorObject,
    href: String,
    items: js.Array[T],
    limit: Double,
    next: String,
    total: js.UndefOr[Double] = js.undefined
  ): CursorBasedPagingObject[T] = {
    val __obj = js.Dynamic.literal(cursors = cursors.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorBasedPagingObject[T]]
  }
}

