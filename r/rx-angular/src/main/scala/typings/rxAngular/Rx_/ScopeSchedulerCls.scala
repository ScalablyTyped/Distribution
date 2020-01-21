package typings.rxAngular.Rx_

import typings.rxCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.ScopeScheduler")
@js.native
class ScopeSchedulerCls protected () extends IScheduler {
  def this($scope: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope */ js.Any) = this()
  /* CompleteClass */
  override def `catch`(handler: js.Function1[/* exception */ js.Any, Boolean]): IScheduler = js.native
  /* CompleteClass */
  override def catchException(handler: js.Function1[/* exception */ js.Any, Boolean]): IScheduler = js.native
}

