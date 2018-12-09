package typings
package prexLib.outLibDeferredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/deferred", "Deferred")
@js.native
class Deferred[T] () extends js.Object {
  var _callback: js.UndefOr[js.Any] = js.native
  var _promise: js.Any = js.native
  var _reject: js.Any = js.native
  var _resolve: js.Any = js.native
  /**
       * Gets a NodeJS-style callback that can be used to resolve or reject the promise.
       */
  val callback: (js.Function2[/* err */ js.UndefOr[stdLib.Error | scala.Null], /* value */ T, scala.Unit]) | (js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]) = js.native
  /**
       * Gets the promise.
       */
  val promise: stdLib.Promise[T] = js.native
  /**
       * Creates a NodeJS-style callback that can be used to resolve or reject the promise with multiple values.
       */
  def createCallback[A /* <: js.Array[_] */](selector: js.Function1[/* args */ A, T]): js.Function2[/* err */ js.UndefOr[stdLib.Error | scala.Null], /* args */ A, scala.Unit] = js.native
  /**
       * Gets the callback used to reject the promise.
       */
  def reject(reason: js.Any): scala.Unit = js.native
  /**
       * Gets the callback used to resolve the promise.
       */
  def resolve(): scala.Unit = js.native
  /**
       * Gets the callback used to resolve the promise.
       */
  def resolve(value: T): scala.Unit = js.native
  /**
       * Gets the callback used to resolve the promise.
       */
  def resolve(value: stdLib.PromiseLike[T]): scala.Unit = js.native
}

