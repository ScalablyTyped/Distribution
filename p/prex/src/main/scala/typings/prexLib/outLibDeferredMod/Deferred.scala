package typings
package prexLib.outLibDeferredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/deferred", "Deferred")
@js.native
class Deferred[T] () extends js.Object {
  var _promise: js.Any = js.native
  var _reject: js.Any = js.native
  var _resolve: js.Any = js.native
  /**
       * Gets the promise.
       */
  val promise: stdLib.Promise[T] = js.native
  /**
       * Rejects the promise.
       *
       * @param reason The reason the promise was rejected.
       */
  def reject(reason: js.Any): scala.Unit = js.native
  /**
       * Resolves the promise.
       *
       * @param value The value used to resolve the promise.
       */
  def resolve(): scala.Unit = js.native
  /**
       * Resolves the promise.
       *
       * @param value The value used to resolve the promise.
       */
  def resolve(value: T): scala.Unit = js.native
  /**
       * Resolves the promise.
       *
       * @param value The value used to resolve the promise.
       */
  def resolve(value: stdLib.PromiseLike[T]): scala.Unit = js.native
}

