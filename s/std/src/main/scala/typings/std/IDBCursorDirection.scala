package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.next
  - typings.std.stdStrings.nextunique
  - typings.std.stdStrings.prev
  - typings.std.stdStrings.prevunique
*/
trait IDBCursorDirection extends js.Object

object IDBCursorDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def next: typings.std.stdStrings.next = this.cast("next")
  @scala.inline
  def nextunique: typings.std.stdStrings.nextunique = this.cast("nextunique")
  @scala.inline
  def prev: typings.std.stdStrings.prev = this.cast("prev")
  @scala.inline
  def prevunique: typings.std.stdStrings.prevunique = this.cast("prevunique")
}

