package typings.recurlyRecurlyJs

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pricing/promise", JSImport.Namespace)
@js.native
object promiseMod extends js.Object {
  /**
    * Represents the completion of an asynchronous operation
    */
  @js.native
  trait PricingPromise[T, PricingMethods] extends Promise[T] {
    /**
      * Attaches callbacks for the resolution and/or rejection of the PricingPromise, without returning a new promise.
      * @param onfulfilled The callback to execute when the PricingPromise is resolved.
      * @param onrejected The callback to execute when the PricingPromise is rejected.
      */
    def done(): T = js.native
    def done(onfulfilled: js.Function1[/* value */ T, _]): T = js.native
    def done(onfulfilled: js.Function1[/* value */ T, _], onrejected: js.Function1[/* reason */ js.Any, _]): T = js.native
  }
  
}

