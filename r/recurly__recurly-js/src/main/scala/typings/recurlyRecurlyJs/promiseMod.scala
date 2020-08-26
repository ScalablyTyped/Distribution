package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.errorMod.RecurlyError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@recurly/recurly-js/lib/pricing/promise", JSImport.Namespace)
@js.native
object promiseMod extends js.Object {
  @js.native
  trait PricingPromise[T, PricingMethods]
    extends js.Promise[T] {
    /**
      * Attaches a callback for only the rejection of the PricingPromise.
      * @returns A PricingPromise for the completion of the callback.
      */
    def `catch`[TResult](): (PricingPromise[T | TResult, PricingMethods]) with PricingMethods = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ RecurlyError, TResult | js.Thenable[TResult]]): (PricingPromise[T | TResult, PricingMethods]) with PricingMethods = js.native
    // Extensions specific to then/promise
    /**
      * Attaches callbacks for the resolution and/or rejection of the PricingPromise, without returning a new promise.
      */
    def done(): T = js.native
    def done(onfulfilled: js.UndefOr[scala.Nothing], onrejected: js.Function1[/* reason */ js.Any, _]): T = js.native
    def done(onfulfilled: js.Function1[/* value */ T, _]): T = js.native
    def done(onfulfilled: js.Function1[/* value */ T, _], onrejected: js.Function1[/* reason */ js.Any, _]): T = js.native
    /**
      * Attaches callbacks for the resolution and/or rejection of the PricingPromise.
      * @returns A PricingPromise for the completion of which ever callback is executed.
      */
    def `then`[TResult1, TResult2](): (PricingPromise[TResult1 | TResult2, PricingMethods]) with PricingMethods = js.native
    def `then`[TResult1, TResult2](onfulfilled: PricingMethods): (PricingPromise[TResult1 | TResult2, PricingMethods]) with PricingMethods = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: PricingMethods,
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): (PricingPromise[TResult1 | TResult2, PricingMethods]) with PricingMethods = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): (PricingPromise[TResult1 | TResult2, PricingMethods]) with PricingMethods = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): (PricingPromise[TResult1 | TResult2, PricingMethods]) with PricingMethods = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): (PricingPromise[TResult1 | TResult2, PricingMethods]) with PricingMethods = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): (PricingPromise[TResult1 | TResult2, PricingMethods]) with PricingMethods = js.native
  }
  
}

