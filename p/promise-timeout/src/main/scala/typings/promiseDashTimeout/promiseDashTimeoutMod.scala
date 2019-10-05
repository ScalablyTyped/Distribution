package typings.promiseDashTimeout

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-timeout", JSImport.Namespace)
@js.native
object promiseDashTimeoutMod extends js.Object {
  @js.native
  class TimeoutError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  def timeout[T](promise: js.Promise[T], timeoutMillis: Double): js.Promise[T] = js.native
}

