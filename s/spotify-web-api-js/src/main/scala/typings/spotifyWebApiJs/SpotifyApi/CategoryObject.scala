package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Category Object
  * [category object](https://developer.spotify.com/web-api/object-model/)
  */
trait CategoryObject extends js.Object {
  var href: String
  var icons: js.Array[ImageObject]
  var id: String
  var name: String
}

object CategoryObject {
  @scala.inline
  def apply(href: String, icons: js.Array[ImageObject], id: String, name: String): CategoryObject = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CategoryObject]
  }
}

