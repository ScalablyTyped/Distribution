package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Category Object
  * [category object](https://developer.spotify.com/web-api/object-model/)
  */
trait CategoryObject extends js.Object {
  var href: java.lang.String
  var icons: js.Array[ImageObject]
  var id: java.lang.String
  var name: java.lang.String
}

object CategoryObject {
  @scala.inline
  def apply(href: java.lang.String, icons: js.Array[ImageObject], id: java.lang.String, name: java.lang.String): CategoryObject = {
    val __obj = js.Dynamic.literal(href = href, icons = icons, id = id, name = name)
  
    __obj.asInstanceOf[CategoryObject]
  }
}

