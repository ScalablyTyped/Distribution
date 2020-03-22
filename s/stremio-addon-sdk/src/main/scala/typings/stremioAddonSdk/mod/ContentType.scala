package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stremioAddonSdk.stremioAddonSdkStrings.movie
  - typings.stremioAddonSdk.stremioAddonSdkStrings.series
  - typings.stremioAddonSdk.stremioAddonSdkStrings.channel
  - typings.stremioAddonSdk.stremioAddonSdkStrings.tv
*/
trait ContentType extends js.Object

object ContentType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def channel: typings.stremioAddonSdk.stremioAddonSdkStrings.channel = this.cast("channel")
  @scala.inline
  def movie: typings.stremioAddonSdk.stremioAddonSdkStrings.movie = this.cast("movie")
  @scala.inline
  def series: typings.stremioAddonSdk.stremioAddonSdkStrings.series = this.cast("series")
  @scala.inline
  def tv: typings.stremioAddonSdk.stremioAddonSdkStrings.tv = this.cast("tv")
}

