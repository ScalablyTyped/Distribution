package typings.sarif.mod.Result

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sarif.sarifStrings.notApplicable
  - typings.sarif.sarifStrings.pass
  - typings.sarif.sarifStrings.fail
  - typings.sarif.sarifStrings.review
  - typings.sarif.sarifStrings.open
  - typings.sarif.sarifStrings.informational
*/
trait kind extends js.Object

object kind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fail: typings.sarif.sarifStrings.fail = this.cast("fail")
  @scala.inline
  def informational: typings.sarif.sarifStrings.informational = this.cast("informational")
  @scala.inline
  def notApplicable: typings.sarif.sarifStrings.notApplicable = this.cast("notApplicable")
  @scala.inline
  def open: typings.sarif.sarifStrings.open = this.cast("open")
  @scala.inline
  def pass: typings.sarif.sarifStrings.pass = this.cast("pass")
  @scala.inline
  def review: typings.sarif.sarifStrings.review = this.cast("review")
}

