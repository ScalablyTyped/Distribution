package typings.rxjs

import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.PartialObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toSubscriberMod {
  
  @JSImport("rxjs/internal/util/toSubscriber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def toSubscriber[T](): Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")().asInstanceOf[Subscriber[T]]
  @scala.inline
  def toSubscriber[T](nextOrObserver: js.Function1[/* value */ T, Unit]): Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any]).asInstanceOf[Subscriber[T]]
  @scala.inline
  def toSubscriber[T](nextOrObserver: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  @scala.inline
  def toSubscriber[T](
    nextOrObserver: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  @scala.inline
  def toSubscriber[T](nextOrObserver: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  @scala.inline
  def toSubscriber[T](nextOrObserver: Unit, error: js.Function1[/* error */ js.Any, Unit]): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  @scala.inline
  def toSubscriber[T](nextOrObserver: Unit, error: js.Function1[/* error */ js.Any, Unit], complete: js.Function0[Unit]): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  @scala.inline
  def toSubscriber[T](nextOrObserver: Unit, error: Unit, complete: js.Function0[Unit]): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  @scala.inline
  def toSubscriber[T](nextOrObserver: PartialObserver[T]): Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any]).asInstanceOf[Subscriber[T]]
  @scala.inline
  def toSubscriber[T](nextOrObserver: PartialObserver[T], error: js.Function1[/* error */ js.Any, Unit]): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  @scala.inline
  def toSubscriber[T](
    nextOrObserver: PartialObserver[T],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  @scala.inline
  def toSubscriber[T](nextOrObserver: PartialObserver[T], error: Unit, complete: js.Function0[Unit]): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSubscriber")(nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
}
