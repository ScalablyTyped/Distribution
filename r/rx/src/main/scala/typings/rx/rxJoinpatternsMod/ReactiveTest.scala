package typings.rx.rxJoinpatternsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx.joinpatterns", "ReactiveTest")
@js.native
object ReactiveTest extends js.Object {
  
  /** Default virtual time used for creation of observable sequences in unit tests. */
  var created: Double = js.native
  
  /** Default virtual time used to dispose subscriptions in unit tests. */
  var disposed: Double = js.native
  
  /**
    * Factory method for an OnCompleted notification record at a given time.
    *
    * @param ticks Recorded virtual time the OnCompleted notification occurs.
    * @return Recorded OnCompleted notification.
    */
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
  def onNext(ticks: Double, value: js.Any): typings.rx.Rx.Recorded = js.native
  
  /**
    * Factory method for a subscription record based on a given subscription and disposal time.
    *
    * @param start Virtual time indicating when the subscription was created.
    * @param end Virtual time indicating when the subscription was disposed.
    * @return Subscription object.
    */
  def subscribe(subscribeAt: Double): typings.rx.Rx.Subscription = js.native
  def subscribe(subscribeAt: Double, unsubscribeAt: Double): typings.rx.Rx.Subscription = js.native
  
  /** Default virtual time used to subscribe to observable sequences in unit tests. */
  var subscribed: Double = js.native
}
