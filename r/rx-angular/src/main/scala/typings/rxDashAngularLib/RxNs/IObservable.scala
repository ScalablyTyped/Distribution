package typings
package rxDashAngularLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservable[T] extends js.Object {
  def safeApply($scope: angularLib.angularMod.IScope, callback: js.Function1[/* data */ T, scala.Unit]): rxDashLiteDashAggregatesLib.RxNs.Observable[T]
}

object IObservable {
  @scala.inline
  def apply[T](
    safeApply: (angularLib.angularMod.IScope, js.Function1[/* data */ T, scala.Unit]) => rxDashLiteDashAggregatesLib.RxNs.Observable[T]
  ): IObservable[T] = {
    val __obj = js.Dynamic.literal(safeApply = js.Any.fromFunction2(safeApply))
  
    __obj.asInstanceOf[IObservable[T]]
  }
}

