package typings.recurlyRecurlyJs.recurlyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.change
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.fieldColonsubmit
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error
*/
trait RecurlyEvent extends js.Object

object RecurlyEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.change = this.cast("change")
  @scala.inline
  def error: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error = this.cast("error")
  @scala.inline
  def fieldColonsubmit: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.fieldColonsubmit = this.cast("field:submit")
}

