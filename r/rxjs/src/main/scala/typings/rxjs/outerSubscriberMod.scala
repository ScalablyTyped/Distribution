package typings.rxjs

import typings.rxjs.innerSubscriberMod.InnerSubscriber
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.PartialObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outerSubscriberMod {
  
  @JSImport("rxjs/internal/OuterSubscriber", "OuterSubscriber")
  @js.native
  /**
    * @param {Observer|function(value: T): void} [destinationOrNext] A partially
    * defined Observer or a `next` callback function.
    * @param {function(e: ?any): void} [error] The `error` callback of an
    * Observer.
    * @param {function(): void} [complete] The `complete` callback of an
    * Observer.
    */
  class OuterSubscriber[T, R] () extends Subscriber[T] {
    def this(destinationOrNext: js.Function1[/* value */ T, Unit]) = this()
    def this(destinationOrNext: PartialObserver[_]) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(destinationOrNext: PartialObserver[_], error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: PartialObserver[_],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: PartialObserver[_],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    
    def notifyComplete(innerSub: InnerSubscriber[T, R]): Unit = js.native
    
    def notifyError(error: js.Any, innerSub: InnerSubscriber[T, R]): Unit = js.native
    
    def notifyNext(
      outerValue: T,
      innerValue: R,
      outerIndex: Double,
      innerIndex: Double,
      innerSub: InnerSubscriber[T, R]
    ): Unit = js.native
  }
}
