package typings
package rxDashAngularLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservable[T] extends js.Object {
  def safeApply($scope: angularLib.angularMod.angularNs.IScope, callback: js.Function1[/* data */ T, scala.Unit]): rxDashLiteDashAggregatesLib.RxNs.Observable[T]
}

object IObservable {
  @scala.inline
  def apply[T](
    safeApply: js.Function2[
      angularLib.angularMod.angularNs.IScope, 
      js.Function1[/* data */ T, scala.Unit], 
      rxDashLiteDashAggregatesLib.RxNs.Observable[T]
    ]
  ): IObservable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("safeApply")(safeApply)
    __obj.asInstanceOf[IObservable[T]]
  }
}

