package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Parameter Objects for searching
//
/**
  * Object for search parameters for searching for tracks, playlists, artists or albums.
  * See: [Search for an item](https://developer.spotify.com/web-api/search-item/)
  *
  * q and type are not optional in the API, however they are marked as optional here, since various libraries
  * implement them as function call parameters instead. This could be changed.
  *
  * @param q Required. The search query's keywords (and optional field filters and operators).
  * @param type Required. A comma-separated list of item types to search across. Valid types are: album, artist, playlist, and track.
  * @param market Optional. An ISO 3166-1 alpha-2 country code or the string from_token
  * @param limit Optional. The maximum number of results to return. Default: 20. Minimum: 1. Maximum: 50.
  * @param offset Optional. The index of the first result to return. Default: 0 (i.e., the first result). Maximum offset: 100.000. Use with limit to get the next page of search results.
  */
@js.native
trait SearchForItemParameterObject extends js.Object {
  
  var limit: js.UndefOr[Double] = js.native
  
  var market: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var q: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object SearchForItemParameterObject {
  
  @scala.inline
  def apply(): SearchForItemParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchForItemParameterObject]
  }
  
  @scala.inline
  implicit class SearchForItemParameterObjectOps[Self <: SearchForItemParameterObject] (val x: Self) extends AnyVal {
    
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMarket(value: String): Self = this.set("market", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarket: Self = this.set("market", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
