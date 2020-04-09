package typings.recurlyRecurlyJs.elementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.change
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.focus
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.blur
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.submit
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.attach
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.remove
*/
trait ElementEvent extends js.Object

object ElementEvent {
  @scala.inline
  def attach: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.attach = this.cast("attach")
  @scala.inline
  def blur: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.blur = this.cast("blur")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.change = this.cast("change")
  @scala.inline
  def focus: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.focus = this.cast("focus")
  @scala.inline
  def remove: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.remove = this.cast("remove")
  @scala.inline
  def submit: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.submit = this.cast("submit")
}

