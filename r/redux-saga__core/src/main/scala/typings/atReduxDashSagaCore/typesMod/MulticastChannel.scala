package typings.atReduxDashSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MulticastChannel[T] extends js.Object {
  def close(): Unit = js.native
  def put(message: T): Unit = js.native
  def put(message: END): Unit = js.native
  def take(cb: js.Function1[/* message */ T | END, Unit]): Unit = js.native
  def take(
    cb: js.Function1[/* message */ T | END, Unit],
    matcher: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Predicate<T> */ js.Any
  ): Unit = js.native
}

@JSImport("@redux-saga/core/types", "multicastChannel")
@js.native
object multicastChannel extends js.Object {
  def apply[T](): MulticastChannel[T] = js.native
}

