package typings
package spotifyDashWebDashPlaybackDashSdkLib.SpotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artist extends js.Object {
  var name: java.lang.String
  var uri: java.lang.String
}

object Artist {
  @scala.inline
  def apply(name: java.lang.String, uri: java.lang.String): Artist = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Artist]
  }
}

