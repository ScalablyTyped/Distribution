package typings.stremioAddonSdk

import typings.stremioAddonSdk.mod.ContentType
import typings.stremioAddonSdk.mod.Extra
import typings.stremioAddonSdk.mod.ShortManifestResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object stremioAddonSdkStrings {
  @js.native
  sealed trait addon_catalog extends ShortManifestResource
  
  @js.native
  sealed trait catalog extends ShortManifestResource
  
  @js.native
  sealed trait channel extends ContentType
  
  @js.native
  sealed trait genre extends Extra
  
  @js.native
  sealed trait landscape extends js.Object
  
  @js.native
  sealed trait meta extends ShortManifestResource
  
  @js.native
  sealed trait movie extends ContentType
  
  @js.native
  sealed trait regular extends js.Object
  
  @js.native
  sealed trait search extends Extra
  
  @js.native
  sealed trait series extends ContentType
  
  @js.native
  sealed trait skip extends Extra
  
  @js.native
  sealed trait square extends js.Object
  
  @js.native
  sealed trait stream extends ShortManifestResource
  
  @js.native
  sealed trait subtitles extends ShortManifestResource
  
  @js.native
  sealed trait tv extends ContentType
  
  @scala.inline
  def addon_catalog: addon_catalog = "addon_catalog".asInstanceOf[addon_catalog]
  @scala.inline
  def catalog: catalog = "catalog".asInstanceOf[catalog]
  @scala.inline
  def channel: channel = "channel".asInstanceOf[channel]
  @scala.inline
  def genre: genre = "genre".asInstanceOf[genre]
  @scala.inline
  def landscape: landscape = "landscape".asInstanceOf[landscape]
  @scala.inline
  def meta: meta = "meta".asInstanceOf[meta]
  @scala.inline
  def movie: movie = "movie".asInstanceOf[movie]
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
  @scala.inline
  def search: search = "search".asInstanceOf[search]
  @scala.inline
  def series: series = "series".asInstanceOf[series]
  @scala.inline
  def skip: skip = "skip".asInstanceOf[skip]
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  @scala.inline
  def subtitles: subtitles = "subtitles".asInstanceOf[subtitles]
  @scala.inline
  def tv: tv = "tv".asInstanceOf[tv]
}

