package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareDashConnect.squareDashConnectStrings.OPEN
  - typings.squareDashConnect.squareDashConnectStrings.COMPLETED
  - typings.squareDashConnect.squareDashConnectStrings.CANCELED
*/
trait OrderStateType extends js.Object

object OrderStateType {
  @scala.inline
  def CANCELED: typings.squareDashConnect.squareDashConnectStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def COMPLETED: typings.squareDashConnect.squareDashConnectStrings.COMPLETED = this.cast("COMPLETED")
  @scala.inline
  def OPEN: typings.squareDashConnect.squareDashConnectStrings.OPEN = this.cast("OPEN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

