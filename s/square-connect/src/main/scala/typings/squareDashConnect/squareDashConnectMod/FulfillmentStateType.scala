package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareDashConnect.squareDashConnectStrings.PROPOSED
  - typings.squareDashConnect.squareDashConnectStrings.RESERVED
  - typings.squareDashConnect.squareDashConnectStrings.PREPARED
  - typings.squareDashConnect.squareDashConnectStrings.COMPLETED
  - typings.squareDashConnect.squareDashConnectStrings.CANCELED
  - typings.squareDashConnect.squareDashConnectStrings.FAILED
*/
trait FulfillmentStateType extends js.Object

object FulfillmentStateType {
  @scala.inline
  def CANCELED: typings.squareDashConnect.squareDashConnectStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def COMPLETED: typings.squareDashConnect.squareDashConnectStrings.COMPLETED = this.cast("COMPLETED")
  @scala.inline
  def FAILED: typings.squareDashConnect.squareDashConnectStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def PREPARED: typings.squareDashConnect.squareDashConnectStrings.PREPARED = this.cast("PREPARED")
  @scala.inline
  def PROPOSED: typings.squareDashConnect.squareDashConnectStrings.PROPOSED = this.cast("PROPOSED")
  @scala.inline
  def RESERVED: typings.squareDashConnect.squareDashConnectStrings.RESERVED = this.cast("RESERVED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

