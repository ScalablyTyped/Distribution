package typings.rxjs

import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.PartialObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toSubscriberMod {
  
  @JSImport("rxjs/internal/util/toSubscriber", "toSubscriber")
  @js.native
  def toSubscriber[T](): Subscriber[T] = js.native
  @JSImport("rxjs/internal/util/toSubscriber", "toSubscriber")
  @js.native
  def toSubscriber[T](
    nextOrObserver: js.UndefOr[scala.Nothing],
    error: js.UndefOr[scala.Nothing],
    complete: js.Function0[Unit]
  ): Subscriber[T] = js.native
  @JSImport("rxjs/internal/util/toSubscriber", "toSubscriber")
  @js.native
  def toSubscriber[T](nextOrObserver: js.UndefOr[scala.Nothing], error: js.Function1[/* error */ js.Any, Unit]): Subscriber[T] = js.native
  @JSImport("rxjs/internal/util/toSubscriber", "toSubscriber")
  @js.native
  def toSubscriber[T](
    nextOrObserver: js.UndefOr[scala.Nothing],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Subscriber[T] = js.native
  @JSImport("rxjs/internal/util/toSubscriber", "toSubscriber")
  @js.native
  def toSubscriber[T](nextOrObserver: js.Function1[/* value */ T, Unit]): Subscriber[T] = js.native
  @JSImport("rxjs/internal/util/toSubscriber", "toSubscriber")
  @js.native
  def toSubscriber[T](
    nextOrObserver: js.Function1[/* value */ T, Unit],
    error: js.UndefOr[scala.Nothing],
    complete: js.Function0[Unit]
  ): Subscriber[T] = js.native
  @JSImport("rxjs/internal/util/toSubscriber", "toSubscriber")
  @js.native
  def toSubscriber[T](nextOrObserver: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): Subscriber[T] = js.native
  @JSImport("rxjs/internal/util/toSubscriber", "toSubscriber")
  @js.native
  def toSubscriber[T](
    nextOrObserver: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Subscriber[T] = js.native
  @JSImport("rxjs/internal/util/toSubscriber", "toSubscriber")
  @js.native
  def toSubscriber[T](nextOrObserver: PartialObserver[T]): Subscriber[T] = js.native
  @JSImport("rxjs/internal/util/toSubscriber", "toSubscriber")
  @js.native
  def toSubscriber[T](nextOrObserver: PartialObserver[T], error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): Subscriber[T] = js.native
  @JSImport("rxjs/internal/util/toSubscriber", "toSubscriber")
  @js.native
  def toSubscriber[T](nextOrObserver: PartialObserver[T], error: js.Function1[/* error */ js.Any, Unit]): Subscriber[T] = js.native
  @JSImport("rxjs/internal/util/toSubscriber", "toSubscriber")
  @js.native
  def toSubscriber[T](
    nextOrObserver: PartialObserver[T],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Subscriber[T] = js.native
}
