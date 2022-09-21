package typings.spotifyWebApiNode

import typings.spotifyWebApiNode.mod.RepeatState
import typings.spotifyWebApiNode.mod.SearchType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spotifyWebApiNodeStrings {
  
  @js.native
  sealed trait album
    extends StObject
       with SearchType
  inline def album: album = "album".asInstanceOf[album]
  
  @js.native
  sealed trait artist
    extends StObject
       with SearchType
  inline def artist: artist = "artist".asInstanceOf[artist]
  
  @js.native
  sealed trait audio extends StObject
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait context
    extends StObject
       with RepeatState
  inline def context: context = "context".asInstanceOf[context]
  
  @js.native
  sealed trait episode
    extends StObject
       with SearchType
  inline def episode: episode = "episode".asInstanceOf[episode]
  
  @js.native
  sealed trait long_term extends StObject
  inline def long_term: long_term = "long_term".asInstanceOf[long_term]
  
  @js.native
  sealed trait medium_term extends StObject
  inline def medium_term: medium_term = "medium_term".asInstanceOf[medium_term]
  
  @js.native
  sealed trait off
    extends StObject
       with RepeatState
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait playlist
    extends StObject
       with SearchType
  inline def playlist: playlist = "playlist".asInstanceOf[playlist]
  
  @js.native
  sealed trait short_term extends StObject
  inline def short_term: short_term = "short_term".asInstanceOf[short_term]
  
  @js.native
  sealed trait show
    extends StObject
       with SearchType
  inline def show: show = "show".asInstanceOf[show]
  
  @js.native
  sealed trait track
    extends StObject
       with RepeatState
       with SearchType
  inline def track: track = "track".asInstanceOf[track]
}
