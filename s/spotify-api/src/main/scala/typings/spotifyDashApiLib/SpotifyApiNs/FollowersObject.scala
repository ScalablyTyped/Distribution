package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Followers Object
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait FollowersObject extends js.Object {
  var href: java.lang.String
  var total: scala.Double
}

object FollowersObject {
  @scala.inline
  def apply(href: java.lang.String, total: scala.Double): FollowersObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[FollowersObject]
  }
}

