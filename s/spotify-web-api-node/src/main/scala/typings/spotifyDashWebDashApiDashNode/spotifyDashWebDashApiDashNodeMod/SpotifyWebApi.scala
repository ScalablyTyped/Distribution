package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import typings.spotifyDashApi.SpotifyApiNs.AddTracksToPlaylistResponse
import typings.spotifyDashApi.SpotifyApiNs.AlbumTracksResponse
import typings.spotifyDashApi.SpotifyApiNs.ArtistsAlbumsResponse
import typings.spotifyDashApi.SpotifyApiNs.ArtistsRelatedArtistsResponse
import typings.spotifyDashApi.SpotifyApiNs.ArtistsTopTracksResponse
import typings.spotifyDashApi.SpotifyApiNs.AudioAnalysisResponse
import typings.spotifyDashApi.SpotifyApiNs.AudioFeaturesResponse
import typings.spotifyDashApi.SpotifyApiNs.CategoryPlaylistsReponse
import typings.spotifyDashApi.SpotifyApiNs.ChangePlaylistDetailsReponse
import typings.spotifyDashApi.SpotifyApiNs.CheckUserSavedAlbumsResponse
import typings.spotifyDashApi.SpotifyApiNs.CheckUsersSavedTracksResponse
import typings.spotifyDashApi.SpotifyApiNs.CreatePlaylistResponse
import typings.spotifyDashApi.SpotifyApiNs.CurrentPlaybackResponse
import typings.spotifyDashApi.SpotifyApiNs.CurrentUsersProfileResponse
import typings.spotifyDashApi.SpotifyApiNs.CurrentlyPlayingResponse
import typings.spotifyDashApi.SpotifyApiNs.FollowPlaylistReponse
import typings.spotifyDashApi.SpotifyApiNs.ListOfFeaturedPlaylistsResponse
import typings.spotifyDashApi.SpotifyApiNs.ListOfNewReleasesResponse
import typings.spotifyDashApi.SpotifyApiNs.ListOfUsersPlaylistsResponse
import typings.spotifyDashApi.SpotifyApiNs.MultipleAlbumsResponse
import typings.spotifyDashApi.SpotifyApiNs.MultipleArtistsResponse
import typings.spotifyDashApi.SpotifyApiNs.MultipleAudioFeaturesResponse
import typings.spotifyDashApi.SpotifyApiNs.MultipleCategoriesResponse
import typings.spotifyDashApi.SpotifyApiNs.MultipleTracksResponse
import typings.spotifyDashApi.SpotifyApiNs.PlaylistTrackResponse
import typings.spotifyDashApi.SpotifyApiNs.RecommendationsFromSeedsResponse
import typings.spotifyDashApi.SpotifyApiNs.RemoveAlbumsForUserResponse
import typings.spotifyDashApi.SpotifyApiNs.RemoveTracksFromPlaylistResponse
import typings.spotifyDashApi.SpotifyApiNs.RemoveUsersSavedTracksResponse
import typings.spotifyDashApi.SpotifyApiNs.ReorderPlaylistTracksResponse
import typings.spotifyDashApi.SpotifyApiNs.ReplacePlaylistTracksResponse
import typings.spotifyDashApi.SpotifyApiNs.SaveAlbumsForUserResponse
import typings.spotifyDashApi.SpotifyApiNs.SaveTracksForUserResponse
import typings.spotifyDashApi.SpotifyApiNs.SearchResponse
import typings.spotifyDashApi.SpotifyApiNs.SingleAlbumResponse
import typings.spotifyDashApi.SpotifyApiNs.SingleArtistResponse
import typings.spotifyDashApi.SpotifyApiNs.SingleCategoryResponse
import typings.spotifyDashApi.SpotifyApiNs.SinglePlaylistResponse
import typings.spotifyDashApi.SpotifyApiNs.SingleTrackResponse
import typings.spotifyDashApi.SpotifyApiNs.UnfollowPlaylistReponse
import typings.spotifyDashApi.SpotifyApiNs.UploadCustomPlaylistCoverImageReponse
import typings.spotifyDashApi.SpotifyApiNs.UserDevicesResponse
import typings.spotifyDashApi.SpotifyApiNs.UserFollowsUsersOrArtistsResponse
import typings.spotifyDashApi.SpotifyApiNs.UserProfileResponse
import typings.spotifyDashApi.SpotifyApiNs.UsersFollowPlaylistReponse
import typings.spotifyDashApi.SpotifyApiNs.UsersFollowedArtistsResponse
import typings.spotifyDashApi.SpotifyApiNs.UsersRecentlyPlayedTracksResponse
import typings.spotifyDashApi.SpotifyApiNs.UsersSavedAlbumsResponse
import typings.spotifyDashApi.SpotifyApiNs.UsersSavedTracksResponse
import typings.spotifyDashApi.SpotifyApiNs.UsersTopArtistsResponse
import typings.spotifyDashApi.SpotifyApiNs.UsersTopTracksResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotifyWebApi extends js.Object {
  def addToMySavedAlbums(albumIds: js.Array[String]): js.Promise[Response[SaveAlbumsForUserResponse]] = js.native
  def addToMySavedAlbums(albumIds: js.Array[String], callback: Callback[SaveAlbumsForUserResponse]): Unit = js.native
  def addToMySavedTracks(trackIds: js.Array[String]): js.Promise[Response[SaveTracksForUserResponse]] = js.native
  def addToMySavedTracks(trackIds: js.Array[String], callback: Callback[SaveTracksForUserResponse]): Unit = js.native
  def addTracksToPlaylist(playlistId: String, tracks: js.Array[String]): js.Promise[Response[AddTracksToPlaylistResponse]] = js.native
  def addTracksToPlaylist(playlistId: String, tracks: js.Array[String], options: PositionOptions): js.Promise[Response[AddTracksToPlaylistResponse]] = js.native
  def addTracksToPlaylist(
    playlistId: String,
    tracks: js.Array[String],
    options: PositionOptions,
    callback: Callback[AddTracksToPlaylistResponse]
  ): Unit = js.native
  def areFollowingPlaylist(userId: String, playlistId: String, followerIds: js.Array[String]): js.Promise[Response[UsersFollowPlaylistReponse]] = js.native
  def areFollowingPlaylist(
    userId: String,
    playlistId: String,
    followerIds: js.Array[String],
    callback: Callback[UsersFollowPlaylistReponse]
  ): Unit = js.native
  def authorizationCodeGrant(code: String): js.Promise[Response[AuthorizationCodeGrantResponse]] = js.native
  def authorizationCodeGrant(code: String, callback: Callback[AuthorizationCodeGrantResponse]): Unit = js.native
  def changePlaylistDetails(playlistId: String): js.Promise[Response[ChangePlaylistDetailsReponse]] = js.native
  def changePlaylistDetails(playlistId: String, options: ChangePlaylistOptions): js.Promise[Response[ChangePlaylistDetailsReponse]] = js.native
  def changePlaylistDetails(
    playlistId: String,
    options: ChangePlaylistOptions,
    callback: Callback[ChangePlaylistDetailsReponse]
  ): Unit = js.native
  def clientCredentialsGrant(): js.Promise[Response[ClientCredentialsGrantResponse]] = js.native
  def clientCredentialsGrant(options: js.Object): js.Promise[Response[ClientCredentialsGrantResponse]] = js.native
  def clientCredentialsGrant(options: js.Object, callback: Callback[ClientCredentialsGrantResponse]): Unit = js.native
  def containsMySavedAlbums(albumIds: js.Array[String]): js.Promise[Response[CheckUserSavedAlbumsResponse]] = js.native
  def containsMySavedAlbums(albumIds: js.Array[String], callback: Callback[CheckUserSavedAlbumsResponse]): Unit = js.native
  def containsMySavedTracks(trackIds: js.Array[String]): js.Promise[Response[CheckUsersSavedTracksResponse]] = js.native
  def containsMySavedTracks(trackIds: js.Array[String], callback: Callback[CheckUsersSavedTracksResponse]): Unit = js.native
  def createAuthorizeURL(scopes: js.Array[String], state: String): String = js.native
  def createAuthorizeURL(scopes: js.Array[String], state: String, showDialog: Boolean): String = js.native
  def createPlaylist(userId: String, playlistName: String): js.Promise[Response[CreatePlaylistResponse]] = js.native
  def createPlaylist(userId: String, playlistName: String, options: PlaylistDetailsOptions): js.Promise[Response[CreatePlaylistResponse]] = js.native
  def createPlaylist(
    userId: String,
    playlistName: String,
    options: PlaylistDetailsOptions,
    callback: Callback[CreatePlaylistResponse]
  ): Unit = js.native
  def followArtists(artistIds: js.Array[String]): js.Promise[Response[Unit]] = js.native
  def followArtists(artistIds: js.Array[String], callback: Callback[Unit]): Unit = js.native
  def followPlaylist(playlistId: String): js.Promise[Response[FollowPlaylistReponse]] = js.native
  def followPlaylist(playlistId: String, options: PublicOptions): js.Promise[Response[FollowPlaylistReponse]] = js.native
  def followPlaylist(playlistId: String, options: PublicOptions, callback: Callback[FollowPlaylistReponse]): Unit = js.native
  def followUsers(userIds: js.Array[String]): js.Promise[Response[Unit]] = js.native
  def followUsers(userIds: js.Array[String], callback: Callback[Unit]): Unit = js.native
  def getAccessToken(): js.UndefOr[String] = js.native
  def getAlbum(albumId: String): js.Promise[Response[SingleAlbumResponse]] = js.native
  def getAlbum(albumId: String, options: MarketOptions): js.Promise[Response[SingleAlbumResponse]] = js.native
  def getAlbum(albumId: String, options: MarketOptions, callback: Callback[SingleAlbumResponse]): Unit = js.native
  def getAlbumTracks(albumId: String): js.Promise[Response[AlbumTracksResponse]] = js.native
  def getAlbumTracks(albumId: String, options: PaginationMarketOptions): js.Promise[Response[AlbumTracksResponse]] = js.native
  def getAlbumTracks(albumId: String, options: PaginationMarketOptions, callback: Callback[AlbumTracksResponse]): Unit = js.native
  def getAlbums(albumIds: js.Array[String]): js.Promise[Response[MultipleAlbumsResponse]] = js.native
  def getAlbums(albumIds: js.Array[String], options: MarketOptions): js.Promise[Response[MultipleAlbumsResponse]] = js.native
  def getAlbums(albumIds: js.Array[String], options: MarketOptions, callback: Callback[MultipleAlbumsResponse]): Unit = js.native
  def getArtist(artistId: String): js.Promise[Response[SingleArtistResponse]] = js.native
  def getArtist(artistId: String, callback: Callback[SingleArtistResponse]): Unit = js.native
  def getArtistAlbums(artistId: String): js.Promise[Response[ArtistsAlbumsResponse]] = js.native
  def getArtistAlbums(artistId: String, options: GetArtistAlbumsOptions): js.Promise[Response[ArtistsAlbumsResponse]] = js.native
  def getArtistAlbums(artistId: String, options: GetArtistAlbumsOptions, callback: Callback[ArtistsAlbumsResponse]): Unit = js.native
  def getArtistRelatedArtists(artistId: String): js.Promise[Response[ArtistsRelatedArtistsResponse]] = js.native
  def getArtistRelatedArtists(artistId: String, callback: Callback[ArtistsRelatedArtistsResponse]): Unit = js.native
  def getArtistTopTracks(artistId: String, country: String): js.Promise[Response[ArtistsTopTracksResponse]] = js.native
  def getArtistTopTracks(artistId: String, country: String, callback: Callback[ArtistsTopTracksResponse]): Unit = js.native
  def getArtists(artistIds: js.Array[String]): js.Promise[Response[MultipleArtistsResponse]] = js.native
  def getArtists(artistIds: js.Array[String], callback: Callback[MultipleArtistsResponse]): Unit = js.native
  def getAudioAnalysisForTrack(trackId: String): js.Promise[Response[AudioAnalysisResponse]] = js.native
  def getAudioAnalysisForTrack(trackId: String, callback: Callback[AudioAnalysisResponse]): Unit = js.native
  def getAudioFeaturesForTrack(trackId: String): js.Promise[Response[AudioFeaturesResponse]] = js.native
  def getAudioFeaturesForTrack(trackId: String, callback: Callback[AudioFeaturesResponse]): Unit = js.native
  def getAudioFeaturesForTracks(trackIds: js.Array[String]): js.Promise[Response[MultipleAudioFeaturesResponse]] = js.native
  def getAudioFeaturesForTracks(trackIds: js.Array[String], callback: Callback[MultipleAudioFeaturesResponse]): Unit = js.native
  def getCategories(): js.Promise[Response[MultipleCategoriesResponse]] = js.native
  def getCategories(options: PaginationLocaleOptions): js.Promise[Response[MultipleCategoriesResponse]] = js.native
  def getCategories(options: PaginationLocaleOptions, callback: Callback[MultipleCategoriesResponse]): Unit = js.native
  def getCategory(categoryId: String): js.Promise[Response[SingleCategoryResponse]] = js.native
  def getCategory(categoryId: String, options: LocaleOptions): js.Promise[Response[SingleCategoryResponse]] = js.native
  def getCategory(categoryId: String, options: LocaleOptions, callback: Callback[SingleCategoryResponse]): Unit = js.native
  def getClientId(): js.UndefOr[String] = js.native
  def getClientSecret(): js.UndefOr[String] = js.native
  def getCredentials(): Credentials = js.native
  def getFeaturedPlaylists(): js.Promise[Response[ListOfFeaturedPlaylistsResponse]] = js.native
  def getFeaturedPlaylists(options: GetFeaturedPlaylistsOptions): js.Promise[Response[ListOfFeaturedPlaylistsResponse]] = js.native
  def getFeaturedPlaylists(options: GetFeaturedPlaylistsOptions, callback: Callback[ListOfFeaturedPlaylistsResponse]): Unit = js.native
  def getFollowedArtists(): js.Promise[Response[UsersFollowedArtistsResponse]] = js.native
  def getFollowedArtists(options: AfterOptions): js.Promise[Response[UsersFollowedArtistsResponse]] = js.native
  def getFollowedArtists(options: AfterOptions, callback: Callback[UsersFollowedArtistsResponse]): Unit = js.native
  def getMe(): js.Promise[Response[CurrentUsersProfileResponse]] = js.native
  def getMe(callback: Callback[CurrentUsersProfileResponse]): Unit = js.native
  def getMyCurrentPlaybackState(): js.Promise[Response[CurrentPlaybackResponse]] = js.native
  def getMyCurrentPlaybackState(options: MarketOptions): js.Promise[Response[CurrentPlaybackResponse]] = js.native
  def getMyCurrentPlaybackState(options: MarketOptions, callback: Callback[CurrentPlaybackResponse]): Unit = js.native
  def getMyCurrentPlayingTrack(): js.Promise[Response[CurrentlyPlayingResponse]] = js.native
  def getMyCurrentPlayingTrack(options: MarketOptions): js.Promise[Response[CurrentlyPlayingResponse]] = js.native
  def getMyCurrentPlayingTrack(options: MarketOptions, callback: Callback[CurrentlyPlayingResponse]): Unit = js.native
  def getMyDevices(): js.Promise[Response[UserDevicesResponse]] = js.native
  def getMyDevices(callback: Callback[UserDevicesResponse]): Unit = js.native
  def getMyRecentlyPlayedTracks(): js.Promise[Response[UsersRecentlyPlayedTracksResponse]] = js.native
  def getMyRecentlyPlayedTracks(options: AfterOptions): js.Promise[Response[UsersRecentlyPlayedTracksResponse]] = js.native
  def getMyRecentlyPlayedTracks(options: AfterOptions, callback: Callback[UsersRecentlyPlayedTracksResponse]): Unit = js.native
  def getMyRecentlyPlayedTracks(options: BeforeOptions): js.Promise[Response[UsersRecentlyPlayedTracksResponse]] = js.native
  def getMyRecentlyPlayedTracks(options: BeforeOptions, callback: Callback[UsersRecentlyPlayedTracksResponse]): Unit = js.native
  def getMySavedAlbums(): js.Promise[Response[UsersSavedAlbumsResponse]] = js.native
  def getMySavedAlbums(options: PaginationMarketOptions): js.Promise[Response[UsersSavedAlbumsResponse]] = js.native
  def getMySavedAlbums(options: PaginationMarketOptions, callback: Callback[UsersSavedAlbumsResponse]): Unit = js.native
  def getMySavedTracks(): js.Promise[Response[UsersSavedTracksResponse]] = js.native
  def getMySavedTracks(options: PaginationMarketOptions): js.Promise[Response[UsersSavedTracksResponse]] = js.native
  def getMySavedTracks(options: PaginationMarketOptions, callback: Callback[UsersSavedTracksResponse]): Unit = js.native
  def getMyTopArtists(): js.Promise[Response[UsersTopArtistsResponse]] = js.native
  def getMyTopArtists(options: GetTopOptions): js.Promise[Response[UsersTopArtistsResponse]] = js.native
  def getMyTopArtists(options: GetTopOptions, callback: Callback[UsersTopArtistsResponse]): Unit = js.native
  def getMyTopTracks(): js.Promise[Response[UsersTopTracksResponse]] = js.native
  def getMyTopTracks(options: GetTopOptions): js.Promise[Response[UsersTopTracksResponse]] = js.native
  def getMyTopTracks(options: GetTopOptions, callback: Callback[UsersTopTracksResponse]): Unit = js.native
  def getNewReleases(): js.Promise[Response[ListOfNewReleasesResponse]] = js.native
  def getNewReleases(options: PaginationCountryOptions): js.Promise[Response[ListOfNewReleasesResponse]] = js.native
  def getNewReleases(options: PaginationCountryOptions, callback: Callback[ListOfNewReleasesResponse]): Unit = js.native
  def getPlaylist(playlistId: String): js.Promise[Response[SinglePlaylistResponse]] = js.native
  def getPlaylist(playlistId: String, options: GetPlaylistOptions): js.Promise[Response[SinglePlaylistResponse]] = js.native
  def getPlaylist(playlistId: String, options: GetPlaylistOptions, callback: Callback[SinglePlaylistResponse]): Unit = js.native
  def getPlaylistTracks(playlistId: String): js.Promise[Response[PlaylistTrackResponse]] = js.native
  def getPlaylistTracks(playlistId: String, options: GetPlaylistTracksOptions): js.Promise[Response[PlaylistTrackResponse]] = js.native
  def getPlaylistTracks(playlistId: String, options: GetPlaylistTracksOptions, callback: Callback[PlaylistTrackResponse]): Unit = js.native
  def getPlaylistsForCategory(categoryId: String): js.Promise[Response[CategoryPlaylistsReponse]] = js.native
  def getPlaylistsForCategory(categoryId: String, options: PaginationCountryOptions): js.Promise[Response[CategoryPlaylistsReponse]] = js.native
  def getPlaylistsForCategory(
    categoryId: String,
    options: PaginationCountryOptions,
    callback: Callback[CategoryPlaylistsReponse]
  ): Unit = js.native
  def getRecommendations(): js.Promise[Response[RecommendationsFromSeedsResponse]] = js.native
  def getRecommendations(options: GetRecommendationsOptions): js.Promise[Response[RecommendationsFromSeedsResponse]] = js.native
  def getRecommendations(options: GetRecommendationsOptions, callback: Callback[RecommendationsFromSeedsResponse]): Unit = js.native
  def getRedirectURI(): js.UndefOr[String] = js.native
  def getRefreshToken(): js.UndefOr[String] = js.native
  def getTrack(trackId: String): js.Promise[Response[SingleTrackResponse]] = js.native
  def getTrack(trackId: String, options: MarketOptions): js.Promise[Response[SingleTrackResponse]] = js.native
  def getTrack(trackId: String, options: MarketOptions, callback: Callback[SingleTrackResponse]): Unit = js.native
  def getTracks(trackIds: js.Array[String]): js.Promise[Response[MultipleTracksResponse]] = js.native
  def getTracks(trackIds: js.Array[String], options: MarketOptions): js.Promise[Response[MultipleTracksResponse]] = js.native
  def getTracks(trackIds: js.Array[String], options: MarketOptions, callback: Callback[MultipleTracksResponse]): Unit = js.native
  def getUser(userId: String): js.Promise[Response[UserProfileResponse]] = js.native
  def getUser(userId: String, callback: Callback[UserProfileResponse]): Unit = js.native
  def getUserPlaylists(): js.Promise[Response[ListOfUsersPlaylistsResponse]] = js.native
  def getUserPlaylists(options: PaginationOptions): js.Promise[Response[ListOfUsersPlaylistsResponse]] = js.native
  def getUserPlaylists(options: PaginationOptions, callback: Callback[ListOfUsersPlaylistsResponse]): Unit = js.native
  def getUserPlaylists(userId: String): js.Promise[Response[ListOfUsersPlaylistsResponse]] = js.native
  def getUserPlaylists(userId: String, options: PaginationOptions): js.Promise[Response[ListOfUsersPlaylistsResponse]] = js.native
  def getUserPlaylists(userId: String, options: PaginationOptions, callback: Callback[ListOfUsersPlaylistsResponse]): Unit = js.native
  def isFollowingArtists(artistIds: js.Array[String]): js.Promise[Response[UserFollowsUsersOrArtistsResponse]] = js.native
  def isFollowingArtists(artistIds: js.Array[String], callback: Callback[UserFollowsUsersOrArtistsResponse]): Unit = js.native
  def isFollowingUsers(userIds: js.Array[String]): js.Promise[Response[UserFollowsUsersOrArtistsResponse]] = js.native
  def isFollowingUsers(userIds: js.Array[String], callback: Callback[UserFollowsUsersOrArtistsResponse]): Unit = js.native
  def pause(): js.Promise[Response[Unit]] = js.native
  def pause(options: DeviceOptions): js.Promise[Response[Unit]] = js.native
  def pause(options: DeviceOptions, callback: Callback[Unit]): Unit = js.native
  def play(): js.Promise[Response[Unit]] = js.native
  def play(options: PlayOptions): js.Promise[Response[Unit]] = js.native
  def play(options: PlayOptions, callback: Callback[Unit]): Unit = js.native
  def refreshAccessToken(): js.Promise[Response[RefreshAccessTokenResponse]] = js.native
  def refreshAccessToken(callback: Callback[RefreshAccessTokenResponse]): Unit = js.native
  def removeFromMySavedAlbums(albumIds: js.Array[String]): js.Promise[Response[RemoveAlbumsForUserResponse]] = js.native
  def removeFromMySavedAlbums(albumIds: js.Array[String], callback: Callback[RemoveAlbumsForUserResponse]): Unit = js.native
  def removeFromMySavedTracks(trackIds: js.Array[String]): js.Promise[Response[RemoveUsersSavedTracksResponse]] = js.native
  def removeFromMySavedTracks(trackIds: js.Array[String], callback: Callback[RemoveUsersSavedTracksResponse]): Unit = js.native
  def removeTracksFromPlaylist(playlistId: String, tracks: js.Array[Track]): js.Promise[Response[RemoveTracksFromPlaylistResponse]] = js.native
  def removeTracksFromPlaylist(playlistId: String, tracks: js.Array[Track], options: SnapshotOptions): js.Promise[Response[RemoveTracksFromPlaylistResponse]] = js.native
  def removeTracksFromPlaylist(
    playlistId: String,
    tracks: js.Array[Track],
    options: SnapshotOptions,
    callback: Callback[RemoveTracksFromPlaylistResponse]
  ): Unit = js.native
  def removeTracksFromPlaylistByPosition(playlistId: String, positions: js.Array[Double], snapshotId: String): js.Promise[Response[RemoveTracksFromPlaylistResponse]] = js.native
  def removeTracksFromPlaylistByPosition(
    playlistId: String,
    positions: js.Array[Double],
    snapshotId: String,
    callback: Callback[RemoveTracksFromPlaylistResponse]
  ): Unit = js.native
  def reorderTracksInPlaylist(playlistId: String, rangeStart: Double, insertBefore: Double): js.Promise[Response[ReorderPlaylistTracksResponse]] = js.native
  def reorderTracksInPlaylist(
    playlistId: String,
    rangeStart: Double,
    insertBefore: Double,
    options: ReorderPlaylistTracksOptions
  ): js.Promise[Response[ReorderPlaylistTracksResponse]] = js.native
  def reorderTracksInPlaylist(
    playlistId: String,
    rangeStart: Double,
    insertBefore: Double,
    options: ReorderPlaylistTracksOptions,
    callback: Callback[ReorderPlaylistTracksResponse]
  ): Unit = js.native
  def replaceTracksInPlaylist(playlistId: String, uris: js.Array[String]): js.Promise[Response[ReplacePlaylistTracksResponse]] = js.native
  def replaceTracksInPlaylist(playlistId: String, uris: js.Array[String], callback: Callback[ReplacePlaylistTracksResponse]): Unit = js.native
  def resetAccessToken(): Unit = js.native
  def resetClientId(): Unit = js.native
  def resetClientSecret(): Unit = js.native
  def resetCredentials(): Unit = js.native
  def resetRedirectURI(): Unit = js.native
  def resetRefreshToken(): Unit = js.native
  def search(query: String, types: js.Array[SearchType]): js.Promise[Response[SearchResponse]] = js.native
  def search(query: String, types: js.Array[SearchType], options: SearchOptions): js.Promise[Response[SearchResponse]] = js.native
  def search(
    query: String,
    types: js.Array[SearchType],
    options: SearchOptions,
    callback: Callback[SearchResponse]
  ): Unit = js.native
  def searchAlbums(query: String): js.Promise[Response[SearchResponse]] = js.native
  def searchAlbums(query: String, options: SearchOptions): js.Promise[Response[SearchResponse]] = js.native
  def searchAlbums(query: String, options: SearchOptions, callback: Callback[SearchResponse]): Unit = js.native
  def searchArtists(query: String): js.Promise[Response[SearchResponse]] = js.native
  def searchArtists(query: String, options: SearchOptions): js.Promise[Response[SearchResponse]] = js.native
  def searchArtists(query: String, options: SearchOptions, callback: Callback[SearchResponse]): Unit = js.native
  def searchPlaylists(query: String): js.Promise[Response[SearchResponse]] = js.native
  def searchPlaylists(query: String, options: SearchOptions): js.Promise[Response[SearchResponse]] = js.native
  def searchPlaylists(query: String, options: SearchOptions, callback: Callback[SearchResponse]): Unit = js.native
  def searchTracks(query: String): js.Promise[Response[SearchResponse]] = js.native
  def searchTracks(query: String, options: SearchOptions): js.Promise[Response[SearchResponse]] = js.native
  def searchTracks(query: String, options: SearchOptions, callback: Callback[SearchResponse]): Unit = js.native
  def seek(positionMs: Double): js.Promise[Response[Unit]] = js.native
  def seek(positionMs: Double, options: DeviceOptions): js.Promise[Response[Unit]] = js.native
  def seek(positionMs: Double, options: DeviceOptions, callback: Callback[Unit]): Unit = js.native
  def setAccessToken(accessToken: String): Unit = js.native
  def setClientId(clientId: String): Unit = js.native
  def setClientSecret(clientSecret: String): Unit = js.native
  def setCredentials(credentials: Credentials): Unit = js.native
  def setRedirectURI(redirectUri: String): Unit = js.native
  def setRefreshToken(refreshToken: String): Unit = js.native
  def setRepeat(): js.Promise[Response[Unit]] = js.native
  def setRepeat(options: RepeatOptions): js.Promise[Response[Unit]] = js.native
  def setRepeat(options: RepeatOptions, callback: Callback[Unit]): Unit = js.native
  def setShuffle(): js.Promise[Response[Unit]] = js.native
  def setShuffle(options: ShuffleOptions): js.Promise[Response[Unit]] = js.native
  def setShuffle(options: ShuffleOptions, callback: Callback[Unit]): Unit = js.native
  def setVolume(volumePercent: Double): js.Promise[Response[Unit]] = js.native
  def setVolume(volumePercent: Double, options: DeviceOptions): js.Promise[Response[Unit]] = js.native
  def setVolume(volumePercent: Double, options: DeviceOptions, callback: Callback[Unit]): Unit = js.native
  def skipToNext(): js.Promise[Response[Unit]] = js.native
  def skipToNext(callback: Callback[Unit]): Unit = js.native
  def skipToPrevious(): js.Promise[Response[Unit]] = js.native
  def skipToPrevious(callback: Callback[Unit]): Unit = js.native
  def transferMyPlayback(): js.Promise[Response[Unit]] = js.native
  def transferMyPlayback(options: TransferPlaybackOptions): js.Promise[Response[Unit]] = js.native
  def transferMyPlayback(options: TransferPlaybackOptions, callback: Callback[Unit]): Unit = js.native
  def unfollowArtists(artistIds: js.Array[String]): js.Promise[Response[Unit]] = js.native
  def unfollowArtists(artistIds: js.Array[String], callback: Callback[Unit]): Unit = js.native
  def unfollowPlaylist(playlistId: String): js.Promise[Response[UnfollowPlaylistReponse]] = js.native
  def unfollowPlaylist(playlistId: String, callback: Callback[UnfollowPlaylistReponse]): Unit = js.native
  def unfollowUsers(userIds: js.Array[String]): js.Promise[Response[Unit]] = js.native
  def unfollowUsers(userIds: js.Array[String], callback: Callback[Unit]): Unit = js.native
  def uploadCustomPlaylistCoverImage(playlistId: String, base64URI: String): js.Promise[Response[UploadCustomPlaylistCoverImageReponse]] = js.native
  def uploadCustomPlaylistCoverImage(playlistId: String, base64URI: String, callback: Callback[UploadCustomPlaylistCoverImageReponse]): Unit = js.native
}

