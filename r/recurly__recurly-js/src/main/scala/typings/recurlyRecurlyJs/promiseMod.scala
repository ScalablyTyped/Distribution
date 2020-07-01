package typings.recurlyRecurlyJs

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@recurly/recurly-js/lib/pricing/promise", JSImport.Namespace)
@js.native
object promiseMod extends js.Object {
  @js.native
  trait PricingPromise[T, PricingMethods] extends Promise[T] {
    // Extensions specific to then/promise
    /**
      * Attaches callbacks for the resolution and/or rejection of the PricingPromise, without returning a new promise.
      */
    def done(): T = js.native
    def done(onfulfilled: js.Function1[/* value */ T, _]): T = js.native
    def done(onfulfilled: js.Function1[/* value */ T, _], onrejected: js.Function1[/* reason */ js.Any, _]): T = js.native
    def `then`[TResult1, TResult2](onfulfilled: PricingMethods): (PricingPromise[TResult1 | TResult2, PricingMethods]) with PricingMethods = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: PricingMethods,
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): (PricingPromise[TResult1 | TResult2, PricingMethods]) with PricingMethods = js.native
  }
  
}

