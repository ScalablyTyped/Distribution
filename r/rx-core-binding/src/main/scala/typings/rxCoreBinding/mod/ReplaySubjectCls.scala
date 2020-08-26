package typings.rxCoreBinding.mod

import typings.rxCore.Rx.IScheduler
import typings.rxCoreBinding.Rx.ISubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-core-binding", "ReplaySubject")
@js.native
class ReplaySubjectCls[T] () extends ISubject[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: js.UndefOr[scala.Nothing], window: Double) = this()
  def this(bufferSize: Double, window: Double) = this()
  def this(bufferSize: js.UndefOr[scala.Nothing], window: js.UndefOr[scala.Nothing], scheduler: IScheduler) = this()
  def this(bufferSize: js.UndefOr[scala.Nothing], window: Double, scheduler: IScheduler) = this()
  def this(bufferSize: Double, window: js.UndefOr[scala.Nothing], scheduler: IScheduler) = this()
  def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
}

