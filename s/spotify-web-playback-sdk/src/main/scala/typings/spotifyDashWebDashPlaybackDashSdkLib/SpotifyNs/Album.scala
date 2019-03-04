package typings
package spotifyDashWebDashPlaybackDashSdkLib.SpotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Album extends js.Object {
  var images: js.Array[Image]
  var name: java.lang.String
  var uri: java.lang.String
}

object Album {
  @scala.inline
  def apply(images: js.Array[Image], name: java.lang.String, uri: java.lang.String): Album = {
    val __obj = js.Dynamic.literal(images = images, name = name, uri = uri)
  
    __obj.asInstanceOf[Album]
  }
}

