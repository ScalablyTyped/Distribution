package typings.scalike.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scalike", "Failure")
@js.native
object Failure extends js.Object {
  
  def apply[A](e: Error): Try[A] = js.native
}
