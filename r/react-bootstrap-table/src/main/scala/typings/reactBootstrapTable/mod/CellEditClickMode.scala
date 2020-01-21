package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactBootstrapTable.reactBootstrapTableStrings.none
  - typings.reactBootstrapTable.reactBootstrapTableStrings.click
  - typings.reactBootstrapTable.reactBootstrapTableStrings.dbclick
*/
trait CellEditClickMode extends js.Object

object CellEditClickMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typings.reactBootstrapTable.reactBootstrapTableStrings.click = this.cast("click")
  @scala.inline
  def dbclick: typings.reactBootstrapTable.reactBootstrapTableStrings.dbclick = this.cast("dbclick")
  @scala.inline
  def none: typings.reactBootstrapTable.reactBootstrapTableStrings.none = this.cast("none")
}

