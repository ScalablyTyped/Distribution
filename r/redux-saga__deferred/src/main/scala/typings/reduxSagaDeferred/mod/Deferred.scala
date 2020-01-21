package typings.reduxSagaDeferred.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deferred[R] extends js.Object {
  var promise: js.Promise[R]
  def reject(error: js.Any): Unit
  def resolve(result: R): Unit
}

object Deferred {
  @scala.inline
  def apply[R](promise: js.Promise[R], reject: js.Any => Unit, resolve: R => Unit): Deferred[R] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
  
    __obj.asInstanceOf[Deferred[R]]
  }
}

