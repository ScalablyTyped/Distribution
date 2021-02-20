package typings.spotifyWebApiNode

import typings.spotifyWebApiNode.mod.SearchType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spotifyWebApiNodeStrings {
  
  @js.native
  sealed trait album extends SearchType
  @scala.inline
  def album: album = "album".asInstanceOf[album]
  
  @js.native
  sealed trait artist extends SearchType
  @scala.inline
  def artist: artist = "artist".asInstanceOf[artist]
  
  @js.native
  sealed trait audio extends StObject
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait context extends StObject
  @scala.inline
  def context: context = "context".asInstanceOf[context]
  
  @js.native
  sealed trait long_term extends StObject
  @scala.inline
  def long_term: long_term = "long_term".asInstanceOf[long_term]
  
  @js.native
  sealed trait medium_term extends StObject
  @scala.inline
  def medium_term: medium_term = "medium_term".asInstanceOf[medium_term]
  
  @js.native
  sealed trait off extends StObject
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait playlist extends SearchType
  @scala.inline
  def playlist: playlist = "playlist".asInstanceOf[playlist]
  
  @js.native
  sealed trait short_term extends StObject
  @scala.inline
  def short_term: short_term = "short_term".asInstanceOf[short_term]
  
  @js.native
  sealed trait track extends SearchType
  @scala.inline
  def track: track = "track".asInstanceOf[track]
}
