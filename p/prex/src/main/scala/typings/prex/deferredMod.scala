package typings.prex

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/deferred", JSImport.Namespace)
@js.native
object deferredMod extends js.Object {
  @js.native
  /**
    * Initializes a new instance of the Deferred class.
    */
  class Deferred[T] () extends js.Object {
    var _callback: js.UndefOr[js.Any] = js.native
    var _promise: js.Any = js.native
    var _reject: js.Any = js.native
    var _resolve: js.Any = js.native
    /**
      * Gets a NodeJS-style callback that can be used to resolve or reject the promise.
      */
    val callback: (js.Function2[/* err */ js.UndefOr[Error | Null], /* value */ T, Unit]) | (js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) = js.native
    /**
      * Gets the promise.
      */
    val promise: js.Promise[T] = js.native
    /**
      * Creates a NodeJS-style callback that can be used to resolve or reject the promise with multiple values.
      */
    def createCallback[A /* <: js.Array[_] */](selector: js.Function1[/* args */ A, T]): js.Function2[/* err */ js.UndefOr[Error | Null], /* args */ A, Unit] = js.native
    /**
      * Gets the callback used to reject the promise.
      */
    def reject(reason: js.Any): Unit = js.native
    /**
      * Gets the callback used to resolve the promise.
      */
    def resolve(): Unit = js.native
    def resolve(value: T): Unit = js.native
    def resolve(value: js.Thenable[T]): Unit = js.native
  }
  
}

