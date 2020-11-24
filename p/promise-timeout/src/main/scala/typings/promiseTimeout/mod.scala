package typings.promiseTimeout

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-timeout", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def timeout[T](promise: js.Promise[T], timeoutMillis: Double): js.Promise[T] = js.native
  
  @js.native
  class TimeoutError () extends Error
}
