package typings.rxjs.innerSubscribeMod

import typings.rxjs.subscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/innerSubscribe", "ComplexOuterSubscriber")
@js.native
class ComplexOuterSubscriber[T, R] () extends Subscriber[T] {
  /**
    * @param _innerSub Used by: race, bufferToggle, delayWhen, windowToggle, windowWhen
    */
  def notifyComplete(_innerSub: ComplexInnerSubscriber[T, R]): Unit = js.native
  def notifyError(error: js.Any): Unit = js.native
  /**
    * @param _outerValue Used by: bufferToggle, delayWhen, windowToggle
    * @param innerValue Used by: subclass default, combineLatest, race, bufferToggle, windowToggle, withLatestFrom
    * @param _outerIndex Used by: combineLatest, race, withLatestFrom
    * @param _innerSub Used by: delayWhen
    */
  def notifyNext(_outerValue: T, innerValue: R, _outerIndex: Double, _innerSub: ComplexInnerSubscriber[T, R]): Unit = js.native
}

