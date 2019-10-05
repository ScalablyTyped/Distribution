package typings.rxDashLiteDashTesting.Rx

import org.scalablytyped.runtime.Instantiable0
import typings.rxDashCore.Rx.Observable
import typings.rxDashLiteDashVirtualtime.Rx.VirtualTimeScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestScheduler extends VirtualTimeScheduler[Double, Double] {
  def createColdObservable[T](records: Recorded*): Observable[T]
  def createHotObservable[T](records: Recorded*): Observable[T]
  def createObserver[T](): MockObserver[T]
  def startWithCreate[T](create: js.Function0[Observable[T]]): MockObserver[T]
  def startWithDispose[T](create: js.Function0[Observable[T]], disposedAt: Double): MockObserver[T]
  def startWithTiming[T](create: js.Function0[Observable[T]], createdAt: Double, subscribedAt: Double, disposedAt: Double): MockObserver[T]
}

@JSGlobal("Rx.TestScheduler")
@js.native
object TestScheduler extends Instantiable0[TestScheduler]

