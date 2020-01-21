package typings.sharedb.mod.middleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sharedb.sharedbStrings.current
  - typings.sharedb.sharedbStrings.byVersion
  - typings.sharedb.sharedbStrings.byTimestamp
*/
trait SnapshotType extends js.Object

object SnapshotType {
  @scala.inline
  def byTimestamp: typings.sharedb.sharedbStrings.byTimestamp = this.cast("byTimestamp")
  @scala.inline
  def byVersion: typings.sharedb.sharedbStrings.byVersion = this.cast("byVersion")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def current: typings.sharedb.sharedbStrings.current = this.cast("current")
}

