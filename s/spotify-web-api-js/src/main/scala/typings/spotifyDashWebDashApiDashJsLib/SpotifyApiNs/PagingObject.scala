package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Paging Object wrapper used for retrieving collections from the Spotify API.
  * [](https://developer.spotify.com/web-api/object-model/#paging-object)
  */
trait PagingObject[T] extends js.Object {
  var href: java.lang.String
  var items: js.Array[T]
  var limit: scala.Double
  var next: java.lang.String
  var offset: scala.Double
  var previous: java.lang.String
  var total: scala.Double
}

object PagingObject {
  @scala.inline
  def apply[T](
    href: java.lang.String,
    items: js.Array[T],
    limit: scala.Double,
    next: java.lang.String,
    offset: scala.Double,
    previous: java.lang.String,
    total: scala.Double
  ): PagingObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("limit")(limit)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("previous")(previous)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[PagingObject[T]]
  }
}

