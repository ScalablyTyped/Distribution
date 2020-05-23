package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait SearchResponse extends js.Object {
  var albums: js.UndefOr[PagingObject[AlbumObjectSimplified]] = js.undefined
  var artists: js.UndefOr[PagingObject[ArtistObjectFull]] = js.undefined
  var episodes: js.UndefOr[PagingObject[EpisodeObjectSimplified]] = js.undefined
  var playlists: js.UndefOr[PagingObject[PlaylistObjectSimplified]] = js.undefined
  var shows: js.UndefOr[PagingObject[ShowObjectSimplified]] = js.undefined
  var tracks: js.UndefOr[PagingObject[TrackObjectFull]] = js.undefined
}

object SearchResponse {
  @scala.inline
  def apply(
    albums: PagingObject[AlbumObjectSimplified] = null,
    artists: PagingObject[ArtistObjectFull] = null,
    episodes: PagingObject[EpisodeObjectSimplified] = null,
    playlists: PagingObject[PlaylistObjectSimplified] = null,
    shows: PagingObject[ShowObjectSimplified] = null,
    tracks: PagingObject[TrackObjectFull] = null
  ): SearchResponse = {
    val __obj = js.Dynamic.literal()
    if (albums != null) __obj.updateDynamic("albums")(albums.asInstanceOf[js.Any])
    if (artists != null) __obj.updateDynamic("artists")(artists.asInstanceOf[js.Any])
    if (episodes != null) __obj.updateDynamic("episodes")(episodes.asInstanceOf[js.Any])
    if (playlists != null) __obj.updateDynamic("playlists")(playlists.asInstanceOf[js.Any])
    if (shows != null) __obj.updateDynamic("shows")(shows.asInstanceOf[js.Any])
    if (tracks != null) __obj.updateDynamic("tracks")(tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponse]
  }
}

