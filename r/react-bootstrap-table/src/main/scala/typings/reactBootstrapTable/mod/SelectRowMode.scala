package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactBootstrapTable.reactBootstrapTableStrings.none
  - typings.reactBootstrapTable.reactBootstrapTableStrings.radio
  - typings.reactBootstrapTable.reactBootstrapTableStrings.checkbox
*/
trait SelectRowMode extends js.Object

object SelectRowMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def checkbox: typings.reactBootstrapTable.reactBootstrapTableStrings.checkbox = this.cast("checkbox")
  @scala.inline
  def none: typings.reactBootstrapTable.reactBootstrapTableStrings.none = this.cast("none")
  @scala.inline
  def radio: typings.reactBootstrapTable.reactBootstrapTableStrings.radio = this.cast("radio")
}

