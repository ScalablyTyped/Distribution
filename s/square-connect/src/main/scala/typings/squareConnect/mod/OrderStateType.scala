package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareConnect.squareConnectStrings.OPEN
  - typings.squareConnect.squareConnectStrings.COMPLETED
  - typings.squareConnect.squareConnectStrings.CANCELED
*/
trait OrderStateType extends js.Object

object OrderStateType {
  @scala.inline
  def CANCELED: typings.squareConnect.squareConnectStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def COMPLETED: typings.squareConnect.squareConnectStrings.COMPLETED = this.cast("COMPLETED")
  @scala.inline
  def OPEN: typings.squareConnect.squareConnectStrings.OPEN = this.cast("OPEN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

