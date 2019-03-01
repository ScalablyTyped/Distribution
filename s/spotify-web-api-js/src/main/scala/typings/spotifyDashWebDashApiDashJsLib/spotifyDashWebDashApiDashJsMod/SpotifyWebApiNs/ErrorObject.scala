package typings
package spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsMod.SpotifyWebApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the regular error object: https://developer.spotify.com/web-api/user-guide/#error-details
  */
trait ErrorObject extends js.Object {
  var response: java.lang.String
  var status: scala.Double
  var statusText: java.lang.String
}

object ErrorObject {
  @scala.inline
  def apply(response: java.lang.String, status: scala.Double, statusText: java.lang.String): ErrorObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[ErrorObject]
  }
}

