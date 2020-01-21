package typings.spotifyApi

import typings.spotifyApi.SpotifyApi.ContextObjectType
import typings.spotifyApi.SpotifyApi.PlaybackRepeatState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object spotifyApiStrings {
  @js.native
  sealed trait C extends js.Object
  
  @js.native
  sealed trait P extends js.Object
  
  @js.native
  sealed trait album extends ContextObjectType
  
  @js.native
  sealed trait artist extends ContextObjectType
  
  @js.native
  sealed trait audio_features extends js.Object
  
  @js.native
  sealed trait context extends PlaybackRepeatState
  
  @js.native
  sealed trait genre extends js.Object
  
  @js.native
  sealed trait off extends PlaybackRepeatState
  
  @js.native
  sealed trait playlist extends ContextObjectType
  
  @js.native
  sealed trait track extends PlaybackRepeatState
  
  @js.native
  sealed trait user extends js.Object
  
  @scala.inline
  def C: C = "C".asInstanceOf[C]
  @scala.inline
  def P: P = "P".asInstanceOf[P]
  @scala.inline
  def album: album = "album".asInstanceOf[album]
  @scala.inline
  def artist: artist = "artist".asInstanceOf[artist]
  @scala.inline
  def audio_features: audio_features = "audio_features".asInstanceOf[audio_features]
  @scala.inline
  def context: context = "context".asInstanceOf[context]
  @scala.inline
  def genre: genre = "genre".asInstanceOf[genre]
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  @scala.inline
  def playlist: playlist = "playlist".asInstanceOf[playlist]
  @scala.inline
  def track: track = "track".asInstanceOf[track]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
}

