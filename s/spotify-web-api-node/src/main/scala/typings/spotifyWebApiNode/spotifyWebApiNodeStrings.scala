package typings.spotifyWebApiNode

import typings.spotifyWebApiNode.mod.SearchType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spotifyWebApiNodeStrings {
  
  @scala.inline
  def album: album = "album".asInstanceOf[album]
  
  @scala.inline
  def artist: artist = "artist".asInstanceOf[artist]
  
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  
  @scala.inline
  def context: context = "context".asInstanceOf[context]
  
  @scala.inline
  def long_term: long_term = "long_term".asInstanceOf[long_term]
  
  @scala.inline
  def medium_term: medium_term = "medium_term".asInstanceOf[medium_term]
  
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @scala.inline
  def playlist: playlist = "playlist".asInstanceOf[playlist]
  
  @scala.inline
  def short_term: short_term = "short_term".asInstanceOf[short_term]
  
  @scala.inline
  def track: track = "track".asInstanceOf[track]
  
  @js.native
  sealed trait album extends SearchType
  
  @js.native
  sealed trait artist extends SearchType
  
  @js.native
  sealed trait audio extends js.Object
  
  @js.native
  sealed trait context extends js.Object
  
  @js.native
  sealed trait long_term extends js.Object
  
  @js.native
  sealed trait medium_term extends js.Object
  
  @js.native
  sealed trait off extends js.Object
  
  @js.native
  sealed trait playlist extends SearchType
  
  @js.native
  sealed trait short_term extends js.Object
  
  @js.native
  sealed trait track extends SearchType
}
