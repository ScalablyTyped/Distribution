package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestScheduler extends VirtualTimeScheduler[Double, Double] {
  
  /**
    * Creates a cold observable using the specified timestamped notification messages either as an array or arguments.
    * @param messages Notifications to surface through the created sequence at their specified virtual time offsets from the sequence subscription time.
    * @return Cold observable sequence that can be used to assert the timing of subscriptions and notifications.
    */
  def createColdObservable[T](records: Recorded*): Observable[T] = js.native
  
  /**
    * Creates a hot observable using the specified timestamped notification messages either as an array or arguments.
    * @param messages Notifications to surface through the created sequence at their specified absolute virtual times.
    * @return Hot observable sequence that can be used to assert the timing of subscriptions and notifications.
    */
  def createHotObservable[T](records: Recorded*): Observable[T] = js.native
  
  /**
    * Creates an observer that records received notification messages and timestamps those.
    * @return Observer that can be used to assert the timing of received notifications.
    */
  def createObserver[T](): MockObserver[T] = js.native
  
  /**
    * Creates a rejected promise with the given reason and ticks
    * @param {Number} ticks The absolute time of the resolution.
    * @param {Any} reason The reason for rejection to yield at the given tick.
    * @returns {MockPromise} A mock Promise which rejects with the given reason.
    */
  def createRejectedPromise[T](ticks: Double, value: T): IPromise[T] = js.native
  
  /**
    * Creates a resolved promise with the given value and ticks
    * @param {Number} ticks The absolute time of the resolution.
    * @param {Any} value The value to yield at the given tick.
    * @returns {MockPromise} A mock Promise which fulfills with the given value.
    */
  def createResolvedPromise[T](ticks: Double, value: T): IPromise[T] = js.native
  
  /**
    * Starts the test scheduler and uses default virtual times to invoke the factory function, to subscribe to the resulting sequence, and to dispose the subscription.
    *
    * @param create Factory method to create an observable sequence.
    * @return Observer with timestamped recordings of notification messages that were received during the virtual time window when the subscription to the source sequence was active.
    */
  def startWithCreate[T](create: js.Function0[Observable[T]]): MockObserver[T] = js.native
  
  /**
    * Starts the test scheduler and uses the specified virtual time to dispose the subscription to the sequence obtained through the factory function.
    * Default virtual times are used for factory invocation and sequence subscription.
    *
    * @param create Factory method to create an observable sequence.
    * @param disposed Virtual time at which to dispose the subscription.
    * @return Observer with timestamped recordings of notification messages that were received during the virtual time window when the subscription to the source sequence was active.
    */
  def startWithDispose[T](create: js.Function0[Observable[T]], disposedAt: Double): MockObserver[T] = js.native
  
  /**
    * Starts the test scheduler and uses the specified virtual times to invoke the factory function, subscribe to the resulting sequence, and dispose the subscription.
    *
    * @param create Factory method to create an observable sequence.
    * @param created Virtual time at which to invoke the factory to create an observable sequence.
    * @param subscribed Virtual time at which to subscribe to the created observable sequence.
    * @param disposed Virtual time at which to dispose the subscription.
    * @return Observer with timestamped recordings of notification messages that were received during the virtual time window when the subscription to the source sequence was active.
    */
  def startWithTiming[T](create: js.Function0[Observable[T]], createdAt: Double, subscribedAt: Double, disposedAt: Double): MockObserver[T] = js.native
}
