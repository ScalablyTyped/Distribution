package typings.spotifyWebApiJs.mod.SpotifyWebApi

import typings.spotifyWebApiJs.SpotifyApi.AddTracksToPlaylistResponse
import typings.spotifyWebApiJs.SpotifyApi.AlbumSearchResponse
import typings.spotifyWebApiJs.SpotifyApi.AlbumTracksResponse
import typings.spotifyWebApiJs.SpotifyApi.ArtistSearchResponse
import typings.spotifyWebApiJs.SpotifyApi.ArtistsAlbumsResponse
import typings.spotifyWebApiJs.SpotifyApi.ArtistsRelatedArtistsResponse
import typings.spotifyWebApiJs.SpotifyApi.ArtistsTopTracksResponse
import typings.spotifyWebApiJs.SpotifyApi.AudioFeaturesResponse
import typings.spotifyWebApiJs.SpotifyApi.AvailableGenreSeedsResponse
import typings.spotifyWebApiJs.SpotifyApi.CategoryPlaylistsResponse
import typings.spotifyWebApiJs.SpotifyApi.ChangePlaylistDetailsResponse
import typings.spotifyWebApiJs.SpotifyApi.CheckUserSavedAlbumsResponse
import typings.spotifyWebApiJs.SpotifyApi.CheckUsersSavedShowsResponse
import typings.spotifyWebApiJs.SpotifyApi.CheckUsersSavedTracksResponse
import typings.spotifyWebApiJs.SpotifyApi.CreatePlaylistResponse
import typings.spotifyWebApiJs.SpotifyApi.CurrentPlaybackResponse
import typings.spotifyWebApiJs.SpotifyApi.CurrentUsersProfileResponse
import typings.spotifyWebApiJs.SpotifyApi.CurrentlyPlayingResponse
import typings.spotifyWebApiJs.SpotifyApi.DeviceSpecificParameterObject
import typings.spotifyWebApiJs.SpotifyApi.EpisodeSearchResponse
import typings.spotifyWebApiJs.SpotifyApi.FollowArtistsOrUsersResponse
import typings.spotifyWebApiJs.SpotifyApi.FollowPlaylistResponse
import typings.spotifyWebApiJs.SpotifyApi.ListOfFeaturedPlaylistsResponse
import typings.spotifyWebApiJs.SpotifyApi.ListOfNewReleasesResponse
import typings.spotifyWebApiJs.SpotifyApi.ListOfUsersPlaylistsResponse
import typings.spotifyWebApiJs.SpotifyApi.ListOfUsersShowsResponse
import typings.spotifyWebApiJs.SpotifyApi.MultipleAlbumsResponse
import typings.spotifyWebApiJs.SpotifyApi.MultipleArtistsResponse
import typings.spotifyWebApiJs.SpotifyApi.MultipleAudioFeaturesResponse
import typings.spotifyWebApiJs.SpotifyApi.MultipleCategoriesResponse
import typings.spotifyWebApiJs.SpotifyApi.MultipleEpisodesResponse
import typings.spotifyWebApiJs.SpotifyApi.MultipleShowsResponse
import typings.spotifyWebApiJs.SpotifyApi.MultipleTracksResponse
import typings.spotifyWebApiJs.SpotifyApi.PlayParameterObject
import typings.spotifyWebApiJs.SpotifyApi.PlaybackRepeatState
import typings.spotifyWebApiJs.SpotifyApi.PlaylistCoverImageResponse
import typings.spotifyWebApiJs.SpotifyApi.PlaylistSearchResponse
import typings.spotifyWebApiJs.SpotifyApi.PlaylistSnapshotResponse
import typings.spotifyWebApiJs.SpotifyApi.PlaylistTrackResponse
import typings.spotifyWebApiJs.SpotifyApi.RecentlyPlayedParameterObject
import typings.spotifyWebApiJs.SpotifyApi.RecommendationsFromSeedsResponse
import typings.spotifyWebApiJs.SpotifyApi.RecommendationsOptionsObject
import typings.spotifyWebApiJs.SpotifyApi.RemoveAlbumsForUserResponse
import typings.spotifyWebApiJs.SpotifyApi.RemoveTracksFromPlaylistResponse
import typings.spotifyWebApiJs.SpotifyApi.RemoveUsersSavedShowsResponse
import typings.spotifyWebApiJs.SpotifyApi.RemoveUsersSavedTracksResponse
import typings.spotifyWebApiJs.SpotifyApi.ReorderPlaylistTracksResponse
import typings.spotifyWebApiJs.SpotifyApi.ReplacePlaylistTracksResponse
import typings.spotifyWebApiJs.SpotifyApi.SaveAlbumsForUserResponse
import typings.spotifyWebApiJs.SpotifyApi.SaveShowsForUserResponse
import typings.spotifyWebApiJs.SpotifyApi.SaveTracksForUserResponse
import typings.spotifyWebApiJs.SpotifyApi.SearchForItemParameterObject
import typings.spotifyWebApiJs.SpotifyApi.SearchResponse
import typings.spotifyWebApiJs.SpotifyApi.ShowEpisodesResponse
import typings.spotifyWebApiJs.SpotifyApi.ShowSearchResponse
import typings.spotifyWebApiJs.SpotifyApi.SingleAlbumResponse
import typings.spotifyWebApiJs.SpotifyApi.SingleArtistResponse
import typings.spotifyWebApiJs.SpotifyApi.SingleCategoryResponse
import typings.spotifyWebApiJs.SpotifyApi.SingleEpisodeResponse
import typings.spotifyWebApiJs.SpotifyApi.SinglePlaylistResponse
import typings.spotifyWebApiJs.SpotifyApi.SingleShowResponse
import typings.spotifyWebApiJs.SpotifyApi.SingleTrackResponse
import typings.spotifyWebApiJs.SpotifyApi.TrackRelinkingParameterObject
import typings.spotifyWebApiJs.SpotifyApi.TrackSearchResponse
import typings.spotifyWebApiJs.SpotifyApi.TransferPlaybackParameterObject
import typings.spotifyWebApiJs.SpotifyApi.UnfollowArtistsOrUsersResponse
import typings.spotifyWebApiJs.SpotifyApi.UnfollowPlaylistResponse
import typings.spotifyWebApiJs.SpotifyApi.UploadCustomPlaylistCoverImageResponse
import typings.spotifyWebApiJs.SpotifyApi.UserDevicesResponse
import typings.spotifyWebApiJs.SpotifyApi.UserFollowsUsersOrArtistsResponse
import typings.spotifyWebApiJs.SpotifyApi.UserProfileResponse
import typings.spotifyWebApiJs.SpotifyApi.UsersFollowPlaylistResponse
import typings.spotifyWebApiJs.SpotifyApi.UsersFollowedArtistsResponse
import typings.spotifyWebApiJs.SpotifyApi.UsersRecentlyPlayedTracksResponse
import typings.spotifyWebApiJs.SpotifyApi.UsersSavedAlbumsResponse
import typings.spotifyWebApiJs.SpotifyApi.UsersSavedTracksResponse
import typings.spotifyWebApiJs.SpotifyApi.UsersTopArtistsResponse
import typings.spotifyWebApiJs.SpotifyApi.UsersTopTracksResponse
import typings.spotifyWebApiJs.spotifyWebApiJsStrings.album
import typings.spotifyWebApiJs.spotifyWebApiJsStrings.artist
import typings.spotifyWebApiJs.spotifyWebApiJsStrings.playlist
import typings.spotifyWebApiJs.spotifyWebApiJsStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes an instance of SpotifyApi
  * Methods are in the order of appearance in spotify-web-api.js
  */
