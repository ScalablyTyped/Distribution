package typings.rxDom.mod

import typings.rx.Rx.IScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("rx-dom", "ReplaySubjectCls")
@js.native
/**
  *  Initializes a new instance of the ReplaySubject class with the specified buffer size, window size and scheduler.
  *  @param {Number} [bufferSize] Maximum element count of the replay buffer.
  *  @param {Number} [windowSize] Maximum time length of the replay buffer.
  *  @param {Scheduler} [scheduler] Scheduler the observers are invoked on.
  */
class ReplaySubjectCls[T] ()
  extends typings.rx.mod.ReplaySubjectCls[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: Double, window: Double) = this()
  def this(bufferSize: Unit, window: Double) = this()
  def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
  def this(bufferSize: Double, window: Unit, scheduler: IScheduler) = this()
  def this(bufferSize: Unit, window: Double, scheduler: IScheduler) = this()
  def this(bufferSize: Unit, window: Unit, scheduler: IScheduler) = this()
}
