package typings.rxDashLiteDashTesting.rxDashLiteDashTestingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-lite-testing", "ReactiveTest")
@js.native
object ReactiveTest extends js.Object {
  var created: Double = js.native
  var disposed: Double = js.native
  var subscribed: Double = js.native
  def onCompleted(ticks: Double): typings.rxDashLiteDashTesting.RxNs.Recorded = js.native
  def onError(ticks: Double, exception: js.Any): typings.rxDashLiteDashTesting.RxNs.Recorded = js.native
  def onNext(ticks: Double, value: js.Any): typings.rxDashLiteDashTesting.RxNs.Recorded = js.native
  def subscribe(subscribeAt: Double): typings.rxDashLiteDashTesting.RxNs.Subscription = js.native
  def subscribe(subscribeAt: Double, unsubscribeAt: Double): typings.rxDashLiteDashTesting.RxNs.Subscription = js.native
}

