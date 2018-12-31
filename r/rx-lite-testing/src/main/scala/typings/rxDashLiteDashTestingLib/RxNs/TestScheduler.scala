package typings
package rxDashLiteDashTestingLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestScheduler
  extends rxDashLiteDashVirtualtimeLib.RxNs.VirtualTimeScheduler[scala.Double, scala.Double] {
  def createColdObservable[T](records: Recorded*): rxDashCoreLib.RxNs.Observable[T]
  def createHotObservable[T](records: Recorded*): rxDashCoreLib.RxNs.Observable[T]
  def createObserver[T](): MockObserver[T]
  def startWithCreate[T](create: js.Function0[rxDashCoreLib.RxNs.Observable[T]]): MockObserver[T]
  def startWithDispose[T](create: js.Function0[rxDashCoreLib.RxNs.Observable[T]], disposedAt: scala.Double): MockObserver[T]
  def startWithTiming[T](
    create: js.Function0[rxDashCoreLib.RxNs.Observable[T]],
    createdAt: scala.Double,
    subscribedAt: scala.Double,
    disposedAt: scala.Double
  ): MockObserver[T]
}

