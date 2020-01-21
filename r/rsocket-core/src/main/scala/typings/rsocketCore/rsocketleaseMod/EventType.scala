package typings.rsocketCore.rsocketleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rsocketCore.rsocketCoreStrings.Accept
  - typings.rsocketCore.rsocketCoreStrings.Reject
  - typings.rsocketCore.rsocketCoreStrings.Terminate
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def Accept: typings.rsocketCore.rsocketCoreStrings.Accept = this.cast("Accept")
  @scala.inline
  def Reject: typings.rsocketCore.rsocketCoreStrings.Reject = this.cast("Reject")
  @scala.inline
  def Terminate: typings.rsocketCore.rsocketCoreStrings.Terminate = this.cast("Terminate")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

