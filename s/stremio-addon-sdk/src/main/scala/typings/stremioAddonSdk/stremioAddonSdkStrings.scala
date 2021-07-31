package typings.stremioAddonSdk

import typings.stremioAddonSdk.mod.ContentType
import typings.stremioAddonSdk.mod.Extra
import typings.stremioAddonSdk.mod.ShortManifestResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stremioAddonSdkStrings {
  
  @js.native
  sealed trait addon_catalog
    extends StObject
       with ShortManifestResource
  @scala.inline
  def addon_catalog: addon_catalog = "addon_catalog".asInstanceOf[addon_catalog]
  
  @js.native
  sealed trait catalog
    extends StObject
       with ShortManifestResource
  @scala.inline
  def catalog: catalog = "catalog".asInstanceOf[catalog]
  
  @js.native
  sealed trait channel
    extends StObject
       with ContentType
  @scala.inline
  def channel: channel = "channel".asInstanceOf[channel]
  
  @js.native
  sealed trait genre
    extends StObject
       with Extra
  @scala.inline
  def genre: genre = "genre".asInstanceOf[genre]
  
  @js.native
  sealed trait landscape extends StObject
  @scala.inline
  def landscape: landscape = "landscape".asInstanceOf[landscape]
  
  @js.native
  sealed trait meta
    extends StObject
       with ShortManifestResource
  @scala.inline
  def meta: meta = "meta".asInstanceOf[meta]
  
  @js.native
  sealed trait movie
    extends StObject
       with ContentType
  @scala.inline
  def movie: movie = "movie".asInstanceOf[movie]
  
  @js.native
  sealed trait regular extends StObject
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait search
    extends StObject
       with Extra
  @scala.inline
  def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait series
    extends StObject
       with ContentType
  @scala.inline
  def series: series = "series".asInstanceOf[series]
  
  @js.native
  sealed trait skip
    extends StObject
       with Extra
  @scala.inline
  def skip: skip = "skip".asInstanceOf[skip]
  
  @js.native
  sealed trait square extends StObject
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait stream
    extends StObject
       with ShortManifestResource
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  
  @js.native
  sealed trait subtitles
    extends StObject
       with ShortManifestResource
  @scala.inline
  def subtitles: subtitles = "subtitles".asInstanceOf[subtitles]
  
  @js.native
  sealed trait tv
    extends StObject
       with ContentType
  @scala.inline
  def tv: tv = "tv".asInstanceOf[tv]
}
