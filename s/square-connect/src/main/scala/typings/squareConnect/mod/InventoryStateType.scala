package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareConnect.squareConnectStrings.CUSTOM
  - typings.squareConnect.squareConnectStrings.IN_STOCK
  - typings.squareConnect.squareConnectStrings.SOLD
  - typings.squareConnect.squareConnectStrings.RETURNED_BY_CUSTOMER
  - typings.squareConnect.squareConnectStrings.RESERVED_FOR_SALE
  - typings.squareConnect.squareConnectStrings.SOLD_ONLINE
  - typings.squareConnect.squareConnectStrings.ORDERED_FROM_VENDOR
  - typings.squareConnect.squareConnectStrings.RECEIVED_FROM_VENDOR
  - typings.squareConnect.squareConnectStrings.IN_TRANSIT_TO
  - typings.squareConnect.squareConnectStrings.NONE
  - typings.squareConnect.squareConnectStrings.WASTE
  - typings.squareConnect.squareConnectStrings.UNLINKED_RETURN
*/
trait InventoryStateType extends js.Object

object InventoryStateType {
  @scala.inline
  def CUSTOM: typings.squareConnect.squareConnectStrings.CUSTOM = this.cast("CUSTOM")
  @scala.inline
  def IN_STOCK: typings.squareConnect.squareConnectStrings.IN_STOCK = this.cast("IN_STOCK")
  @scala.inline
  def IN_TRANSIT_TO: typings.squareConnect.squareConnectStrings.IN_TRANSIT_TO = this.cast("IN_TRANSIT_TO")
  @scala.inline
  def NONE: typings.squareConnect.squareConnectStrings.NONE = this.cast("NONE")
  @scala.inline
  def ORDERED_FROM_VENDOR: typings.squareConnect.squareConnectStrings.ORDERED_FROM_VENDOR = this.cast("ORDERED_FROM_VENDOR")
  @scala.inline
  def RECEIVED_FROM_VENDOR: typings.squareConnect.squareConnectStrings.RECEIVED_FROM_VENDOR = this.cast("RECEIVED_FROM_VENDOR")
  @scala.inline
  def RESERVED_FOR_SALE: typings.squareConnect.squareConnectStrings.RESERVED_FOR_SALE = this.cast("RESERVED_FOR_SALE")
  @scala.inline
  def RETURNED_BY_CUSTOMER: typings.squareConnect.squareConnectStrings.RETURNED_BY_CUSTOMER = this.cast("RETURNED_BY_CUSTOMER")
  @scala.inline
  def SOLD: typings.squareConnect.squareConnectStrings.SOLD = this.cast("SOLD")
  @scala.inline
  def SOLD_ONLINE: typings.squareConnect.squareConnectStrings.SOLD_ONLINE = this.cast("SOLD_ONLINE")
  @scala.inline
  def UNLINKED_RETURN: typings.squareConnect.squareConnectStrings.UNLINKED_RETURN = this.cast("UNLINKED_RETURN")
  @scala.inline
  def WASTE: typings.squareConnect.squareConnectStrings.WASTE = this.cast("WASTE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

