package typings
package spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsMod.SpotifyWebApiNs

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
  def addToMySavedAlbums(albumIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SaveAlbumsForUserResponse] = js.native
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
  def addToMySavedAlbums(albumIds: js.Array[java.lang.String], options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SaveAlbumsForUserResponse] = js.native
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
  def addToMySavedAlbums(
    albumIds: js.Array[java.lang.String],
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SaveAlbumsForUserResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SaveAlbumsForUserResponse] = js.native
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
  def addToMySavedTracks(trackIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SaveTracksForUserResponse] = js.native
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
  def addToMySavedTracks(trackIds: js.Array[java.lang.String], options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SaveTracksForUserResponse] = js.native
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
  def addToMySavedTracks(
    trackIds: js.Array[java.lang.String],
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SaveTracksForUserResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SaveTracksForUserResponse] = js.native
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
  def addTracksToPlaylist(playlistId: java.lang.String, uris: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AddTracksToPlaylistResponse] = js.native
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
  def addTracksToPlaylist(playlistId: java.lang.String, uris: js.Array[java.lang.String], options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AddTracksToPlaylistResponse] = js.native
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
  def addTracksToPlaylist(
    playlistId: java.lang.String,
    uris: js.Array[java.lang.String],
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AddTracksToPlaylistResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AddTracksToPlaylistResponse] = js.native
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
  def areFollowingPlaylist(playlistId: java.lang.String, userIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersFollowPlaylistReponse] = js.native
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
  def areFollowingPlaylist(
    playlistId: java.lang.String,
    userIds: js.Array[java.lang.String],
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersFollowPlaylistReponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersFollowPlaylistReponse] = js.native
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
  def changePlaylistDetails(playlistId: java.lang.String, data: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ChangePlaylistDetailsReponse] = js.native
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
  def changePlaylistDetails(
    playlistId: java.lang.String,
    data: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ChangePlaylistDetailsReponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ChangePlaylistDetailsReponse] = js.native
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
  def containsMySavedAlbums(albumIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CheckUserSavedAlbumsResponse] = js.native
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
  def containsMySavedAlbums(albumIds: js.Array[java.lang.String], options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CheckUserSavedAlbumsResponse] = js.native
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
  def containsMySavedAlbums(
    albumIds: js.Array[java.lang.String],
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CheckUserSavedAlbumsResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CheckUserSavedAlbumsResponse] = js.native
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
  def containsMySavedTracks(trackIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CheckUsersSavedTracksResponse] = js.native
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
  def containsMySavedTracks(trackIds: js.Array[java.lang.String], options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CheckUsersSavedTracksResponse] = js.native
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
  def containsMySavedTracks(
    trackIds: js.Array[java.lang.String],
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CheckUsersSavedTracksResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CheckUsersSavedTracksResponse] = js.native
  /**
           * Creates a playlist and stores it in the current user's library.
           * See [Create a Playlist](https://developer.spotify.com/web-api/create-playlist/) on
           * the Spotify Developer site for more information about the endpoint.
           *
           * @param {Object} options A JSON object with options that can be passed
           * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
           * one is the error object (null if no error), and the second is the value if the request succeeded.
           * @return {Object} Null if a callback is provided, a `Promise` object otherwise
           */
  def createPlaylist(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CreatePlaylistResponse] = js.native
  /**
           * Creates a playlist and stores it in the current user's library.
           * See [Create a Playlist](https://developer.spotify.com/web-api/create-playlist/) on
           * the Spotify Developer site for more information about the endpoint.
           *
           * @param {Object} options A JSON object with options that can be passed
           * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
           * one is the error object (null if no error), and the second is the value if the request succeeded.
           * @return {Object} Null if a callback is provided, a `Promise` object otherwise
           */
  def createPlaylist(options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CreatePlaylistResponse] = js.native
  /**
           * Creates a playlist and stores it in the current user's library.
           * See [Create a Playlist](https://developer.spotify.com/web-api/create-playlist/) on
           * the Spotify Developer site for more information about the endpoint.
           *
           * @param {Object} options A JSON object with options that can be passed
           * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
           * one is the error object (null if no error), and the second is the value if the request succeeded.
           * @return {Object} Null if a callback is provided, a `Promise` object otherwise
           */
  def createPlaylist(
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CreatePlaylistResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CreatePlaylistResponse] = js.native
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
  def followArtists(artistIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.FollowArtistsOrUsersResponse] = js.native
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
  def followArtists(
    artistIds: js.Array[java.lang.String],
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.FollowArtistsOrUsersResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.FollowArtistsOrUsersResponse] = js.native
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
  def followPlaylist(playlistId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.FollowPlaylistReponse] = js.native
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
  def followPlaylist(playlistId: java.lang.String, options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.FollowPlaylistReponse] = js.native
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
  def followPlaylist(
    playlistId: java.lang.String,
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.FollowPlaylistReponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.FollowPlaylistReponse] = js.native
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
  def followUsers(userIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.FollowArtistsOrUsersResponse] = js.native
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
  def followUsers(
    userIds: js.Array[java.lang.String],
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.FollowArtistsOrUsersResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.FollowArtistsOrUsersResponse] = js.native
  /**
           * Gets the access token in use.
           *
           * @return {string} accessToken The access token
           */
  def getAccessToken(): java.lang.String = js.native
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
  def getAlbum(albumId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleAlbumResponse] = js.native
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
  def getAlbum(albumId: java.lang.String, options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleAlbumResponse] = js.native
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
  def getAlbum(
    albumId: java.lang.String,
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleAlbumResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleAlbumResponse] = js.native
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
  def getAlbumTracks(albumId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AlbumTracksResponse] = js.native
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
  def getAlbumTracks(albumId: java.lang.String, options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AlbumTracksResponse] = js.native
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
  def getAlbumTracks(
    albumId: java.lang.String,
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AlbumTracksResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AlbumTracksResponse] = js.native
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
  def getAlbums(albumIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleAlbumsResponse] = js.native
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
  def getAlbums(albumIds: js.Array[java.lang.String], options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleAlbumsResponse] = js.native
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
  def getAlbums(
    albumIds: js.Array[java.lang.String],
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleAlbumsResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleAlbumsResponse] = js.native
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
  def getArtist(artistId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleArtistResponse] = js.native
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
  def getArtist(artistId: java.lang.String, options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleArtistResponse] = js.native
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
  def getArtist(
    artistId: java.lang.String,
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleArtistResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleArtistResponse] = js.native
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
  def getArtistAlbums(artistId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistsAlbumsResponse] = js.native
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
  def getArtistAlbums(artistId: java.lang.String, options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistsAlbumsResponse] = js.native
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
  def getArtistAlbums(
    artistId: java.lang.String,
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistsAlbumsResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistsAlbumsResponse] = js.native
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
  def getArtistRelatedArtists(artistId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistsRelatedArtistsResponse] = js.native
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
  def getArtistRelatedArtists(artistId: java.lang.String, options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistsRelatedArtistsResponse] = js.native
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
  def getArtistRelatedArtists(
    artistId: java.lang.String,
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistsRelatedArtistsResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistsRelatedArtistsResponse] = js.native
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
  def getArtistTopTracks(artistId: java.lang.String, countryId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistsTopTracksResponse] = js.native
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
  def getArtistTopTracks(artistId: java.lang.String, countryId: java.lang.String, options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistsTopTracksResponse] = js.native
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
  def getArtistTopTracks(
    artistId: java.lang.String,
    countryId: java.lang.String,
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistsTopTracksResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistsTopTracksResponse] = js.native
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
  def getArtists(artistIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleArtistsResponse] = js.native
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
  def getArtists(artistIds: js.Array[java.lang.String], options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleArtistsResponse] = js.native
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
  def getArtists(
    artistIds: js.Array[java.lang.String],
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleArtistsResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleArtistsResponse] = js.native
  /**
           * Get audio feature information for a single track identified by its unique Spotify ID. 
           * See [Get Audio Analysis for a Track](https://developer.spotify.com/documentation/web-api/https://developer.spotify.com/documentation/web-api/reference/tracks/get-audio-analysis/) on
           * the Spotify Developer site for more information about the endpoint.
           * @param {string} trackId The id of the track. If you know the Spotify URI it is easy
           * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
           * one is the error object (null if no error), and the second is the value if the request succeeded.
           */
  def getAudioAnalysisForTrack(trackId: java.lang.String): stdLib.Promise[_] = js.native
  /**
           * Get audio feature information for a single track identified by its unique Spotify ID. 
           * See [Get Audio Analysis for a Track](https://developer.spotify.com/documentation/web-api/https://developer.spotify.com/documentation/web-api/reference/tracks/get-audio-analysis/) on
           * the Spotify Developer site for more information about the endpoint.
           * @param {string} trackId The id of the track. If you know the Spotify URI it is easy
           * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
           * one is the error object (null if no error), and the second is the value if the request succeeded.
           */
  def getAudioAnalysisForTrack(trackId: java.lang.String, callback: ResultsCallback[_]): stdLib.Promise[_] = js.native
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
  def getAudioFeaturesForTrack(trackId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AudioFeaturesResponse] = js.native
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
  def getAudioFeaturesForTrack(
    trackId: java.lang.String,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AudioFeaturesResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AudioFeaturesResponse] = js.native
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
  def getAudioFeaturesForTracks(trackIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleAudioFeaturesResponse] = js.native
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
  def getAudioFeaturesForTracks(
    trackIds: js.Array[java.lang.String],
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleAudioFeaturesResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleAudioFeaturesResponse] = js.native
  /**
           * Retrieve a list of available genres seed parameter values for recommendations.
           * See [Available Genre Seeds](https://developer.spotify.com/web-api/get-recommendations/#available-genre-seeds) on
           * the Spotify Developer site for more information about the endpoint.
           *
           * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
           * one is the error object (null if no error), and the second is the value if the request succeeded.
           * @return {Object} Null if a callback is provided, a `Promise` object otherwise
           */
  def getAvailableGenreSeeds(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AvailableGenreSeedsResponse] = js.native
  /**
           * Retrieve a list of available genres seed parameter values for recommendations.
           * See [Available Genre Seeds](https://developer.spotify.com/web-api/get-recommendations/#available-genre-seeds) on
           * the Spotify Developer site for more information about the endpoint.
           *
           * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
           * one is the error object (null if no error), and the second is the value if the request succeeded.
           * @return {Object} Null if a callback is provided, a `Promise` object otherwise
           */
  def getAvailableGenreSeeds(callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AvailableGenreSeedsResponse]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AvailableGenreSeedsResponse] = js.native
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
  def getCategories(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleCategoriesResponse] = js.native
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
  def getCategories(options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleCategoriesResponse] = js.native
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
  def getCategories(
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleCategoriesResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleCategoriesResponse] = js.native
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
  def getCategory(categoryId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleCategoryResponse] = js.native
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
  def getCategory(categoryId: java.lang.String, options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleCategoryResponse] = js.native
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
  def getCategory(
    categoryId: java.lang.String,
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleCategoryResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleCategoryResponse] = js.native
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
  def getCategoryPlaylists(categoryId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CategoryPlaylistsReponse] = js.native
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
  def getCategoryPlaylists(categoryId: java.lang.String, options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CategoryPlaylistsReponse] = js.native
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
  def getCategoryPlaylists(
    categoryId: java.lang.String,
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CategoryPlaylistsReponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CategoryPlaylistsReponse] = js.native
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
  def getFeaturedPlaylists(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ListOfFeaturedPlaylistsResponse] = js.native
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
  def getFeaturedPlaylists(options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ListOfFeaturedPlaylistsResponse] = js.native
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
  def getFeaturedPlaylists(
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ListOfFeaturedPlaylistsResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ListOfFeaturedPlaylistsResponse] = js.native
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
  def getFollowedArtists(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersFollowedArtistsResponse] = js.native
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
  def getFollowedArtists(options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersFollowedArtistsResponse] = js.native
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
  def getFollowedArtists(
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersFollowedArtistsResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersFollowedArtistsResponse] = js.native
  /**
           * Fetches a resource through a generic GET request.
           *
           * @param {string} url The URL to be fetched
           * @param {function(Object,Object)} callback An optional callback
           * @return {Object} Null if a callback is provided, a `Promise` object otherwise
           */
  def getGeneric(url: java.lang.String): stdLib.Promise[js.Object] = js.native
  /**
           * Fetches a resource through a generic GET request.
           *
           * @param {string} url The URL to be fetched
           * @param {function(Object,Object)} callback An optional callback
           * @return {Object} Null if a callback is provided, a `Promise` object otherwise
           */
  def getGeneric(url: java.lang.String, callback: ResultsCallback[js.Object]): stdLib.Promise[js.Object] = js.native
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
  def getMe(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CurrentUsersProfileResponse] = js.native
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
  def getMe(options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CurrentUsersProfileResponse] = js.native
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
  def getMe(
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CurrentUsersProfileResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CurrentUsersProfileResponse] = js.native
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
  def getMyCurrentPlaybackState(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CurrentPlaybackResponse] = js.native
  def getMyCurrentPlaybackState(callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CurrentPlaybackResponse]): scala.Unit = js.native
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
  def getMyCurrentPlaybackState(options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.TrackRelinkingParameterObject): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CurrentPlaybackResponse] = js.native
  def getMyCurrentPlaybackState(
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.TrackRelinkingParameterObject,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CurrentPlaybackResponse]
  ): scala.Unit = js.native
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
  def getMyCurrentPlayingTrack(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CurrentlyPlayingResponse] = js.native
  def getMyCurrentPlayingTrack(callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CurrentlyPlayingResponse]): scala.Unit = js.native
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
  def getMyCurrentPlayingTrack(options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.TrackRelinkingParameterObject): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CurrentlyPlayingResponse] = js.native
  def getMyCurrentPlayingTrack(
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.TrackRelinkingParameterObject,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.CurrentlyPlayingResponse]
  ): scala.Unit = js.native
  /**
          * Get information about a user’s available devices.
          * See [Get a User’s Available Devices](https://developer.spotify.com/web-api/get-a-users-available-devices/) on
          * the Spotify Developer site for more information about the endpoint.
          *
          * @param {function(Object,Object)} callback An optional callback that receives 2 parameters. The first
          * one is the error object (null if no error), and the second is the value if the request succeeded.
          * @return {Object} Null if a callback is provided, a `Promise` object otherwise
          */
  def getMyDevices(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UserDevicesResponse] = js.native
  def getMyDevices(callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UserDevicesResponse]): scala.Unit = js.native
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
  def getMyRecentlyPlayedTracks(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersRecentlyPlayedTracksResponse] = js.native
  def getMyRecentlyPlayedTracks(
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersRecentlyPlayedTracksResponse]
  ): scala.Unit = js.native
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
  def getMyRecentlyPlayedTracks(options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RecentlyPlayedParameterObject): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersRecentlyPlayedTracksResponse] = js.native
  def getMyRecentlyPlayedTracks(
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RecentlyPlayedParameterObject,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersRecentlyPlayedTracksResponse]
  ): scala.Unit = js.native
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
  def getMySavedAlbums(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersSavedAlbumsResponse] = js.native
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
  def getMySavedAlbums(options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersSavedAlbumsResponse] = js.native
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
  def getMySavedAlbums(
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersSavedAlbumsResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersSavedAlbumsResponse] = js.native
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
  def getMySavedTracks(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersSavedTracksResponse] = js.native
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
  def getMySavedTracks(options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersSavedTracksResponse] = js.native
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
  def getMySavedTracks(
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersSavedTracksResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersSavedTracksResponse] = js.native
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
  def getMyTopArtists(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersTopArtistsResponse] = js.native
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
  def getMyTopArtists(options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersTopArtistsResponse] = js.native
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
  def getMyTopArtists(
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersTopArtistsResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersTopArtistsResponse] = js.native
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
  def getMyTopTracks(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersTopTracksResponse] = js.native
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
  def getMyTopTracks(options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersTopTracksResponse] = js.native
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
  def getMyTopTracks(
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersTopTracksResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UsersTopTracksResponse] = js.native
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
  def getNewReleases(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ListOfNewReleasesResponse] = js.native
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
  def getNewReleases(options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ListOfNewReleasesResponse] = js.native
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
  def getNewReleases(
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ListOfNewReleasesResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ListOfNewReleasesResponse] = js.native
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
  def getPlaylist(playlistId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SinglePlaylistResponse] = js.native
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
  def getPlaylist(playlistId: java.lang.String, options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SinglePlaylistResponse] = js.native
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
  def getPlaylist(
    playlistId: java.lang.String,
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SinglePlaylistResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SinglePlaylistResponse] = js.native
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
  def getPlaylistTracks(playlistId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaylistTrackResponse] = js.native
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
  def getPlaylistTracks(playlistId: java.lang.String, options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaylistTrackResponse] = js.native
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
  def getPlaylistTracks(
    playlistId: java.lang.String,
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaylistTrackResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaylistTrackResponse] = js.native
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
  def getRecommendations(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RecommendationsFromSeedsResponse] = js.native
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
  def getRecommendations(options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RecommendationsOptionsObject): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RecommendationsFromSeedsResponse] = js.native
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
  def getRecommendations(
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RecommendationsOptionsObject,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RecommendationsFromSeedsResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RecommendationsFromSeedsResponse] = js.native
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
  def getTrack(trackId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleTrackResponse] = js.native
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
  def getTrack(trackId: java.lang.String, options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleTrackResponse] = js.native
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
  def getTrack(
    trackId: java.lang.String,
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleTrackResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SingleTrackResponse] = js.native
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
  def getTracks(trackIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleTracksResponse] = js.native
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
  def getTracks(trackIds: js.Array[java.lang.String], options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleTracksResponse] = js.native
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
  def getTracks(
    trackIds: js.Array[java.lang.String],
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleTracksResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.MultipleTracksResponse] = js.native
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
  def getUser(userId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UserProfileResponse] = js.native
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
  def getUser(userId: java.lang.String, options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UserProfileResponse] = js.native
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
  def getUser(
    userId: java.lang.String,
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UserProfileResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UserProfileResponse] = js.native
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
  def getUserPlaylists(): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ListOfUsersPlaylistsResponse] = js.native
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
  def getUserPlaylists(userId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ListOfUsersPlaylistsResponse] = js.native
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
  def getUserPlaylists(userId: java.lang.String, options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ListOfUsersPlaylistsResponse] = js.native
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
  def getUserPlaylists(
    userId: java.lang.String,
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ListOfUsersPlaylistsResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ListOfUsersPlaylistsResponse] = js.native
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
  def isFollowingArtists(artistIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UserFollowsUsersOrArtistsResponse] = js.native
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
  def isFollowingArtists(
    artistIds: js.Array[java.lang.String],
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UserFollowsUsersOrArtistsResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UserFollowsUsersOrArtistsResponse] = js.native
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
  def isFollowingUsers(userIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UserFollowsUsersOrArtistsResponse] = js.native
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
  def isFollowingUsers(
    userIds: js.Array[java.lang.String],
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UserFollowsUsersOrArtistsResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UserFollowsUsersOrArtistsResponse] = js.native
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
  def pause(): stdLib.Promise[scala.Unit] = js.native
  def pause(callback: VoidResultsCallback): scala.Unit = js.native
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
  def pause(options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject): stdLib.Promise[scala.Unit] = js.native
  def pause(
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject,
    callback: VoidResultsCallback
  ): scala.Unit = js.native
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
  def play(): stdLib.Promise[scala.Unit] = js.native
  def play(callback: VoidResultsCallback): scala.Unit = js.native
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
  def play(options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject): stdLib.Promise[scala.Unit] = js.native
  def play(
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject,
    callback: VoidResultsCallback
  ): scala.Unit = js.native
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
  def removeFromMySavedAlbums(albumIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RemoveAlbumsForUserResponse] = js.native
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
  def removeFromMySavedAlbums(albumIds: js.Array[java.lang.String], options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RemoveAlbumsForUserResponse] = js.native
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
  def removeFromMySavedAlbums(
    albumIds: js.Array[java.lang.String],
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RemoveAlbumsForUserResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RemoveAlbumsForUserResponse] = js.native
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
  def removeFromMySavedTracks(trackIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RemoveUsersSavedTracksResponse] = js.native
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
  def removeFromMySavedTracks(trackIds: js.Array[java.lang.String], options: js.Object): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RemoveUsersSavedTracksResponse] = js.native
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
  def removeFromMySavedTracks(
    trackIds: js.Array[java.lang.String],
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RemoveUsersSavedTracksResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RemoveUsersSavedTracksResponse] = js.native
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
  def removeTracksFromPlaylist(playlistId: java.lang.String, uris: js.Array[js.Object]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RemoveTracksFromPlaylistResponse] = js.native
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
  def removeTracksFromPlaylist(
    playlistId: java.lang.String,
    uris: js.Array[js.Object],
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RemoveTracksFromPlaylistResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.RemoveTracksFromPlaylistResponse] = js.native
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
  def removeTracksFromPlaylistInPositions(playlistId: java.lang.String, positions: js.Array[scala.Double], snapshotId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaylistSnapshotResponse] = js.native
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
  def removeTracksFromPlaylistInPositions(
    playlistId: java.lang.String,
    positions: js.Array[scala.Double],
    snapshotId: java.lang.String,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaylistSnapshotResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaylistSnapshotResponse] = js.native
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
  def removeTracksFromPlaylistWithSnapshotId(playlistId: java.lang.String, uris: js.Array[js.Object], snapshotId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaylistSnapshotResponse] = js.native
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
  def removeTracksFromPlaylistWithSnapshotId(
    playlistId: java.lang.String,
    uris: js.Array[js.Object],
    snapshotId: java.lang.String,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaylistSnapshotResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaylistSnapshotResponse] = js.native
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
  def reorderTracksInPlaylist(playlistId: java.lang.String, rangeStart: scala.Double, insertBefore: scala.Double): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ReorderPlaylistTracksResponse] = js.native
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
  def reorderTracksInPlaylist(
    playlistId: java.lang.String,
    rangeStart: scala.Double,
    insertBefore: scala.Double,
    options: js.Object
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ReorderPlaylistTracksResponse] = js.native
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
  def reorderTracksInPlaylist(
    playlistId: java.lang.String,
    rangeStart: scala.Double,
    insertBefore: scala.Double,
    options: js.Object,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ReorderPlaylistTracksResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ReorderPlaylistTracksResponse] = js.native
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
  def replaceTracksInPlaylist(playlistId: java.lang.String, uris: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ReplacePlaylistTracksResponse] = js.native
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
  def replaceTracksInPlaylist(
    playlistId: java.lang.String,
    uris: js.Array[java.lang.String],
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ReplacePlaylistTracksResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ReplacePlaylistTracksResponse] = js.native
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
  
  def search(
    query: java.lang.String,
    types: js.Array[
      spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.album | spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.artist | spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.playlist | spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.track
    ]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SearchResponse] = js.native
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
  
  def search(
    query: java.lang.String,
    types: js.Array[
      spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.album | spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.artist | spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.playlist | spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.track
    ],
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SearchForItemParameterObject
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SearchResponse] = js.native
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
  
  def search(
    query: java.lang.String,
    types: js.Array[
      spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.album | spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.artist | spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.playlist | spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.track
    ],
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SearchForItemParameterObject,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AlbumSearchResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SearchResponse] = js.native
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
  def searchAlbums(query: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AlbumSearchResponse] = js.native
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
  def searchAlbums(
    query: java.lang.String,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SearchForItemParameterObject
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AlbumSearchResponse] = js.native
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
  def searchAlbums(
    query: java.lang.String,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SearchForItemParameterObject,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AlbumSearchResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.AlbumSearchResponse] = js.native
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
  def searchArtists(query: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistSearchResponse] = js.native
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
  def searchArtists(
    query: java.lang.String,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SearchForItemParameterObject
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistSearchResponse] = js.native
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
  def searchArtists(
    query: java.lang.String,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SearchForItemParameterObject,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistSearchResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.ArtistSearchResponse] = js.native
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
  def searchPlaylists(query: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaylistSearchResponse] = js.native
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
  def searchPlaylists(
    query: java.lang.String,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SearchForItemParameterObject
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaylistSearchResponse] = js.native
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
  def searchPlaylists(
    query: java.lang.String,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SearchForItemParameterObject,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaylistSearchResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaylistSearchResponse] = js.native
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
  def searchTracks(query: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.TrackSearchResponse] = js.native
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
  def searchTracks(
    query: java.lang.String,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SearchForItemParameterObject
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.TrackSearchResponse] = js.native
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
  def searchTracks(
    query: java.lang.String,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.SearchForItemParameterObject,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.TrackSearchResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.TrackSearchResponse] = js.native
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
  def seek(position: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def seek(position: scala.Double, callback: VoidResultsCallback): scala.Unit = js.native
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
  def seek(
    position: scala.Double,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject
  ): stdLib.Promise[scala.Unit] = js.native
  def seek(
    position: scala.Double,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject,
    callback: VoidResultsCallback
  ): scala.Unit = js.native
  /**
           * Sets the access token to be used.
           * See [the Authorization Guide](https://developer.spotify.com/web-api/authorization-guide/) on
           * the Spotify Developer site for more information about obtaining an access token.
           *
           * @param {string} accessToken The access token
           * @return {void}
           */
  def setAccessToken(accessToken: java.lang.String): scala.Unit = js.native
  /**
           * Sets an implementation of Promises/A+ to be used. E.g. Q, when.
           * See [Conformant Implementations](https://github.com/promises-aplus/promises-spec/blob/master/implementations.md)
           * for a list of some available options
           *
           * @param {Object} PromiseImplementation A Promises/A+ valid implementation
           * @throws {Error} If the implementation being set doesn't conform with Promises/A+
           * @return {void}
           */
  def setPromiseImplementation(promiseImplementation: js.Object): scala.Unit = js.native
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
  def setRepeat(state: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaybackRepeatState): stdLib.Promise[scala.Unit] = js.native
  def setRepeat(
    state: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaybackRepeatState,
    callback: VoidResultsCallback
  ): scala.Unit = js.native
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
  def setRepeat(
    state: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaybackRepeatState,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject
  ): stdLib.Promise[scala.Unit] = js.native
  def setRepeat(
    state: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.PlaybackRepeatState,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject,
    callback: VoidResultsCallback
  ): scala.Unit = js.native
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
  def setShuffle(state: scala.Boolean): stdLib.Promise[scala.Unit] = js.native
  def setShuffle(state: scala.Boolean, callback: VoidResultsCallback): scala.Unit = js.native
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
  def setShuffle(
    state: scala.Boolean,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject
  ): stdLib.Promise[scala.Unit] = js.native
  def setShuffle(
    state: scala.Boolean,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject,
    callback: VoidResultsCallback
  ): scala.Unit = js.native
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
  def setVolume(volumePercent: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def setVolume(volumePercent: scala.Double, callback: VoidResultsCallback): scala.Unit = js.native
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
  def setVolume(
    volumePercent: scala.Double,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject
  ): stdLib.Promise[scala.Unit] = js.native
  def setVolume(
    volumePercent: scala.Double,
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject,
    callback: VoidResultsCallback
  ): scala.Unit = js.native
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
  def skipToNext(): stdLib.Promise[scala.Unit] = js.native
  def skipToNext(callback: VoidResultsCallback): scala.Unit = js.native
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
  def skipToNext(options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject): stdLib.Promise[scala.Unit] = js.native
  def skipToNext(
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject,
    callback: VoidResultsCallback
  ): scala.Unit = js.native
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
  def skipToPrevious(): stdLib.Promise[scala.Unit] = js.native
  def skipToPrevious(callback: VoidResultsCallback): scala.Unit = js.native
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
  def skipToPrevious(options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject): stdLib.Promise[scala.Unit] = js.native
  def skipToPrevious(
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.DeviceSpecificParameterObject,
    callback: VoidResultsCallback
  ): scala.Unit = js.native
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
  def transferMyPlayback(deviceIds: js.Array[java.lang.String]): stdLib.Promise[scala.Unit] = js.native
  def transferMyPlayback(deviceIds: js.Array[java.lang.String], callback: VoidResultsCallback): scala.Unit = js.native
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
  def transferMyPlayback(
    deviceIds: js.Array[java.lang.String],
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.TransferPlaybackParameterObject
  ): stdLib.Promise[scala.Unit] = js.native
  def transferMyPlayback(
    deviceIds: js.Array[java.lang.String],
    options: spotifyDashWebDashApiDashJsLib.SpotifyApiNs.TransferPlaybackParameterObject,
    callback: VoidResultsCallback
  ): scala.Unit = js.native
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
  def unfollowArtists(artistIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UnfollowArtistsOrUsersResponse] = js.native
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
  def unfollowArtists(
    artistIds: js.Array[java.lang.String],
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UnfollowArtistsOrUsersResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UnfollowArtistsOrUsersResponse] = js.native
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
  def unfollowPlaylist(playlistId: java.lang.String): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UnfollowPlaylistReponse] = js.native
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
  def unfollowPlaylist(
    playlistId: java.lang.String,
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UnfollowPlaylistReponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UnfollowPlaylistReponse] = js.native
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
  def unfollowUsers(userIds: js.Array[java.lang.String]): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UnfollowArtistsOrUsersResponse] = js.native
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
  def unfollowUsers(
    userIds: js.Array[java.lang.String],
    callback: ResultsCallback[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UnfollowArtistsOrUsersResponse]
  ): stdLib.Promise[spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UnfollowArtistsOrUsersResponse] = js.native
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
  def uploadCustomPlaylistCoverImage(playlistId: java.lang.String, imageData: java.lang.String): stdLib.Promise[
    spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UploadCustomPlaylistCoverImageReponse
  ] = js.native
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
  def uploadCustomPlaylistCoverImage(
    playlistId: java.lang.String,
    imageData: java.lang.String,
    callback: ResultsCallback[
      spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UploadCustomPlaylistCoverImageReponse
    ]
  ): stdLib.Promise[
    spotifyDashWebDashApiDashJsLib.SpotifyApiNs.UploadCustomPlaylistCoverImageReponse
  ] = js.native
}

