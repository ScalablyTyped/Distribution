package typings.prex

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferredMod {
  
  @JSImport("prex/out/lib/deferred", "Deferred")
  @js.native
  /**
    * Initializes a new instance of the Deferred class.
    */
  open class Deferred[T] () extends StObject {
    
    /* private */ var _callback: Any = js.native
    
    /* private */ var _promise: Any = js.native
    
    /* private */ var _reject: Any = js.native
    
    /* private */ var _resolve: Any = js.native
    
    /**
      * Gets a NodeJS-style callback that can be used to resolve or reject the promise.
      */
    def callback: (js.Function2[/* err */ js.UndefOr[js.Error | Null], /* value */ T, Unit]) | (js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) = js.native
    
    /**
      * Creates a NodeJS-style callback that can be used to resolve or reject the promise with multiple values.
      */
    def createCallback[A /* <: js.Array[Any] */](selector: js.Function1[/* args */ A, T]): js.Function2[/* err */ js.UndefOr[js.Error | Null], /* args */ A, Unit] = js.native
    
    /**
      * Gets the promise.
      */
    def promise: js.Promise[T] = js.native
    
    /**
      * Gets the callback used to reject the promise.
      */
    def reject: js.Function1[/* reason */ Any, Unit] = js.native
    
    /**
      * Gets the callback used to resolve the promise.
      */
    def resolve: js.Function1[/* value */ js.UndefOr[T | PromiseLike[T]], Unit] = js.native
  }
}
