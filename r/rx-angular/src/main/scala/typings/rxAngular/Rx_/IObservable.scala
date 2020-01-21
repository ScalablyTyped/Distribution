package typings.rxAngular.Rx_

import typings.angular.mod.IScope
import typings.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservable[T] extends js.Object {
  def safeApply($scope: IScope, callback: js.Function1[/* data */ T, Unit]): Observable[T]
}

object IObservable {
  @scala.inline
  def apply[T](safeApply: (IScope, js.Function1[/* data */ T, Unit]) => Observable[T]): IObservable[T] = {
    val __obj = js.Dynamic.literal(safeApply = js.Any.fromFunction2(safeApply))
  
    __obj.asInstanceOf[IObservable[T]]
  }
}

