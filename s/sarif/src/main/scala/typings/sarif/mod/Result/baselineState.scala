package typings.sarif.mod.Result

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sarif.sarifStrings.`new`
  - typings.sarif.sarifStrings.unchanged
  - typings.sarif.sarifStrings.updated
  - typings.sarif.sarifStrings.absent
*/
trait baselineState extends js.Object

object baselineState {
  @scala.inline
  def absent: typings.sarif.sarifStrings.absent = this.cast("absent")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `new`: typings.sarif.sarifStrings.`new` = this.cast("new")
  @scala.inline
  def unchanged: typings.sarif.sarifStrings.unchanged = this.cast("unchanged")
  @scala.inline
  def updated: typings.sarif.sarifStrings.updated = this.cast("updated")
}

