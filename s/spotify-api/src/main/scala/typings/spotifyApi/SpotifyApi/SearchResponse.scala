package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search for artists/albums/tracks/playlists
  * 
  * GET /v1/search?type=album
  * https://developer.spotify.com/web-api/search-item/
  */
/* Inlined parent std.Partial<spotify-api.SpotifyApi.ArtistSearchResponse> */
/* Inlined parent std.Partial<spotify-api.SpotifyApi.AlbumSearchResponse> */
/* Inlined parent std.Partial<spotify-api.SpotifyApi.TrackSearchResponse> */
/* Inlined parent std.Partial<spotify-api.SpotifyApi.PlaylistSearchResponse> */
@js.native
trait SearchResponse extends js.Object {
  
  var albums: js.UndefOr[PagingObject[AlbumObjectSimplified]] = js.native
  
  var artists: js.UndefOr[PagingObject[ArtistObjectFull]] = js.native
  
  var playlists: js.UndefOr[PagingObject[PlaylistObjectSimplified]] = js.native
  
  var tracks: js.UndefOr[PagingObject[TrackObjectFull]] = js.native
}
object SearchResponse {
  
  @scala.inline
  def apply(): SearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResponse]
  }
  
  @scala.inline
  implicit class SearchResponseOps[Self <: SearchResponse] (val x: Self) extends AnyVal {
    
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
    def setAlbums(value: PagingObject[AlbumObjectSimplified]): Self = this.set("albums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlbums: Self = this.set("albums", js.undefined)
    
    @scala.inline
    def setArtists(value: PagingObject[ArtistObjectFull]): Self = this.set("artists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtists: Self = this.set("artists", js.undefined)
    
    @scala.inline
    def setPlaylists(value: PagingObject[PlaylistObjectSimplified]): Self = this.set("playlists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaylists: Self = this.set("playlists", js.undefined)
    
    @scala.inline
    def setTracks(value: PagingObject[TrackObjectFull]): Self = this.set("tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracks: Self = this.set("tracks", js.undefined)
  }
}
