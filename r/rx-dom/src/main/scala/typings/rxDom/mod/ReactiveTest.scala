package typings.rxDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactiveTest {
  
  @JSImport("rx-dom", "ReactiveTest")
  @js.native
  val ^ : js.Any = js.native
  
  /** Default virtual time used for creation of observable sequences in unit tests. */
  @JSImport("rx-dom", "ReactiveTest.created")
  @js.native
  def created: Double = js.native
  @scala.inline
  def created_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("created")(x.asInstanceOf[js.Any])
  
  /** Default virtual time used to dispose subscriptions in unit tests. */
  @JSImport("rx-dom", "ReactiveTest.disposed")
  @js.native
  def disposed: Double = js.native
  @scala.inline
  def disposed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disposed")(x.asInstanceOf[js.Any])
  
  /**
    * Factory method for an OnCompleted notification record at a given time.
    *
    * @param ticks Recorded virtual time the OnCompleted notification occurs.
    * @return Recorded OnCompleted notification.
    */
  @JSImport("rx-dom", "ReactiveTest.onCompleted")
  @js.native
  def onCompleted(ticks: Double): typings.rx.Rx.Recorded = js.native
  
  /**
    * Factory method for an OnError notification record at a given time with a given error.
    *
    * 1 - ReactiveTest.onNext(200, new Error('error'));
    * 2 - ReactiveTest.onNext(200, function (e) { return e.message === 'error'; });
    *
    * @param ticks Recorded virtual time the OnError notification occurs.
    * @param exception Recorded exception stored in the OnError notification.
    * @return Recorded OnError notification.
    */
  @JSImport("rx-dom", "ReactiveTest.onError")
  @js.native
  def onError(ticks: Double, exception: js.Any): typings.rx.Rx.Recorded = js.native
  /**
    * Factory method for an OnError notification record at a given time with a given error.
    *
    * 1 - ReactiveTest.onNext(200, new Error('error'));
    * 2 - ReactiveTest.onNext(200, function (e) { return e.message === 'error'; });
    *
    * @param ticks Recorded virtual time the OnError notification occurs.
    * @param exception Recorded exception stored in the OnError notification.
    * @return Recorded OnError notification.
    */
  @JSImport("rx-dom", "ReactiveTest.onError")
  @js.native
  def onError(ticks: Double, predicate: js.Function1[/* exception */ js.Any, Boolean]): typings.rx.Rx.Recorded = js.native
  
  /**
    * Factory method for an OnNext notification record at a given time with a given value or a predicate function.
    *
    * 1 - ReactiveTest.onNext(200, 42);
    * 2 - ReactiveTest.onNext(200, function (x) { return x.length == 2; });
    *
    * @param ticks Recorded virtual time the OnNext notification occurs.
    * @param value Recorded value stored in the OnNext notification or a predicate.
    * @return Recorded OnNext notification.
    */
  @JSImport("rx-dom", "ReactiveTest.onNext")
  @js.native
  def onNext(ticks: Double, predicate: js.Function1[/* value */ js.Any, Boolean]): typings.rx.Rx.Recorded = js.native
  /**
    * Factory method for an OnNext notification record at a given time with a given value or a predicate function.
    *
    * 1 - ReactiveTest.onNext(200, 42);
    * 2 - ReactiveTest.onNext(200, function (x) { return x.length == 2; });
    *
    * @param ticks Recorded virtual time the OnNext notification occurs.
    * @param value Recorded value stored in the OnNext notification or a predicate.
    * @return Recorded OnNext notification.
    */
  @JSImport("rx-dom", "ReactiveTest.onNext")
  @js.native
  def onNext(ticks: Double, value: js.Any): typings.rx.Rx.Recorded = js.native
  
  /**
    * Factory method for a subscription record based on a given subscription and disposal time.
    *
    * @param start Virtual time indicating when the subscription was created.
    * @param end Virtual time indicating when the subscription was disposed.
    * @return Subscription object.
    */
  @JSImport("rx-dom", "ReactiveTest.subscribe")
  @js.native
  def subscribe(subscribeAt: Double): typings.rx.Rx.Subscription = js.native
  @JSImport("rx-dom", "ReactiveTest.subscribe")
  @js.native
  def subscribe(subscribeAt: Double, unsubscribeAt: Double): typings.rx.Rx.Subscription = js.native
  
  /** Default virtual time used to subscribe to observable sequences in unit tests. */
  @JSImport("rx-dom", "ReactiveTest.subscribed")
  @js.native
  def subscribed: Double = js.native
  @scala.inline
  def subscribed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subscribed")(x.asInstanceOf[js.Any])
}
