package typings.sloc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sloc.slocStrings.total
  - typings.sloc.slocStrings.source
  - typings.sloc.slocStrings.comment
  - typings.sloc.slocStrings.single
  - typings.sloc.slocStrings.block
  - typings.sloc.slocStrings.mixed
  - typings.sloc.slocStrings.blockEmpty
  - typings.sloc.slocStrings.empty
  - typings.sloc.slocStrings.todo
*/
trait Key extends js.Object

object Key {
  @scala.inline
  def block: typings.sloc.slocStrings.block = this.cast("block")
  @scala.inline
  def blockEmpty: typings.sloc.slocStrings.blockEmpty = this.cast("blockEmpty")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def comment: typings.sloc.slocStrings.comment = this.cast("comment")
  @scala.inline
  def empty: typings.sloc.slocStrings.empty = this.cast("empty")
  @scala.inline
  def mixed: typings.sloc.slocStrings.mixed = this.cast("mixed")
  @scala.inline
  def single: typings.sloc.slocStrings.single = this.cast("single")
  @scala.inline
  def source: typings.sloc.slocStrings.source = this.cast("source")
  @scala.inline
  def todo: typings.sloc.slocStrings.todo = this.cast("todo")
  @scala.inline
  def total: typings.sloc.slocStrings.total = this.cast("total")
}

