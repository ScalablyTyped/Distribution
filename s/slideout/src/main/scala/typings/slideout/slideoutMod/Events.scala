package typings.slideout.slideoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.slideout.slideoutStrings.beforeopen
  - typings.slideout.slideoutStrings.open
  - typings.slideout.slideoutStrings.beforeclose
  - typings.slideout.slideoutStrings.close
  - typings.slideout.slideoutStrings.translatestart
  - typings.slideout.slideoutStrings.translate
  - typings.slideout.slideoutStrings.translateend
*/
trait Events extends js.Object

object Events {
  @scala.inline
  def beforeclose: typings.slideout.slideoutStrings.beforeclose = this.cast("beforeclose")
  @scala.inline
  def beforeopen: typings.slideout.slideoutStrings.beforeopen = this.cast("beforeopen")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def close: typings.slideout.slideoutStrings.close = this.cast("close")
  @scala.inline
  def open: typings.slideout.slideoutStrings.open = this.cast("open")
  @scala.inline
  def translate: typings.slideout.slideoutStrings.translate = this.cast("translate")
  @scala.inline
  def translateend: typings.slideout.slideoutStrings.translateend = this.cast("translateend")
  @scala.inline
  def translatestart: typings.slideout.slideoutStrings.translatestart = this.cast("translatestart")
}

