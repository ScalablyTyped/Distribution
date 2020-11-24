package typings.rx.rxAggregatesMod

import typings.rx.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx.aggregates", "ReplaySubject")
@js.native
/**
  *  Initializes a new instance of the ReplaySubject class with the specified buffer size, window size and scheduler.
  *  @param {Number} [bufferSize] Maximum element count of the replay buffer.
  *  @param {Number} [windowSize] Maximum time length of the replay buffer.
  *  @param {Scheduler} [scheduler] Scheduler the observers are invoked on.
  */
class ReplaySubjectCls[T] ()
  extends typings.rx.Rx.Subject[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: js.UndefOr[scala.Nothing], window: Double) = this()
  def this(bufferSize: Double, window: Double) = this()
  def this(bufferSize: js.UndefOr[scala.Nothing], window: js.UndefOr[scala.Nothing], scheduler: IScheduler) = this()
  def this(bufferSize: js.UndefOr[scala.Nothing], window: Double, scheduler: IScheduler) = this()
  def this(bufferSize: Double, window: js.UndefOr[scala.Nothing], scheduler: IScheduler) = this()
  def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
}
