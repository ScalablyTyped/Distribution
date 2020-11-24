package typings.rxAngular.Rx_

import typings.angular.mod.IScope
import typings.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservable[T] extends js.Object {
  
  def safeApply($scope: IScope, callback: js.Function1[/* data */ T, Unit]): Observable[T] = js.native
}
object IObservable {
  
  @scala.inline
  def apply[T](safeApply: (IScope, js.Function1[/* data */ T, Unit]) => Observable[T]): IObservable[T] = {
    val __obj = js.Dynamic.literal(safeApply = js.Any.fromFunction2(safeApply))
    __obj.asInstanceOf[IObservable[T]]
  }
  
  @scala.inline
  implicit class IObservableOps[Self <: IObservable[_], T] (val x: Self with IObservable[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSafeApply(value: (IScope, js.Function1[/* data */ T, Unit]) => Observable[T]): Self = this.set("safeApply", js.Any.fromFunction2(value))
  }
}
