package typings.spotifyDashApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Error object
  * [error object](https://developer.spotify.com/web-api/object-model/)
  */
trait ErrorObject extends js.Object {
  var message: String
  var status: Double
}

object ErrorObject {
  @scala.inline
  def apply(message: String, status: Double): ErrorObject = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorObject]
  }
}

