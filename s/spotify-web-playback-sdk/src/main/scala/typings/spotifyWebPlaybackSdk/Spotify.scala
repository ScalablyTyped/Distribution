package typings.spotifyWebPlaybackSdk

import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkNumbers.`0`
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkNumbers.`1`
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkNumbers.`2`
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.ad
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.audio
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.episode
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.not_ready
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.player_state_changed
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.ready
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.track
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Spotify {
  
  type AddListenerFn = (js.Function2[/* event */ ready | not_ready, /* cb */ PlaybackInstanceListener, Unit]) & (js.Function2[player_state_changed, /* cb */ PlaybackStateListener, Unit]) & (js.Function2[/* event */ ErrorTypes, /* cb */ ErrorListener, Unit])
  
  trait Album extends StObject {
    
    var images: js.Array[Image]
    
    var name: String
    
    var uri: String
  }
  object Album {
    
    inline def apply(images: js.Array[Image], name: String, uri: String): Album = {
      val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Album]
    }
    
    extension [Self <: Album](x: Self) {
      
      inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait Artist extends StObject {
    
    var name: String
    
    var uri: String
  }
  object Artist {
    
    inline def apply(name: String, uri: String): Artist = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Artist]
    }
    
    extension [Self <: Artist](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var message: String
  }
  object Error {
    
    inline def apply(message: String): Error = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorListener = js.Function1[/* err */ Error, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.account_error
    - typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.authentication_error
    - typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.initialization_error
    - typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.playback_error
  */
  trait ErrorTypes extends StObject
  object ErrorTypes {
    
    inline def account_error: typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.account_error = "account_error".asInstanceOf[typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.account_error]
    
    inline def authentication_error: typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.authentication_error = "authentication_error".asInstanceOf[typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.authentication_error]
    
    inline def initialization_error: typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.initialization_error = "initialization_error".asInstanceOf[typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.initialization_error]
    
    inline def playback_error: typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.playback_error = "playback_error".asInstanceOf[typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.playback_error]
  }
  
  trait Image extends StObject {
    
    var height: js.UndefOr[Double | Null] = js.undefined
    
    var url: String
    
    var width: js.UndefOr[Double | Null] = js.undefined
  }
  object Image {
    
    inline def apply(url: String): Image = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    extension [Self <: Image](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PlaybackContext extends StObject {
    
    var metadata: js.Any
    
    var uri: String | Null
  }
  object PlaybackContext {
    
    inline def apply(metadata: js.Any): PlaybackContext = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], uri = null)
      __obj.asInstanceOf[PlaybackContext]
    }
    
    extension [Self <: PlaybackContext](x: Self) {
      
      inline def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriNull: Self = StObject.set(x, "uri", null)
    }
  }
  
  trait PlaybackDisallows extends StObject {
    
    var pausing: Boolean
    
    var peeking_next: Boolean
    
    var peeking_prev: Boolean
    
    var resuming: Boolean
    
    var seeking: Boolean
    
    var skipping_next: Boolean
    
    var skipping_prev: Boolean
  }
  object PlaybackDisallows {
    
    inline def apply(
      pausing: Boolean,
      peeking_next: Boolean,
      peeking_prev: Boolean,
      resuming: Boolean,
      seeking: Boolean,
      skipping_next: Boolean,
      skipping_prev: Boolean
    ): PlaybackDisallows = {
      val __obj = js.Dynamic.literal(pausing = pausing.asInstanceOf[js.Any], peeking_next = peeking_next.asInstanceOf[js.Any], peeking_prev = peeking_prev.asInstanceOf[js.Any], resuming = resuming.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], skipping_next = skipping_next.asInstanceOf[js.Any], skipping_prev = skipping_prev.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaybackDisallows]
    }
    
    extension [Self <: PlaybackDisallows](x: Self) {
      
      inline def setPausing(value: Boolean): Self = StObject.set(x, "pausing", value.asInstanceOf[js.Any])
      
      inline def setPeeking_next(value: Boolean): Self = StObject.set(x, "peeking_next", value.asInstanceOf[js.Any])
      
      inline def setPeeking_prev(value: Boolean): Self = StObject.set(x, "peeking_prev", value.asInstanceOf[js.Any])
      
      inline def setResuming(value: Boolean): Self = StObject.set(x, "resuming", value.asInstanceOf[js.Any])
      
      inline def setSeeking(value: Boolean): Self = StObject.set(x, "seeking", value.asInstanceOf[js.Any])
      
      inline def setSkipping_next(value: Boolean): Self = StObject.set(x, "skipping_next", value.asInstanceOf[js.Any])
      
      inline def setSkipping_prev(value: Boolean): Self = StObject.set(x, "skipping_prev", value.asInstanceOf[js.Any])
    }
  }
  
  type PlaybackInstanceListener = js.Function1[/* inst */ WebPlaybackInstance, Unit]
  
  trait PlaybackRestrictions extends StObject {
    
    var disallow_pausing_reasons: js.Array[String]
    
    var disallow_peeking_next_reasons: js.Array[String]
    
    var disallow_peeking_prev_reasons: js.Array[String]
    
    var disallow_resuming_reasons: js.Array[String]
    
    var disallow_seeking_reasons: js.Array[String]
    
    var disallow_skipping_next_reasons: js.Array[String]
    
    var disallow_skipping_prev_reasons: js.Array[String]
  }
  object PlaybackRestrictions {
    
    inline def apply(
      disallow_pausing_reasons: js.Array[String],
      disallow_peeking_next_reasons: js.Array[String],
      disallow_peeking_prev_reasons: js.Array[String],
      disallow_resuming_reasons: js.Array[String],
      disallow_seeking_reasons: js.Array[String],
      disallow_skipping_next_reasons: js.Array[String],
      disallow_skipping_prev_reasons: js.Array[String]
    ): PlaybackRestrictions = {
      val __obj = js.Dynamic.literal(disallow_pausing_reasons = disallow_pausing_reasons.asInstanceOf[js.Any], disallow_peeking_next_reasons = disallow_peeking_next_reasons.asInstanceOf[js.Any], disallow_peeking_prev_reasons = disallow_peeking_prev_reasons.asInstanceOf[js.Any], disallow_resuming_reasons = disallow_resuming_reasons.asInstanceOf[js.Any], disallow_seeking_reasons = disallow_seeking_reasons.asInstanceOf[js.Any], disallow_skipping_next_reasons = disallow_skipping_next_reasons.asInstanceOf[js.Any], disallow_skipping_prev_reasons = disallow_skipping_prev_reasons.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaybackRestrictions]
    }
    
    extension [Self <: PlaybackRestrictions](x: Self) {
      
      inline def setDisallow_pausing_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_pausing_reasons", value.asInstanceOf[js.Any])
      
      inline def setDisallow_pausing_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_pausing_reasons", js.Array(value :_*))
      
      inline def setDisallow_peeking_next_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_peeking_next_reasons", value.asInstanceOf[js.Any])
      
      inline def setDisallow_peeking_next_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_peeking_next_reasons", js.Array(value :_*))
      
      inline def setDisallow_peeking_prev_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_peeking_prev_reasons", value.asInstanceOf[js.Any])
      
      inline def setDisallow_peeking_prev_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_peeking_prev_reasons", js.Array(value :_*))
      
      inline def setDisallow_resuming_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_resuming_reasons", value.asInstanceOf[js.Any])
      
      inline def setDisallow_resuming_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_resuming_reasons", js.Array(value :_*))
      
      inline def setDisallow_seeking_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_seeking_reasons", value.asInstanceOf[js.Any])
      
      inline def setDisallow_seeking_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_seeking_reasons", js.Array(value :_*))
      
      inline def setDisallow_skipping_next_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_skipping_next_reasons", value.asInstanceOf[js.Any])
      
      inline def setDisallow_skipping_next_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_skipping_next_reasons", js.Array(value :_*))
      
      inline def setDisallow_skipping_prev_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_skipping_prev_reasons", value.asInstanceOf[js.Any])
      
      inline def setDisallow_skipping_prev_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_skipping_prev_reasons", js.Array(value :_*))
    }
  }
  
  trait PlaybackState extends StObject {
    
    var context: PlaybackContext
    
    var disallows: PlaybackDisallows
    
    var duration: Double
    
    var paused: Boolean
    
    var position: Double
    
    /**
      * 0: NO_REPEAT
      * 1: ONCE_REPEAT
      * 2: FULL_REPEAT
      */
    var repeat_mode: `0` | `1` | `2`
    
    var restrictions: PlaybackRestrictions
    
    var shuffle: Boolean
    
    var track_window: PlaybackTrackWindow
  }
  object PlaybackState {
    
    inline def apply(
      context: PlaybackContext,
      disallows: PlaybackDisallows,
      duration: Double,
      paused: Boolean,
      position: Double,
      repeat_mode: `0` | `1` | `2`,
      restrictions: PlaybackRestrictions,
      shuffle: Boolean,
      track_window: PlaybackTrackWindow
    ): PlaybackState = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], disallows = disallows.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], repeat_mode = repeat_mode.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], shuffle = shuffle.asInstanceOf[js.Any], track_window = track_window.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaybackState]
    }
    
    extension [Self <: PlaybackState](x: Self) {
      
      inline def setContext(value: PlaybackContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDisallows(value: PlaybackDisallows): Self = StObject.set(x, "disallows", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRepeat_mode(value: `0` | `1` | `2`): Self = StObject.set(x, "repeat_mode", value.asInstanceOf[js.Any])
      
      inline def setRestrictions(value: PlaybackRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
      
      inline def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
      
      inline def setTrack_window(value: PlaybackTrackWindow): Self = StObject.set(x, "track_window", value.asInstanceOf[js.Any])
    }
  }
  
  type PlaybackStateListener = js.Function1[/* s */ PlaybackState, Unit]
  
  trait PlaybackTrackWindow extends StObject {
    
    var current_track: Track
    
    var next_tracks: js.Array[Track]
    
    var previous_tracks: js.Array[Track]
  }
  object PlaybackTrackWindow {
    
    inline def apply(current_track: Track, next_tracks: js.Array[Track], previous_tracks: js.Array[Track]): PlaybackTrackWindow = {
      val __obj = js.Dynamic.literal(current_track = current_track.asInstanceOf[js.Any], next_tracks = next_tracks.asInstanceOf[js.Any], previous_tracks = previous_tracks.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaybackTrackWindow]
    }
    
    extension [Self <: PlaybackTrackWindow](x: Self) {
      
      inline def setCurrent_track(value: Track): Self = StObject.set(x, "current_track", value.asInstanceOf[js.Any])
      
      inline def setNext_tracks(value: js.Array[Track]): Self = StObject.set(x, "next_tracks", value.asInstanceOf[js.Any])
      
      inline def setNext_tracksVarargs(value: Track*): Self = StObject.set(x, "next_tracks", js.Array(value :_*))
      
      inline def setPrevious_tracks(value: js.Array[Track]): Self = StObject.set(x, "previous_tracks", value.asInstanceOf[js.Any])
      
      inline def setPrevious_tracksVarargs(value: Track*): Self = StObject.set(x, "previous_tracks", js.Array(value :_*))
    }
  }
  
  /* was `typeof SpotifyPlayer` */
  type Player = SpotifyPlayer
  
  trait PlayerInit extends StObject {
    
    def getOAuthToken(cb: js.Function1[/* token */ String, Unit]): Unit
    
    var name: String
    
    var volume: js.UndefOr[Double] = js.undefined
  }
  object PlayerInit {
    
    inline def apply(getOAuthToken: js.Function1[/* token */ String, Unit] => Unit, name: String): PlayerInit = {
      val __obj = js.Dynamic.literal(getOAuthToken = js.Any.fromFunction1(getOAuthToken), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerInit]
    }
    
    extension [Self <: PlayerInit](x: Self) {
      
      inline def setGetOAuthToken(value: js.Function1[/* token */ String, Unit] => Unit): Self = StObject.set(x, "getOAuthToken", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  @js.native
  trait SpotifyPlayer extends StObject {
    
    def addListener(event: ErrorTypes, cb: ErrorListener): Unit = js.native
    @JSName("addListener")
    var addListener_Original: AddListenerFn = js.native
    @JSName("addListener")
    def addListener_notready(event: not_ready, cb: PlaybackInstanceListener): Unit = js.native
    @JSName("addListener")
    def addListener_playerstatechanged(event: player_state_changed, cb: PlaybackStateListener): Unit = js.native
    @JSName("addListener")
    def addListener_ready(event: ready, cb: PlaybackInstanceListener): Unit = js.native
    
    def connect(): js.Promise[Boolean] = js.native
    
    def disconnect(): Unit = js.native
    
    def getCurrentState(): js.Promise[PlaybackState | Null] = js.native
    
    def getVolume(): js.Promise[Double] = js.native
    
    def nextTrack(): js.Promise[Unit] = js.native
    
    def on(event: ErrorTypes, cb: ErrorListener): Unit = js.native
    @JSName("on")
    var on_Original: AddListenerFn = js.native
    @JSName("on")
    def on_notready(event: not_ready, cb: PlaybackInstanceListener): Unit = js.native
    @JSName("on")
    def on_playerstatechanged(event: player_state_changed, cb: PlaybackStateListener): Unit = js.native
    @JSName("on")
    def on_ready(event: ready, cb: PlaybackInstanceListener): Unit = js.native
    
    def pause(): js.Promise[Unit] = js.native
    
    def previousTrack(): js.Promise[Unit] = js.native
    
    def removeListener(event: ErrorTypes): Unit = js.native
    def removeListener(event: ErrorTypes, cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener): Unit = js.native
    @JSName("removeListener")
    def removeListener_notready(event: not_ready): Unit = js.native
    @JSName("removeListener")
    def removeListener_notready(event: not_ready, cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener): Unit = js.native
    @JSName("removeListener")
    def removeListener_playerstatechanged(event: player_state_changed): Unit = js.native
    @JSName("removeListener")
    def removeListener_playerstatechanged(event: player_state_changed, cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener): Unit = js.native
    @JSName("removeListener")
    def removeListener_ready(event: ready): Unit = js.native
    @JSName("removeListener")
    def removeListener_ready(event: ready, cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener): Unit = js.native
    
    def resume(): js.Promise[Unit] = js.native
    
    def seek(pos_ms: Double): js.Promise[Unit] = js.native
    
    def setName(name: String): js.Promise[Unit] = js.native
    
    def setVolume(volume: Double): js.Promise[Unit] = js.native
    
    def togglePlay(): js.Promise[Unit] = js.native
  }
  
  trait Track extends StObject {
    
    var album: Album
    
    var artists: js.Array[Artist]
    
    var id: String | Null
    
    var is_playable: Boolean
    
    var media_type: audio | video
    
    var name: String
    
    var `type`: track | episode | ad
    
    var uri: String
  }
  object Track {
    
    inline def apply(
      album: Album,
      artists: js.Array[Artist],
      is_playable: Boolean,
      media_type: audio | video,
      name: String,
      `type`: track | episode | ad,
      uri: String
    ): Track = {
      val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], is_playable = is_playable.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], id = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Track]
    }
    
    extension [Self <: Track](x: Self) {
      
      inline def setAlbum(value: Album): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
      
      inline def setArtists(value: js.Array[Artist]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
      
      inline def setArtistsVarargs(value: Artist*): Self = StObject.set(x, "artists", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIs_playable(value: Boolean): Self = StObject.set(x, "is_playable", value.asInstanceOf[js.Any])
      
      inline def setMedia_type(value: audio | video): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: track | episode | ad): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebPlaybackInstance extends StObject {
    
    var device_id: String
  }
  object WebPlaybackInstance {
    
    inline def apply(device_id: String): WebPlaybackInstance = {
      val __obj = js.Dynamic.literal(device_id = device_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebPlaybackInstance]
    }
    
    extension [Self <: WebPlaybackInstance](x: Self) {
      
      inline def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
    }
  }
}
