package typings.rcTable.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcTable.rcTableStrings.left
  - typings.rcTable.rcTableStrings.center
  - typings.rcTable.rcTableStrings.right
*/
trait AlignType extends js.Object

object AlignType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.rcTable.rcTableStrings.center = this.cast("center")
  @scala.inline
  def left: typings.rcTable.rcTableStrings.left = this.cast("left")
  @scala.inline
  def right: typings.rcTable.rcTableStrings.right = this.cast("right")
}

