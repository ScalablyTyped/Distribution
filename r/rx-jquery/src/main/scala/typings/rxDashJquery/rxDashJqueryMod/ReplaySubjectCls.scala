package typings.rxDashJquery.rxDashJqueryMod

import typings.rxDashCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-jquery", "ReplaySubjectCls")
@js.native
class ReplaySubjectCls[T] ()
  extends typings.rxDashCoreDashBinding.Rx.ReplaySubjectCls[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: Double, window: Double) = this()
  def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
}

