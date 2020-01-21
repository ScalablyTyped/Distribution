package typings.sarif.mod.ThreadFlowLocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sarif.sarifStrings.important
  - typings.sarif.sarifStrings.essential
  - typings.sarif.sarifStrings.unimportant
*/
trait importance extends js.Object

object importance {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def essential: typings.sarif.sarifStrings.essential = this.cast("essential")
  @scala.inline
  def important: typings.sarif.sarifStrings.important = this.cast("important")
  @scala.inline
  def unimportant: typings.sarif.sarifStrings.unimportant = this.cast("unimportant")
}

