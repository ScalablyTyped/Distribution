package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareConnect.squareConnectStrings.PROPOSED
  - typings.squareConnect.squareConnectStrings.RESERVED
  - typings.squareConnect.squareConnectStrings.PREPARED
  - typings.squareConnect.squareConnectStrings.COMPLETED
  - typings.squareConnect.squareConnectStrings.CANCELED
  - typings.squareConnect.squareConnectStrings.FAILED
*/
trait FulfillmentStateType extends js.Object

object FulfillmentStateType {
  @scala.inline
  def CANCELED: typings.squareConnect.squareConnectStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def COMPLETED: typings.squareConnect.squareConnectStrings.COMPLETED = this.cast("COMPLETED")
  @scala.inline
  def FAILED: typings.squareConnect.squareConnectStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def PREPARED: typings.squareConnect.squareConnectStrings.PREPARED = this.cast("PREPARED")
  @scala.inline
  def PROPOSED: typings.squareConnect.squareConnectStrings.PROPOSED = this.cast("PROPOSED")
  @scala.inline
  def RESERVED: typings.squareConnect.squareConnectStrings.RESERVED = this.cast("RESERVED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

