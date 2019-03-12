package typings
package atReduxDashSagaDeferredLib.atReduxDashSagaDeferredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deferred[R] extends js.Object {
  var promise: js.Promise[R]
  def reject(error: js.Any): scala.Unit
  def resolve(result: R): scala.Unit
}

object Deferred {
  @scala.inline
  def apply[R](promise: js.Promise[R], reject: js.Any => scala.Unit, resolve: R => scala.Unit): Deferred[R] = {
    val __obj = js.Dynamic.literal(promise = promise, reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
  
    __obj.asInstanceOf[Deferred[R]]
  }
}

