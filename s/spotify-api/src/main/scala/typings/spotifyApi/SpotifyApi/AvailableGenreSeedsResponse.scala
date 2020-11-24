package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get available genre seeds
  * 
  * GET /v1/recommendations/available-genre-seeds
  * https://developer.spotify.com/web-api/get-recommendations/#available-genre-seeds
  */
@js.native
trait AvailableGenreSeedsResponse extends js.Object {
  
  var genres: js.Array[String] = js.native
}
object AvailableGenreSeedsResponse {
  
  @scala.inline
  def apply(genres: js.Array[String]): AvailableGenreSeedsResponse = {
    val __obj = js.Dynamic.literal(genres = genres.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableGenreSeedsResponse]
  }
  
  @scala.inline
  implicit class AvailableGenreSeedsResponseOps[Self <: AvailableGenreSeedsResponse] (val x: Self) extends AnyVal {
    
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
    def setGenresVarargs(value: String*): Self = this.set("genres", js.Array(value :_*))
    
    @scala.inline
    def setGenres(value: js.Array[String]): Self = this.set("genres", value.asInstanceOf[js.Any])
  }
}
