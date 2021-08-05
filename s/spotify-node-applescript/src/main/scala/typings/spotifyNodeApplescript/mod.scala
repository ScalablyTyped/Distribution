package typings.spotifyNodeApplescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spotify-node-applescript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getState(callback: StateCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getState")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getTrack(callback: GetTrackCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTrack")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isRepeating(callback: IsRepeatingCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isRepeating")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isRunning(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isRunning")().asInstanceOf[Unit]
  inline def isRunning(callback: IsRunningCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isRunning")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isShuffling(callback: IsShufflingCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isShuffling")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def jumpTo(second: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(second.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def jumpTo(second: Double, callback: SuccessCallbackFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(second.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def muteVolume(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("muteVolume")().asInstanceOf[Unit]
  inline def muteVolume(callback: SuccessCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("muteVolume")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def next(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("next")().asInstanceOf[Unit]
  inline def next(callback: SuccessCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("next")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def pause(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")().asInstanceOf[Unit]
  inline def pause(callback: SuccessCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def play(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("play")().asInstanceOf[Unit]
  inline def play(callback: SuccessCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("play")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def playPause(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("playPause")().asInstanceOf[Unit]
  inline def playPause(callback: SuccessCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("playPause")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def playTrack(uri: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("playTrack")(uri.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def playTrack(uri: String, callback: SuccessCallbackFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("playTrack")(uri.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def playTrackInContext(uri: String, contextUri: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("playTrackInContext")(uri.asInstanceOf[js.Any], contextUri.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def playTrackInContext(uri: String, contextUri: String, callback: SuccessCallbackFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("playTrackInContext")(uri.asInstanceOf[js.Any], contextUri.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def previous(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("previous")().asInstanceOf[Unit]
  inline def previous(callback: SuccessCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("previous")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setRepeating(repeating: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRepeating")(repeating.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setRepeating(repeating: Boolean, callback: SuccessCallbackFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRepeating")(repeating.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setShuffling(shuffling: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShuffling")(shuffling.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setShuffling(shuffling: Boolean, callback: SuccessCallbackFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setShuffling")(shuffling.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setVolume(volume: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVolume")(volume.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setVolume(volume: Double, callback: SuccessCallbackFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVolume")(volume.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toggleRepeating(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleRepeating")().asInstanceOf[Unit]
  inline def toggleRepeating(callback: SuccessCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleRepeating")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toggleShuffling(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleShuffling")().asInstanceOf[Unit]
  inline def toggleShuffling(callback: SuccessCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleShuffling")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unmuteVolume(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmuteVolume")().asInstanceOf[Unit]
  inline def unmuteVolume(callback: SuccessCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmuteVolume")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def volumeDown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("volumeDown")().asInstanceOf[Unit]
  inline def volumeDown(callback: SuccessCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("volumeDown")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def volumeUp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("volumeUp")().asInstanceOf[Unit]
  inline def volumeUp(callback: SuccessCallbackFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("volumeUp")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
    
    inline def paused: typings.spotifyNodeApplescript.spotifyNodeApplescriptStrings.paused = "paused".asInstanceOf[typings.spotifyNodeApplescript.spotifyNodeApplescriptStrings.paused]
    
    inline def playing: typings.spotifyNodeApplescript.spotifyNodeApplescriptStrings.playing = "playing".asInstanceOf[typings.spotifyNodeApplescript.spotifyNodeApplescriptStrings.playing]
  }
  
  trait SpotifyState extends StObject {
    
    var position: Double
    
    var state: SpotifyPlayingState
    
    var volume: Double
  }
  object SpotifyState {
    
    inline def apply(position: Double, state: SpotifyPlayingState, volume: Double): SpotifyState = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpotifyState]
    }
    
    extension [Self <: SpotifyState](x: Self) {
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setState(value: SpotifyPlayingState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    }
  }
  
  type StateCallbackFn = js.Function2[/* error */ String, /* state */ SpotifyState, Unit]
  
  type SuccessCallbackFn = js.Function0[Unit]
  
  trait TrackInfo extends StObject {
    
    var album: String
    
    var album_artist: String
    
    var artist: String
    
    var artwork_url: String
    
    var disc_number: Double
    
    var duration: Double
    
    var id: String
    
    var name: String
    
    var played_count: Double
    
    var popularity: Double
    
    var spotify_url: String
    
    var starred: Boolean
    
    var track_number: Double
  }
  object TrackInfo {
    
    inline def apply(
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
    
    extension [Self <: TrackInfo](x: Self) {
      
      inline def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
      
      inline def setAlbum_artist(value: String): Self = StObject.set(x, "album_artist", value.asInstanceOf[js.Any])
      
      inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
      
      inline def setArtwork_url(value: String): Self = StObject.set(x, "artwork_url", value.asInstanceOf[js.Any])
      
      inline def setDisc_number(value: Double): Self = StObject.set(x, "disc_number", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlayed_count(value: Double): Self = StObject.set(x, "played_count", value.asInstanceOf[js.Any])
      
      inline def setPopularity(value: Double): Self = StObject.set(x, "popularity", value.asInstanceOf[js.Any])
      
      inline def setSpotify_url(value: String): Self = StObject.set(x, "spotify_url", value.asInstanceOf[js.Any])
      
      inline def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
      
      inline def setTrack_number(value: Double): Self = StObject.set(x, "track_number", value.asInstanceOf[js.Any])
    }
  }
}
