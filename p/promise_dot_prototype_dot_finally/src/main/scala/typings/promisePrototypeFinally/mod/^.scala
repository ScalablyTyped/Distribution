package typings.promisePrototypeFinally.mod

import typings.promisePrototypeFinally.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise.prototype.finally", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T, U](promise: Promise[T]): Promise[T] = js.native
  def apply[T, U](promise: Promise[T], onFinally: js.Function0[U | js.Thenable[U]]): Promise[T] = js.native
}

