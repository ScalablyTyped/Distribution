package typings.atStorybookComponents.distFormInputInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atStorybookComponents.atStorybookComponentsStrings.valid
  - typings.atStorybookComponents.atStorybookComponentsStrings.error
  - typings.atStorybookComponents.atStorybookComponentsStrings.warn
*/
trait ValidationStates extends js.Object

object ValidationStates {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.atStorybookComponents.atStorybookComponentsStrings.error = this.cast("error")
  @scala.inline
  def valid: typings.atStorybookComponents.atStorybookComponentsStrings.valid = this.cast("valid")
  @scala.inline
  def warn: typings.atStorybookComponents.atStorybookComponentsStrings.warn = this.cast("warn")
}

