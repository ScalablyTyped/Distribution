package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestrictionsObject extends js.Object {
  var reason: String
}

object RestrictionsObject {
  @scala.inline
  def apply(reason: String): RestrictionsObject = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RestrictionsObject]
  }
}

