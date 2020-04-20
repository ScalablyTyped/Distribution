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
  def fail: typings.sarif.sarifStrings.fail = "fail".asInstanceOf[typings.sarif.sarifStrings.fail]
  @scala.inline
  def informational: typings.sarif.sarifStrings.informational = "informational".asInstanceOf[typings.sarif.sarifStrings.informational]
  @scala.inline
  def notApplicable: typings.sarif.sarifStrings.notApplicable = "notApplicable".asInstanceOf[typings.sarif.sarifStrings.notApplicable]
  @scala.inline
  def open: typings.sarif.sarifStrings.open = "open".asInstanceOf[typings.sarif.sarifStrings.open]
  @scala.inline
  def pass: typings.sarif.sarifStrings.pass = "pass".asInstanceOf[typings.sarif.sarifStrings.pass]
  @scala.inline
  def review: typings.sarif.sarifStrings.review = "review".asInstanceOf[typings.sarif.sarifStrings.review]
}

