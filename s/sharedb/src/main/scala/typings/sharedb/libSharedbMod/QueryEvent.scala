package typings.sharedb.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sharedb.sharedbStrings.ready
  - typings.sharedb.sharedbStrings.error
  - typings.sharedb.sharedbStrings.changed
  - typings.sharedb.sharedbStrings.insert
  - typings.sharedb.sharedbStrings.move
  - typings.sharedb.sharedbStrings.remove
  - typings.sharedb.sharedbStrings.extra
*/
trait QueryEvent extends js.Object

object QueryEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def changed: typings.sharedb.sharedbStrings.changed = this.cast("changed")
  @scala.inline
  def error: typings.sharedb.sharedbStrings.error = this.cast("error")
  @scala.inline
  def extra: typings.sharedb.sharedbStrings.extra = this.cast("extra")
  @scala.inline
  def insert: typings.sharedb.sharedbStrings.insert = this.cast("insert")
  @scala.inline
  def move: typings.sharedb.sharedbStrings.move = this.cast("move")
  @scala.inline
  def ready: typings.sharedb.sharedbStrings.ready = this.cast("ready")
  @scala.inline
  def remove: typings.sharedb.sharedbStrings.remove = this.cast("remove")
}

