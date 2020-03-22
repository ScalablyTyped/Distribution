package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stremioAddonSdk.stremioAddonSdkStrings.search
  - typings.stremioAddonSdk.stremioAddonSdkStrings.genre
  - typings.stremioAddonSdk.stremioAddonSdkStrings.skip
*/
trait Extra extends js.Object

object Extra {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def genre: typings.stremioAddonSdk.stremioAddonSdkStrings.genre = this.cast("genre")
  @scala.inline
  def search: typings.stremioAddonSdk.stremioAddonSdkStrings.search = this.cast("search")
  @scala.inline
  def skip: typings.stremioAddonSdk.stremioAddonSdkStrings.skip = this.cast("skip")
}

