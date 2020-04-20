package typings.sarif.mod.Result

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sarif.sarifStrings.none
  - typings.sarif.sarifStrings.note
  - typings.sarif.sarifStrings.warning
  - typings.sarif.sarifStrings.error
*/
trait level extends js.Object

object level {
  @scala.inline
  def error: typings.sarif.sarifStrings.error = "error".asInstanceOf[typings.sarif.sarifStrings.error]
  @scala.inline
  def none: typings.sarif.sarifStrings.none = "none".asInstanceOf[typings.sarif.sarifStrings.none]
  @scala.inline
  def note: typings.sarif.sarifStrings.note = "note".asInstanceOf[typings.sarif.sarifStrings.note]
  @scala.inline
  def warning: typings.sarif.sarifStrings.warning = "warning".asInstanceOf[typings.sarif.sarifStrings.warning]
}

