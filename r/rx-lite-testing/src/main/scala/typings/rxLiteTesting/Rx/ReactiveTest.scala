package typings.rxLiteTesting.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.ReactiveTest")
@js.native
object ReactiveTest extends js.Object {
  var created: Double = js.native
  var disposed: Double = js.native
  var subscribed: Double = js.native
  def onCompleted(ticks: Double): Recorded = js.native
  def onError(ticks: Double, exception: js.Any): Recorded = js.native
  def onNext(ticks: Double, value: js.Any): Recorded = js.native
  def subscribe(subscribeAt: Double): Subscription = js.native
  def subscribe(subscribeAt: Double, unsubscribeAt: Double): Subscription = js.native
}

