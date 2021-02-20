package typings.spotifyNodeApplescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spotify-node-applescript", "getState")
  @js.native
  def getState(callback: StateCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "getTrack")
  @js.native
  def getTrack(callback: GetTrackCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "isRepeating")
  @js.native
  def isRepeating(callback: IsRepeatingCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "isRunning")
  @js.native
  def isRunning(): Unit = js.native
  @JSImport("spotify-node-applescript", "isRunning")
  @js.native
  def isRunning(callback: IsRunningCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "isShuffling")
  @js.native
  def isShuffling(callback: IsShufflingCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "jumpTo")
  @js.native
  def jumpTo(second: Double): Unit = js.native
  @JSImport("spotify-node-applescript", "jumpTo")
  @js.native
  def jumpTo(second: Double, callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "muteVolume")
  @js.native
  def muteVolume(): Unit = js.native
  @JSImport("spotify-node-applescript", "muteVolume")
  @js.native
  def muteVolume(callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "next")
  @js.native
  def next(): Unit = js.native
  @JSImport("spotify-node-applescript", "next")
  @js.native
  def next(callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "pause")
  @js.native
  def pause(): Unit = js.native
  @JSImport("spotify-node-applescript", "pause")
  @js.native
  def pause(callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "play")
  @js.native
  def play(): Unit = js.native
  @JSImport("spotify-node-applescript", "play")
  @js.native
  def play(callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "playPause")
  @js.native
  def playPause(): Unit = js.native
  @JSImport("spotify-node-applescript", "playPause")
  @js.native
  def playPause(callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "playTrack")
  @js.native
  def playTrack(uri: String): Unit = js.native
  @JSImport("spotify-node-applescript", "playTrack")
  @js.native
  def playTrack(uri: String, callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "playTrackInContext")
  @js.native
  def playTrackInContext(uri: String, contextUri: String): Unit = js.native
  @JSImport("spotify-node-applescript", "playTrackInContext")
  @js.native
  def playTrackInContext(uri: String, contextUri: String, callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "previous")
  @js.native
  def previous(): Unit = js.native
  @JSImport("spotify-node-applescript", "previous")
  @js.native
  def previous(callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "setRepeating")
  @js.native
  def setRepeating(repeating: Boolean): Unit = js.native
  @JSImport("spotify-node-applescript", "setRepeating")
  @js.native
  def setRepeating(repeating: Boolean, callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "setShuffling")
  @js.native
  def setShuffling(shuffling: Boolean): Unit = js.native
  @JSImport("spotify-node-applescript", "setShuffling")
  @js.native
  def setShuffling(shuffling: Boolean, callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "setVolume")
  @js.native
  def setVolume(volume: Double): Unit = js.native
  @JSImport("spotify-node-applescript", "setVolume")
  @js.native
  def setVolume(volume: Double, callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "toggleRepeating")
  @js.native
  def toggleRepeating(): Unit = js.native
  @JSImport("spotify-node-applescript", "toggleRepeating")
  @js.native
  def toggleRepeating(callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "toggleShuffling")
  @js.native
  def toggleShuffling(): Unit = js.native
  @JSImport("spotify-node-applescript", "toggleShuffling")
  @js.native
  def toggleShuffling(callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "unmuteVolume")
  @js.native
  def unmuteVolume(): Unit = js.native
  @JSImport("spotify-node-applescript", "unmuteVolume")
  @js.native
  def unmuteVolume(callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "volumeDown")
  @js.native
  def volumeDown(): Unit = js.native
  @JSImport("spotify-node-applescript", "volumeDown")
  @js.native
  def volumeDown(callback: SuccessCallbackFn): Unit = js.native
  
  @JSImport("spotify-node-applescript", "volumeUp")
  @js.native
  def volumeUp(): Unit = js.native
  @JSImport("spotify-node-applescript", "volumeUp")
  @js.native
  def volumeUp(callback: SuccessCallbackFn): Unit = js.native
  
  type GetTrackCallbackFn = js.Function2[/* error */ String, /* track */ TrackInfo, Unit]
  
  type IsRepeatingCallbackFn = js.Function2[/* error */ String, /* repeating */ Boolean, Unit]
  
  type IsRunningCallbackFn = js.Function2[/* error */ String, /* isRunning */ Boolean, Unit]
  
  type IsShufflingCallbackFn = js.Function2[/* error */ String, /* shuffling */ Boolean, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.spotifyNodeApplescript.spotifyNodeApplescriptStrings.playing
    - typings.spotifyNodeApplescript.spotifyNodeApplescriptStrings.paused
  */
  trait SpotifyPlayingState extends StObject
  object SpotifyPlayingState {
    
    @scala.inline
    def paused: typings.spotifyNodeApplescript.spotifyNodeApplescriptStrings.paused = "paused".asInstanceOf[typings.spotifyNodeApplescript.spotifyNodeApplescriptStrings.paused]
    
    @scala.inline
    def playing: typings.spotifyNodeApplescript.spotifyNodeApplescriptStrings.playing = "playing".asInstanceOf[typings.spotifyNodeApplescript.spotifyNodeApplescriptStrings.playing]
  }
  
  @js.native
  trait SpotifyState extends StObject {
    
    var position: Double = js.native
    
    var state: SpotifyPlayingState = js.native
    
    var volume: Double = js.native
  }
  object SpotifyState {
    
    @scala.inline
    def apply(position: Double, state: SpotifyPlayingState, volume: Double): SpotifyState = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpotifyState]
    }
    
    @scala.inline
    implicit class SpotifyStateMutableBuilder[Self <: SpotifyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: SpotifyPlayingState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    }
  }
  
  type StateCallbackFn = js.Function2[/* error */ String, /* state */ SpotifyState, Unit]
  
  type SuccessCallbackFn = js.Function0[Unit]
  
  @js.native
  trait TrackInfo extends StObject {
    
    var album: String = js.native
    
    var album_artist: String = js.native
    
    var artist: String = js.native
    
    var artwork_url: String = js.native
    
    var disc_number: Double = js.native
    
    var duration: Double = js.native
    
    var id: String = js.native
    
    var name: String = js.native
    
    var played_count: Double = js.native
    
    var popularity: Double = js.native
    
    var spotify_url: String = js.native
    
    var starred: Boolean = js.native
    
    var track_number: Double = js.native
  }
  object TrackInfo {
    
    @scala.inline
    def apply(
      album: String,
      album_artist: String,
      artist: String,
      artwork_url: String,
      disc_number: Double,
      duration: Double,
      id: String,
      name: String,
      played_count: Double,
      popularity: Double,
      spotify_url: String,
      starred: Boolean,
      track_number: Double
    ): TrackInfo = {
      val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], album_artist = album_artist.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], artwork_url = artwork_url.asInstanceOf[js.Any], disc_number = disc_number.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], played_count = played_count.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], spotify_url = spotify_url.asInstanceOf[js.Any], starred = starred.asInstanceOf[js.Any], track_number = track_number.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackInfo]
    }
    
    @scala.inline
    implicit class TrackInfoMutableBuilder[Self <: TrackInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlbum_artist(value: String): Self = StObject.set(x, "album_artist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtwork_url(value: String): Self = StObject.set(x, "artwork_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisc_number(value: Double): Self = StObject.set(x, "disc_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayed_count(value: Double): Self = StObject.set(x, "played_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopularity(value: Double): Self = StObject.set(x, "popularity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpotify_url(value: String): Self = StObject.set(x, "spotify_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_number(value: Double): Self = StObject.set(x, "track_number", value.asInstanceOf[js.Any])
    }
  }
}
