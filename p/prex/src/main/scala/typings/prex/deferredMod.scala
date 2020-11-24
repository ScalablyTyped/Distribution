package typings.prex

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prex/out/lib/deferred", JSImport.Namespace)
@js.native
object deferredMod extends js.Object {
  
  @js.native
  /**
    * Initializes a new instance of the Deferred class.
    */
  class Deferred[T] () extends js.Object {
    
    var _callback: js.Any = js.native
    
    var _promise: js.Any = js.native
    
    var _reject: js.Any = js.native
    
    var _resolve: js.Any = js.native
    
    /**
      * Gets a NodeJS-style callback that can be used to resolve or reject the promise.
      */
    def callback: (js.Function2[/* err */ js.UndefOr[Error | Null], /* value */ T, Unit]) | (js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) = js.native
    
    /**
      * Creates a NodeJS-style callback that can be used to resolve or reject the promise with multiple values.
      */
    def createCallback[A /* <: js.Array[_] */](selector: js.Function1[/* args */ A, T]): js.Function2[/* err */ js.UndefOr[Error | Null], /* args */ A, Unit] = js.native
    
    /**
      * Gets the promise.
      */
    def promise: js.Promise[T] = js.native
    
    /**
      * Gets the callback used to reject the promise.
      */
    def reject: js.Function1[/* reason */ js.Any, Unit] = js.native
    
    /**
      * Gets the callback used to resolve the promise.
      */
    def resolve: js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit] = js.native
  }
}
