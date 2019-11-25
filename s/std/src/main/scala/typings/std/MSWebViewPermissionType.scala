package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.geolocation
  - typings.std.stdStrings.unlimitedIndexedDBQuota
  - typings.std.stdStrings.media
  - typings.std.stdStrings.pointerlock
  - typings.std.stdStrings.webnotifications
*/
trait MSWebViewPermissionType extends js.Object

object MSWebViewPermissionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def geolocation: typings.std.stdStrings.geolocation = this.cast("geolocation")
  @scala.inline
  def media: typings.std.stdStrings.media = this.cast("media")
  @scala.inline
  def pointerlock: typings.std.stdStrings.pointerlock = this.cast("pointerlock")
  @scala.inline
  def unlimitedIndexedDBQuota: typings.std.stdStrings.unlimitedIndexedDBQuota = this.cast("unlimitedIndexedDBQuota")
  @scala.inline
  def webnotifications: typings.std.stdStrings.webnotifications = this.cast("webnotifications")
}

