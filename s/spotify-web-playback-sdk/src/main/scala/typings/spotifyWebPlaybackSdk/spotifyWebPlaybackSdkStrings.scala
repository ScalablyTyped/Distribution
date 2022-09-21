package typings.spotifyWebPlaybackSdk

import typings.spotifyWebPlaybackSdk.Spotify.ErrorTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spotifyWebPlaybackSdkStrings {
  
  @js.native
  sealed trait account_error
    extends StObject
       with ErrorTypes
  inline def account_error: account_error = "account_error".asInstanceOf[account_error]
  
  @js.native
  sealed trait ad extends StObject
  inline def ad: ad = "ad".asInstanceOf[ad]
  
  @js.native
  sealed trait audio extends StObject
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait authentication_error
    extends StObject
       with ErrorTypes
  inline def authentication_error: authentication_error = "authentication_error".asInstanceOf[authentication_error]
  
  @js.native
  sealed trait autoplay_failed extends StObject
  inline def autoplay_failed: autoplay_failed = "autoplay_failed".asInstanceOf[autoplay_failed]
  
  @js.native
  sealed trait episode extends StObject
  inline def episode: episode = "episode".asInstanceOf[episode]
  
  @js.native
  sealed trait initialization_error
    extends StObject
       with ErrorTypes
  inline def initialization_error: initialization_error = "initialization_error".asInstanceOf[initialization_error]
  
  @js.native
  sealed trait not_ready extends StObject
  inline def not_ready: not_ready = "not_ready".asInstanceOf[not_ready]
  
  @js.native
  sealed trait playback_error
    extends StObject
       with ErrorTypes
  inline def playback_error: playback_error = "playback_error".asInstanceOf[playback_error]
  
  @js.native
  sealed trait player_state_changed extends StObject
  inline def player_state_changed: player_state_changed = "player_state_changed".asInstanceOf[player_state_changed]
  
  @js.native
  sealed trait ready extends StObject
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait track extends StObject
  inline def track: track = "track".asInstanceOf[track]
  
  @js.native
  sealed trait video extends StObject
  inline def video: video = "video".asInstanceOf[video]
}
