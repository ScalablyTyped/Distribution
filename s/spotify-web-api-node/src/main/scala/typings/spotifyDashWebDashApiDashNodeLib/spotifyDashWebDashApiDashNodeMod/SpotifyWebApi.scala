package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotifyWebApi extends js.Object {
  def addToMySavedAlbums(albumIds: js.Array[java.lang.String]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SaveAlbumsForUserResponse]] = js.native
  def addToMySavedAlbums(
    albumIds: js.Array[java.lang.String],
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.SaveAlbumsForUserResponse]
  ): scala.Unit = js.native
  def addToMySavedTracks(trackIds: js.Array[java.lang.String]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SaveTracksForUserResponse]] = js.native
  def addToMySavedTracks(
    trackIds: js.Array[java.lang.String],
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.SaveTracksForUserResponse]
  ): scala.Unit = js.native
  def addTracksToPlaylist(playlistId: java.lang.String, tracks: js.Array[java.lang.String]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.AddTracksToPlaylistResponse]] = js.native
  def addTracksToPlaylist(playlistId: java.lang.String, tracks: js.Array[java.lang.String], options: PositionOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.AddTracksToPlaylistResponse]] = js.native
  def addTracksToPlaylist(
    playlistId: java.lang.String,
    tracks: js.Array[java.lang.String],
    options: PositionOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.AddTracksToPlaylistResponse]
  ): scala.Unit = js.native
  def areFollowingPlaylist(userId: java.lang.String, playlistId: java.lang.String, followerIds: js.Array[java.lang.String]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UsersFollowPlaylistReponse]] = js.native
  def areFollowingPlaylist(
    userId: java.lang.String,
    playlistId: java.lang.String,
    followerIds: js.Array[java.lang.String],
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.UsersFollowPlaylistReponse]
  ): scala.Unit = js.native
  def authorizationCodeGrant(code: java.lang.String): js.Promise[Response[AuthorizationCodeGrantResponse]] = js.native
  def authorizationCodeGrant(code: java.lang.String, callback: Callback[AuthorizationCodeGrantResponse]): scala.Unit = js.native
  def changePlaylistDetails(playlistId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ChangePlaylistDetailsReponse]] = js.native
  def changePlaylistDetails(playlistId: java.lang.String, options: ChangePlaylistOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ChangePlaylistDetailsReponse]] = js.native
  def changePlaylistDetails(
    playlistId: java.lang.String,
    options: ChangePlaylistOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.ChangePlaylistDetailsReponse]
  ): scala.Unit = js.native
  def clientCredentialsGrant(): js.Promise[Response[ClientCredentialsGrantResponse]] = js.native
  def clientCredentialsGrant(options: js.Object): js.Promise[Response[ClientCredentialsGrantResponse]] = js.native
  def clientCredentialsGrant(options: js.Object, callback: Callback[ClientCredentialsGrantResponse]): scala.Unit = js.native
  def containsMySavedAlbums(albumIds: js.Array[java.lang.String]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.CheckUserSavedAlbumsResponse]] = js.native
  def containsMySavedAlbums(
    albumIds: js.Array[java.lang.String],
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.CheckUserSavedAlbumsResponse]
  ): scala.Unit = js.native
  def containsMySavedTracks(trackIds: js.Array[java.lang.String]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.CheckUsersSavedTracksResponse]] = js.native
  def containsMySavedTracks(
    trackIds: js.Array[java.lang.String],
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.CheckUsersSavedTracksResponse]
  ): scala.Unit = js.native
  def createAuthorizeURL(scopes: js.Array[java.lang.String], state: java.lang.String): java.lang.String = js.native
  def createAuthorizeURL(scopes: js.Array[java.lang.String], state: java.lang.String, showDialog: scala.Boolean): java.lang.String = js.native
  def createPlaylist(userId: java.lang.String, playlistName: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.CreatePlaylistResponse]] = js.native
  def createPlaylist(userId: java.lang.String, playlistName: java.lang.String, options: PlaylistDetailsOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.CreatePlaylistResponse]] = js.native
  def createPlaylist(
    userId: java.lang.String,
    playlistName: java.lang.String,
    options: PlaylistDetailsOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.CreatePlaylistResponse]
  ): scala.Unit = js.native
  def followArtists(artistIds: js.Array[java.lang.String]): js.Promise[Response[scala.Unit]] = js.native
  def followArtists(artistIds: js.Array[java.lang.String], callback: Callback[scala.Unit]): scala.Unit = js.native
  def followPlaylist(playlistId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.FollowPlaylistReponse]] = js.native
  def followPlaylist(playlistId: java.lang.String, options: PublicOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.FollowPlaylistReponse]] = js.native
  def followPlaylist(
    playlistId: java.lang.String,
    options: PublicOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.FollowPlaylistReponse]
  ): scala.Unit = js.native
  def followUsers(userIds: js.Array[java.lang.String]): js.Promise[Response[scala.Unit]] = js.native
  def followUsers(userIds: js.Array[java.lang.String], callback: Callback[scala.Unit]): scala.Unit = js.native
  def getAccessToken(): js.UndefOr[java.lang.String] = js.native
  def getAlbum(albumId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SingleAlbumResponse]] = js.native
  def getAlbum(albumId: java.lang.String, options: MarketOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SingleAlbumResponse]] = js.native
  def getAlbum(
    albumId: java.lang.String,
    options: MarketOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.SingleAlbumResponse]
  ): scala.Unit = js.native
  def getAlbumTracks(albumId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.AlbumTracksResponse]] = js.native
  def getAlbumTracks(albumId: java.lang.String, options: PaginationMarketOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.AlbumTracksResponse]] = js.native
  def getAlbumTracks(
    albumId: java.lang.String,
    options: PaginationMarketOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.AlbumTracksResponse]
  ): scala.Unit = js.native
  def getAlbums(albumIds: js.Array[java.lang.String]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.MultipleAlbumsResponse]] = js.native
  def getAlbums(albumIds: js.Array[java.lang.String], options: MarketOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.MultipleAlbumsResponse]] = js.native
  def getAlbums(
    albumIds: js.Array[java.lang.String],
    options: MarketOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.MultipleAlbumsResponse]
  ): scala.Unit = js.native
  def getArtist(artistId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SingleArtistResponse]] = js.native
  def getArtist(
    artistId: java.lang.String,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.SingleArtistResponse]
  ): scala.Unit = js.native
  def getArtistAlbums(artistId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ArtistsAlbumsResponse]] = js.native
  def getArtistAlbums(artistId: java.lang.String, options: GetArtistAlbumsOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ArtistsAlbumsResponse]] = js.native
  def getArtistAlbums(
    artistId: java.lang.String,
    options: GetArtistAlbumsOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.ArtistsAlbumsResponse]
  ): scala.Unit = js.native
  def getArtistRelatedArtists(artistId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ArtistsRelatedArtistsResponse]] = js.native
  def getArtistRelatedArtists(
    artistId: java.lang.String,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.ArtistsRelatedArtistsResponse]
  ): scala.Unit = js.native
  def getArtistTopTracks(artistId: java.lang.String, country: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ArtistsTopTracksResponse]] = js.native
  def getArtistTopTracks(
    artistId: java.lang.String,
    country: java.lang.String,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.ArtistsTopTracksResponse]
  ): scala.Unit = js.native
  def getArtists(artistIds: js.Array[java.lang.String]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.MultipleArtistsResponse]] = js.native
  def getArtists(
    artistIds: js.Array[java.lang.String],
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.MultipleArtistsResponse]
  ): scala.Unit = js.native
  def getAudioAnalysisForTrack(trackId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.AudioAnalysisResponse]] = js.native
  def getAudioAnalysisForTrack(
    trackId: java.lang.String,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.AudioAnalysisResponse]
  ): scala.Unit = js.native
  def getAudioFeaturesForTrack(trackId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.AudioFeaturesResponse]] = js.native
  def getAudioFeaturesForTrack(
    trackId: java.lang.String,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.AudioFeaturesResponse]
  ): scala.Unit = js.native
  def getAudioFeaturesForTracks(trackIds: js.Array[java.lang.String]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.MultipleAudioFeaturesResponse]] = js.native
  def getAudioFeaturesForTracks(
    trackIds: js.Array[java.lang.String],
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.MultipleAudioFeaturesResponse]
  ): scala.Unit = js.native
  def getCategories(): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.MultipleCategoriesResponse]] = js.native
  def getCategories(options: PaginationLocaleOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.MultipleCategoriesResponse]] = js.native
  def getCategories(
    options: PaginationLocaleOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.MultipleCategoriesResponse]
  ): scala.Unit = js.native
  def getCategory(categoryId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SingleCategoryResponse]] = js.native
  def getCategory(categoryId: java.lang.String, options: LocaleOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SingleCategoryResponse]] = js.native
  def getCategory(
    categoryId: java.lang.String,
    options: LocaleOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.SingleCategoryResponse]
  ): scala.Unit = js.native
  def getClientId(): js.UndefOr[java.lang.String] = js.native
  def getClientSecret(): js.UndefOr[java.lang.String] = js.native
  def getCredentials(): Credentials = js.native
  def getFeaturedPlaylists(): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ListOfFeaturedPlaylistsResponse]] = js.native
  def getFeaturedPlaylists(options: GetFeaturedPlaylistsOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ListOfFeaturedPlaylistsResponse]] = js.native
  def getFeaturedPlaylists(
    options: GetFeaturedPlaylistsOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.ListOfFeaturedPlaylistsResponse]
  ): scala.Unit = js.native
  def getFollowedArtists(): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UsersFollowedArtistsResponse]] = js.native
  def getFollowedArtists(options: AfterOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UsersFollowedArtistsResponse]] = js.native
  def getFollowedArtists(
    options: AfterOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.UsersFollowedArtistsResponse]
  ): scala.Unit = js.native
  def getMe(): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.CurrentUsersProfileResponse]] = js.native
  def getMe(callback: Callback[spotifyDashApiLib.SpotifyApiNs.CurrentUsersProfileResponse]): scala.Unit = js.native
  def getMyCurrentPlaybackState(): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.CurrentPlaybackResponse]] = js.native
  def getMyCurrentPlaybackState(options: MarketOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.CurrentPlaybackResponse]] = js.native
  def getMyCurrentPlaybackState(options: MarketOptions, callback: Callback[spotifyDashApiLib.SpotifyApiNs.CurrentPlaybackResponse]): scala.Unit = js.native
  def getMyCurrentPlayingTrack(): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.CurrentlyPlayingResponse]] = js.native
  def getMyCurrentPlayingTrack(options: MarketOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.CurrentlyPlayingResponse]] = js.native
  def getMyCurrentPlayingTrack(
    options: MarketOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.CurrentlyPlayingResponse]
  ): scala.Unit = js.native
  def getMyDevices(): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UserDevicesResponse]] = js.native
  def getMyDevices(callback: Callback[spotifyDashApiLib.SpotifyApiNs.UserDevicesResponse]): scala.Unit = js.native
  def getMyRecentlyPlayedTracks(): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UsersRecentlyPlayedTracksResponse]] = js.native
  def getMyRecentlyPlayedTracks(options: AfterOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UsersRecentlyPlayedTracksResponse]] = js.native
  def getMyRecentlyPlayedTracks(
    options: AfterOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.UsersRecentlyPlayedTracksResponse]
  ): scala.Unit = js.native
  def getMyRecentlyPlayedTracks(options: BeforeOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UsersRecentlyPlayedTracksResponse]] = js.native
  def getMyRecentlyPlayedTracks(
    options: BeforeOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.UsersRecentlyPlayedTracksResponse]
  ): scala.Unit = js.native
  def getMySavedAlbums(): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UsersSavedAlbumsResponse]] = js.native
  def getMySavedAlbums(options: PaginationMarketOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UsersSavedAlbumsResponse]] = js.native
  def getMySavedAlbums(
    options: PaginationMarketOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.UsersSavedAlbumsResponse]
  ): scala.Unit = js.native
  def getMySavedTracks(): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UsersSavedTracksResponse]] = js.native
  def getMySavedTracks(options: PaginationMarketOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UsersSavedTracksResponse]] = js.native
  def getMySavedTracks(
    options: PaginationMarketOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.UsersSavedTracksResponse]
  ): scala.Unit = js.native
  def getMyTopArtists(): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UsersTopArtistsResponse]] = js.native
  def getMyTopArtists(options: GetTopOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UsersTopArtistsResponse]] = js.native
  def getMyTopArtists(options: GetTopOptions, callback: Callback[spotifyDashApiLib.SpotifyApiNs.UsersTopArtistsResponse]): scala.Unit = js.native
  def getMyTopTracks(): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UsersTopTracksResponse]] = js.native
  def getMyTopTracks(options: GetTopOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UsersTopTracksResponse]] = js.native
  def getMyTopTracks(options: GetTopOptions, callback: Callback[spotifyDashApiLib.SpotifyApiNs.UsersTopTracksResponse]): scala.Unit = js.native
  def getNewReleases(): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ListOfNewReleasesResponse]] = js.native
  def getNewReleases(options: PaginationCountryOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ListOfNewReleasesResponse]] = js.native
  def getNewReleases(
    options: PaginationCountryOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.ListOfNewReleasesResponse]
  ): scala.Unit = js.native
  def getPlaylist(playlistId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SinglePlaylistResponse]] = js.native
  def getPlaylist(playlistId: java.lang.String, options: GetPlaylistOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SinglePlaylistResponse]] = js.native
  def getPlaylist(
    playlistId: java.lang.String,
    options: GetPlaylistOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.SinglePlaylistResponse]
  ): scala.Unit = js.native
  def getPlaylistTracks(playlistId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.PlaylistTrackResponse]] = js.native
  def getPlaylistTracks(playlistId: java.lang.String, options: GetPlaylistTracksOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.PlaylistTrackResponse]] = js.native
  def getPlaylistTracks(
    playlistId: java.lang.String,
    options: GetPlaylistTracksOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.PlaylistTrackResponse]
  ): scala.Unit = js.native
  def getPlaylistsForCategory(categoryId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.CategoryPlaylistsReponse]] = js.native
  def getPlaylistsForCategory(categoryId: java.lang.String, options: PaginationCountryOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.CategoryPlaylistsReponse]] = js.native
  def getPlaylistsForCategory(
    categoryId: java.lang.String,
    options: PaginationCountryOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.CategoryPlaylistsReponse]
  ): scala.Unit = js.native
  def getRecommendations(): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.RecommendationsFromSeedsResponse]] = js.native
  def getRecommendations(options: GetRecommendationsOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.RecommendationsFromSeedsResponse]] = js.native
  def getRecommendations(
    options: GetRecommendationsOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.RecommendationsFromSeedsResponse]
  ): scala.Unit = js.native
  def getRedirectURI(): js.UndefOr[java.lang.String] = js.native
  def getRefreshToken(): js.UndefOr[java.lang.String] = js.native
  def getTrack(trackId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SingleTrackResponse]] = js.native
  def getTrack(trackId: java.lang.String, options: MarketOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SingleTrackResponse]] = js.native
  def getTrack(
    trackId: java.lang.String,
    options: MarketOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.SingleTrackResponse]
  ): scala.Unit = js.native
  def getTracks(trackIds: js.Array[java.lang.String]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.MultipleTracksResponse]] = js.native
  def getTracks(trackIds: js.Array[java.lang.String], options: MarketOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.MultipleTracksResponse]] = js.native
  def getTracks(
    trackIds: js.Array[java.lang.String],
    options: MarketOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.MultipleTracksResponse]
  ): scala.Unit = js.native
  def getUser(userId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UserProfileResponse]] = js.native
  def getUser(userId: java.lang.String, callback: Callback[spotifyDashApiLib.SpotifyApiNs.UserProfileResponse]): scala.Unit = js.native
  def getUserPlaylists(): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ListOfUsersPlaylistsResponse]] = js.native
  def getUserPlaylists(options: PaginationOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ListOfUsersPlaylistsResponse]] = js.native
  def getUserPlaylists(
    options: PaginationOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.ListOfUsersPlaylistsResponse]
  ): scala.Unit = js.native
  def getUserPlaylists(userId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ListOfUsersPlaylistsResponse]] = js.native
  def getUserPlaylists(userId: java.lang.String, options: PaginationOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ListOfUsersPlaylistsResponse]] = js.native
  def getUserPlaylists(
    userId: java.lang.String,
    options: PaginationOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.ListOfUsersPlaylistsResponse]
  ): scala.Unit = js.native
  def isFollowingArtists(artistIds: js.Array[java.lang.String]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UserFollowsUsersOrArtistsResponse]] = js.native
  def isFollowingArtists(
    artistIds: js.Array[java.lang.String],
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.UserFollowsUsersOrArtistsResponse]
  ): scala.Unit = js.native
  def isFollowingUsers(userIds: js.Array[java.lang.String]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UserFollowsUsersOrArtistsResponse]] = js.native
  def isFollowingUsers(
    userIds: js.Array[java.lang.String],
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.UserFollowsUsersOrArtistsResponse]
  ): scala.Unit = js.native
  def pause(): js.Promise[Response[scala.Unit]] = js.native
  def pause(options: DeviceOptions): js.Promise[Response[scala.Unit]] = js.native
  def pause(options: DeviceOptions, callback: Callback[scala.Unit]): scala.Unit = js.native
  def play(): js.Promise[Response[scala.Unit]] = js.native
  def play(options: PlayOptions): js.Promise[Response[scala.Unit]] = js.native
  def play(options: PlayOptions, callback: Callback[scala.Unit]): scala.Unit = js.native
  def refreshAccessToken(): js.Promise[Response[RefreshAccessTokenResponse]] = js.native
  def refreshAccessToken(callback: Callback[RefreshAccessTokenResponse]): scala.Unit = js.native
  def removeFromMySavedAlbums(albumIds: js.Array[java.lang.String]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.RemoveAlbumsForUserResponse]] = js.native
  def removeFromMySavedAlbums(
    albumIds: js.Array[java.lang.String],
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.RemoveAlbumsForUserResponse]
  ): scala.Unit = js.native
  def removeFromMySavedTracks(trackIds: js.Array[java.lang.String]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.RemoveUsersSavedTracksResponse]] = js.native
  def removeFromMySavedTracks(
    trackIds: js.Array[java.lang.String],
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.RemoveUsersSavedTracksResponse]
  ): scala.Unit = js.native
  def removeTracksFromPlaylist(playlistId: java.lang.String, tracks: js.Array[Track]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.RemoveTracksFromPlaylistResponse]] = js.native
  def removeTracksFromPlaylist(playlistId: java.lang.String, tracks: js.Array[Track], options: SnapshotOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.RemoveTracksFromPlaylistResponse]] = js.native
  def removeTracksFromPlaylist(
    playlistId: java.lang.String,
    tracks: js.Array[Track],
    options: SnapshotOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.RemoveTracksFromPlaylistResponse]
  ): scala.Unit = js.native
  def removeTracksFromPlaylistByPosition(playlistId: java.lang.String, positions: js.Array[scala.Double], snapshotId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.RemoveTracksFromPlaylistResponse]] = js.native
  def removeTracksFromPlaylistByPosition(
    playlistId: java.lang.String,
    positions: js.Array[scala.Double],
    snapshotId: java.lang.String,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.RemoveTracksFromPlaylistResponse]
  ): scala.Unit = js.native
  def reorderTracksInPlaylist(playlistId: java.lang.String, rangeStart: scala.Double, insertBefore: scala.Double): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ReorderPlaylistTracksResponse]] = js.native
  def reorderTracksInPlaylist(
    playlistId: java.lang.String,
    rangeStart: scala.Double,
    insertBefore: scala.Double,
    options: ReorderPlaylistTracksOptions
  ): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ReorderPlaylistTracksResponse]] = js.native
  def reorderTracksInPlaylist(
    playlistId: java.lang.String,
    rangeStart: scala.Double,
    insertBefore: scala.Double,
    options: ReorderPlaylistTracksOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.ReorderPlaylistTracksResponse]
  ): scala.Unit = js.native
  def replaceTracksInPlaylist(playlistId: java.lang.String, uris: js.Array[java.lang.String]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.ReplacePlaylistTracksResponse]] = js.native
  def replaceTracksInPlaylist(
    playlistId: java.lang.String,
    uris: js.Array[java.lang.String],
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.ReplacePlaylistTracksResponse]
  ): scala.Unit = js.native
  def resetAccessToken(): scala.Unit = js.native
  def resetClientId(): scala.Unit = js.native
  def resetClientSecret(): scala.Unit = js.native
  def resetCredentials(): scala.Unit = js.native
  def resetRedirectURI(): scala.Unit = js.native
  def resetRefreshToken(): scala.Unit = js.native
  def search(query: java.lang.String, types: js.Array[SearchType]): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SearchResponse]] = js.native
  def search(query: java.lang.String, types: js.Array[SearchType], options: SearchOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SearchResponse]] = js.native
  def search(
    query: java.lang.String,
    types: js.Array[SearchType],
    options: SearchOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.SearchResponse]
  ): scala.Unit = js.native
  def searchAlbums(query: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SearchResponse]] = js.native
  def searchAlbums(query: java.lang.String, options: SearchOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SearchResponse]] = js.native
  def searchAlbums(
    query: java.lang.String,
    options: SearchOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.SearchResponse]
  ): scala.Unit = js.native
  def searchArtists(query: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SearchResponse]] = js.native
  def searchArtists(query: java.lang.String, options: SearchOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SearchResponse]] = js.native
  def searchArtists(
    query: java.lang.String,
    options: SearchOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.SearchResponse]
  ): scala.Unit = js.native
  def searchPlaylists(query: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SearchResponse]] = js.native
  def searchPlaylists(query: java.lang.String, options: SearchOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SearchResponse]] = js.native
  def searchPlaylists(
    query: java.lang.String,
    options: SearchOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.SearchResponse]
  ): scala.Unit = js.native
  def searchTracks(query: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SearchResponse]] = js.native
  def searchTracks(query: java.lang.String, options: SearchOptions): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.SearchResponse]] = js.native
  def searchTracks(
    query: java.lang.String,
    options: SearchOptions,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.SearchResponse]
  ): scala.Unit = js.native
  def seek(positionMs: scala.Double): js.Promise[Response[scala.Unit]] = js.native
  def seek(positionMs: scala.Double, options: DeviceOptions): js.Promise[Response[scala.Unit]] = js.native
  def seek(positionMs: scala.Double, options: DeviceOptions, callback: Callback[scala.Unit]): scala.Unit = js.native
  def setAccessToken(accessToken: java.lang.String): scala.Unit = js.native
  def setClientId(clientId: java.lang.String): scala.Unit = js.native
  def setClientSecret(clientSecret: java.lang.String): scala.Unit = js.native
  def setCredentials(credentials: Credentials): scala.Unit = js.native
  def setRedirectURI(redirectUri: java.lang.String): scala.Unit = js.native
  def setRefreshToken(refreshToken: java.lang.String): scala.Unit = js.native
  def setRepeat(): js.Promise[Response[scala.Unit]] = js.native
  def setRepeat(options: RepeatOptions): js.Promise[Response[scala.Unit]] = js.native
  def setRepeat(options: RepeatOptions, callback: Callback[scala.Unit]): scala.Unit = js.native
  def setShuffle(): js.Promise[Response[scala.Unit]] = js.native
  def setShuffle(options: ShuffleOptions): js.Promise[Response[scala.Unit]] = js.native
  def setShuffle(options: ShuffleOptions, callback: Callback[scala.Unit]): scala.Unit = js.native
  def setVolume(volumePercent: scala.Double): js.Promise[Response[scala.Unit]] = js.native
  def setVolume(volumePercent: scala.Double, options: DeviceOptions): js.Promise[Response[scala.Unit]] = js.native
  def setVolume(volumePercent: scala.Double, options: DeviceOptions, callback: Callback[scala.Unit]): scala.Unit = js.native
  def skipToNext(): js.Promise[Response[scala.Unit]] = js.native
  def skipToNext(callback: Callback[scala.Unit]): scala.Unit = js.native
  def skipToPrevious(): js.Promise[Response[scala.Unit]] = js.native
  def skipToPrevious(callback: Callback[scala.Unit]): scala.Unit = js.native
  def transferMyPlayback(): js.Promise[Response[scala.Unit]] = js.native
  def transferMyPlayback(options: TransferPlaybackOptions): js.Promise[Response[scala.Unit]] = js.native
  def transferMyPlayback(options: TransferPlaybackOptions, callback: Callback[scala.Unit]): scala.Unit = js.native
  def unfollowArtists(artistIds: js.Array[java.lang.String]): js.Promise[Response[scala.Unit]] = js.native
  def unfollowArtists(artistIds: js.Array[java.lang.String], callback: Callback[scala.Unit]): scala.Unit = js.native
  def unfollowPlaylist(playlistId: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UnfollowPlaylistReponse]] = js.native
  def unfollowPlaylist(
    playlistId: java.lang.String,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.UnfollowPlaylistReponse]
  ): scala.Unit = js.native
  def unfollowUsers(userIds: js.Array[java.lang.String]): js.Promise[Response[scala.Unit]] = js.native
  def unfollowUsers(userIds: js.Array[java.lang.String], callback: Callback[scala.Unit]): scala.Unit = js.native
  def uploadCustomPlaylistCoverImage(playlistId: java.lang.String, base64URI: java.lang.String): js.Promise[Response[spotifyDashApiLib.SpotifyApiNs.UploadCustomPlaylistCoverImageReponse]] = js.native
  def uploadCustomPlaylistCoverImage(
    playlistId: java.lang.String,
    base64URI: java.lang.String,
    callback: Callback[spotifyDashApiLib.SpotifyApiNs.UploadCustomPlaylistCoverImageReponse]
  ): scala.Unit = js.native
}

