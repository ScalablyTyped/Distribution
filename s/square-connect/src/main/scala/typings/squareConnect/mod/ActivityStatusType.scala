package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareConnect.squareConnectStrings.ACTIVE
  - typings.squareConnect.squareConnectStrings.INACTIVE
*/
trait ActivityStatusType extends js.Object

object ActivityStatusType {
  @scala.inline
  def ACTIVE: typings.squareConnect.squareConnectStrings.ACTIVE = this.cast("ACTIVE")
  @scala.inline
  def INACTIVE: typings.squareConnect.squareConnectStrings.INACTIVE = this.cast("INACTIVE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

