package typings.spotifyWebApiJs

import typings.spotifyWebApiJs.SpotifyApi.ContextObjectType
import typings.spotifyWebApiJs.SpotifyApi.PlaybackRepeatState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spotifyWebApiJsStrings {
  
  @js.native
  sealed trait C extends StObject
  inline def C: C = "C".asInstanceOf[C]
  
  @js.native
  sealed trait P extends StObject
  inline def P: P = "P".asInstanceOf[P]
  
  @js.native
  sealed trait album
    extends StObject
       with ContextObjectType
  inline def album: album = "album".asInstanceOf[album]
  
  @js.native
  sealed trait artist
    extends StObject
       with ContextObjectType
  inline def artist: artist = "artist".asInstanceOf[artist]
  
  @js.native
  sealed trait audio_features extends StObject
  inline def audio_features: audio_features = "audio_features".asInstanceOf[audio_features]
  
  @js.native
  sealed trait context
    extends StObject
       with PlaybackRepeatState
  inline def context: context = "context".asInstanceOf[context]
  
  @js.native
  sealed trait episode extends StObject
  inline def episode: episode = "episode".asInstanceOf[episode]
  
  @js.native
  sealed trait genre extends StObject
  inline def genre: genre = "genre".asInstanceOf[genre]
  
  @js.native
  sealed trait off
    extends StObject
       with PlaybackRepeatState
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait playlist
    extends StObject
       with ContextObjectType
  inline def playlist: playlist = "playlist".asInstanceOf[playlist]
  
  @js.native
  sealed trait show extends StObject
  inline def show: show = "show".asInstanceOf[show]
  
  @js.native
  sealed trait track
    extends StObject
       with PlaybackRepeatState
  inline def track: track = "track".asInstanceOf[track]
  
  @js.native
  sealed trait user extends StObject
  inline def user: user = "user".asInstanceOf[user]
}
