package typings.spotifyDashWebDashApiDashJs.spotifyDashWebDashApiDashJsMod.SpotifyWebApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the regular error object: https://developer.spotify.com/web-api/user-guide/#error-details
  */
trait ErrorObject extends js.Object {
  var response: String
  var status: Double
  var statusText: String
}

object ErrorObject {
  @scala.inline
  def apply(response: String, status: Double, statusText: String): ErrorObject = {
    val __obj = js.Dynamic.literal(response = response, status = status, statusText = statusText)
  
    __obj.asInstanceOf[ErrorObject]
  }
}

