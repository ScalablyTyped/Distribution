package typings.promiseDotPrototypeDotFinally.promiseDotPrototypeDotFinallyMod

import typings.promiseDotPrototypeDotFinally.promiseDotPrototypeDotFinallyMod.Global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise.prototype.finally", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T, U](promise: Promise[T]): Promise[T] = js.native
  def apply[T, U](promise: Promise[T], onFinally: js.Function0[U | js.Thenable[U]]): Promise[T] = js.native
  def shim(): Unit = js.native
}

