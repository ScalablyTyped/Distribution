package typings.sharedb.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sharedb.sharedbStrings.load
  - typings.sharedb.sharedbStrings.create
  - typings.sharedb.sharedbStrings.`before op`
  - typings.sharedb.sharedbStrings.op
  - typings.sharedb.sharedbStrings.del
  - typings.sharedb.sharedbStrings.error
  - typings.sharedb.sharedbStrings.`no write pending`
  - typings.sharedb.sharedbStrings.`nothing pending`
*/
trait DocEvent extends js.Object

object DocEvent {
  @scala.inline
  def `before op`: typings.sharedb.sharedbStrings.`before op` = this.cast("before op")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typings.sharedb.sharedbStrings.create = this.cast("create")
  @scala.inline
  def del: typings.sharedb.sharedbStrings.del = this.cast("del")
  @scala.inline
  def error: typings.sharedb.sharedbStrings.error = this.cast("error")
  @scala.inline
  def load: typings.sharedb.sharedbStrings.load = this.cast("load")
  @scala.inline
  def `no write pending`: typings.sharedb.sharedbStrings.`no write pending` = this.cast("no write pending")
  @scala.inline
  def `nothing pending`: typings.sharedb.sharedbStrings.`nothing pending` = this.cast("nothing pending")
  @scala.inline
  def op: typings.sharedb.sharedbStrings.op = this.cast("op")
}