@js.native
trait SpotifyWebApiJs extends js.Object {
  /**
    * Save one or more albums to the current user's "Your Music" library.
    * See [Save Albums for Current User](https://developer.spotify.com/web-api/save-albums-user/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} albumIds The ids of the albums. If you know their Spotify URI, it is easy
    * to find their album id (e.g. spotify:album:<here_is_the_album_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def addToMySavedAlbums(albumIds: js.Array[String]): js.Promise[SaveAlbumsForUserResponse] = js.native
  def addToMySavedAlbums(
    albumIds: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[SaveAlbumsForUserResponse]
  ): js.Promise[SaveAlbumsForUserResponse] = js.native
  def addToMySavedAlbums(albumIds: js.Array[String], options: js.Object): js.Promise[SaveAlbumsForUserResponse] = js.native
  def addToMySavedAlbums(
    albumIds: js.Array[String],
    options: js.Object,
    callback: ResultsCallback[SaveAlbumsForUserResponse]
  ): js.Promise[SaveAlbumsForUserResponse] = js.native
  /**
    * Adds a list of shows to the current user's saved shows.
    * See [Save Shows for Current User](https://developer.spotify.com/documentation/web-api/reference/library/save-shows-user/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} showIds The ids of the shows. If you know their Spotify URI it is easy
    * to find their show id (e.g. spotify:show:<here_is_the_show_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def addToMySavedShows(showIds: js.Array[String]): js.Promise[SaveShowsForUserResponse] = js.native
  def addToMySavedShows(
    showIds: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[SaveShowsForUserResponse]
  ): js.Promise[SaveShowsForUserResponse] = js.native
  def addToMySavedShows(showIds: js.Array[String], options: js.Object): js.Promise[SaveShowsForUserResponse] = js.native
  def addToMySavedShows(showIds: js.Array[String], options: js.Object, callback: ResultsCallback[SaveShowsForUserResponse]): js.Promise[SaveShowsForUserResponse] = js.native
  /**
    * Adds a list of tracks to the current user's saved tracks.
    * See [Save Tracks for Current User](https://developer.spotify.com/web-api/save-tracks-user/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} trackIds The ids of the tracks. If you know their Spotify URI it is easy
    * to find their track id (e.g. spotify:track:<here_is_the_track_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def addToMySavedTracks(trackIds: js.Array[String]): js.Promise[SaveTracksForUserResponse] = js.native
  def addToMySavedTracks(
    trackIds: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[SaveTracksForUserResponse]
  ): js.Promise[SaveTracksForUserResponse] = js.native
  def addToMySavedTracks(trackIds: js.Array[String], options: js.Object): js.Promise[SaveTracksForUserResponse] = js.native
  def addToMySavedTracks(
    trackIds: js.Array[String],
    options: js.Object,
    callback: ResultsCallback[SaveTracksForUserResponse]
  ): js.Promise[SaveTracksForUserResponse] = js.native
  /**
    * Add tracks to a playlist.
    * See [Add Tracks to a Playlist](https://developer.spotify.com/web-api/add-tracks-to-playlist/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} playlistId The id of the playlist. If you know the Spotify URI it is easy
    * to find the playlist id (e.g. spotify:user:xxxx:playlist:<here_is_the_playlist_id>)
    * @param {Array<string>} uris An array of Spotify URIs for the tracks
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def addTracksToPlaylist(playlistId: String, uris: js.Array[String]): js.Promise[AddTracksToPlaylistResponse] = js.native
  def addTracksToPlaylist(
    playlistId: String,
    uris: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[AddTracksToPlaylistResponse]
  ): js.Promise[AddTracksToPlaylistResponse] = js.native
  def addTracksToPlaylist(playlistId: String, uris: js.Array[String], options: js.Object): js.Promise[AddTracksToPlaylistResponse] = js.native
  def addTracksToPlaylist(
    playlistId: String,
    uris: js.Array[String],
    options: js.Object,
    callback: ResultsCallback[AddTracksToPlaylistResponse]
  ): js.Promise[AddTracksToPlaylistResponse] = js.native
  /**
    * Check to see if one or more Spotify users are following a specified playlist.
    * See [Check if Users Follow a Playlist](https://developer.spotify.com/web-api/check-user-following-playlist/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} playlistId The id of the playlist. If you know the Spotify URI it is easy
    * to find the playlist id (e.g. spotify:user:xxxx:playlist:<here_is_the_playlist_id>)
    * @param {Array<string>} userIds The ids of the users. If you know their Spotify URI it is easy
    * to find their user id (e.g. spotify:user:<here_is_the_user_id>)
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is an array of boolean values that indicate
    * whether the users are following the playlist sent in the request.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def areFollowingPlaylist(playlistId: String, userIds: js.Array[String]): js.Promise[UsersFollowPlaylistResponse] = js.native
  def areFollowingPlaylist(
    playlistId: String,
    userIds: js.Array[String],
    callback: ResultsCallback[UsersFollowPlaylistResponse]
  ): js.Promise[UsersFollowPlaylistResponse] = js.native
  /**
    * Change a playlist's name and public/private state
    * See [Change a Playlist's Details](https://developer.spotify.com/web-api/change-playlist-details/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} playlistId The id of the playlist. If you know the Spotify URI it is easy
    * to find the playlist id (e.g. spotify:user:xxxx:playlist:<here_is_the_playlist_id>)
    * @param {Object} data A JSON object with the data to update. E.g. {name: 'A new name', public: true}
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def changePlaylistDetails(playlistId: String, data: js.Object): js.Promise[ChangePlaylistDetailsResponse] = js.native
  def changePlaylistDetails(playlistId: String, data: js.Object, callback: ResultsCallback[ChangePlaylistDetailsResponse]): js.Promise[ChangePlaylistDetailsResponse] = js.native
  /**
    * Check if one or more albums is already saved in the current Spotify user's "Your Music" library.
    * See [Check User's Saved Albums](https://developer.spotify.com/web-api/check-users-saved-albums/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} albumIds The ids of the albums. If you know their Spotify URI, it is easy
    * to find their album id (e.g. spotify:album:<here_is_the_album_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def containsMySavedAlbums(albumIds: js.Array[String]): js.Promise[CheckUserSavedAlbumsResponse] = js.native
  def containsMySavedAlbums(
    albumIds: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[CheckUserSavedAlbumsResponse]
  ): js.Promise[CheckUserSavedAlbumsResponse] = js.native
  def containsMySavedAlbums(albumIds: js.Array[String], options: js.Object): js.Promise[CheckUserSavedAlbumsResponse] = js.native
  def containsMySavedAlbums(
    albumIds: js.Array[String],
    options: js.Object,
    callback: ResultsCallback[CheckUserSavedAlbumsResponse]
  ): js.Promise[CheckUserSavedAlbumsResponse] = js.native
  /**
    * Checks if the current user's saved shows contains a certain list of shows.
    * See [Check Current User's Saved Shows](https://developer.spotify.com/documentation/web-api/reference/library/check-users-saved-shows/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} showIds The ids of the shows. If you know their Spotify URI it is easy
    * to find their show id (e.g. spotify:show:<here_is_the_show_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def containsMySavedShows(showIds: js.Array[String]): js.Promise[CheckUsersSavedShowsResponse] = js.native
  def containsMySavedShows(
    showIds: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[CheckUsersSavedShowsResponse]
  ): js.Promise[CheckUsersSavedShowsResponse] = js.native
  def containsMySavedShows(showIds: js.Array[String], options: js.Object): js.Promise[CheckUsersSavedShowsResponse] = js.native
  def containsMySavedShows(
    showIds: js.Array[String],
    options: js.Object,
    callback: ResultsCallback[CheckUsersSavedShowsResponse]
  ): js.Promise[CheckUsersSavedShowsResponse] = js.native
  /**
    * Checks if the current user's saved tracks contains a certain list of tracks.
    * See [Check Current User's Saved Tracks](https://developer.spotify.com/web-api/check-users-saved-tracks/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} trackIds The ids of the tracks. If you know their Spotify URI it is easy
    * to find their track id (e.g. spotify:track:<here_is_the_track_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def containsMySavedTracks(trackIds: js.Array[String]): js.Promise[CheckUsersSavedTracksResponse] = js.native
  def containsMySavedTracks(
    trackIds: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[CheckUsersSavedTracksResponse]
  ): js.Promise[CheckUsersSavedTracksResponse] = js.native
  def containsMySavedTracks(trackIds: js.Array[String], options: js.Object): js.Promise[CheckUsersSavedTracksResponse] = js.native
  def containsMySavedTracks(
    trackIds: js.Array[String],
    options: js.Object,
    callback: ResultsCallback[CheckUsersSavedTracksResponse]
  ): js.Promise[CheckUsersSavedTracksResponse] = js.native
  /**
    * Creates a playlist and stores it in the current user's library.
    * See [Create a Playlist](https://developer.spotify.com/web-api/create-playlist/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} userId The id of the user. If you know the Spotify URI it is easy
    * to find the id (e.g. spotify:user:<here_is_the_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def createPlaylist(userId: String): js.Promise[CreatePlaylistResponse] = js.native
  def createPlaylist(
    userId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[CreatePlaylistResponse]
  ): js.Promise[CreatePlaylistResponse] = js.native
  def createPlaylist(userId: String, options: js.Object): js.Promise[CreatePlaylistResponse] = js.native
  def createPlaylist(userId: String, options: js.Object, callback: ResultsCallback[CreatePlaylistResponse]): js.Promise[CreatePlaylistResponse] = js.native
  /**
    * Adds the current user as a follower of one or more artists.
    * See [Follow Artists or Users](https://developer.spotify.com/web-api/follow-artists-users/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} artistIds The ids of the artists. If you know their Spotify URI it is easy
    * to find their artist id (e.g. spotify:artist:<here_is_the_artist_id>)
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is an empty value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def followArtists(artistIds: js.Array[String]): js.Promise[FollowArtistsOrUsersResponse] = js.native
  def followArtists(artistIds: js.Array[String], callback: ResultsCallback[FollowArtistsOrUsersResponse]): js.Promise[FollowArtistsOrUsersResponse] = js.native
  /**
    * Add the current user as a follower of one playlist.
    * See [Follow a Playlist](https://developer.spotify.com/web-api/follow-playlist/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} playlistId The id of the playlist. If you know the Spotify URI it is easy
    * to find the playlist id (e.g. spotify:user:xxxx:playlist:<here_is_the_playlist_id>)
    * @param {Object} options A JSON object with options that can be passed. For instance,
    * whether you want the playlist to be followed privately ({public: false})
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is an empty value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def followPlaylist(playlistId: String): js.Promise[FollowPlaylistResponse] = js.native
  def followPlaylist(
    playlistId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[FollowPlaylistResponse]
  ): js.Promise[FollowPlaylistResponse] = js.native
  def followPlaylist(playlistId: String, options: js.Object): js.Promise[FollowPlaylistResponse] = js.native
  def followPlaylist(playlistId: String, options: js.Object, callback: ResultsCallback[FollowPlaylistResponse]): js.Promise[FollowPlaylistResponse] = js.native
  /**
    * Adds the current user as a follower of one or more other Spotify users.
    * See [Follow Artists or Users](https://developer.spotify.com/web-api/follow-artists-users/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} userIds The ids of the users. If you know their Spotify URI it is easy
    * to find their user id (e.g. spotify:user:<here_is_the_user_id>)
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is an empty value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def followUsers(userIds: js.Array[String]): js.Promise[FollowArtistsOrUsersResponse] = js.native
  def followUsers(userIds: js.Array[String], callback: ResultsCallback[FollowArtistsOrUsersResponse]): js.Promise[FollowArtistsOrUsersResponse] = js.native
  /**
    * Gets the access token in use.
    *
    * @return {string} accessToken The access token
    */
  def getAccessToken(): String | Null = js.native
  /**
    * Fetches an album from the Spotify catalog.
    * See [Get an Album](https://developer.spotify.com/web-api/get-album/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} albumId The id of the album. If you know the Spotify URI it is easy
    * to find the album id (e.g. spotify:album:<here_is_the_album_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getAlbum(albumId: String): js.Promise[SingleAlbumResponse] = js.native
  def getAlbum(
    albumId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[SingleAlbumResponse]
  ): js.Promise[SingleAlbumResponse] = js.native
  def getAlbum(albumId: String, options: js.Object): js.Promise[SingleAlbumResponse] = js.native
  def getAlbum(albumId: String, options: js.Object, callback: ResultsCallback[SingleAlbumResponse]): js.Promise[SingleAlbumResponse] = js.native
  /**
    * Fetches the tracks of an album from the Spotify catalog.
    * See [Get an Album's Tracks](https://developer.spotify.com/web-api/get-albums-tracks/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} albumId The id of the album. If you know the Spotify URI it is easy
    * to find the album id (e.g. spotify:album:<here_is_the_album_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getAlbumTracks(albumId: String): js.Promise[AlbumTracksResponse] = js.native
  def getAlbumTracks(
    albumId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[AlbumTracksResponse]
  ): js.Promise[AlbumTracksResponse] = js.native
  def getAlbumTracks(albumId: String, options: js.Object): js.Promise[AlbumTracksResponse] = js.native
  def getAlbumTracks(albumId: String, options: js.Object, callback: ResultsCallback[AlbumTracksResponse]): js.Promise[AlbumTracksResponse] = js.native
  /**
    * Fetches multiple albums from the Spotify catalog.
    * See [Get Several Albums](https://developer.spotify.com/web-api/get-several-albums/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} albumIds The ids of the albums. If you know their Spotify URI it is easy
    * to find their album id (e.g. spotify:album:<here_is_the_album_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getAlbums(albumIds: js.Array[String]): js.Promise[MultipleAlbumsResponse] = js.native
  def getAlbums(
    albumIds: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[MultipleAlbumsResponse]
  ): js.Promise[MultipleAlbumsResponse] = js.native
  def getAlbums(albumIds: js.Array[String], options: js.Object): js.Promise[MultipleAlbumsResponse] = js.native
  def getAlbums(albumIds: js.Array[String], options: js.Object, callback: ResultsCallback[MultipleAlbumsResponse]): js.Promise[MultipleAlbumsResponse] = js.native
  /**
    * Fetches an artist from the Spotify catalog.
    * See [Get an Artist](https://developer.spotify.com/web-api/get-artist/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} artistId The id of the artist. If you know the Spotify URI it is easy
    * to find the artist id (e.g. spotify:artist:<here_is_the_artist_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getArtist(artistId: String): js.Promise[SingleArtistResponse] = js.native
  def getArtist(
    artistId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[SingleArtistResponse]
  ): js.Promise[SingleArtistResponse] = js.native
  def getArtist(artistId: String, options: js.Object): js.Promise[SingleArtistResponse] = js.native
  def getArtist(artistId: String, options: js.Object, callback: ResultsCallback[SingleArtistResponse]): js.Promise[SingleArtistResponse] = js.native
  /**
    * Fetches the albums of an artist from the Spotify catalog.
    * See [Get an Artist's Albums](https://developer.spotify.com/web-api/get-artists-albums/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} artistId The id of the artist. If you know the Spotify URI it is easy
    * to find the artist id (e.g. spotify:artist:<here_is_the_artist_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getArtistAlbums(artistId: String): js.Promise[ArtistsAlbumsResponse] = js.native
  def getArtistAlbums(
    artistId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[ArtistsAlbumsResponse]
  ): js.Promise[ArtistsAlbumsResponse] = js.native
  def getArtistAlbums(artistId: String, options: js.Object): js.Promise[ArtistsAlbumsResponse] = js.native
  def getArtistAlbums(artistId: String, options: js.Object, callback: ResultsCallback[ArtistsAlbumsResponse]): js.Promise[ArtistsAlbumsResponse] = js.native
  /**
    * Fetches a list of artists related with a given one from the Spotify catalog.
    * See [Get an Artist's Related Artists](https://developer.spotify.com/web-api/get-related-artists/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} artistId The id of the artist. If you know the Spotify URI it is easy
    * to find the artist id (e.g. spotify:artist:<here_is_the_artist_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getArtistRelatedArtists(artistId: String): js.Promise[ArtistsRelatedArtistsResponse] = js.native
  def getArtistRelatedArtists(
    artistId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[ArtistsRelatedArtistsResponse]
  ): js.Promise[ArtistsRelatedArtistsResponse] = js.native
  def getArtistRelatedArtists(artistId: String, options: js.Object): js.Promise[ArtistsRelatedArtistsResponse] = js.native
  def getArtistRelatedArtists(artistId: String, options: js.Object, callback: ResultsCallback[ArtistsRelatedArtistsResponse]): js.Promise[ArtistsRelatedArtistsResponse] = js.native
  /**
    * Fetches a list of top tracks of an artist from the Spotify catalog, for a specific country.
    * See [Get an Artist's Top Tracks](https://developer.spotify.com/web-api/get-artists-top-tracks/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} artistId The id of the artist. If you know the Spotify URI it is easy
    * to find the artist id (e.g. spotify:artist:<here_is_the_artist_id>)
    * @param {string} countryId The id of the country (e.g. ES for Spain or US for United States)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getArtistTopTracks(artistId: String, countryId: String): js.Promise[ArtistsTopTracksResponse] = js.native
  def getArtistTopTracks(
    artistId: String,
    countryId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[ArtistsTopTracksResponse]
  ): js.Promise[ArtistsTopTracksResponse] = js.native
  def getArtistTopTracks(artistId: String, countryId: String, options: js.Object): js.Promise[ArtistsTopTracksResponse] = js.native
  def getArtistTopTracks(
    artistId: String,
    countryId: String,
    options: js.Object,
    callback: ResultsCallback[ArtistsTopTracksResponse]
  ): js.Promise[ArtistsTopTracksResponse] = js.native
  /**
    * Fetches multiple artists from the Spotify catalog.
    * See [Get Several Artists](https://developer.spotify.com/web-api/get-several-artists/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} artistIds The ids of the artists. If you know their Spotify URI it is easy
    * to find their artist id (e.g. spotify:artist:<here_is_the_artist_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getArtists(artistIds: js.Array[String]): js.Promise[MultipleArtistsResponse] = js.native
  def getArtists(
    artistIds: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[MultipleArtistsResponse]
  ): js.Promise[MultipleArtistsResponse] = js.native
  def getArtists(artistIds: js.Array[String], options: js.Object): js.Promise[MultipleArtistsResponse] = js.native
  def getArtists(
    artistIds: js.Array[String],
    options: js.Object,
    callback: ResultsCallback[MultipleArtistsResponse]
  ): js.Promise[MultipleArtistsResponse] = js.native
  /**
    * Get audio feature information for a single track identified by its unique Spotify ID.
    * See [Get Audio Analysis for a Track](https://developer.spotify.com/documentation/web-api/https://developer.spotify.com/documentation/web-api/reference/tracks/get-audio-analysis/) on
    * the Spotify Developer site for more information about the endpoint.
    * @param {string} trackId The id of the track. If you know the Spotify URI it is easy
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    */
  def getAudioAnalysisForTrack(trackId: String): js.Promise[_] = js.native
  def getAudioAnalysisForTrack(trackId: String, callback: ResultsCallback[_]): js.Promise[_] = js.native
  /**
    * Get audio features for a single track identified by its unique Spotify ID.
    * See [Get Audio Features for a Track](https://developer.spotify.com/web-api/get-audio-features/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} trackId The id of the track. If you know the Spotify URI it is easy
    * to find the track id (e.g. spotify:track:<here_is_the_track_id>)
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getAudioFeaturesForTrack(trackId: String): js.Promise[AudioFeaturesResponse] = js.native
  def getAudioFeaturesForTrack(trackId: String, callback: ResultsCallback[AudioFeaturesResponse]): js.Promise[AudioFeaturesResponse] = js.native
  /**
    * Get audio features for multiple tracks based on their Spotify IDs.
    * See [Get Audio Features for Several Tracks](https://developer.spotify.com/web-api/get-several-audio-features/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} trackIds The ids of the tracks. If you know their Spotify URI it is easy
    * to find their track id (e.g. spotify:track:<here_is_the_track_id>)
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getAudioFeaturesForTracks(trackIds: js.Array[String]): js.Promise[MultipleAudioFeaturesResponse] = js.native
  def getAudioFeaturesForTracks(trackIds: js.Array[String], callback: ResultsCallback[MultipleAudioFeaturesResponse]): js.Promise[MultipleAudioFeaturesResponse] = js.native
  /**
    * Retrieve a list of available genres seed parameter values for recommendations.
    * See [Available Genre Seeds](https://developer.spotify.com/web-api/get-recommendations/#available-genre-seeds) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getAvailableGenreSeeds(): js.Promise[AvailableGenreSeedsResponse] = js.native
  def getAvailableGenreSeeds(callback: ResultsCallback[AvailableGenreSeedsResponse]): js.Promise[AvailableGenreSeedsResponse] = js.native
  /**
    * Get a list of categories used to tag items in Spotify (on, for example, the Spotify player's "Browse" tab).
    * See [Get a List of Categories](https://developer.spotify.com/web-api/get-list-categories/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getCategories(): js.Promise[MultipleCategoriesResponse] = js.native
  def getCategories(options: js.UndefOr[scala.Nothing], callback: ResultsCallback[MultipleCategoriesResponse]): js.Promise[MultipleCategoriesResponse] = js.native
  def getCategories(options: js.Object): js.Promise[MultipleCategoriesResponse] = js.native
  def getCategories(options: js.Object, callback: ResultsCallback[MultipleCategoriesResponse]): js.Promise[MultipleCategoriesResponse] = js.native
  /**
    * Get a single category used to tag items in Spotify (on, for example, the Spotify player's "Browse" tab).
    * See [Get a Category](https://developer.spotify.com/web-api/get-category/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} categoryId The id of the category. These can be found with the getCategories function
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getCategory(categoryId: String): js.Promise[SingleCategoryResponse] = js.native
  def getCategory(
    categoryId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[SingleCategoryResponse]
  ): js.Promise[SingleCategoryResponse] = js.native
  def getCategory(categoryId: String, options: js.Object): js.Promise[SingleCategoryResponse] = js.native
  def getCategory(categoryId: String, options: js.Object, callback: ResultsCallback[SingleCategoryResponse]): js.Promise[SingleCategoryResponse] = js.native
  /**
    * Get a list of Spotify playlists tagged with a particular category.
    * See [Get a Category's Playlists](https://developer.spotify.com/web-api/get-categorys-playlists/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} categoryId The id of the category. These can be found with the getCategories function
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getCategoryPlaylists(categoryId: String): js.Promise[CategoryPlaylistsResponse] = js.native
  def getCategoryPlaylists(
    categoryId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[CategoryPlaylistsResponse]
  ): js.Promise[CategoryPlaylistsResponse] = js.native
  def getCategoryPlaylists(categoryId: String, options: js.Object): js.Promise[CategoryPlaylistsResponse] = js.native
  def getCategoryPlaylists(categoryId: String, options: js.Object, callback: ResultsCallback[CategoryPlaylistsResponse]): js.Promise[CategoryPlaylistsResponse] = js.native
  /**
    * Fetches an episode from the Spotify catalog.
    * See [Get an Episode](https://developer.spotify.com/documentation/web-api/reference/episodes/get-an-episode/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} episodeId The id of the episode. If you know the Spotify URI it is easy
    * to find the episode id (e.g. spotify:episode:<here_is_the_episode_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getEpisode(episodeId: String): js.Promise[SingleEpisodeResponse] = js.native
  def getEpisode(
    episodeId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[SingleEpisodeResponse]
  ): js.Promise[SingleEpisodeResponse] = js.native
  def getEpisode(episodeId: String, options: js.Object): js.Promise[SingleEpisodeResponse] = js.native
  def getEpisode(episodeId: String, options: js.Object, callback: ResultsCallback[SingleEpisodeResponse]): js.Promise[SingleEpisodeResponse] = js.native
  /**
    * Fetches multiple episodes from the Spotify catalog.
    * See [Get Several Episodes](https://developer.spotify.com/documentation/web-api/reference/episodes/get-several-episodes/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} episodeIds The ids of the episodes. If you know their Spotify URI it is easy
    * to find their episode id (e.g. spotify:episode:<here_is_the_episode_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getEpisodes(episodeIds: js.Array[String]): js.Promise[MultipleEpisodesResponse] = js.native
  def getEpisodes(
    episodeIds: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[MultipleEpisodesResponse]
  ): js.Promise[MultipleEpisodesResponse] = js.native
  def getEpisodes(episodeIds: js.Array[String], options: js.Object): js.Promise[MultipleEpisodesResponse] = js.native
  def getEpisodes(
    episodeIds: js.Array[String],
    options: js.Object,
    callback: ResultsCallback[MultipleEpisodesResponse]
  ): js.Promise[MultipleEpisodesResponse] = js.native
  /**
    * Fetches a list of Spotify featured playlists (shown, for example, on a Spotify player's "Browse" tab).
    * See [Get a List of Featured Playlists](https://developer.spotify.com/web-api/get-list-featured-playlists/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getFeaturedPlaylists(): js.Promise[ListOfFeaturedPlaylistsResponse] = js.native
  def getFeaturedPlaylists(options: js.UndefOr[scala.Nothing], callback: ResultsCallback[ListOfFeaturedPlaylistsResponse]): js.Promise[ListOfFeaturedPlaylistsResponse] = js.native
  def getFeaturedPlaylists(options: js.Object): js.Promise[ListOfFeaturedPlaylistsResponse] = js.native
  def getFeaturedPlaylists(options: js.Object, callback: ResultsCallback[ListOfFeaturedPlaylistsResponse]): js.Promise[ListOfFeaturedPlaylistsResponse] = js.native
  /**
    * Get the current user's followed artists.
    * See [Get User's Followed Artists](https://developer.spotify.com/web-api/get-followed-artists/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} [options] Options, being after and limit.
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is an object with a paged object containing
    * artists.
    * @returns {Promise|undefined} A promise that if successful, resolves to an object containing a paging object which contains
    * artists objects. Not returned if a callback is given.
    */
  def getFollowedArtists(): js.Promise[UsersFollowedArtistsResponse] = js.native
  def getFollowedArtists(options: js.UndefOr[scala.Nothing], callback: ResultsCallback[UsersFollowedArtistsResponse]): js.Promise[UsersFollowedArtistsResponse] = js.native
  def getFollowedArtists(options: js.Object): js.Promise[UsersFollowedArtistsResponse] = js.native
  def getFollowedArtists(options: js.Object, callback: ResultsCallback[UsersFollowedArtistsResponse]): js.Promise[UsersFollowedArtistsResponse] = js.native
  /**
    * Fetches a resource through a generic GET request.
    *
    * @param {string} url The URL to be fetched
    * @param {function(Object,Object)} callback An optional callback
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getGeneric(url: String): js.Promise[js.Object] = js.native
  def getGeneric(url: String, callback: ResultsCallback[js.Object]): js.Promise[js.Object] = js.native
  /**
    * Fetches information about the current user.
    * See [Get Current User's Profile](https://developer.spotify.com/web-api/get-current-users-profile/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getMe(): js.Promise[CurrentUsersProfileResponse] = js.native
  def getMe(options: js.UndefOr[scala.Nothing], callback: ResultsCallback[CurrentUsersProfileResponse]): js.Promise[CurrentUsersProfileResponse] = js.native
  def getMe(options: js.Object): js.Promise[CurrentUsersProfileResponse] = js.native
  def getMe(options: js.Object, callback: ResultsCallback[CurrentUsersProfileResponse]): js.Promise[CurrentUsersProfileResponse] = js.native
  /**
    * Get information about the user’s current playback state, including track, track progress, and active device.
    * See [Get Information About The User’s Current Playback](https://developer.spotify.com/web-api/get-information-about-the-users-current-playback/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed.
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getMyCurrentPlaybackState(): js.Promise[CurrentPlaybackResponse] = js.native
  def getMyCurrentPlaybackState(callback: ResultsCallback[CurrentPlaybackResponse]): Unit = js.native
  def getMyCurrentPlaybackState(options: TrackRelinkingParameterObject): js.Promise[CurrentPlaybackResponse] = js.native
  def getMyCurrentPlaybackState(options: TrackRelinkingParameterObject, callback: ResultsCallback[CurrentPlaybackResponse]): Unit = js.native
  /**
    * Get the object currently being played on the user’s Spotify account.
    * See [Get the User’s Currently Playing Track](https://developer.spotify.com/web-api/get-the-users-currently-playing-track/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed.
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getMyCurrentPlayingTrack(): js.Promise[CurrentlyPlayingResponse] = js.native
  def getMyCurrentPlayingTrack(callback: ResultsCallback[CurrentlyPlayingResponse]): Unit = js.native
  def getMyCurrentPlayingTrack(options: TrackRelinkingParameterObject): js.Promise[CurrentlyPlayingResponse] = js.native
  def getMyCurrentPlayingTrack(options: TrackRelinkingParameterObject, callback: ResultsCallback[CurrentlyPlayingResponse]): Unit = js.native
  /**
    * Get information about a user’s available devices.
    * See [Get a User’s Available Devices](https://developer.spotify.com/web-api/get-a-users-available-devices/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getMyDevices(): js.Promise[UserDevicesResponse] = js.native
  def getMyDevices(callback: ResultsCallback[UserDevicesResponse]): Unit = js.native
  /**
    * Get tracks from the current user’s recently played tracks.
    * See [Get Current User’s Recently Played Tracks](https://developer.spotify.com/web-api/web-api-personalization-endpoints/get-recently-played/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getMyRecentlyPlayedTracks(): js.Promise[UsersRecentlyPlayedTracksResponse] = js.native
  def getMyRecentlyPlayedTracks(callback: ResultsCallback[UsersRecentlyPlayedTracksResponse]): Unit = js.native
  def getMyRecentlyPlayedTracks(options: RecentlyPlayedParameterObject): js.Promise[UsersRecentlyPlayedTracksResponse] = js.native
  def getMyRecentlyPlayedTracks(
    options: RecentlyPlayedParameterObject,
    callback: ResultsCallback[UsersRecentlyPlayedTracksResponse]
  ): Unit = js.native
  /**
    * Get a list of the albums saved in the current Spotify user's "Your Music" library.
    * See [Get Current User's Saved Albums](https://developer.spotify.com/web-api/get-users-saved-albums/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getMySavedAlbums(): js.Promise[UsersSavedAlbumsResponse] = js.native
  def getMySavedAlbums(options: js.UndefOr[scala.Nothing], callback: ResultsCallback[UsersSavedAlbumsResponse]): js.Promise[UsersSavedAlbumsResponse] = js.native
  def getMySavedAlbums(options: js.Object): js.Promise[UsersSavedAlbumsResponse] = js.native
  def getMySavedAlbums(options: js.Object, callback: ResultsCallback[UsersSavedAlbumsResponse]): js.Promise[UsersSavedAlbumsResponse] = js.native
  /**
    * Fetches current user's saved shows.
    * See [Get Current User's Saved Shows](https://developer.spotify.com/documentation/web-api/reference/library/get-users-saved-shows/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getMySavedShows(): js.Promise[ListOfUsersShowsResponse] = js.native
  def getMySavedShows(options: js.UndefOr[scala.Nothing], callback: ResultsCallback[ListOfUsersShowsResponse]): js.Promise[ListOfUsersShowsResponse] = js.native
  def getMySavedShows(options: js.Object): js.Promise[ListOfUsersShowsResponse] = js.native
  def getMySavedShows(options: js.Object, callback: ResultsCallback[ListOfUsersShowsResponse]): js.Promise[ListOfUsersShowsResponse] = js.native
  /**
    * Fetches current user's saved tracks.
    * See [Get Current User's Saved Tracks](https://developer.spotify.com/web-api/get-users-saved-tracks/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getMySavedTracks(): js.Promise[UsersSavedTracksResponse] = js.native
  def getMySavedTracks(options: js.UndefOr[scala.Nothing], callback: ResultsCallback[UsersSavedTracksResponse]): js.Promise[UsersSavedTracksResponse] = js.native
  def getMySavedTracks(options: js.Object): js.Promise[UsersSavedTracksResponse] = js.native
  def getMySavedTracks(options: js.Object, callback: ResultsCallback[UsersSavedTracksResponse]): js.Promise[UsersSavedTracksResponse] = js.native
  /**
    * Get the current user’s top artists based on calculated affinity.
    * See [Get a User’s Top Artists](https://developer.spotify.com/web-api/get-users-top-artists-and-tracks/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getMyTopArtists(): js.Promise[UsersTopArtistsResponse] = js.native
  def getMyTopArtists(options: js.UndefOr[scala.Nothing], callback: ResultsCallback[UsersTopArtistsResponse]): js.Promise[UsersTopArtistsResponse] = js.native
  def getMyTopArtists(options: js.Object): js.Promise[UsersTopArtistsResponse] = js.native
  def getMyTopArtists(options: js.Object, callback: ResultsCallback[UsersTopArtistsResponse]): js.Promise[UsersTopArtistsResponse] = js.native
  /**
    * Get the current user’s top tracks based on calculated affinity.
    * See [Get a User’s Top Tracks](https://developer.spotify.com/web-api/get-users-top-artists-and-tracks/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getMyTopTracks(): js.Promise[UsersTopTracksResponse] = js.native
  def getMyTopTracks(options: js.UndefOr[scala.Nothing], callback: ResultsCallback[UsersTopTracksResponse]): js.Promise[UsersTopTracksResponse] = js.native
  def getMyTopTracks(options: js.Object): js.Promise[UsersTopTracksResponse] = js.native
  def getMyTopTracks(options: js.Object, callback: ResultsCallback[UsersTopTracksResponse]): js.Promise[UsersTopTracksResponse] = js.native
  /**
    * Fetches a list of new album releases featured in Spotify (shown, for example, on a Spotify player's "Browse" tab).
    * See [Get a List of New Releases](https://developer.spotify.com/web-api/get-list-new-releases/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getNewReleases(): js.Promise[ListOfNewReleasesResponse] = js.native
  def getNewReleases(options: js.UndefOr[scala.Nothing], callback: ResultsCallback[ListOfNewReleasesResponse]): js.Promise[ListOfNewReleasesResponse] = js.native
  def getNewReleases(options: js.Object): js.Promise[ListOfNewReleasesResponse] = js.native
  def getNewReleases(options: js.Object, callback: ResultsCallback[ListOfNewReleasesResponse]): js.Promise[ListOfNewReleasesResponse] = js.native
  /**
    * Fetches a specific playlist.
    * See [Get a Playlist](https://developer.spotify.com/web-api/get-playlist/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} playlistId The id of the playlist. If you know the Spotify URI it is easy
    * to find the playlist id (e.g. spotify:user:xxxx:playlist:<here_is_the_playlist_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getPlaylist(playlistId: String): js.Promise[SinglePlaylistResponse] = js.native
  def getPlaylist(
    playlistId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[SinglePlaylistResponse]
  ): js.Promise[SinglePlaylistResponse] = js.native
  def getPlaylist(playlistId: String, options: js.Object): js.Promise[SinglePlaylistResponse] = js.native
  def getPlaylist(playlistId: String, options: js.Object, callback: ResultsCallback[SinglePlaylistResponse]): js.Promise[SinglePlaylistResponse] = js.native
  /**
    * Gets the current image associated with a specific playlist.
    * See [Get a Playlist Cover Image](https://developer.spotify.com/documentation/web-api/reference/playlists/get-playlist-cover/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} playlistId The id of the playlist. If you know the Spotify URI it is easy
    * to find the playlist id (e.g. spotify:playlist:<here_is_the_playlist_id>)
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getPlaylistCoverImage(playlistId: String): js.Promise[PlaylistCoverImageResponse] = js.native
  def getPlaylistCoverImage(playlistId: String, callback: ResultsCallback[PlaylistCoverImageResponse]): js.Promise[PlaylistCoverImageResponse] = js.native
  /**
    * Fetches the tracks from a specific playlist.
    * See [Get a Playlist's Tracks](https://developer.spotify.com/web-api/get-playlists-tracks/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} playlistId The id of the playlist. If you know the Spotify URI it is easy
    * to find the playlist id (e.g. spotify:user:xxxx:playlist:<here_is_the_playlist_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getPlaylistTracks(playlistId: String): js.Promise[PlaylistTrackResponse] = js.native
  def getPlaylistTracks(
    playlistId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[PlaylistTrackResponse]
  ): js.Promise[PlaylistTrackResponse] = js.native
  def getPlaylistTracks(playlistId: String, options: js.Object): js.Promise[PlaylistTrackResponse] = js.native
  def getPlaylistTracks(playlistId: String, options: js.Object, callback: ResultsCallback[PlaylistTrackResponse]): js.Promise[PlaylistTrackResponse] = js.native
  /**
    * Create a playlist-style listening experience based on seed artists, tracks and genres.
    * See [Get Recommendations Based on Seeds](https://developer.spotify.com/web-api/get-recommendations/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getRecommendations(): js.Promise[RecommendationsFromSeedsResponse] = js.native
  def getRecommendations(options: js.UndefOr[scala.Nothing], callback: ResultsCallback[RecommendationsFromSeedsResponse]): js.Promise[RecommendationsFromSeedsResponse] = js.native
  def getRecommendations(options: RecommendationsOptionsObject): js.Promise[RecommendationsFromSeedsResponse] = js.native
  def getRecommendations(options: RecommendationsOptionsObject, callback: ResultsCallback[RecommendationsFromSeedsResponse]): js.Promise[RecommendationsFromSeedsResponse] = js.native
  /**
    * Fetches a show from the Spotify catalog.
    * See [Get a Show](https://developer.spotify.com/documentation/web-api/reference/shows/get-a-show/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} showId The id of the show. If you know the Spotify URI it is easy
    * to find the show id (e.g. spotify:show:<here_is_the_show_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getShow(showId: String): js.Promise[SingleShowResponse] = js.native
  def getShow(showId: String, options: js.UndefOr[scala.Nothing], callback: ResultsCallback[SingleShowResponse]): js.Promise[SingleShowResponse] = js.native
  def getShow(showId: String, options: js.Object): js.Promise[SingleShowResponse] = js.native
  def getShow(showId: String, options: js.Object, callback: ResultsCallback[SingleShowResponse]): js.Promise[SingleShowResponse] = js.native
  /**
    * Fetches the episodes of a show from the Spotify catalog.
    * See [Get a Show's Episodes](https://developer.spotify.com/documentation/web-api/reference/shows/get-shows-episodes/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} showId The id of the show. If you know the Spotify URI it is easy
    * to find the show id (e.g. spotify:show:<here_is_the_show_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getShowEpisodes(showId: String): js.Promise[ShowEpisodesResponse] = js.native
  def getShowEpisodes(
    showId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[ShowEpisodesResponse]
  ): js.Promise[ShowEpisodesResponse] = js.native
  def getShowEpisodes(showId: String, options: js.Object): js.Promise[ShowEpisodesResponse] = js.native
  def getShowEpisodes(showId: String, options: js.Object, callback: ResultsCallback[ShowEpisodesResponse]): js.Promise[ShowEpisodesResponse] = js.native
  /**
    * Fetches multiple shows from the Spotify catalog.
    * See [Get Several Shows](https://developer.spotify.com/documentation/web-api/reference/shows/get-several-shows/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} showIds The ids of the shows. If you know their Spotify URI it is easy
    * to find their show id (e.g. spotify:show:<here_is_the_show_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getShows(showIds: js.Array[String]): js.Promise[MultipleShowsResponse] = js.native
  def getShows(
    showIds: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[MultipleShowsResponse]
  ): js.Promise[MultipleShowsResponse] = js.native
  def getShows(showIds: js.Array[String], options: js.Object): js.Promise[MultipleShowsResponse] = js.native
  def getShows(showIds: js.Array[String], options: js.Object, callback: ResultsCallback[MultipleShowsResponse]): js.Promise[MultipleShowsResponse] = js.native
  /**
    * Fetches a track from the Spotify catalog.
    * See [Get a Track](https://developer.spotify.com/web-api/get-track/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} trackId The id of the track. If you know the Spotify URI it is easy
    * to find the track id (e.g. spotify:track:<here_is_the_track_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getTrack(trackId: String): js.Promise[SingleTrackResponse] = js.native
  def getTrack(
    trackId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[SingleTrackResponse]
  ): js.Promise[SingleTrackResponse] = js.native
  def getTrack(trackId: String, options: js.Object): js.Promise[SingleTrackResponse] = js.native
  def getTrack(trackId: String, options: js.Object, callback: ResultsCallback[SingleTrackResponse]): js.Promise[SingleTrackResponse] = js.native
  /**
    * Fetches multiple tracks from the Spotify catalog.
    * See [Get Several Tracks](https://developer.spotify.com/web-api/get-several-tracks/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} trackIds The ids of the tracks. If you know their Spotify URI it is easy
    * to find their track id (e.g. spotify:track:<here_is_the_track_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getTracks(trackIds: js.Array[String]): js.Promise[MultipleTracksResponse] = js.native
  def getTracks(
    trackIds: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[MultipleTracksResponse]
  ): js.Promise[MultipleTracksResponse] = js.native
  def getTracks(trackIds: js.Array[String], options: js.Object): js.Promise[MultipleTracksResponse] = js.native
  def getTracks(trackIds: js.Array[String], options: js.Object, callback: ResultsCallback[MultipleTracksResponse]): js.Promise[MultipleTracksResponse] = js.native
  /**
    * Fetches information about a specific user.
    * See [Get a User's Profile](https://developer.spotify.com/web-api/get-users-profile/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} userId The id of the user. If you know the Spotify URI it is easy
    * to find the id (e.g. spotify:user:<here_is_the_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getUser(userId: String): js.Promise[UserProfileResponse] = js.native
  def getUser(userId: String, options: js.UndefOr[scala.Nothing], callback: ResultsCallback[UserProfileResponse]): js.Promise[UserProfileResponse] = js.native
  def getUser(userId: String, options: js.Object): js.Promise[UserProfileResponse] = js.native
  def getUser(userId: String, options: js.Object, callback: ResultsCallback[UserProfileResponse]): js.Promise[UserProfileResponse] = js.native
  /**
    * Fetches a list of the current user's playlists.
    * See [Get a List of a User's Playlists](https://developer.spotify.com/web-api/get-list-users-playlists/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} userId An optional id of the user. If you know the Spotify URI it is easy
    * to find the id (e.g. spotify:user:<here_is_the_id>). If not provided, the id of the user that granted
    * the permissions will be used.
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def getUserPlaylists(): js.Promise[ListOfUsersPlaylistsResponse] = js.native
  def getUserPlaylists(
    userId: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[ListOfUsersPlaylistsResponse]
  ): js.Promise[ListOfUsersPlaylistsResponse] = js.native
  def getUserPlaylists(userId: js.UndefOr[scala.Nothing], options: js.Object): js.Promise[ListOfUsersPlaylistsResponse] = js.native
  def getUserPlaylists(
    userId: js.UndefOr[scala.Nothing],
    options: js.Object,
    callback: ResultsCallback[ListOfUsersPlaylistsResponse]
  ): js.Promise[ListOfUsersPlaylistsResponse] = js.native
  def getUserPlaylists(userId: String): js.Promise[ListOfUsersPlaylistsResponse] = js.native
  def getUserPlaylists(
    userId: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[ListOfUsersPlaylistsResponse]
  ): js.Promise[ListOfUsersPlaylistsResponse] = js.native
  def getUserPlaylists(userId: String, options: js.Object): js.Promise[ListOfUsersPlaylistsResponse] = js.native
  def getUserPlaylists(userId: String, options: js.Object, callback: ResultsCallback[ListOfUsersPlaylistsResponse]): js.Promise[ListOfUsersPlaylistsResponse] = js.native
  /**
    * Checks to see if the current user is following one or more artists.
    * See [Check if Current User Follows](https://developer.spotify.com/web-api/check-current-user-follows/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} artistIds The ids of the artists. If you know their Spotify URI it is easy
    * to find their artist id (e.g. spotify:artist:<here_is_the_artist_id>)
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is an array of boolean values that indicate
    * whether the user is following the artists sent in the request.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def isFollowingArtists(artistIds: js.Array[String]): js.Promise[UserFollowsUsersOrArtistsResponse] = js.native
  def isFollowingArtists(artistIds: js.Array[String], callback: ResultsCallback[UserFollowsUsersOrArtistsResponse]): js.Promise[UserFollowsUsersOrArtistsResponse] = js.native
  /**
    * Checks to see if the current user is following one or more other Spotify users.
    * See [Check if Current User Follows Users or Artists](https://developer.spotify.com/web-api/check-current-user-follows/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} userIds The ids of the users. If you know their Spotify URI it is easy
    * to find their user id (e.g. spotify:user:<here_is_the_user_id>)
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is an array of boolean values that indicate
    * whether the user is following the users sent in the request.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def isFollowingUsers(userIds: js.Array[String]): js.Promise[UserFollowsUsersOrArtistsResponse] = js.native
  def isFollowingUsers(userIds: js.Array[String], callback: ResultsCallback[UserFollowsUsersOrArtistsResponse]): js.Promise[UserFollowsUsersOrArtistsResponse] = js.native
  /**
    * Pause playback on the user’s account.
    * See [Pause a User’s Playback](https://developer.spotify.com/web-api/pause-a-users-playback/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed.
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def pause(): js.Promise[Unit] = js.native
  def pause(callback: VoidResultsCallback): Unit = js.native
  def pause(options: DeviceSpecificParameterObject): js.Promise[Unit] = js.native
  def pause(options: DeviceSpecificParameterObject, callback: VoidResultsCallback): Unit = js.native
  /**
    * Start a new context or resume current playback on the user’s active device.
    * See [Start/Resume a User’s Playback](https://developer.spotify.com/web-api/start-a-users-playback/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed.
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def play(): js.Promise[Unit] = js.native
  def play(callback: VoidResultsCallback): Unit = js.native
  def play(options: PlayParameterObject): js.Promise[Unit] = js.native
  def play(options: PlayParameterObject, callback: VoidResultsCallback): Unit = js.native
  /**
    * Remove one or more albums from the current user's "Your Music" library.
    * See [Remove Albums for Current User](https://developer.spotify.com/web-api/remove-albums-user/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} albumIds The ids of the albums. If you know their Spotify URI, it is easy
    * to find their album id (e.g. spotify:album:<here_is_the_album_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def removeFromMySavedAlbums(albumIds: js.Array[String]): js.Promise[RemoveAlbumsForUserResponse] = js.native
  def removeFromMySavedAlbums(
    albumIds: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[RemoveAlbumsForUserResponse]
  ): js.Promise[RemoveAlbumsForUserResponse] = js.native
  def removeFromMySavedAlbums(albumIds: js.Array[String], options: js.Object): js.Promise[RemoveAlbumsForUserResponse] = js.native
  def removeFromMySavedAlbums(
    albumIds: js.Array[String],
    options: js.Object,
    callback: ResultsCallback[RemoveAlbumsForUserResponse]
  ): js.Promise[RemoveAlbumsForUserResponse] = js.native
  /**
    * Remove a list of shows from the current user's saved shows.
    * See [Remove Shows for Current User](https://developer.spotify.com/documentation/web-api/reference/library/remove-shows-user/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} showIds The ids of the shows. If you know their Spotify URI it is easy
    * to find their show id (e.g. spotify:show:<here_is_the_show_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def removeFromMySavedShows(showIds: js.Array[String]): js.Promise[RemoveUsersSavedShowsResponse] = js.native
  def removeFromMySavedShows(
    showIds: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[RemoveUsersSavedShowsResponse]
  ): js.Promise[RemoveUsersSavedShowsResponse] = js.native
  def removeFromMySavedShows(showIds: js.Array[String], options: js.Object): js.Promise[RemoveUsersSavedShowsResponse] = js.native
  def removeFromMySavedShows(
    showIds: js.Array[String],
    options: js.Object,
    callback: ResultsCallback[RemoveUsersSavedShowsResponse]
  ): js.Promise[RemoveUsersSavedShowsResponse] = js.native
  /**
    * Remove a list of tracks from the current user's saved tracks.
    * See [Remove Tracks for Current User](https://developer.spotify.com/web-api/remove-tracks-user/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} trackIds The ids of the tracks. If you know their Spotify URI it is easy
    * to find their track id (e.g. spotify:track:<here_is_the_track_id>)
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def removeFromMySavedTracks(trackIds: js.Array[String]): js.Promise[RemoveUsersSavedTracksResponse] = js.native
  def removeFromMySavedTracks(
    trackIds: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[RemoveUsersSavedTracksResponse]
  ): js.Promise[RemoveUsersSavedTracksResponse] = js.native
  def removeFromMySavedTracks(trackIds: js.Array[String], options: js.Object): js.Promise[RemoveUsersSavedTracksResponse] = js.native
  def removeFromMySavedTracks(
    trackIds: js.Array[String],
    options: js.Object,
    callback: ResultsCallback[RemoveUsersSavedTracksResponse]
  ): js.Promise[RemoveUsersSavedTracksResponse] = js.native
  /**
    * Remove tracks from a playlist
    * See [Remove Tracks from a Playlist](https://developer.spotify.com/web-api/remove-tracks-playlist/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} playlistId The id of the playlist. If you know the Spotify URI it is easy
    * to find the playlist id (e.g. spotify:user:xxxx:playlist:<here_is_the_playlist_id>)
    * @param {Array<Object>} uris An array of tracks to be removed. Each element of the array can be either a
    * string, in which case it is treated as a URI, or an object containing the properties `uri` (which is a
    * string) and `positions` (which is an array of integers).
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def removeTracksFromPlaylist(playlistId: String, uris: js.Array[js.Object]): js.Promise[RemoveTracksFromPlaylistResponse] = js.native
  def removeTracksFromPlaylist(
    playlistId: String,
    uris: js.Array[js.Object],
    callback: ResultsCallback[RemoveTracksFromPlaylistResponse]
  ): js.Promise[RemoveTracksFromPlaylistResponse] = js.native
  /**
    * Remove tracks from a playlist, specifying the positions of the tracks to be removed.
    * See [Remove Tracks from a Playlist](https://developer.spotify.com/web-api/remove-tracks-playlist/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} playlistId The id of the playlist. If you know the Spotify URI it is easy
    * to find the playlist id (e.g. spotify:user:xxxx:playlist:<here_is_the_playlist_id>)
    * @param {Array<number>} positions array of integers containing the positions of the tracks to remove
    * from the playlist.
    * @param {string} snapshotId The playlist's snapshot ID against which you want to make the changes
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def removeTracksFromPlaylistInPositions(playlistId: String, positions: js.Array[Double], snapshotId: String): js.Promise[PlaylistSnapshotResponse] = js.native
  def removeTracksFromPlaylistInPositions(
    playlistId: String,
    positions: js.Array[Double],
    snapshotId: String,
    callback: ResultsCallback[PlaylistSnapshotResponse]
  ): js.Promise[PlaylistSnapshotResponse] = js.native
  /**
    * Remove tracks from a playlist, specifying a snapshot id.
    * See [Remove Tracks from a Playlist](https://developer.spotify.com/web-api/remove-tracks-playlist/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} playlistId The id of the playlist. If you know the Spotify URI it is easy
    * to find the playlist id (e.g. spotify:user:xxxx:playlist:<here_is_the_playlist_id>)
    * @param {Array<Object>} uris An array of tracks to be removed. Each element of the array can be either a
    * string, in which case it is treated as a URI, or an object containing the properties `uri` (which is a
    * string) and `positions` (which is an array of integers).
    * @param {string} snapshotId The playlist's snapshot ID against which you want to make the changes
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def removeTracksFromPlaylistWithSnapshotId(playlistId: String, uris: js.Array[js.Object], snapshotId: String): js.Promise[PlaylistSnapshotResponse] = js.native
  def removeTracksFromPlaylistWithSnapshotId(
    playlistId: String,
    uris: js.Array[js.Object],
    snapshotId: String,
    callback: ResultsCallback[PlaylistSnapshotResponse]
  ): js.Promise[PlaylistSnapshotResponse] = js.native
  /**
    * Reorder tracks in a playlist
    * See [Reorder a Playlist’s Tracks](https://developer.spotify.com/web-api/reorder-playlists-tracks/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} playlistId The id of the playlist. If you know the Spotify URI it is easy
    * to find the playlist id (e.g. spotify:user:xxxx:playlist:<here_is_the_playlist_id>)
    * @param {number} rangeStart The position of the first track to be reordered.
    * @param {number} insertBefore The position where the tracks should be inserted. To reorder the tracks to
    * the end of the playlist, simply set insert_before to the position after the last track.
    * @param {Object} options An object with optional parameters (range_length, snapshot_id)
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def reorderTracksInPlaylist(playlistId: String, rangeStart: Double, insertBefore: Double): js.Promise[ReorderPlaylistTracksResponse] = js.native
  def reorderTracksInPlaylist(
    playlistId: String,
    rangeStart: Double,
    insertBefore: Double,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[ReorderPlaylistTracksResponse]
  ): js.Promise[ReorderPlaylistTracksResponse] = js.native
  def reorderTracksInPlaylist(playlistId: String, rangeStart: Double, insertBefore: Double, options: js.Object): js.Promise[ReorderPlaylistTracksResponse] = js.native
  def reorderTracksInPlaylist(
    playlistId: String,
    rangeStart: Double,
    insertBefore: Double,
    options: js.Object,
    callback: ResultsCallback[ReorderPlaylistTracksResponse]
  ): js.Promise[ReorderPlaylistTracksResponse] = js.native
  /**
    * Replace the tracks of a playlist
    * See [Replace a Playlist's Tracks](https://developer.spotify.com/web-api/replace-playlists-tracks/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} playlistId The id of the playlist. If you know the Spotify URI it is easy
    * to find the playlist id (e.g. spotify:user:xxxx:playlist:<here_is_the_playlist_id>)
    * @param {Array<string>} uris An array of Spotify URIs for the tracks
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def replaceTracksInPlaylist(playlistId: String, uris: js.Array[String]): js.Promise[ReplacePlaylistTracksResponse] = js.native
  def replaceTracksInPlaylist(
    playlistId: String,
    uris: js.Array[String],
    callback: ResultsCallback[ReplacePlaylistTracksResponse]
  ): js.Promise[ReplacePlaylistTracksResponse] = js.native
  // the search method added to allow access to it in typescript
  /**
    * Get Spotify catalog information about artists, albums, tracks or playlists that match a keyword string.
    * See [Search for an Item](https://developer.spotify.com/web-api/search-item/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} query The search query
    * @param {Array<>} types An array of item types to search across.
    * Valid types are: 'album', 'artist', 'playlist', and 'track'.
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def search(query: String, types: js.Array[album | artist | playlist | track]): js.Promise[SearchResponse] = js.native
  def search(
    query: String,
    types: js.Array[album | artist | playlist | track],
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[AlbumSearchResponse]
  ): js.Promise[SearchResponse] = js.native
  def search(
    query: String,
    types: js.Array[album | artist | playlist | track],
    options: SearchForItemParameterObject
  ): js.Promise[SearchResponse] = js.native
  def search(
    query: String,
    types: js.Array[album | artist | playlist | track],
    options: SearchForItemParameterObject,
    callback: ResultsCallback[AlbumSearchResponse]
  ): js.Promise[SearchResponse] = js.native
  /**
    * Fetches albums from the Spotify catalog according to a query.
    * See [Search for an Item](https://developer.spotify.com/web-api/search-item/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} query The search query
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def searchAlbums(query: String): js.Promise[AlbumSearchResponse] = js.native
  def searchAlbums(query: String, options: js.UndefOr[scala.Nothing], callback: ResultsCallback[AlbumSearchResponse]): js.Promise[AlbumSearchResponse] = js.native
  def searchAlbums(query: String, options: SearchForItemParameterObject): js.Promise[AlbumSearchResponse] = js.native
  def searchAlbums(
    query: String,
    options: SearchForItemParameterObject,
    callback: ResultsCallback[AlbumSearchResponse]
  ): js.Promise[AlbumSearchResponse] = js.native
  /**
    * Fetches artists from the Spotify catalog according to a query.
    * See [Search for an Item](https://developer.spotify.com/web-api/search-item/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} query The search query
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def searchArtists(query: String): js.Promise[ArtistSearchResponse] = js.native
  def searchArtists(query: String, options: js.UndefOr[scala.Nothing], callback: ResultsCallback[ArtistSearchResponse]): js.Promise[ArtistSearchResponse] = js.native
  def searchArtists(query: String, options: SearchForItemParameterObject): js.Promise[ArtistSearchResponse] = js.native
  def searchArtists(
    query: String,
    options: SearchForItemParameterObject,
    callback: ResultsCallback[ArtistSearchResponse]
  ): js.Promise[ArtistSearchResponse] = js.native
  /**
    * Fetches episodes from the Spotify catalog according to a query.
    * See [Search for an Item](https://developer.spotify.com/web-api/search-item/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} query The search query
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def searchEpisodes(query: String): js.Promise[EpisodeSearchResponse] = js.native
  def searchEpisodes(
    query: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[EpisodeSearchResponse]
  ): js.Promise[EpisodeSearchResponse] = js.native
  def searchEpisodes(query: String, options: SearchForItemParameterObject): js.Promise[EpisodeSearchResponse] = js.native
  def searchEpisodes(
    query: String,
    options: SearchForItemParameterObject,
    callback: ResultsCallback[EpisodeSearchResponse]
  ): js.Promise[EpisodeSearchResponse] = js.native
  /**
    * Fetches playlists from the Spotify catalog according to a query.
    * See [Search for an Item](https://developer.spotify.com/web-api/search-item/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} query The search query
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def searchPlaylists(query: String): js.Promise[PlaylistSearchResponse] = js.native
  def searchPlaylists(
    query: String,
    options: js.UndefOr[scala.Nothing],
    callback: ResultsCallback[PlaylistSearchResponse]
  ): js.Promise[PlaylistSearchResponse] = js.native
  def searchPlaylists(query: String, options: SearchForItemParameterObject): js.Promise[PlaylistSearchResponse] = js.native
  def searchPlaylists(
    query: String,
    options: SearchForItemParameterObject,
    callback: ResultsCallback[PlaylistSearchResponse]
  ): js.Promise[PlaylistSearchResponse] = js.native
  /**
    * Fetches shows from the Spotify catalog according to a query.
    * See [Search for an Item](https://developer.spotify.com/web-api/search-item/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} query The search query
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def searchShows(query: String): js.Promise[ShowSearchResponse] = js.native
  def searchShows(query: String, options: js.UndefOr[scala.Nothing], callback: ResultsCallback[ShowSearchResponse]): js.Promise[ShowSearchResponse] = js.native
  def searchShows(query: String, options: SearchForItemParameterObject): js.Promise[ShowSearchResponse] = js.native
  def searchShows(
    query: String,
    options: SearchForItemParameterObject,
    callback: ResultsCallback[ShowSearchResponse]
  ): js.Promise[ShowSearchResponse] = js.native
  /**
    * Fetches tracks from the Spotify catalog according to a query.
    * See [Search for an Item](https://developer.spotify.com/web-api/search-item/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} query The search query
    * @param {Object} options A JSON object with options that can be passed
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def searchTracks(query: String): js.Promise[TrackSearchResponse] = js.native
  def searchTracks(query: String, options: js.UndefOr[scala.Nothing], callback: ResultsCallback[TrackSearchResponse]): js.Promise[TrackSearchResponse] = js.native
  def searchTracks(query: String, options: SearchForItemParameterObject): js.Promise[TrackSearchResponse] = js.native
  def searchTracks(
    query: String,
    options: SearchForItemParameterObject,
    callback: ResultsCallback[TrackSearchResponse]
  ): js.Promise[TrackSearchResponse] = js.native
  /**
    * Seeks to the given position in the user’s currently playing track.
    * See [Seek To Position In Currently Playing Track](https://developer.spotify.com/web-api/seek-to-position-in-currently-playing-track/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {number} position_ms The position in milliseconds to seek to. Must be a positive number.
    * @param {Object} options A JSON object with options that can be passed.
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def seek(position: Double): js.Promise[Unit] = js.native
  def seek(position: Double, callback: VoidResultsCallback): Unit = js.native
  def seek(position: Double, options: DeviceSpecificParameterObject): js.Promise[Unit] = js.native
  def seek(position: Double, options: DeviceSpecificParameterObject, callback: VoidResultsCallback): Unit = js.native
  /**
    * Sets the access token to be used.
    * See [the Authorization Guide](https://developer.spotify.com/web-api/authorization-guide/) on
    * the Spotify Developer site for more information about obtaining an access token.
    *
    * @param {string} accessToken The access token
    * @return {void}
    */
  def setAccessToken(): Unit = js.native
  def setAccessToken(accessToken: String): Unit = js.native
  /**
    * Sets an implementation of Promises/A+ to be used. E.g. Q, when.
    * See [Conformant Implementations](https://github.com/promises-aplus/promises-spec/blob/master/implementations.md)
    * for a list of some available options
    *
    * @param {Object} PromiseImplementation A Promises/A+ valid implementation
    * @throws {Error} If the implementation being set doesn't conform with Promises/A+
    * @return {void}
    */
  def setPromiseImplementation(promiseImplementation: js.Object): Unit = js.native
  /**
    * Set the repeat mode for the user’s playback. Options are repeat-track, repeat-context, and off.
    * See [Set Repeat Mode On User’s Playback](https://developer.spotify.com/web-api/set-repeat-mode-on-users-playback/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {String} state A string set to 'track', 'context' or 'off'.
    * @param {Object} options A JSON object with options that can be passed.
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def setRepeat(state: PlaybackRepeatState): js.Promise[Unit] = js.native
  def setRepeat(state: PlaybackRepeatState, callback: VoidResultsCallback): Unit = js.native
  def setRepeat(state: PlaybackRepeatState, options: DeviceSpecificParameterObject): js.Promise[Unit] = js.native
  def setRepeat(state: PlaybackRepeatState, options: DeviceSpecificParameterObject, callback: VoidResultsCallback): Unit = js.native
  /**
    * Toggle shuffle on or off for user’s playback.
    * See [Toggle Shuffle For User’s Playback](https://developer.spotify.com/web-api/toggle-shuffle-for-users-playback/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {bool} state Whether or not to shuffle user's playback.
    * @param {Object} options A JSON object with options that can be passed.
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def setShuffle(state: Boolean): js.Promise[Unit] = js.native
  def setShuffle(state: Boolean, callback: VoidResultsCallback): Unit = js.native
  def setShuffle(state: Boolean, options: DeviceSpecificParameterObject): js.Promise[Unit] = js.native
  def setShuffle(state: Boolean, options: DeviceSpecificParameterObject, callback: VoidResultsCallback): Unit = js.native
  /**
    * Set the volume for the user’s current playback device.
    * See [Set Volume For User’s Playback](https://developer.spotify.com/web-api/set-volume-for-users-playback/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {number} volume_percent The volume to set. Must be a value from 0 to 100 inclusive.
    * @param {Object} options A JSON object with options that can be passed.
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def setVolume(volumePercent: Double): js.Promise[Unit] = js.native
  def setVolume(volumePercent: Double, callback: VoidResultsCallback): Unit = js.native
  def setVolume(volumePercent: Double, options: DeviceSpecificParameterObject): js.Promise[Unit] = js.native
  def setVolume(volumePercent: Double, options: DeviceSpecificParameterObject, callback: VoidResultsCallback): Unit = js.native
  /**
    * Skips to next track in the user’s queue.
    * See [Skip User’s Playback To Next Track](https://developer.spotify.com/web-api/skip-users-playback-to-next-track/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed.
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def skipToNext(): js.Promise[Unit] = js.native
  def skipToNext(callback: VoidResultsCallback): Unit = js.native
  def skipToNext(options: DeviceSpecificParameterObject): js.Promise[Unit] = js.native
  def skipToNext(options: DeviceSpecificParameterObject, callback: VoidResultsCallback): Unit = js.native
  /**
    * Skips to previous track in the user’s queue.
    * Note that this will ALWAYS skip to the previous track, regardless of the current track’s progress.
    * Returning to the start of the current track should be performed using `.seek()`
    * See [Skip User’s Playback To Previous Track](https://developer.spotify.com/web-api/skip-users-playback-to-next-track/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Object} options A JSON object with options that can be passed.
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def skipToPrevious(): js.Promise[Unit] = js.native
  def skipToPrevious(callback: VoidResultsCallback): Unit = js.native
  def skipToPrevious(options: DeviceSpecificParameterObject): js.Promise[Unit] = js.native
  def skipToPrevious(options: DeviceSpecificParameterObject, callback: VoidResultsCallback): Unit = js.native
  /**
    * Transfer playback to a new device and determine if it should start playing.
    * See [Transfer a User’s Playback](https://developer.spotify.com/web-api/transfer-a-users-playback/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} deviceIds A JSON array containing the ID of the device on which playback should be started/transferred.
    * @param {Object} options A JSON object with options that can be passed.
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def transferMyPlayback(deviceIds: js.Array[String]): js.Promise[Unit] = js.native
  def transferMyPlayback(deviceIds: js.Array[String], callback: VoidResultsCallback): Unit = js.native
  def transferMyPlayback(deviceIds: js.Array[String], options: TransferPlaybackParameterObject): js.Promise[Unit] = js.native
  def transferMyPlayback(
    deviceIds: js.Array[String],
    options: TransferPlaybackParameterObject,
    callback: VoidResultsCallback
  ): Unit = js.native
  /**
    * Removes the current user as a follower of one or more artists.
    * See [Unfollow Artists or Users](https://developer.spotify.com/web-api/unfollow-artists-users/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} artistIds The ids of the artists. If you know their Spotify URI it is easy
    * to find their artist id (e.g. spotify:artist:<here_is_the_artist_id>)
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is an empty value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def unfollowArtists(artistIds: js.Array[String]): js.Promise[UnfollowArtistsOrUsersResponse] = js.native
  def unfollowArtists(artistIds: js.Array[String], callback: ResultsCallback[UnfollowArtistsOrUsersResponse]): js.Promise[UnfollowArtistsOrUsersResponse] = js.native
  /**
    * Remove the current user as a follower of one playlist.
    * See [Unfollow a Playlist](https://developer.spotify.com/web-api/unfollow-playlist/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} playlistId The id of the playlist. If you know the Spotify URI it is easy
    * to find the playlist id (e.g. spotify:user:xxxx:playlist:<here_is_the_playlist_id>)
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is an empty value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def unfollowPlaylist(playlistId: String): js.Promise[UnfollowPlaylistResponse] = js.native
  def unfollowPlaylist(playlistId: String, callback: ResultsCallback[UnfollowPlaylistResponse]): js.Promise[UnfollowPlaylistResponse] = js.native
  /**
    * Removes the current user as a follower of one or more other Spotify users.
    * See [Unfollow Artists or Users](https://developer.spotify.com/web-api/unfollow-artists-users/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {Array<string>} userIds The ids of the users. If you know their Spotify URI it is easy
    * to find their user id (e.g. spotify:user:<here_is_the_user_id>)
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is an empty value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def unfollowUsers(userIds: js.Array[String]): js.Promise[UnfollowArtistsOrUsersResponse] = js.native
  def unfollowUsers(userIds: js.Array[String], callback: ResultsCallback[UnfollowArtistsOrUsersResponse]): js.Promise[UnfollowArtistsOrUsersResponse] = js.native
  /**
    * Upload a custom playlist cover image.
    * See [Upload A Custom Playlist Cover Image](https://developer.spotify.com/web-api/upload-a-custom-playlist-cover-image/) on
    * the Spotify Developer site for more information about the endpoint.
    *
    * @param {string} playlistId The id of the playlist. If you know the Spotify URI it is easy
    * to find the playlist id (e.g. spotify:user:xxxx:playlist:<here_is_the_playlist_id>)
    * @param {string} imageData Base64 encoded JPEG image data, maximum payload size is 256 KB.
    * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    * @return {Object} Null if a callback is provided, a `Promise` object otherwise
    */
  def uploadCustomPlaylistCoverImage(playlistId: String, imageData: String): js.Promise[UploadCustomPlaylistCoverImageResponse] = js.native
  def uploadCustomPlaylistCoverImage(
    playlistId: String,
    imageData: String,
    callback: ResultsCallback[UploadCustomPlaylistCoverImageResponse]
  ): js.Promise[UploadCustomPlaylistCoverImageResponse] = js.native
}

