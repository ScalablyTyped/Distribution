package typings.stremioAddonSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Genre extends js.Object {
  var genre: String
  var search: String
  var skip: Double
}

object Genre {
  @scala.inline
  def apply(genre: String, search: String, skip: Double): Genre = {
    val __obj = js.Dynamic.literal(genre = genre.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Genre]
  }
}

