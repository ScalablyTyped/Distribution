package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search for artists/albums/tracks/playlists/shows/episodes
  *
  * GET /v1/search?type=album
  * https://developer.spotify.com/web-api/search-item/
  */
/* Inlined parent std.Partial<spotify-web-api-js.SpotifyApi.ArtistSearchResponse> */
/* Inlined parent std.Partial<spotify-web-api-js.SpotifyApi.AlbumSearchResponse> */
/* Inlined parent std.Partial<spotify-web-api-js.SpotifyApi.TrackSearchResponse> */
/* Inlined parent std.Partial<spotify-web-api-js.SpotifyApi.PlaylistSearchResponse> */
/* Inlined parent std.Partial<spotify-web-api-js.SpotifyApi.ShowSearchResponse> */
/* Inlined parent std.Partial<spotify-web-api-js.SpotifyApi.EpisodeSearchResponse> */
trait SearchResponse extends StObject {
  
  var albums: js.UndefOr[PagingObject[AlbumObjectSimplified]] = js.undefined
  
  var artists: js.UndefOr[PagingObject[ArtistObjectFull]] = js.undefined
  
  var episodes: js.UndefOr[PagingObject[EpisodeObjectSimplified]] = js.undefined
  
  var playlists: js.UndefOr[PagingObject[PlaylistObjectSimplified]] = js.undefined
  
  var shows: js.UndefOr[PagingObject[ShowObjectSimplified]] = js.undefined
  
  var tracks: js.UndefOr[PagingObject[TrackObjectFull]] = js.undefined
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
    def setEpisodes(value: PagingObject[EpisodeObjectSimplified]): Self = StObject.set(x, "episodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpisodesUndefined: Self = StObject.set(x, "episodes", js.undefined)
    
    @scala.inline
    def setPlaylists(value: PagingObject[PlaylistObjectSimplified]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistsUndefined: Self = StObject.set(x, "playlists", js.undefined)
    
    @scala.inline
    def setShows(value: PagingObject[ShowObjectSimplified]): Self = StObject.set(x, "shows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsUndefined: Self = StObject.set(x, "shows", js.undefined)
    
    @scala.inline
    def setTracks(value: PagingObject[TrackObjectFull]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
  }
}
