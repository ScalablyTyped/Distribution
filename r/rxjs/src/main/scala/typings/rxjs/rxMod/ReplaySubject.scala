package typings.rxjs.rxMod

import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/Rx", "ReplaySubject")
@js.native
class ReplaySubject[T] ()
  extends typings.rxjs.replaySubjectMod.ReplaySubject[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: js.UndefOr[scala.Nothing], windowTime: Double) = this()
  def this(bufferSize: Double, windowTime: Double) = this()
  def this(
    bufferSize: js.UndefOr[scala.Nothing],
    windowTime: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ) = this()
  def this(bufferSize: js.UndefOr[scala.Nothing], windowTime: Double, scheduler: SchedulerLike) = this()
  def this(bufferSize: Double, windowTime: js.UndefOr[scala.Nothing], scheduler: SchedulerLike) = this()
  def this(bufferSize: Double, windowTime: Double, scheduler: SchedulerLike) = this()
}
