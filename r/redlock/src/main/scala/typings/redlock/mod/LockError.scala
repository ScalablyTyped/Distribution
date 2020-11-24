package typings.redlock.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This error is returned when there is an error locking a resource.
  */
@JSImport("redlock", "LockError")
@js.native
class LockError () extends Error {
  def this(message: String) = this()
  
  var attempts: Double = js.native
  
  @JSName("name")
  val name_LockError: typings.redlock.redlockStrings.LockError = js.native
}
