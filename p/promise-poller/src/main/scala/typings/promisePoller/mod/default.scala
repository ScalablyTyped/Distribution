package typings.promisePoller.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-poller", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[T](options: PromisePollerOptions[T]): js.Promise[T] = js.native
}

