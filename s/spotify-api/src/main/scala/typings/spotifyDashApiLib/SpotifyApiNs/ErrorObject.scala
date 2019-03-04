package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Error object
  * [error object](https://developer.spotify.com/web-api/object-model/)
  */
trait ErrorObject extends js.Object {
  var message: java.lang.String
  var status: scala.Double
}

object ErrorObject {
  @scala.inline
  def apply(message: java.lang.String, status: scala.Double): ErrorObject = {
    val __obj = js.Dynamic.literal(message = message, status = status)
  
    __obj.asInstanceOf[ErrorObject]
  }
}

