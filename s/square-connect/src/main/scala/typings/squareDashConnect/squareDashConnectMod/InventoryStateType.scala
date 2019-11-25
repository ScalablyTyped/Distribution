package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareDashConnect.squareDashConnectStrings.CUSTOM
  - typings.squareDashConnect.squareDashConnectStrings.IN_STOCK
  - typings.squareDashConnect.squareDashConnectStrings.SOLD
  - typings.squareDashConnect.squareDashConnectStrings.RETURNED_BY_CUSTOMER
  - typings.squareDashConnect.squareDashConnectStrings.RESERVED_FOR_SALE
  - typings.squareDashConnect.squareDashConnectStrings.SOLD_ONLINE
  - typings.squareDashConnect.squareDashConnectStrings.ORDERED_FROM_VENDOR
  - typings.squareDashConnect.squareDashConnectStrings.RECEIVED_FROM_VENDOR
  - typings.squareDashConnect.squareDashConnectStrings.IN_TRANSIT_TO
  - typings.squareDashConnect.squareDashConnectStrings.NONE
  - typings.squareDashConnect.squareDashConnectStrings.WASTE
  - typings.squareDashConnect.squareDashConnectStrings.UNLINKED_RETURN
*/
trait InventoryStateType extends js.Object

object InventoryStateType {
  @scala.inline
  def CUSTOM: typings.squareDashConnect.squareDashConnectStrings.CUSTOM = this.cast("CUSTOM")
  @scala.inline
  def IN_STOCK: typings.squareDashConnect.squareDashConnectStrings.IN_STOCK = this.cast("IN_STOCK")
  @scala.inline
  def IN_TRANSIT_TO: typings.squareDashConnect.squareDashConnectStrings.IN_TRANSIT_TO = this.cast("IN_TRANSIT_TO")
  @scala.inline
  def NONE: typings.squareDashConnect.squareDashConnectStrings.NONE = this.cast("NONE")
  @scala.inline
  def ORDERED_FROM_VENDOR: typings.squareDashConnect.squareDashConnectStrings.ORDERED_FROM_VENDOR = this.cast("ORDERED_FROM_VENDOR")
  @scala.inline
  def RECEIVED_FROM_VENDOR: typings.squareDashConnect.squareDashConnectStrings.RECEIVED_FROM_VENDOR = this.cast("RECEIVED_FROM_VENDOR")
  @scala.inline
  def RESERVED_FOR_SALE: typings.squareDashConnect.squareDashConnectStrings.RESERVED_FOR_SALE = this.cast("RESERVED_FOR_SALE")
  @scala.inline
  def RETURNED_BY_CUSTOMER: typings.squareDashConnect.squareDashConnectStrings.RETURNED_BY_CUSTOMER = this.cast("RETURNED_BY_CUSTOMER")
  @scala.inline
  def SOLD: typings.squareDashConnect.squareDashConnectStrings.SOLD = this.cast("SOLD")
  @scala.inline
  def SOLD_ONLINE: typings.squareDashConnect.squareDashConnectStrings.SOLD_ONLINE = this.cast("SOLD_ONLINE")
  @scala.inline
  def UNLINKED_RETURN: typings.squareDashConnect.squareDashConnectStrings.UNLINKED_RETURN = this.cast("UNLINKED_RETURN")
  @scala.inline
  def WASTE: typings.squareDashConnect.squareDashConnectStrings.WASTE = this.cast("WASTE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

