package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Error object
  * [error object](https://developer.spotify.com/web-api/object-model/)
  */
trait ErrorObject extends js.Object {
  /**
    * A short description of the cause of the error.
    */
  var message: String
  /**
    * The HTTP status code (also returned in the response header;
    * see [Response Status Codes](https://developer.spotify.com/documentation/web-api/#response-status-codes) for more information).
    */
  var status: Double
}

object ErrorObject {
  @scala.inline
  def apply(message: String, status: Double): ErrorObject = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorObject]
  }
}

