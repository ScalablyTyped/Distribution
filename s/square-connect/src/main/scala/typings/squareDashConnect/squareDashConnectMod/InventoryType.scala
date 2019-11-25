package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareDashConnect.squareDashConnectStrings.PHYSICAL_COUNT
  - typings.squareDashConnect.squareDashConnectStrings.ADJUSTMENT
  - typings.squareDashConnect.squareDashConnectStrings.TRANSFER
*/
trait InventoryType extends js.Object

object InventoryType {
  @scala.inline
  def ADJUSTMENT: typings.squareDashConnect.squareDashConnectStrings.ADJUSTMENT = this.cast("ADJUSTMENT")
  @scala.inline
  def PHYSICAL_COUNT: typings.squareDashConnect.squareDashConnectStrings.PHYSICAL_COUNT = this.cast("PHYSICAL_COUNT")
  @scala.inline
  def TRANSFER: typings.squareDashConnect.squareDashConnectStrings.TRANSFER = this.cast("TRANSFER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

