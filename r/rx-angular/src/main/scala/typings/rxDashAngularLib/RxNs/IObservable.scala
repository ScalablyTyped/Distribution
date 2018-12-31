package typings
package rxDashAngularLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservable[T] extends js.Object {
  def safeApply($scope: angularLib.angularMod.angularNs.IScope, callback: js.Function1[/* data */ T, scala.Unit]): rxDashLiteDashAggregatesLib.RxNs.Observable[T]
}

