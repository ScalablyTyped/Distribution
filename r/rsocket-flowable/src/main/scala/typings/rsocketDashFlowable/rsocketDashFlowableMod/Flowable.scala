package typings.rsocketDashFlowable.rsocketDashFlowableMod

import typings.rsocketDashFlowable.flowableMod.Source
import typings.rsocketDashFlowable.flowableMod.default
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-flowable", "Flowable")
@js.native
class Flowable[T] protected () extends default[T] {
  def this(source: Source[T]) = this()
  def this(source: Source[T], max: Double) = this()
}

/* static members */
@JSImport("rsocket-flowable", "Flowable")
@js.native
object Flowable extends js.Object {
  def error(error: Error): typings.rsocketDashFlowable.flowableMod.Flowable[js.Object] = js.native
  def just[U](values: U*): typings.rsocketDashFlowable.flowableMod.Flowable[U] = js.native
  def never(): typings.rsocketDashFlowable.flowableMod.Flowable[js.Object] = js.native
}

