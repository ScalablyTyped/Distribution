package typings.rxjs

import typings.std.PromiseConstructorLike
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  object config {
    
    @JSImport("rxjs/internal/config", "config")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The promise constructor used by default for methods such as
      * {@link toPromise} and {@link forEach}
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rxjs/internal/config", "config.Promise")
    @js.native
    class Promise[T] protected ()
      extends StObject
         with PromiseLike[T] {
      def this(executor: js.Function2[
                /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
                Unit
              ]) = this()
    }
    /**
      * The promise constructor used by default for methods such as
      * {@link toPromise} and {@link forEach}
      */
    @JSImport("rxjs/internal/config", "config.Promise")
    @js.native
    def Promise: PromiseConstructorLike = js.native
    inline def Promise_=(x: PromiseConstructorLike): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
    
    /**
      * If true, turns on synchronous error rethrowing, which is a deprecated behavior
      * in v6 and higher. This behavior enables bad patterns like wrapping a subscribe
      * call in a try/catch block. It also enables producer interference, a nasty bug
      * where a multicast can be broken for all observers by a downstream consumer with
      * an unhandled error. DO NOT USE THIS FLAG UNLESS IT'S NEEDED TO BY TIME
      * FOR MIGRATION REASONS.
      */
    @JSImport("rxjs/internal/config", "config.useDeprecatedSynchronousErrorHandling")
    @js.native
    def useDeprecatedSynchronousErrorHandling: Boolean = js.native
    inline def useDeprecatedSynchronousErrorHandling_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useDeprecatedSynchronousErrorHandling")(x.asInstanceOf[js.Any])
  }
}
