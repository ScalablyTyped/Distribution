package typings.stremioAddonSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGenre extends js.Object {
  var genre: String
  var search: String
  var skip: Double
}

object AnonGenre {
  @scala.inline
  def apply(genre: String, search: String, skip: Double): AnonGenre = {
    val __obj = js.Dynamic.literal(genre = genre.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGenre]
  }
}

