package typings.recurlyRecurlyJs

import typings.std.Promise
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPricingPromiseMod {
  
  @js.native
  trait PricingPromise[T, PricingMethods]
    extends StObject
       with Promise[T] {
    
    // Extensions specific to then/promise
    /**
      * Attaches callbacks for the resolution and/or rejection of the PricingPromise, without returning a new promise.
      * @param onfulfilled The callback to execute when the PricingPromise is resolved.
      * @param onrejected The callback to execute when the PricingPromise is rejected.
      */
    def done(): T = js.native
    def done(onfulfilled: js.Function1[/* value */ T, Any]): T = js.native
    def done(onfulfilled: js.Function1[/* value */ T, Any], onrejected: js.Function1[/* reason */ Any, Any]): T = js.native
    def done(onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, Any]): T = js.native
    
    def `then`[TResult1, TResult2](onfulfilled: PricingMethods): (PricingPromise[TResult1 | TResult2, PricingMethods]) & PricingMethods = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: PricingMethods,
      onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
    ): (PricingPromise[TResult1 | TResult2, PricingMethods]) & PricingMethods = js.native
  }
}
