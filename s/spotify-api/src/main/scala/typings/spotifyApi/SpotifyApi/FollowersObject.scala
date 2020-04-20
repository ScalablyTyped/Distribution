package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Followers Object
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait FollowersObject extends js.Object {
  /**
    * A link to the Web API endpoint providing full details of the followers; `null` if not available.
    * Please note that this will always be set to `null`, as the Web API does not support it at the moment.
    */
  var href: Null
  /**
    * The total number of followers.
    */
  var total: Double
}

object FollowersObject {
  @scala.inline
  def apply(href: Null, total: Double): FollowersObject = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowersObject]
  }
}

