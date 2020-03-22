package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stremioAddonSdk.stremioAddonSdkStrings.catalog
  - typings.stremioAddonSdk.stremioAddonSdkStrings.meta
  - typings.stremioAddonSdk.stremioAddonSdkStrings.stream
  - typings.stremioAddonSdk.stremioAddonSdkStrings.subtitles
  - typings.stremioAddonSdk.stremioAddonSdkStrings.addon_catalog
*/
trait ShortManifestResource extends js.Object

object ShortManifestResource {
  @scala.inline
  def addon_catalog: typings.stremioAddonSdk.stremioAddonSdkStrings.addon_catalog = this.cast("addon_catalog")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def catalog: typings.stremioAddonSdk.stremioAddonSdkStrings.catalog = this.cast("catalog")
  @scala.inline
  def meta: typings.stremioAddonSdk.stremioAddonSdkStrings.meta = this.cast("meta")
  @scala.inline
  def stream: typings.stremioAddonSdk.stremioAddonSdkStrings.stream = this.cast("stream")
  @scala.inline
  def subtitles: typings.stremioAddonSdk.stremioAddonSdkStrings.subtitles = this.cast("subtitles")
}

