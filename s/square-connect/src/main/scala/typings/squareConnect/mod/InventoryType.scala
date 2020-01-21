package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareConnect.squareConnectStrings.PHYSICAL_COUNT
  - typings.squareConnect.squareConnectStrings.ADJUSTMENT
  - typings.squareConnect.squareConnectStrings.TRANSFER
*/
trait InventoryType extends js.Object

object InventoryType {
  @scala.inline
  def ADJUSTMENT: typings.squareConnect.squareConnectStrings.ADJUSTMENT = this.cast("ADJUSTMENT")
  @scala.inline
  def PHYSICAL_COUNT: typings.squareConnect.squareConnectStrings.PHYSICAL_COUNT = this.cast("PHYSICAL_COUNT")
  @scala.inline
  def TRANSFER: typings.squareConnect.squareConnectStrings.TRANSFER = this.cast("TRANSFER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

