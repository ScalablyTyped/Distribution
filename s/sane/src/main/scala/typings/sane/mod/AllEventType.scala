package typings.sane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sane.saneStrings.add
  - typings.sane.saneStrings.change
  - typings.sane.saneStrings.delete
*/
trait AllEventType extends js.Object

object AllEventType {
  @scala.inline
  def add: typings.sane.saneStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.sane.saneStrings.change = this.cast("change")
  @scala.inline
  def delete: typings.sane.saneStrings.delete = this.cast("delete")
}

