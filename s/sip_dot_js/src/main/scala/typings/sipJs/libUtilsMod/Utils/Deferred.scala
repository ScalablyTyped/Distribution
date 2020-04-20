package typings.sipJs.libUtilsMod.Utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deferred[T] extends js.Object {
  var promise: js.Promise[T]
  def reject(): T
  def resolve(): T
}

object Deferred {
  @scala.inline
  def apply[T](promise: js.Promise[T], reject: () => T, resolve: () => T): Deferred[T] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction0(reject), resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[Deferred[T]]
  }
}

