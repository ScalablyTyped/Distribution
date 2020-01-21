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
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof spotify-api.SpotifyApi.ArtistSearchResponse ]:? spotify-api.SpotifyApi.ArtistSearchResponse[P]}
- Dropped {[ P in keyof spotify-api.SpotifyApi.AlbumSearchResponse ]:? spotify-api.SpotifyApi.AlbumSearchResponse[P]}
- Dropped {[ P in keyof spotify-api.SpotifyApi.TrackSearchResponse ]:? spotify-api.SpotifyApi.TrackSearchResponse[P]}
- Dropped {[ P in keyof spotify-api.SpotifyApi.PlaylistSearchResponse ]:? spotify-api.SpotifyApi.PlaylistSearchResponse[P]} */ trait SearchResponse extends js.Object

