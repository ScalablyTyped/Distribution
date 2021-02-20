package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
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
trait SearchResponse extends StObject {
  
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
  implicit class SearchResponseMutableBuilder[Self <: SearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbums(value: PagingObject[AlbumObjectSimplified]): Self = StObject.set(x, "albums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumsUndefined: Self = StObject.set(x, "albums", js.undefined)
    
    @scala.inline
    def setArtists(value: PagingObject[ArtistObjectFull]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistsUndefined: Self = StObject.set(x, "artists", js.undefined)
    
    @scala.inline
    def setPlaylists(value: PagingObject[PlaylistObjectSimplified]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistsUndefined: Self = StObject.set(x, "playlists", js.undefined)
    
    @scala.inline
    def setTracks(value: PagingObject[TrackObjectFull]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
  }
}
