package typings.redlock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redlockStrings {
  
  @scala.inline
  def LockError: LockError = "LockError".asInstanceOf[LockError]
  
  @scala.inline
  def clientError: clientError = "clientError".asInstanceOf[clientError]
  
  @js.native
  sealed trait LockError extends js.Object
  
  @js.native
  sealed trait clientError extends js.Object
}
