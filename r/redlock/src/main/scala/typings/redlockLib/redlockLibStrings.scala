package typings
package redlockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object redlockLibStrings {
  @js.native
  sealed trait LockError extends js.Object
  
  @js.native
  sealed trait clientError extends js.Object
  
  def LockError: LockError = "LockError".asInstanceOf[LockError]
  def clientError: clientError = "clientError".asInstanceOf[clientError]
}

