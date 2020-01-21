package typings.rcTable.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcTable.rcTableStrings.left
  - typings.rcTable.rcTableStrings.middle
  - typings.rcTable.rcTableStrings.right
  - typings.rcTable.rcTableStrings.both
*/
trait ScrollPosition extends js.Object

object ScrollPosition {
  @scala.inline
  def both: typings.rcTable.rcTableStrings.both = this.cast("both")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.rcTable.rcTableStrings.left = this.cast("left")
  @scala.inline
  def middle: typings.rcTable.rcTableStrings.middle = this.cast("middle")
  @scala.inline
  def right: typings.rcTable.rcTableStrings.right = this.cast("right")
}

