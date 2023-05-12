package typings.promiseDeferred

import typings.std.PromiseConstructor
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @example
  * import Deferred = require('promise-deferred');
  * const deferred = new Deferred<string>();
  *
  * // set up handlers
  * deferred.promise.then((value) => {}, (error) => {});
  *
  * // resolve
  * deferred.resolve('a value');
  *
  * // reject
  * deferred.reject(new Error('oh noes'));
  */
object mod {
  
  // eslint-disable-next-line no-unnecessary-generics
  inline def apply[T](): Deferred[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Deferred[T]]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("promise-deferred", JSImport.Namespace)
  @js.native
  // eslint-disable-next-line no-unnecessary-generics
  open class ^[T] ()
    extends StObject
       with Deferred[T]
  @JSImport("promise-deferred", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("promise-deferred", "Promise")
  @js.native
  open class Promise[T] protected ()
    extends StObject
       with typings.std.Promise[T] {
    /**
      * Creates a new Promise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used to resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    /* standard es2015.promise */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ T | PromiseLike[T], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ]) = this()
  }
  @JSImport("promise-deferred", "Promise")
  @js.native
  def Promise: PromiseConstructor = js.native
  inline def Promise_=(x: PromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Deferred[T] extends StObject {
    
    val promise: js.Promise[T] = js.native
    
    def reject(): Unit = js.native
    def reject(reason: Any): Unit = js.native
    
    def resolve(value: T): Unit = js.native
    def resolve(value: PromiseLike[T]): Unit = js.native
  }
}
