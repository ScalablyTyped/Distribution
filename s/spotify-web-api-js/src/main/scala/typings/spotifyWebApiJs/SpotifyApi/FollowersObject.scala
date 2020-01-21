package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Followers Object
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait FollowersObject extends js.Object {
  var href: String
  var total: Double
}

object FollowersObject {
  @scala.inline
  def apply(href: String, total: Double): FollowersObject = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FollowersObject]
  }
}

