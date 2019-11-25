package typings.rxDashAngular.Rx

import typings.angular.angularMod.IScope
import typings.rxDashCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.ScopeScheduler")
@js.native
class ScopeSchedulerCls protected () extends IScheduler {
  def this($scope: IScope) = this()
  /* CompleteClass */
  override def `catch`(handler: js.Function1[/* exception */ js.Any, Boolean]): IScheduler = js.native
  /* CompleteClass */
  override def catchException(handler: js.Function1[/* exception */ js.Any, Boolean]): IScheduler = js.native
}

