package typings.rcDashTable.esInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcDashTable.rcDashTableStrings.left
  - typings.rcDashTable.rcDashTableStrings.middle
  - typings.rcDashTable.rcDashTableStrings.right
  - typings.rcDashTable.rcDashTableStrings.both
*/
trait ScrollPosition extends js.Object

object ScrollPosition {
  @scala.inline
  def both: typings.rcDashTable.rcDashTableStrings.both = this.cast("both")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.rcDashTable.rcDashTableStrings.left = this.cast("left")
  @scala.inline
  def middle: typings.rcDashTable.rcDashTableStrings.middle = this.cast("middle")
  @scala.inline
  def right: typings.rcDashTable.rcDashTableStrings.right = this.cast("right")
}

