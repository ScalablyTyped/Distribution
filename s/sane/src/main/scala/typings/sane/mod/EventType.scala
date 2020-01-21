package typings.sane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sane.saneStrings.ready
  - typings.sane.saneStrings.error
  - typings.sane.saneStrings.all
  - typings.sane.saneStrings.add
  - typings.sane.saneStrings.change
  - typings.sane.saneStrings.delete
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def add: typings.sane.saneStrings.add = this.cast("add")
  @scala.inline
  def all: typings.sane.saneStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.sane.saneStrings.change = this.cast("change")
  @scala.inline
  def delete: typings.sane.saneStrings.delete = this.cast("delete")
  @scala.inline
  def error: typings.sane.saneStrings.error = this.cast("error")
  @scala.inline
  def ready: typings.sane.saneStrings.ready = this.cast("ready")
}

