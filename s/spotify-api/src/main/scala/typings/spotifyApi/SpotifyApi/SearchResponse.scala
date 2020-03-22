package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait SearchResponse extends js.Object {
  var albums: js.UndefOr[PagingObject[AlbumObjectSimplified]] = js.undefined
  var artists: js.UndefOr[PagingObject[ArtistObjectFull]] = js.undefined
  var playlists: js.UndefOr[PagingObject[PlaylistObjectSimplified]] = js.undefined
  var tracks: js.UndefOr[PagingObject[TrackObjectFull]] = js.undefined
}

object SearchResponse {
  @scala.inline
  def apply(
    albums: PagingObject[AlbumObjectSimplified] = null,
    artists: PagingObject[ArtistObjectFull] = null,
    playlists: PagingObject[PlaylistObjectSimplified] = null,
    tracks: PagingObject[TrackObjectFull] = null
  ): SearchResponse = {
    val __obj = js.Dynamic.literal()
    if (albums != null) __obj.updateDynamic("albums")(albums.asInstanceOf[js.Any])
    if (artists != null) __obj.updateDynamic("artists")(artists.asInstanceOf[js.Any])
    if (playlists != null) __obj.updateDynamic("playlists")(playlists.asInstanceOf[js.Any])
    if (tracks != null) __obj.updateDynamic("tracks")(tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponse]
  }
}

