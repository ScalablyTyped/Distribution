package typings.stremioAddonSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Genre extends js.Object {
  var genre: String = js.native
  var search: String = js.native
  var skip: Double = js.native
}

object Genre {
  @scala.inline
  def apply(genre: String, search: String, skip: Double): Genre = {
    val __obj = js.Dynamic.literal(genre = genre.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Genre]
  }
  @scala.inline
  implicit class GenreOps[Self <: Genre] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGenre(value: String): Self = this.set("genre", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
  }
  
}

