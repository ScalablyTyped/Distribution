package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareDashConnect.squareDashConnectStrings.NONE
  - typings.squareDashConnect.squareDashConnectStrings.LOW_QUANTITY
*/
trait InventoryAlertType extends js.Object

object InventoryAlertType {
  @scala.inline
  def LOW_QUANTITY: typings.squareDashConnect.squareDashConnectStrings.LOW_QUANTITY = this.cast("LOW_QUANTITY")
  @scala.inline
  def NONE: typings.squareDashConnect.squareDashConnectStrings.NONE = this.cast("NONE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

